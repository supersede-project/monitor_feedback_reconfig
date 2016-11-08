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
package eu.supersede.feedbackgathering.reconfiguration.enactor.common;

import java.util.List;

import eu.supersede.integration.api.feedback.orchestrator.types.Configuration;
import eu.supersede.integration.api.feedback.orchestrator.types.FeedbackMechanism;
import eu.supersede.integration.api.feedback.orchestrator.types.FeedbackParameter;
import eu.supersede.integration.api.feedback.proxies.FeedbackOrchestratorProxy;

public class FeedbackExecutor implements IFeedbackExecutor{

	private FeedbackOrchestratorProxy<?, ?> proxy;
	private String token;
	private String user;
	private String password;
	
	public FeedbackExecutor(String user, String password)  throws Exception {
		proxy = new FeedbackOrchestratorProxy<Object, Object>();
		this.user = user;
		this.password = password;
	}
	
	@Override
	public List<Configuration> listConfigurationsInApplication(Integer applicationId) throws Exception {
		return proxy.listConfigurationsInApplication(applicationId);
	}

	@Override
	public FeedbackMechanism updateFeedbackMechanismInConfigurationInApplication(FeedbackMechanism fm,
			Integer configurationId, Integer applicationId) throws Exception {
    	token = proxy.authenticate(user, password);
    	return proxy.updateFeedbackMechanismInConfigurationInApplication(fm, configurationId, applicationId, token);
	}

	@Override
	public FeedbackParameter updateFeedbackParameter(FeedbackParameter fp, Integer applicationId) throws Exception {
		token = proxy.authenticate(user, password);
		return proxy.updateFeedbackParameterInApplication(fp, applicationId, token);
	}
	
}
