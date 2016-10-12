package eu.supersede.monitor.reconfiguration.adapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.uml2.uml.Model;

import cz.zcu.yafmt.model.fm.Feature;
import cz.zcu.yafmt.model.fm.FeatureModel;
import eu.supersede.dynadapt.dsl.aspect.Aspect;
import eu.supersede.dynadapt.modelrepository.repositoryaccess.ModelRepository;

public class Adapter implements IAdapter {
	
	ModelRepository mr;
	
	Map<String, String> modelsLocation;
	
	String repository = "platform:/resource/eu.supersede.monitor.reconfiguration.models/models/";
	
	public Adapter(ModelRepository mr) {
		this.mr = mr;
		modelsLocation = new HashMap<String, String>();
		modelsLocation.put("aspects", "adaptability_models/");
		modelsLocation.put("variants", "uml_models/variants/");
		modelsLocation.put("profiles", "uml_models/profiles/");
		modelsLocation.put("patterns", "patterns/");
		modelsLocation.put("features", "features/models/");
	}

	@Override
	public void adapt(FeatureModel variability, Aspect adaptation, Model baseModel) {
		
		List<Feature> features = listFeatures(variability.getRoot());

		for (int i = 0; i < features.size(); ++i) {
			
			Feature f = features.get(i);
			List<Aspect> aspects = mr.getAspectModels(f.getId(), modelsLocation);
			
			System.out.println(aspects);
			
		}
				
	}

	private List<Feature> listFeatures(Feature root) {
		List<Feature> features = new ArrayList<>();
		features.add(root);
		if (root.getFeatures().size() > 0) features.addAll(listFeatures(root));
		return features;
	}

}
