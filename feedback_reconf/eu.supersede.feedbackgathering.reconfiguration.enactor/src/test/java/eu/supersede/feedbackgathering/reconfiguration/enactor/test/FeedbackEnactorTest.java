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
package eu.supersede.feedbackgathering.reconfiguration.enactor.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import eu.supersede.feedbackgathering.reconfiguration.enactor.FeedbackEnactor;

public class FeedbackEnactorTest {

	FeedbackEnactor fe;
	Integer appId = 4;
	
	@Before
	public void setup() throws Exception{
			fe = new FeedbackEnactor(appId);			
	}
	
	@Test
	public void testReconfigureFeedbackGathering() throws Exception {
		fe.reconfigureFeedbackGathering();
	}

}
