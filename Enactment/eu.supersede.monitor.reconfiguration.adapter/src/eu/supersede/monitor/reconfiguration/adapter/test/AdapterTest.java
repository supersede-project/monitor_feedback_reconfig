package eu.supersede.monitor.reconfiguration.adapter.test;

import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import cz.zcu.yafmt.model.fm.FeatureModel;
import eu.supersede.dynadapt.dsl.aspect.Aspect;
import eu.supersede.dynadapt.featuremodel.fc.FeatureConfigDAO;
import eu.supersede.dynadapt.featuremodel.fc.FeatureConfigLAO;
import eu.supersede.dynadapt.featuremodel.fc.FeatureConfigSUPERSEDE;
import eu.supersede.dynadapt.featuremodel.fc.IFeatureConfigLAO;
import eu.supersede.dynadapt.featuremodel.selection.SelectionSUPERSEDE;
import eu.supersede.dynadapt.model.ModelManager;
import eu.supersede.dynadapt.modelrepository.repositoryaccess.ModelRepository;
import eu.supersede.monitor.reconfiguration.adapter.Adapter;

import org.eclipse.emf.mwe.utils.StandaloneSetup;
import org.eclipse.uml2.uml.Model;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

public class AdapterTest {

	String baseModelPath = "platform:/resource/eu.supersede.monitor.reconfiguration.models/models/uml_models/base/MonitoringSystemBaseModel.uml";
	String repository = "platform:/resource/eu.supersede.monitor.reconfiguration.models/models/";
	String featureConfigPath = "platform:/resource/eu.supersede.monitor.reconfiguration.models/models/features/configurations/MonitoringSystemConfigDefault.yafc";
	String featureModelPath = "platform:/resource/eu.supersede.monitor.reconfiguration.models/models/features/models/MonitoringSystem.yafm";
	String localPath = "file:/home/jmotger/Escritorio/SUPERSEDE/monitor_feedback_reconfig/Enactment/eu.supersede.monitor.reconfiguration.models/bin/";
	
	Map<String, String> modelsLocation;

	ModelRepository mr = null;
	ModelManager mm = null;
	Adapter adapter = null;

	URL url = null;
	
	IFeatureConfigLAO fcLAO = null;

	@Before
	public void setUp() throws Exception {
		new StandaloneSetup().setPlatformUri("../");
		modelsLocation = new HashMap<String, String>();
		modelsLocation.put("aspects", "adaptability_models/");
		modelsLocation.put("variants", "uml_models/variants/");
		modelsLocation.put("profiles", "uml_models/profiles/");
		modelsLocation.put("patterns", "patterns/");
		modelsLocation.put("features", "features/models/");
		
		url = new URL(localPath);
		mr = new ModelRepository(repository,url);
		mm = new ModelManager(baseModelPath);
		fcLAO = new FeatureConfigLAO(new FeatureConfigDAO());
	}
	
	@Test
	public void adapt() {
		try {
			adapter = new Adapter(mr, mm);
			Model baseModel = mm.loadUMLModel(baseModelPath);
			
			FeatureModel featureModel = mm.loadFeatureModel(featureModelPath);
			List<Aspect> a = mr.getAspectModels("timeSlot_twitter", modelsLocation);

			adapter.adapt(featureModel, a.get(0), baseModel);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*@Test
	public void validAspectLoading() {

		List<Aspect> a = mr.getAspectModels("GooglePlay_API_GooglePlay", modelsLocation);
		System.out.println(a.get(0).getFeature().getId());

	}*/

	/**
	 * This test shows how from a SelectionSUPERSEDE of a FeatureConfigSUPERSEDE
	 * model its corresponding adaptation models can be retrieved.
	 */
	/*
	@Test
	public void testGetValidFeatureAspectsForASelection() {
		FeatureConfigSUPERSEDE fc = fcLAO.getFeatureConfigSUPERSEDE(featureConfigPath, featureModelPath);
		String featureId = fc.getSelections().get(5).getFeature().getId();

		List<Aspect> a = mr.getAspectModels(featureId, modelsLocation);

		System.out.print(a.get(0).getFeature().getId());
	}*/

}