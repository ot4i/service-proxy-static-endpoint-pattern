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
package com.ibm.etools.mft.pattern.sv.sp.ssp;

import java.util.Map;
import org.eclipse.osgi.util.NLS;
import com.ibm.etools.mft.pattern.sv.plugin.PatternBundle;
import com.ibm.etools.mft.pattern.sv.plugin.PatternPlugin;
import com.ibm.etools.patterns.model.base.IPatternBundle;

public class PatternMessages extends PatternBundle implements IPatternBundle {
	private static final String BUNDLE_NAME = "com.ibm.etools.mft.pattern.sv.sp.ssp.messages"; //$NON-NLS-1$
	private static final Map<String, String> map;	
	private static final String[] enumerations = {
	};

	public static String getStringStatic(String key) {
		return map.get(key);
	}
	
	public String getString(String key) {
		return map.get(key);
	}
	
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_group_instanceName;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_group_instanceName_description;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_group_serviceInformation;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_group_serviceInformation_description;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_group_log;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_group_log_description;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_group_errorHandling;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_group_errorHandling_description;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_group_general;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_group_general_description;		

	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_pov_root_instanceName;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_pov_root_instanceName_default;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_pov_root_instanceName_watermark;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_pov_root_serviceWSDL;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_pov_root_serviceWSDL_watermark;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_pov_root_targetEndpoint;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_pov_root_targetEndpoint_watermark;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_pov_root_proxyUrl;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_pov_root_proxyUrl_watermark;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_pov_root_validationofRequest;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_pov_root_validationofRequest_watermark;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_pov_root_validationofResponse;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_pov_root_validationofResponse_watermark;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_pov_root_loggingRequired;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_pov_root_loggingRequired_default;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_pov_root_loggingRequired_watermark;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_pov_root_logQueueManager;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_pov_root_logQueueManager_watermark;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_pov_root_logQueue;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_pov_root_logQueue_watermark;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_pov_root_errorMessageRequired;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_pov_root_errorMessageRequired_default;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_pov_root_errorMessageRequired_watermark;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_pov_root_errorQueueManager;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_pov_root_errorQueueManager_watermark;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_pov_root_errorQueue;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_pov_root_errorQueue_watermark;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_pov_root_brokerSchema;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_pov_root_brokerSchema_watermark;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_pov_root_flowPrefix;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_pov_root_flowPrefix_watermark;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_pov_root_flowSuffix;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_pov_root_flowSuffix_watermark;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_pov_root_queuePrefix;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_pov_root_queuePrefix_watermark;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_pov_root_queueSuffix;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_pov_root_queueSuffix_watermark;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_pov_root_shortDescription;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_pov_root_shortDescription_default;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_pov_root_shortDescription_watermark;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_pov_root_longDescription;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_pov_root_longDescription_default;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_pov_root_longDescription_watermark;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_pov_validationEnum_None;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_pov_validationEnum_contentAndValue;		

	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_esql_1;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_esql_2;
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_esql_3;
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_esql_4;
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_esql_5;
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_esql_6;
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_esql_7;
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_esql_8;
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_flow_1;		
	
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_summary_1;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_summary_2;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_summary_3;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_summary_4;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_summary_5;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_summary_6;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_summary_7;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_summary_8;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_summary_9;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_summary_14;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_summary_14_queueManager;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_summary_15;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_summary_15_queueManager;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_summary_22;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_summary_23;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_summary_25;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_summary_26;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_summary_27;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_summary_28;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_summary_29;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_summary_30;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_summary_31;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_summary_32;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_summary_33;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_summary_34;		
	public static String com_ibm_etools_mft_pattern_sv_sp_ssp_summary_35;		
	
	static {
		NLS.initializeMessages(BUNDLE_NAME, PatternMessages.class);
		PatternPlugin.addBundle(PatternMessages.class);
		map = PatternBundle.createMessageMap(PatternMessages.class, enumerations);
	}
}
