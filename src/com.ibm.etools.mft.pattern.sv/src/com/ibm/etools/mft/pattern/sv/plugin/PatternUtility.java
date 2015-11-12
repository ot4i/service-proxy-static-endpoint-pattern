/*******************************************************************************
* Copyright (c) 2005, 2011 IBM Corporation and others.
*
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*     IBM - initial API and implementation
*******************************************************************************/
package com.ibm.etools.mft.pattern.sv.plugin;

import java.util.List;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jet.JET2Context;
import org.eclipse.jet.XPathContextExtender;
import org.eclipse.wst.wsdl.Binding;
import org.eclipse.wst.wsdl.BindingOperation;
import org.eclipse.wst.wsdl.Service;
import org.eclipse.wst.wsdl.binding.soap.SOAPAddress;
import com.ibm.etools.mft.patterns.utils.WSDLValidationHelper;

public class PatternUtility {
	private static final String ROOT_SELECT = "$root";
	private static final String DEFAULT_WSDL_VALUE = "";
	private static final String ELEMENT_PORT_TYPE = "portType";
	private static final String ELEMENT_TARGET_NAMESPACE = "targetNamespace";
	private static final String ELEMENT_BINDING = "binding";
	private static final String ELEMENT_PORT = "port";
	private static final String ELEMENT_SERVICE = "service";
	private static final String ELEMENT_OPERATION = "operation";
	private static final String ELEMENT_ADDRESS = "address";
	private static final String ELEMENT_WSDL_FILE_NAME = "fileName";
	private static final String ELEMENT_WSDL_PROJECT_NAME = "projectName";
	private static final String ELEMENT_WSDL_IS_MESSAGE_SET_PROJECT = "isMessageSetProject";
	private static final String ELEMENT_WSDL_MESSAGE_SET_NAME = "messageSetName";
	private static final String MESSAGE_SET_PROJECT_NATURE = "com.ibm.etools.msg.validation.msetnature";

	/**
	 * Gets the folder name for the pattern configuration.
	 * 
	 * @param context
	 *            <code>JET2Context</code>.
	 * @param variable
	 *            Where to put the resulting value.
	 */
    public static void getPatternConfigurationFolderName(JET2Context context, String variable) {
		String folderName = com.ibm.etools.patterns.PatternMessages.PatternInstanceProject_folderName;
		context.setVariable(variable, folderName);
    }
	
	/**
	 * @return <code>true</code> if this is a message set project.
	 */
	public static boolean isMessageSetProject(IProject project) {
		try {
			return project.isNatureEnabled(MESSAGE_SET_PROJECT_NATURE);
		} catch (CoreException exception) {
			return true; // Should never happen..!
		}
	}
	
	/**
	 * Configures the WSDL file and project names depending on the type of project.
	 * 
	 * @param context
	 *            <code>JET2Context</code>.
	 * @param deploymentFile
	 *            The workspace path to the WSDL file.
	 * @param configurationElement
	 *            Where to store the WSDL configuration.
	 */
    private static void configureFileAndProjectNames(JET2Context context, String deploymentFile, Object configurationElement) {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot workspaceRoot = workspace.getRoot();		
		XPathContextExtender extender = XPathContextExtender.getInstance(context);

		int position = deploymentFile.indexOf('/');
		if (position >= 0) {
			String wsdlFileName = deploymentFile.substring(position + 1);
			position = wsdlFileName.indexOf('/');
			if (position >= 0) {
				wsdlFileName = wsdlFileName.substring(position + 1);
				extender.addTextElement(configurationElement, ELEMENT_WSDL_FILE_NAME, wsdlFileName);
			}
		}

		String wsdlProjectName = null;

		position = deploymentFile.indexOf('/');
		if (position >= 0) {
			String leadingSeparatorRemoved = deploymentFile.substring(position + 1);
			position = leadingSeparatorRemoved.indexOf('/');
			if (position >= 0) {
				wsdlProjectName = leadingSeparatorRemoved.substring(0, position);
				extender.addTextElement(configurationElement, ELEMENT_WSDL_PROJECT_NAME, wsdlProjectName);
				IProject referencedProject = workspaceRoot.getProject(wsdlProjectName);
				boolean isMessageSet = isMessageSetProject(referencedProject);
				String isMessageSetText = Boolean.toString(isMessageSet);
				extender.addTextElement(configurationElement, ELEMENT_WSDL_IS_MESSAGE_SET_PROJECT, isMessageSetText);
				if (isMessageSet == true) {
					String messageSetName = leadingSeparatorRemoved.substring(position + 1);
					position = messageSetName.indexOf('/');
					messageSetName = messageSetName.substring(0, position);
					extender.addTextElement(configurationElement, ELEMENT_WSDL_MESSAGE_SET_NAME, messageSetName);
				}
			}
		}
    }
    
	/**
	 * Configures the deployment WSDL configuration in the model.
	 *  
	 * @param context
	 *            <code>JET2Context</code>.
	 * @param select
	 *            Where to get the deployment WSDL.
	 * @param elementName
	 *            Location to store the information.
	 */
	@SuppressWarnings("unused")
    public static void configureWSDL(JET2Context context, String select, String elementName) {
		XPathContextExtender extender = XPathContextExtender.getInstance(context);
	    Object currentContext = extender.currentXPathContextObject();
	    Object deploymentElement = extender.resolveSingle(currentContext, select);
	    String deploymentFile = extender.getContent(deploymentElement);
		WSDLValidationHelper validator = WSDLValidationHelper.getInstance();
	    Object rootElement = extender.resolveSingle(currentContext, ROOT_SELECT);
	    Object configurationElement = extender.addElement(rootElement, elementName);
	    
		validator.clearData();
	    
	    String addressLocation, defaultPortTypeName, targetNamespace, bindingName, portName, serviceName, operationName;
	    addressLocation = operationName = defaultPortTypeName = targetNamespace = 
	    	bindingName = portName = serviceName = DEFAULT_WSDL_VALUE;
	    
	    try {
			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			IWorkspaceRoot workspaceRoot = workspace.getRoot();		
			IFile resourceFile = (IFile) workspaceRoot.findMember(deploymentFile);

			// Did we find the definition?
			if (resourceFile != null) {
				validator.validate(resourceFile);
	
				defaultPortTypeName = validator.getDefaultPortTypeName();
				targetNamespace = validator.getTargetNamespace();
				Binding binding = validator.getDefaultBinding();
				bindingName = binding.getQName().getLocalPart();
				portName = validator.getPort(binding).getName();
				Service service = validator.getService(binding);		
				serviceName = service.getQName().getLocalPart();

				List<Object> operations = validator.getBindingOperations();
				if (operations.size() > 0) {
					BindingOperation operation = (BindingOperation) operations.get(0);
					operationName = operation.getName();
				}
				
				for (Object currentElement : validator.getPort(binding).getExtensibilityElements()) {
					if (currentElement instanceof SOAPAddress) {
						SOAPAddress address = (SOAPAddress) currentElement;
						addressLocation = address.getLocationURI(); break;
					}
				}
			}			
	    } catch (Throwable throwable) { 
		    addressLocation = operationName = defaultPortTypeName = targetNamespace = 
		    	bindingName = portName = serviceName = DEFAULT_WSDL_VALUE;
	    }

		validator.clearData();
	    
		Object portTypeElement = extender.addTextElement(configurationElement, ELEMENT_PORT_TYPE, defaultPortTypeName);
		Object namespaceElement = extender.addTextElement(configurationElement, ELEMENT_TARGET_NAMESPACE, targetNamespace);
		Object bindingElement = extender.addTextElement(configurationElement, ELEMENT_BINDING, bindingName);		
		Object portElement = extender.addTextElement(configurationElement, ELEMENT_PORT, portName);
		Object serviceElement = extender.addTextElement(configurationElement, ELEMENT_SERVICE, serviceName);
		Object operationElement = extender.addTextElement(configurationElement, ELEMENT_OPERATION, operationName);
		Object addressElement = extender.addTextElement(configurationElement, ELEMENT_ADDRESS, addressLocation);
		
		
		configureFileAndProjectNames(context, deploymentFile, configurationElement);

    }

    /**
     * Transform broker schema to schema folder name
     * 
     * @param context
	 *            <code>JET2Context</code>.
	 * @param brokerSchema
	 *            The broker schema.
	 * @param variable
	 *            Where to put the resulting value.
	 */
    public static void getBrokerSchemaFolderName(JET2Context context, String select, String variable) {
    	XPathContextExtender extender = XPathContextExtender.getInstance(context);
	    Object currentContext = extender.currentXPathContextObject();
	    Object element = extender.resolveSingle(currentContext, select);
    	String brokerSchema = extender.getContent(element);
    	if (brokerSchema != null) {
    		brokerSchema = brokerSchema.replace(".", "/");
    	}
    	context.setVariable(variable, brokerSchema);
    }
}
