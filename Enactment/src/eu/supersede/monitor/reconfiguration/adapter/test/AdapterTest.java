package eu.supersede.monitor.reconfiguration.adapter.test;

import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import eu.supersede.dynadapt.dsl.aspect.Aspect;
import eu.supersede.dynadapt.featuremodel.fc.FeatureConfigDAO;
import eu.supersede.dynadapt.featuremodel.fc.FeatureConfigLAO;
import eu.supersede.dynadapt.featuremodel.fc.FeatureConfigSUPERSEDE;
import eu.supersede.dynadapt.featuremodel.fc.IFeatureConfigLAO;
import eu.supersede.dynadapt.modelrepository.repositoryaccess.ModelRepository;
import org.eclipse.emf.mwe.utils.StandaloneSetup;

public class AdapterTest {

	String repository = "platform:/resource/eu.supersede.monitor.reconfiguration.models/models/";
	String featureConfigPath = "platform:/resource/eu.supersede.monitor.reconfiguration.models/models/features/configurations/MonitoringSystemConfigDefault.yafc";
	String featureModelPath = "platform:/resource/eu.supersede.monitor.reconfiguration.models/models/features/models/MonitoringSystem.yafm";
	
	Map<String, String> modelsLocation;

	ModelRepository mr = null;
	
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
		
		mr = new ModelRepository(repository);
		fcLAO = new FeatureConfigLAO(new FeatureConfigDAO());
	}
	
	@Test
	public void validAspectLoading() {

		List<Aspect> a = mr.getAspectModels("GooglePlay_API_GooglePlay", modelsLocation);
		System.out.print(a.get(0).getFeature().getId());
		

	}
	
	/**
	 * This test shows how from a SelectionSUPERSEDE of a FeatureConfigSUPERSEDE model its
	 * corresponding adaptation models can be retrieved. 
	 */
	@Test
	public void testGetValidFeatureAspectsForASelection() {
		FeatureConfigSUPERSEDE fc = fcLAO.getFeatureConfigSUPERSEDE(featureConfigPath, featureModelPath);
		/* Example with google play api - in this iteration selection #5 */
		String featureId = fc.getSelections().get(5).getFeature().getId();

		List<Aspect> a = mr.getAspectModels(featureId, modelsLocation);
		
		System.out.print(a.get(0).getFeature().getId());
	}
	
}
