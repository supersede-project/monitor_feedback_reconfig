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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.JsonObject;

import eu.supersede.integration.api.monitoring.orchestrator.proxies.MonitoringOrchestratorProxy;
import eu.supersede.integration.api.monitoring.orchestrator.types.MonitorConfiguration;
import eu.supersede.monitor.reconfiguration.executor.model.MonitorInfo;
import eu.supersede.monitor.reconfiguration.executor.model.MonitorList;

public class MonitorReconfigExecutor implements IMonitorReconfigExecutor {
	
	private final static Logger log = LoggerFactory.getLogger(MonitorReconfigExecutor.class);
	
	@Override
	public void addMonitorConfiguration(JsonObject inputJson) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateMonitorConfiguration(JsonObject inputJson) throws Exception {
		
		MonitorList monitorList = new MonitorList(inputJson);
		
		for (MonitorInfo monitor : monitorList.getMonitors()) {
			
			MonitorConfiguration configuration = new MonitorConfiguration();
			feedConfiguration(configuration,monitor);
			configuration.setTimeStamp(monitorList.getTimeStamp());
			configuration.setConfigSender(monitorList.getConfigSender());
			log.debug("Generating a reconfiguration for " + monitor.getMonitorType() + " monitor with " + monitor.getMonitorTool() + " tool");
			MonitoringOrchestratorProxy<?, ?> proxy = new MonitoringOrchestratorProxy<Object, Object>();
			proxy.updateMonitorConfigurationForMonitorToolAndMonitorType(configuration, monitor.getMonitorTool(), monitor.getMonitorType());
		}
	}

	@Override
	public void deleteMonitorConfiguration(JsonObject inputJson) {
		// TODO Auto-generated method stub
		
	}
	
	private void feedConfiguration(MonitorConfiguration configuration, MonitorInfo info) throws Exception{
		JsonObject json = null;
		if (info.getJson().get("SocialNetworks") != null) json = info.getJson().get("SocialNetworks").getAsJsonObject();
		else if (info.getJson().get("MarketPlaces") != null) json = info.getJson().get("MarketPlaces").getAsJsonObject();
		else throw new Exception("Wrong monitor type");
		if (json.get("kafkaEndpoint") != null) configuration.setKafkaEndpoint(json.get("kafkaEndpoint").getAsString());
		if (json.get("kafkaTopic") != null) configuration.setKafkaTopic(json.get("kafkaTopic").getAsString());
		if (json.get("keywordExpression") != null) configuration.setKeywordExpression(json.get("keywordExpression").getAsString());
		if (json.get("state") != null) configuration.setState(json.get("state").getAsString());
		if (json.get("kafkaEndpoint") != null) configuration.setKafkaEndpoint(json.get("kafkaEndpoint").getAsString());
		if (json.get("id") != null) configuration.setId(Integer.parseInt(json.get("id").getAsString()));
		if (json.get("kafkaEndpoint") != null) configuration.setKafkaEndpoint(json.get("kafkaEndpoint").getAsString());
		if (json.get("timeSlot") != null) configuration.setTimeSlot(json.get("timeSlot").getAsString());
		if (json.get("packageName") != null) configuration.setKafkaEndpoint(json.get("packageName").getAsString());
		if (json.get("appId") != null) configuration.setKafkaEndpoint(json.get("appId").getAsString());
	}

}
