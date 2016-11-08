package eu.supersede.monitor.reconfiguration.enacter;

import java.io.File;
import java.util.Scanner;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import eu.supersede.monitor.reconfiguration.executor.IMonitorReconfigExecutor;
import eu.supersede.monitor.reconfiguration.executor.MonitorReconfigExecutor;
import eu.supersede.reconfiguration.enactor.uml2json.Uml2Json;

public class Enacter implements IEnacter {
	
	IMonitorReconfigExecutor executor;
	
	public Enacter() {
		executor = new MonitorReconfigExecutor();
	}

	@Override
	public void applyUpdateEnactment(String absoluteSourcePath, String sourceModel, String absoluteTargetFolderPath) throws Exception {
		
		Uml2Json.deriveUMLToJsonInFolder(absoluteSourcePath + sourceModel, absoluteTargetFolderPath);
		
		String jsonFileName = absoluteTargetFolderPath + sourceModel.split(".")[0] + ".txt";
		
		String json = new Scanner(new File(jsonFileName)).useDelimiter("\\Z").next();
		JsonObject jsonObject = (new JsonParser()).parse(json).getAsJsonObject();
		
		executor.updateMonitorConfiguration(jsonObject);
		
	}

	@Override
	public void applyAddEnactment(String absoluteSourcePath, String sourceModel, String absoluteTarget)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void applyDeleteEnactment(String absoluteSourcePath, String sourceModel, String absoluteTarget)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
