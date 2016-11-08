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
