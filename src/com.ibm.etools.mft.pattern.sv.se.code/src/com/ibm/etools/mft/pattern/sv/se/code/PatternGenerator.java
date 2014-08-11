/*******************************************************************************
 * Copyright (c) 2014 IBM Corporation and other Contributors
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM - initial implementation
 *******************************************************************************/
package com.ibm.etools.mft.pattern.sv.se.code;

import com.ibm.broker.config.appdev.MessageFlow;
import com.ibm.broker.config.appdev.Node;
import com.ibm.broker.config.appdev.patterns.GeneratePatternInstanceTransform;
import com.ibm.broker.config.appdev.patterns.PatternInstanceManager;

public class PatternGenerator implements GeneratePatternInstanceTransform {
	
	
	private static final String PROJECT_NAME = "StaticEndpointProject";
	private static final String PROXY_FLOW_NAME = "mqsi/Proxy.msgflow";
	private static final String LOG_FLOW_NAME = "mqsi/Log.subflow";
	private static final String ERROR_FLOW_NAME = "mqsi/Error.subflow";

	private static final String LOG_NODE_NAME = "Log";
	private static final String ERROR_NODE_NAME = "Error";
	
	private static final String LOG_ENABLED_PROPERTY_ID = "pp6";
	
	private static final String ERROR_ENABLED_PROPERTY_ID = "pp11";

	private PatternInstanceManager patternInstanceManager;
	
	@Override
	public void onGeneratePatternInstance(PatternInstanceManager patternInstanceManager) {
		
		// The location for the generated projects 
		String location = patternInstanceManager.getWorkspaceLocation();
		
		// The pattern instance name for this generation
		String patternInstanceName = patternInstanceManager.getPatternInstanceName();
		
		this.patternInstanceManager = patternInstanceManager;
		
		//Remove Log flow is logging disabled
		boolean logEnabled = patternInstanceManager.getParameterValue(LOG_ENABLED_PROPERTY_ID).equals("true");
		
		if (!logEnabled) {
			MessageFlow logMessageFlow = patternInstanceManager.getMessageFlow(PROJECT_NAME, LOG_FLOW_NAME);
			patternInstanceManager.removeMessageFlow(logMessageFlow);
			//Remove Log sublflow node
			this.removeNodeFromProxyFlow(LOG_NODE_NAME);
		}
		
		//Remove Error flow is logging disabled
		boolean errorEnabled = patternInstanceManager.getParameterValue(ERROR_ENABLED_PROPERTY_ID).equals("true");
		
		if (!errorEnabled) {
			MessageFlow errorMessageFlow = patternInstanceManager.getMessageFlow(PROJECT_NAME, ERROR_FLOW_NAME);
			patternInstanceManager.removeMessageFlow(errorMessageFlow);
			//Remove Error sublflow node
			this.removeNodeFromProxyFlow(ERROR_NODE_NAME);
		}
		
	}
	
	private void removeNodeFromProxyFlow(String nodeName) {
		MessageFlow proxyFlow = this.patternInstanceManager.getMessageFlow(PROJECT_NAME, PROXY_FLOW_NAME);

		if (proxyFlow != null) {
			Node node = proxyFlow.getNodeByName(nodeName);
			if (node != null) {
				proxyFlow.removeNode(node);
			}
		}
	}

}