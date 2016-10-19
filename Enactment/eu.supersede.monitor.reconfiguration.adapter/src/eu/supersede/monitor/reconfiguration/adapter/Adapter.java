package eu.supersede.monitor.reconfiguration.adapter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.patternlanguage.helper.CorePatternLanguageHelper;

import cz.zcu.yafmt.model.fm.Feature;
import cz.zcu.yafmt.model.fm.FeatureModel;
import eu.supersede.dynadapt.adapter.ModelAdapter;
import eu.supersede.dynadapt.aom.dsl.parser.AdaptationParser;
import eu.supersede.dynadapt.dsl.aspect.ActionOptionType;
import eu.supersede.dynadapt.dsl.aspect.impl.UpdateValueImpl;
import eu.supersede.dynadapt.dsl.aspect.Aspect;
import eu.supersede.dynadapt.dsl.aspect.Composition;
import eu.supersede.dynadapt.dsl.aspect.Pointcut;
import eu.supersede.dynadapt.model.ModelManager;
import eu.supersede.dynadapt.model.query.ModelQuery;
import eu.supersede.dynadapt.modelrepository.repositoryaccess.ModelRepository;

public class Adapter implements IAdapter {
	
	ModelRepository mr;
	AdaptationParser parser;
	ModelManager mm;
	ModelQuery mq;
	ModelAdapter ma;
	
	Map<String, String> modelsLocation;
	
	String repository = "platform:/resource/eu.supersede.monitor.reconfiguration.models/models/";
	
	public Adapter(ModelRepository mr, ModelManager mm) throws Exception {
		this.mr = mr;
		this.parser = new AdaptationParser();
		this.ma = new ModelAdapter(mm);
		this.mm = mm;
		this.mq = new ModelQuery(mm);
		modelsLocation = new HashMap<String, String>();
		modelsLocation.put("aspects", "adaptability_models/");
		modelsLocation.put("variants", "uml_models/variants/");
		modelsLocation.put("profiles", "uml_models/profiles/");
		modelsLocation.put("patterns", "patterns/");
		modelsLocation.put("features", "features/models/");
	}

	@Override
	public void adapt(FeatureModel variability, Aspect adaptationModel, Model baseModel) throws Exception {
		
		List<Feature> features = listFeatures(variability.getRoot(), adaptationModel.getFeature().getId());
		
		for (Feature f : features) {
			System.out.println("Feature ID: " + f.getId());
			List<Aspect> aspects = mr.getAspectModels(f.getId(), modelsLocation);
			System.out.println("Adaptations for feature: " + aspects.size());
			for (Aspect a : aspects) {
				System.out.println("	Aspect name: " + a.getName());
				//parser.parseAdaptationModel(aspects.get(0));
				Stereotype role = null;
				List<Pointcut> pointcuts = a.getPointcuts();
				for (Pointcut p : pointcuts) {
					role = p.getRole();
					System.out.println("		Role: " + role.getName());
					Collection<? extends IPatternMatch> matches = mq.query(
							CorePatternLanguageHelper.getFullyQualifiedName(p.getPattern()), 
							repository + modelsLocation.get("patterns") + "monitoring_reconfiguration_queries.vql");
					List<Element> elements = new ArrayList<>();
					for (IPatternMatch i : matches) {
						elements.add((Element) i.get(0));
					}
					for (Element e : elements) {
						System.out.println("			Applied to: " + e);
						ma.stereotypeElement(e, p.getRole());
					}
				}
				Model variant = a.getAdvice();
				ActionOptionType actionOptionType = a.getCompositions().get(0).getAction();
				if (actionOptionType instanceof UpdateValueImpl) {
					Object value = actionOptionType.eGet(actionOptionType.eClass().getEStructuralFeature("value"));
					ma.applyUpdateCompositionDirective(baseModel, value, role);
				} else {
					ma.applyCompositionDirective(a.getCompositions().get(0), baseModel, role, variant);
				}
			}
		}
				
	}

	private List<Feature> listFeatures(Feature root, String featureId) {
		List<Feature> features = new ArrayList<>();
		if (root.getId().equals(featureId)) features.add(root);
		if (root.getFeatures().size() > 0) 
			for (Feature f : root.getFeatures()) features.addAll(listFeatures(f, featureId));
		return features;
	}

}
