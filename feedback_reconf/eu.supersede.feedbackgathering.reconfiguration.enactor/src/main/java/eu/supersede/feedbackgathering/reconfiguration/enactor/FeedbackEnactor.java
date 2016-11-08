/*******************************************************************************
 * Copyright (c) 2016 FBK
 * All rights reserved. Licensed under the Apache License, Version 2.0 (the "License");
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
 *     Denisse Muñante (FBK) - main development
 *
 * Initially developed in the context of SUPERSEDE EU project www.supersede.eu
 *******************************************************************************/
package eu.supersede.feedbackgathering.reconfiguration.enactor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.springframework.context.ApplicationContextException;

import org.json.JSONObject;
import org.json.JSONArray;

import eu.supersede.feedbackgathering.reconfiguration.enactor.common.FeedbackExecutor;
import eu.supersede.integration.api.feedback.orchestrator.types.Configuration;
import eu.supersede.integration.api.feedback.orchestrator.types.FeedbackMechanism;
//import eu.supersede.integration.api.feedback.orchestrator.types.FeedbackParameter;
import eu.supersede.integration.properties.IntegrationProperty;

public class FeedbackEnactor implements IFeedbackEnactor {

	private Integer applicationId;
	private String user;
	private String password;
	private String absoluteSourcePath;
	private String absoluteTargetPath; 
	private String sourceModel;
	private String targetModel;
	private FeedbackExecutor executor;
	
	public FeedbackEnactor(Integer appId) throws Exception {
		applicationId = appId;
		Properties props = new Properties();
		props.load(this.getClass().getResourceAsStream("/feedback.properties"));
		
		user = props.getProperty("feedback.user");
		password = props.getProperty("feedback.password");
		absoluteSourcePath = props.getProperty("feedback.absoluteSourcePath");
		absoluteTargetPath = props.getProperty("feedback.absoluteTargetPath");
		sourceModel = props.getProperty("feedback.sourceModel");
		targetModel = props.getProperty("feedback.targetModel");
		executor = new FeedbackExecutor(user, password);		
	}

	@Override
	public void reconfigureFeedbackGathering() throws Exception {
		// Get the list of configurations in the application
		List<Configuration> lstConfiguration = executor.listConfigurationsInApplication(applicationId);
		Configuration conf = null;
		
		// Find the first configuration [active] to be used
		for(Configuration c: lstConfiguration){
			//if(c.isActive()){
				conf = c;
				break;
			//}
		}
		
		if(conf != null){
			//Transform the model UML to JSON entries to update		
			
			
			//Read the Json file
			JSONObject objJson = readJsonObject();
			
			//Update feedback mechanisms
			List<FeedbackMechanism> lstMechanisms = listFeedbackMechanisms(objJson);
			for(FeedbackMechanism fm: lstMechanisms){
				//Update only mechanisms with id
				if(fm.getId() != null && !fm.getId().equals(0)){
					executor.updateFeedbackMechanismInConfigurationInApplication(fm, conf.getId(), applicationId);
				}
			}
			
			//Update parameters 
			//List<FeedbackParameter> lstParameters = listFeed
		}
		else{
			//An exception in case any configuration is active
			throw new ApplicationContextException("No configuration is active in the application: " + applicationId);
		}
	}
	
	private JSONObject readJsonObject() throws Exception{
		BufferedReader br = new BufferedReader(new FileReader(absoluteTargetPath + targetModel));
	    StringBuilder sb = new StringBuilder(); 
	    String line;
		try {
		    line = br.readLine();
		    
		    if(line != null){
			    while (line != null) {
			        sb.append(line);
			        //sb.append(System.lineSeparator());
			        line = br.readLine();
			    }
				return new JSONObject(sb.toString());
		    }
		    else{
		    	throw new ApplicationContextException("Json file is empty!");
		    }
		} finally {
		    br.close();
		}
	}
	
	private List<FeedbackMechanism> listFeedbackMechanisms(JSONObject objJson) throws Exception{
		List<FeedbackMechanism> lstMechanism = new ArrayList<>();
		FeedbackMechanism fm;
		JSONObject tmp;
		
		// Read the mechanisms to update
		JSONArray arr = objJson.names();//objJson.getJSONArray("instances");
		for (int i = 0; i < arr.length(); i++)
		{
			fm = new FeedbackMechanism();
			tmp = objJson.getJSONObject(arr.getString(i));
			fm.setId(tmp.getInt("id")); 
			fm.setOrder(tmp.getInt("order"));
			fm.setActive(tmp.getBoolean("active"));
			fm.setType(tmp.getString("type"));
			lstMechanism.add(fm);
		}
		return lstMechanism;
	}
}
