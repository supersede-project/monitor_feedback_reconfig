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
package eu.supersede.monitor.reconfiguration.executor;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.conn.HttpHostConnectException;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.google.gson.JsonObject;

import eu.supersede.monitor.reconfiguration.executor.model.MonitorInfo;
import eu.supersede.monitor.reconfiguration.executor.model.MonitorList;

public class MonitorReconfigExecutor implements IMonitorReconfigExecutor {
	
	private final String host = "http://localhost:8080";

	@Override
	public void addMonitorConfiguration(JsonObject inputJson) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateMonitorConfiguration(JsonObject inputJson) throws Exception {
		
		CloseableHttpClient client = HttpClientBuilder.create().build();

		MonitorList monitorList = new MonitorList(inputJson);
		
		for (MonitorInfo monitor : monitorList.getMonitors()) {
			
			String url = host + "/monitors/" + monitor.getMonitorType() +
					"/" + monitor.getMonitorTool() + 
					"/" + monitor.getConfId();
						
			String jsonString = getOrchestratorJson(monitor, monitorList);
			System.out.println("Sending json: " + jsonString);
			
			HttpPut request = new HttpPut(url);
			StringEntity params = new StringEntity(jsonString);
			request.addHeader("content-type", "application/json");
			request.setEntity(params);
			
			try {
				HttpResponse httpResponse = client.execute(request);
			} catch (HttpHostConnectException e) {
				System.out.println("Connection has been suspended due to failure connecting " + host + ". Aborting.");
			}
			//String mimeType = ContentType.getOrDefault(httpResponse.getEntity()).getMimeType();
			//String jsonFromResponse = EntityUtils.toString(httpResponse.getEntity());
			
		}

	}

	@Override
	public void deleteMonitorConfiguration(JsonObject inputJson) {
		// TODO Auto-generated method stub
		
	}
	
	private String getOrchestratorJson(MonitorInfo monitor, MonitorList list) {
		JsonObject json = monitor.getJson();
		json.addProperty("configSender", list.getConfigSender());
		json.addProperty("timeStamp", list.getTimeStamp());
		return json.toString();
	}

}
