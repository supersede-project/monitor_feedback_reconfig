package eu.supersede.monitor.reconfiguration.executor;

import com.google.gson.JsonObject;

public interface IMonitorReconfigExecutor {
	
	public void addMonitorConfiguration(JsonObject inputJson) throws Exception;
	
	public void updateMonitorConfiguration(JsonObject inputJson, String monitorType, 
			String monitorTool, String confId) throws Exception;
	
	public void deleteMonitorConfiguration(JsonObject inputJson) throws Exception;

}
