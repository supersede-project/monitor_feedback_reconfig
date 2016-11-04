package eu.supersede.monitor.reconfiguration.executor.model;

import java.util.Map.Entry;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class MonitorInfo {
	
	private final String SOCIAL_NETWORKS = "SocialNetworks";
	private final String MARKET_PLACES = "MarketPlaces";
	
	private String monitorType;

	private String monitorTool;
	
	private String confId;
	
	public MonitorInfo(JsonObject json) {
		
		JsonObject info =  null;
		for (Entry<String, JsonElement> e : json.entrySet()) {
			if (e.getKey().equals(SOCIAL_NETWORKS)) {
				info = json.getAsJsonObject(SOCIAL_NETWORKS);
				this.monitorType = SOCIAL_NETWORKS;
				break;
			} else if (e.getKey().equals(MARKET_PLACES)) {
				info = json.getAsJsonObject(MARKET_PLACES);
				this.monitorType = MARKET_PLACES;
				break;
			}
		}
		this.monitorTool = info.get("toolName").getAsString();
		this.confId = info.get("confId").getAsString();
		
	}
	
	public String getMonitorType() {
		return monitorType;
	}

	public void setMonitorType(String monitorType) {
		this.monitorType = monitorType;
	}

	public String getMonitorTool() {
		return monitorTool;
	}

	public void setMonitorTool(String monitorTool) {
		this.monitorTool = monitorTool;
	}

	public String getConfId() {
		return confId;
	}

	public void setConfId(String confId) {
		this.confId = confId;
	}

}
