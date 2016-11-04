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
package eu.supersede.monitor.reconfiguration.executor.test;

import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import eu.supersede.monitor.reconfiguration.executor.IMonitorReconfigExecutor;
import eu.supersede.monitor.reconfiguration.executor.MonitorReconfigExecutor;

public class MonitorReconfigExecutorTest {

	@Before
	public void setUp() {
		
	}
	
	@Test
	public void updateMonitorConfig() {
		try {
			InputStream stream = this.getClass().getResourceAsStream("update_monitor.json");
			String jsonString = IOUtils.toString(stream);
			JsonObject jsonObject = (new JsonParser()).parse(jsonString).getAsJsonObject();
			IMonitorReconfigExecutor executor = new MonitorReconfigExecutor();
			executor.updateMonitorConfiguration(jsonObject);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
}
