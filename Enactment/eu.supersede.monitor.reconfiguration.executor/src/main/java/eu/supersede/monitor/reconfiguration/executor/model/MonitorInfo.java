/*******************************************************************************
 * Copyright (c) 2016 Universitat Politécnica de Catalunya (UPC)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors:
 * 	Quim Motger (UPC) - main development
 * 	
 * Initially developed in the context of SUPERSEDE EU project
 * www.supersede.eu
 *******************************************************************************/
package eu.supersede.monitor.reconfiguration.executor.model;

import com.google.gson.JsonObject;

public class MonitorInfo {

	private String monitorType;
	
	private String monitorTool;
	
	private String confId;
	
	private JsonObject json;
	
	public MonitorInfo(JsonObject json, String type) {
		
		this.monitorType = type;
		this.monitorTool = json.get("toolName").getAsString();
		this.confId = json.get("id").getAsString();

		this.json = json;

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
	
	public JsonObject getJson() {
		return json;
	}
	
}
