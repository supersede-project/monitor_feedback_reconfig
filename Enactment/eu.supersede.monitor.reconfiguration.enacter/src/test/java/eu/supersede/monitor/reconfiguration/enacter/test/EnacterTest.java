package eu.supersede.monitor.reconfiguration.enacter.test;

import org.junit.Test;

import eu.supersede.monitor.reconfiguration.enacter.Enacter;
import eu.supersede.monitor.reconfiguration.enacter.IEnacter;

public class EnacterTest {

	@Test
	public void updateMonitoringEnactment() {
		
		//Edit local paths for testing purposes
		String absoluteSourcePath = "/home/jmotger/Escritorio/SUPERSEDE/dyn_adapt/Enactment/components/adapter/model/eu.supersede.dynadapt.monitoring.models/models/uml_models/base/";
		String sourceModel = "MonitoringSystemAdaptedBaseModel.uml";
		String absoluteTargetFolderPath = "/home/jmotger/Escritorio/SUPERSEDE/monitor_feedback_reconfig/Enactment/eu.supersede.monitor.reconfiguration.enacter/json/";
		
		IEnacter enacter = new Enacter();
		
		try {
			enacter.applyUpdateEnactment(absoluteSourcePath, sourceModel, absoluteTargetFolderPath);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
