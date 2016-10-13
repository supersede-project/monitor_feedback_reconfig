package eu.supersede.monitor.reconfiguration.adapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

import cz.zcu.yafmt.model.fm.Feature;
import cz.zcu.yafmt.model.fm.FeatureModel;
import eu.supersede.dynadapt.adapter.ModelAdapter;
import eu.supersede.dynadapt.aom.dsl.parser.AdaptationParser;
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
	
	public Adapter(ModelRepository mr) throws ViatraQueryException {
		this.mr = mr;
		this.parser = new AdaptationParser();
		this.mm = new ModelManager();
		this.mq = new ModelQuery(mm);
		this.ma = new ModelAdapter();
		modelsLocation = new HashMap<String, String>();
		modelsLocation.put("aspects", "adaptability_models/");
		modelsLocation.put("variants", "uml_models/variants/");
		modelsLocation.put("profiles", "uml_models/profiles/");
		modelsLocation.put("patterns", "patterns/");
		modelsLocation.put("features", "features/models/");
	}

	@Override
	public void adapt(FeatureModel variability, Aspect adaptationModel, Model baseModel) throws ViatraQueryException {
		
		List<Feature> features = listFeatures(variability.getRoot());

		for (Feature f : features) {
			List<Aspect> aspects = mr.getAspectModels(f.getId(), modelsLocation);
			for (Aspect a : aspects) {
				//parser.parseAdaptationModel(aspects.get(0));
				Stereotype role = null;
				List<Pointcut> pointcuts = a.getPointcuts();
				for (Pointcut p : pointcuts) {
					role = p.getRole();
					List<Element> elements = (List<Element>) mq.query(p.getName(), baseModel.eResource());
					for (Element e : elements) {
						ma.stereotypeElement(e, p.getRole());
					}
				}
				Model variant = a.getAdvice();
				List<Composition> compositions = a.getCompositions();
				ma.applyCompositionDirective(compositions.get(0), baseModel, role, variant);
			}
		}
				
	}

	private List<Feature> listFeatures(Feature root) {
		List<Feature> features = new ArrayList<>();
		features.add(root);
		if (root.getFeatures().size() > 0) features.addAll(listFeatures(root));
		return features;
	}

}
