package eu.supersede.monitor.reconfiguration.enacter.test;

import org.junit.Before;
import org.junit.Test;

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
import eu.supersede.monitor.reconfiguration.enacter.Enacter;
import eu.supersede.monitor.reconfiguration.enacter.IEnacter;

public class EnacterTest {
		
	private String absoluteSourcePath;
	private String sourceModel;
	private String absoluteTargetFolderPath;
	
	@Before
	public void setUp() {
		absoluteSourcePath = "src/test/java/eu/supersede/monitor/reconfiguration/enacter/test/";
		sourceModel = "MonitoringSystemBaseModel.uml";
		absoluteTargetFolderPath = "json/";
	}

	@Test
	public void updateMonitoringEnactment() throws Exception {
		
		IEnacter enacter = new Enacter();
		enacter.applyUpdateEnactment(absoluteSourcePath, sourceModel, absoluteTargetFolderPath);
		
	}
	
}
