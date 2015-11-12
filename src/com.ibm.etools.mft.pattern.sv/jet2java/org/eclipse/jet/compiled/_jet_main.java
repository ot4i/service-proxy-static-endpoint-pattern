package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_main implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_ws = "org.eclipse.jet.workspaceTags"; //$NON-NLS-1$

    public _jet_main() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_setVariable_4_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            4, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/*", //$NON-NLS-1$
                "root", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_7_1 = new TagInfo("c:set", //$NON-NLS-1$
            7, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_7_42 = new TagInfo("c:get", //$NON-NLS-1$
            7, 42,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_8_1 = new TagInfo("c:set", //$NON-NLS-1$
            8, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_42 = new TagInfo("c:get", //$NON-NLS-1$
            8, 42,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "namespace-uri($root)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_9_1 = new TagInfo("c:set", //$NON-NLS-1$
            9, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_project_16_1 = new TagInfo("ws:project", //$NON-NLS-1$
            16, 1,
            new String[] {
                "name", //$NON-NLS-1$
            },
            new String[] {
                "{$root/@projectname}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_17_2 = new TagInfo("ws:file", //$NON-NLS-1$
            17, 2,
            new String[] {
                "encoding", //$NON-NLS-1$
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                ".project", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "sv/sp/ssp/templates/root/project.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_18_2 = new TagInfo("c:set", //$NON-NLS-1$
            18, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_37 = new TagInfo("c:get", //$NON-NLS-1$
            18, 37,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_76 = new TagInfo("c:get", //$NON-NLS-1$
            18, 76,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowSuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_19_2 = new TagInfo("c:set", //$NON-NLS-1$
            19, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_35 = new TagInfo("c:get", //$NON-NLS-1$
            19, 35,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_72 = new TagInfo("c:get", //$NON-NLS-1$
            19, 72,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowSuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_20_2 = new TagInfo("c:set", //$NON-NLS-1$
            20, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "proxy", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_37 = new TagInfo("c:get", //$NON-NLS-1$
            20, 37,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_76 = new TagInfo("c:get", //$NON-NLS-1$
            20, 76,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowSuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_23_2 = new TagInfo("c:set", //$NON-NLS-1$
            23, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "errorFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_41 = new TagInfo("c:get", //$NON-NLS-1$
            23, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_80 = new TagInfo("c:get", //$NON-NLS-1$
            23, 80,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowSuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_24_2 = new TagInfo("c:set", //$NON-NLS-1$
            24, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "logFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_39 = new TagInfo("c:get", //$NON-NLS-1$
            24, 39,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_76 = new TagInfo("c:get", //$NON-NLS-1$
            24, 76,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowSuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_25_2 = new TagInfo("c:set", //$NON-NLS-1$
            25, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_40 = new TagInfo("c:get", //$NON-NLS-1$
            25, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_79 = new TagInfo("c:get", //$NON-NLS-1$
            25, 79,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowSuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_26_2 = new TagInfo("c:set", //$NON-NLS-1$
            26, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowURI", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_43 = new TagInfo("c:get", //$NON-NLS-1$
            26, 43,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_81 = new TagInfo("c:get", //$NON-NLS-1$
            26, 81,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_27_2 = new TagInfo("c:set", //$NON-NLS-1$
            27, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_27_46 = new TagInfo("c:get", //$NON-NLS-1$
            27, 46,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_27_84 = new TagInfo("c:get", //$NON-NLS-1$
            27, 84,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_28_2 = new TagInfo("c:set", //$NON-NLS-1$
            28, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_50 = new TagInfo("c:get", //$NON-NLS-1$
            28, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_88 = new TagInfo("c:get", //$NON-NLS-1$
            28, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_29_2 = new TagInfo("ws:file", //$NON-NLS-1$
            29, 2,
            new String[] {
                "encoding", //$NON-NLS-1$
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                "{$root/@brokerSchema2}{$root/@thisFlow}.msgflow", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "sv/sp/ssp/templates/root/Proxy.msgflow.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_30_2 = new TagInfo("ws:file", //$NON-NLS-1$
            30, 2,
            new String[] {
                "encoding", //$NON-NLS-1$
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                "{$root/@brokerSchema2}Proxy.esql", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "sv/sp/ssp/templates/root/Proxy.esql.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_33_2 = new TagInfo("c:set", //$NON-NLS-1$
            33, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_40 = new TagInfo("c:get", //$NON-NLS-1$
            33, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_79 = new TagInfo("c:get", //$NON-NLS-1$
            33, 79,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowSuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_34_2 = new TagInfo("c:set", //$NON-NLS-1$
            34, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowURI", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_43 = new TagInfo("c:get", //$NON-NLS-1$
            34, 43,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_81 = new TagInfo("c:get", //$NON-NLS-1$
            34, 81,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_35_2 = new TagInfo("c:set", //$NON-NLS-1$
            35, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_35_46 = new TagInfo("c:get", //$NON-NLS-1$
            35, 46,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_35_84 = new TagInfo("c:get", //$NON-NLS-1$
            35, 84,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_36_2 = new TagInfo("c:set", //$NON-NLS-1$
            36, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_50 = new TagInfo("c:get", //$NON-NLS-1$
            36, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_88 = new TagInfo("c:get", //$NON-NLS-1$
            36, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_37_2 = new TagInfo("ws:file", //$NON-NLS-1$
            37, 2,
            new String[] {
                "encoding", //$NON-NLS-1$
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                "{$root/@brokerSchema2}Error.esql", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "sv/sp/ssp/templates/root/Error.esql.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_38_2 = new TagInfo("ws:file", //$NON-NLS-1$
            38, 2,
            new String[] {
                "encoding", //$NON-NLS-1$
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                "{$root/@brokerSchema2}{$root/@thisFlow}.subflow", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "sv/sp/ssp/templates/root/Error.subflow.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_41_2 = new TagInfo("c:if", //$NON-NLS-1$
            41, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_42_3 = new TagInfo("c:set", //$NON-NLS-1$
            42, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_41 = new TagInfo("c:get", //$NON-NLS-1$
            42, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_78 = new TagInfo("c:get", //$NON-NLS-1$
            42, 78,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/flowSuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_43_3 = new TagInfo("c:set", //$NON-NLS-1$
            43, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowURI", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_43_44 = new TagInfo("c:get", //$NON-NLS-1$
            43, 44,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_43_82 = new TagInfo("c:get", //$NON-NLS-1$
            43, 82,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_44_3 = new TagInfo("c:set", //$NON-NLS-1$
            44, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_44_47 = new TagInfo("c:get", //$NON-NLS-1$
            44, 47,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_44_85 = new TagInfo("c:get", //$NON-NLS-1$
            44, 85,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_45_3 = new TagInfo("c:set", //$NON-NLS-1$
            45, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_45_51 = new TagInfo("c:get", //$NON-NLS-1$
            45, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_45_89 = new TagInfo("c:get", //$NON-NLS-1$
            45, 89,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_46_3 = new TagInfo("ws:file", //$NON-NLS-1$
            46, 3,
            new String[] {
                "encoding", //$NON-NLS-1$
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                "{$root/@brokerSchema2}Log.esql", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "sv/sp/ssp/templates/root/Log.esql.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_47_3 = new TagInfo("ws:file", //$NON-NLS-1$
            47, 3,
            new String[] {
                "encoding", //$NON-NLS-1$
                "path", //$NON-NLS-1$
                "replace", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                "{$root/@brokerSchema2}{$root/@thisFlow}.subflow", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "sv/sp/ssp/templates/root/Log.subflow.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_project_54_1 = new TagInfo("ws:project", //$NON-NLS-1$
            54, 1,
            new String[] {
                "name", //$NON-NLS-1$
            },
            new String[] {
                "{$root/instanceName}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_55_2 = new TagInfo("ws:file", //$NON-NLS-1$
            55, 2,
            new String[] {
                "encoding", //$NON-NLS-1$
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "UTF-8", //$NON-NLS-1$
                "sv/sp/ssp/templates/root/summary.jet", //$NON-NLS-1$
                "{$patternConfigurationFolderName}/{$root/instanceName}_summary.html", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_57_2 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            57, 2,
            new String[] {
                "src", //$NON-NLS-1$
                "srcContext", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "css/summary.css", //$NON-NLS-1$
                "transform", //$NON-NLS-1$
                "{$patternConfigurationFolderName}/summary.css", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_folder_60_2 = new TagInfo("ws:folder", //$NON-NLS-1$
            60, 2,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "{$patternConfigurationFolderName}/icons", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_61_3 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            61, 3,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "srcContext", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "icons/header-gradient.gif", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "transform", //$NON-NLS-1$
                "header-gradient.gif", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_63_3 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            63, 3,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "srcContext", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "icons/section.gif", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "transform", //$NON-NLS-1$
                "section.gif", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_65_3 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            65, 3,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "srcContext", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "icons/summary-title.gif", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "transform", //$NON-NLS-1$
                "summary-title.gif", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_67_3 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            67, 3,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "srcContext", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "icons/title-gradient.gif", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "transform", //$NON-NLS-1$
                "title-gradient.gif", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write(NL);         
        // Define variables the root element in the model 
        RuntimeTagElement _jettag_c_setVariable_4_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_4_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_4_1.setRuntimeParent(null);
        _jettag_c_setVariable_4_1.setTagInfo(_td_c_setVariable_4_1);
        _jettag_c_setVariable_4_1.doStart(context, out);
        _jettag_c_setVariable_4_1.doEnd();
        out.write(NL);         
        // Set top level pattern characteristics as attributes of root 
        RuntimeTagElement _jettag_c_set_7_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_7_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_7_1.setRuntimeParent(null);
        _jettag_c_set_7_1.setTagInfo(_td_c_set_7_1);
        _jettag_c_set_7_1.doStart(context, out);
        JET2Writer _jettag_c_set_7_1_saved_out = out;
        while (_jettag_c_set_7_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_get_7_42 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_42); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_7_42.setRuntimeParent(_jettag_c_set_7_1);
            _jettag_c_get_7_42.setTagInfo(_td_c_get_7_42);
            _jettag_c_get_7_42.doStart(context, out);
            _jettag_c_get_7_42.doEnd();
            out.write("_Flows");  //$NON-NLS-1$        
            _jettag_c_set_7_1.handleBodyContent(out);
        }
        out = _jettag_c_set_7_1_saved_out;
        _jettag_c_set_7_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_set_8_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_8_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_8_1.setRuntimeParent(null);
        _jettag_c_set_8_1.setTagInfo(_td_c_set_8_1);
        _jettag_c_set_8_1.doStart(context, out);
        JET2Writer _jettag_c_set_8_1_saved_out = out;
        while (_jettag_c_set_8_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_get_8_42 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_42); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_8_42.setRuntimeParent(_jettag_c_set_8_1);
            _jettag_c_get_8_42.setTagInfo(_td_c_get_8_42);
            _jettag_c_get_8_42.doStart(context, out);
            _jettag_c_get_8_42.doEnd();
            _jettag_c_set_8_1.handleBodyContent(out);
        }
        out = _jettag_c_set_8_1_saved_out;
        _jettag_c_set_8_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_set_9_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_9_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_9_1.setRuntimeParent(null);
        _jettag_c_set_9_1.setTagInfo(_td_c_set_9_1);
        _jettag_c_set_9_1.doStart(context, out);
        JET2Writer _jettag_c_set_9_1_saved_out = out;
        while (_jettag_c_set_9_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("1.0");  //$NON-NLS-1$        
            _jettag_c_set_9_1.handleBodyContent(out);
        }
        out = _jettag_c_set_9_1_saved_out;
        _jettag_c_set_9_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        // Load the WSDL data 
 com.ibm.etools.mft.pattern.sv.plugin.PatternUtility.configureWSDL(
	context, "$root/serviceWSDL", "serviceWSDLData"); 
        out.write(NL);         
        // Build message flow project 
        RuntimeTagElement _jettag_ws_project_16_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "project", "ws:project", _td_ws_project_16_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_project_16_1.setRuntimeParent(null);
        _jettag_ws_project_16_1.setTagInfo(_td_ws_project_16_1);
        _jettag_ws_project_16_1.doStart(context, out);
        while (_jettag_ws_project_16_1.okToProcessBody()) {
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_17_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_17_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_17_2.setRuntimeParent(_jettag_ws_project_16_1);
            _jettag_ws_file_17_2.setTagInfo(_td_ws_file_17_2);
            _jettag_ws_file_17_2.doStart(context, out);
            _jettag_ws_file_17_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_18_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_18_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_18_2.setRuntimeParent(_jettag_ws_project_16_1);
            _jettag_c_set_18_2.setTagInfo(_td_c_set_18_2);
            _jettag_c_set_18_2.doStart(context, out);
            JET2Writer _jettag_c_set_18_2_saved_out = out;
            while (_jettag_c_set_18_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_18_37 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_37); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_18_37.setRuntimeParent(_jettag_c_set_18_2);
                _jettag_c_get_18_37.setTagInfo(_td_c_get_18_37);
                _jettag_c_get_18_37.doStart(context, out);
                _jettag_c_get_18_37.doEnd();
                out.write("Error");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_18_76 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_76); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_18_76.setRuntimeParent(_jettag_c_set_18_2);
                _jettag_c_get_18_76.setTagInfo(_td_c_get_18_76);
                _jettag_c_get_18_76.doStart(context, out);
                _jettag_c_get_18_76.doEnd();
                _jettag_c_set_18_2.handleBodyContent(out);
            }
            out = _jettag_c_set_18_2_saved_out;
            _jettag_c_set_18_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_19_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_19_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_19_2.setRuntimeParent(_jettag_ws_project_16_1);
            _jettag_c_set_19_2.setTagInfo(_td_c_set_19_2);
            _jettag_c_set_19_2.doStart(context, out);
            JET2Writer _jettag_c_set_19_2_saved_out = out;
            while (_jettag_c_set_19_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_19_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_35); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_19_35.setRuntimeParent(_jettag_c_set_19_2);
                _jettag_c_get_19_35.setTagInfo(_td_c_get_19_35);
                _jettag_c_get_19_35.doStart(context, out);
                _jettag_c_get_19_35.doEnd();
                out.write("Log");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_19_72 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_72); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_19_72.setRuntimeParent(_jettag_c_set_19_2);
                _jettag_c_get_19_72.setTagInfo(_td_c_get_19_72);
                _jettag_c_get_19_72.doStart(context, out);
                _jettag_c_get_19_72.doEnd();
                _jettag_c_set_19_2.handleBodyContent(out);
            }
            out = _jettag_c_set_19_2_saved_out;
            _jettag_c_set_19_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_20_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_20_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_20_2.setRuntimeParent(_jettag_ws_project_16_1);
            _jettag_c_set_20_2.setTagInfo(_td_c_set_20_2);
            _jettag_c_set_20_2.doStart(context, out);
            JET2Writer _jettag_c_set_20_2_saved_out = out;
            while (_jettag_c_set_20_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_20_37 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_37); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_20_37.setRuntimeParent(_jettag_c_set_20_2);
                _jettag_c_get_20_37.setTagInfo(_td_c_get_20_37);
                _jettag_c_get_20_37.doStart(context, out);
                _jettag_c_get_20_37.doEnd();
                out.write("Proxy");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_20_76 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_76); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_20_76.setRuntimeParent(_jettag_c_set_20_2);
                _jettag_c_get_20_76.setTagInfo(_td_c_get_20_76);
                _jettag_c_get_20_76.doStart(context, out);
                _jettag_c_get_20_76.doEnd();
                _jettag_c_set_20_2.handleBodyContent(out);
            }
            out = _jettag_c_set_20_2_saved_out;
            _jettag_c_set_20_2.doEnd();
            out.write(NL);         
            out.write(NL);         
            // Main proxy flow 
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_23_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_23_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_23_2.setRuntimeParent(_jettag_ws_project_16_1);
            _jettag_c_set_23_2.setTagInfo(_td_c_set_23_2);
            _jettag_c_set_23_2.doStart(context, out);
            JET2Writer _jettag_c_set_23_2_saved_out = out;
            while (_jettag_c_set_23_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_23_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_41); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_23_41.setRuntimeParent(_jettag_c_set_23_2);
                _jettag_c_get_23_41.setTagInfo(_td_c_get_23_41);
                _jettag_c_get_23_41.doStart(context, out);
                _jettag_c_get_23_41.doEnd();
                out.write("Error");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_23_80 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_80); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_23_80.setRuntimeParent(_jettag_c_set_23_2);
                _jettag_c_get_23_80.setTagInfo(_td_c_get_23_80);
                _jettag_c_get_23_80.doStart(context, out);
                _jettag_c_get_23_80.doEnd();
                _jettag_c_set_23_2.handleBodyContent(out);
            }
            out = _jettag_c_set_23_2_saved_out;
            _jettag_c_set_23_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_24_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_24_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_24_2.setRuntimeParent(_jettag_ws_project_16_1);
            _jettag_c_set_24_2.setTagInfo(_td_c_set_24_2);
            _jettag_c_set_24_2.doStart(context, out);
            JET2Writer _jettag_c_set_24_2_saved_out = out;
            while (_jettag_c_set_24_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_24_39 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_39); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_24_39.setRuntimeParent(_jettag_c_set_24_2);
                _jettag_c_get_24_39.setTagInfo(_td_c_get_24_39);
                _jettag_c_get_24_39.doStart(context, out);
                _jettag_c_get_24_39.doEnd();
                out.write("Log");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_24_76 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_76); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_24_76.setRuntimeParent(_jettag_c_set_24_2);
                _jettag_c_get_24_76.setTagInfo(_td_c_get_24_76);
                _jettag_c_get_24_76.doStart(context, out);
                _jettag_c_get_24_76.doEnd();
                _jettag_c_set_24_2.handleBodyContent(out);
            }
            out = _jettag_c_set_24_2_saved_out;
            _jettag_c_set_24_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_25_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_25_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_25_2.setRuntimeParent(_jettag_ws_project_16_1);
            _jettag_c_set_25_2.setTagInfo(_td_c_set_25_2);
            _jettag_c_set_25_2.doStart(context, out);
            JET2Writer _jettag_c_set_25_2_saved_out = out;
            while (_jettag_c_set_25_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_25_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_40); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_25_40.setRuntimeParent(_jettag_c_set_25_2);
                _jettag_c_get_25_40.setTagInfo(_td_c_get_25_40);
                _jettag_c_get_25_40.doStart(context, out);
                _jettag_c_get_25_40.doEnd();
                out.write("Proxy");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_25_79 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_79); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_25_79.setRuntimeParent(_jettag_c_set_25_2);
                _jettag_c_get_25_79.setTagInfo(_td_c_get_25_79);
                _jettag_c_get_25_79.doStart(context, out);
                _jettag_c_get_25_79.doEnd();
                _jettag_c_set_25_2.handleBodyContent(out);
            }
            out = _jettag_c_set_25_2_saved_out;
            _jettag_c_set_25_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_26_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_26_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_26_2.setRuntimeParent(_jettag_ws_project_16_1);
            _jettag_c_set_26_2.setTagInfo(_td_c_set_26_2);
            _jettag_c_set_26_2.doStart(context, out);
            JET2Writer _jettag_c_set_26_2_saved_out = out;
            while (_jettag_c_set_26_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_26_43 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_43); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_26_43.setRuntimeParent(_jettag_c_set_26_2);
                _jettag_c_get_26_43.setTagInfo(_td_c_get_26_43);
                _jettag_c_get_26_43.doStart(context, out);
                _jettag_c_get_26_43.doEnd();
                RuntimeTagElement _jettag_c_get_26_81 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_81); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_26_81.setRuntimeParent(_jettag_c_set_26_2);
                _jettag_c_get_26_81.setTagInfo(_td_c_get_26_81);
                _jettag_c_get_26_81.doStart(context, out);
                _jettag_c_get_26_81.doEnd();
                _jettag_c_set_26_2.handleBodyContent(out);
            }
            out = _jettag_c_set_26_2_saved_out;
            _jettag_c_set_26_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_27_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_27_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_27_2.setRuntimeParent(_jettag_ws_project_16_1);
            _jettag_c_set_27_2.setTagInfo(_td_c_set_27_2);
            _jettag_c_set_27_2.doStart(context, out);
            JET2Writer _jettag_c_set_27_2_saved_out = out;
            while (_jettag_c_set_27_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_27_46 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_46); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_27_46.setRuntimeParent(_jettag_c_set_27_2);
                _jettag_c_get_27_46.setTagInfo(_td_c_get_27_46);
                _jettag_c_get_27_46.doStart(context, out);
                _jettag_c_get_27_46.doEnd();
                RuntimeTagElement _jettag_c_get_27_84 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_84); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_27_84.setRuntimeParent(_jettag_c_set_27_2);
                _jettag_c_get_27_84.setTagInfo(_td_c_get_27_84);
                _jettag_c_get_27_84.doStart(context, out);
                _jettag_c_get_27_84.doEnd();
                _jettag_c_set_27_2.handleBodyContent(out);
            }
            out = _jettag_c_set_27_2_saved_out;
            _jettag_c_set_27_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_28_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_28_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_28_2.setRuntimeParent(_jettag_ws_project_16_1);
            _jettag_c_set_28_2.setTagInfo(_td_c_set_28_2);
            _jettag_c_set_28_2.doStart(context, out);
            JET2Writer _jettag_c_set_28_2_saved_out = out;
            while (_jettag_c_set_28_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_28_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_28_50.setRuntimeParent(_jettag_c_set_28_2);
                _jettag_c_get_28_50.setTagInfo(_td_c_get_28_50);
                _jettag_c_get_28_50.doStart(context, out);
                _jettag_c_get_28_50.doEnd();
                RuntimeTagElement _jettag_c_get_28_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_88); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_28_88.setRuntimeParent(_jettag_c_set_28_2);
                _jettag_c_get_28_88.setTagInfo(_td_c_get_28_88);
                _jettag_c_get_28_88.doStart(context, out);
                _jettag_c_get_28_88.doEnd();
                _jettag_c_set_28_2.handleBodyContent(out);
            }
            out = _jettag_c_set_28_2_saved_out;
            _jettag_c_set_28_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_29_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_29_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_29_2.setRuntimeParent(_jettag_ws_project_16_1);
            _jettag_ws_file_29_2.setTagInfo(_td_ws_file_29_2);
            _jettag_ws_file_29_2.doStart(context, out);
            _jettag_ws_file_29_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_30_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_30_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_30_2.setRuntimeParent(_jettag_ws_project_16_1);
            _jettag_ws_file_30_2.setTagInfo(_td_ws_file_30_2);
            _jettag_ws_file_30_2.doStart(context, out);
            _jettag_ws_file_30_2.doEnd();
            out.write("   ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            // Error subflow
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_33_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_33_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_33_2.setRuntimeParent(_jettag_ws_project_16_1);
            _jettag_c_set_33_2.setTagInfo(_td_c_set_33_2);
            _jettag_c_set_33_2.doStart(context, out);
            JET2Writer _jettag_c_set_33_2_saved_out = out;
            while (_jettag_c_set_33_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_33_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_40); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_33_40.setRuntimeParent(_jettag_c_set_33_2);
                _jettag_c_get_33_40.setTagInfo(_td_c_get_33_40);
                _jettag_c_get_33_40.doStart(context, out);
                _jettag_c_get_33_40.doEnd();
                out.write("Error");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_33_79 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_79); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_33_79.setRuntimeParent(_jettag_c_set_33_2);
                _jettag_c_get_33_79.setTagInfo(_td_c_get_33_79);
                _jettag_c_get_33_79.doStart(context, out);
                _jettag_c_get_33_79.doEnd();
                _jettag_c_set_33_2.handleBodyContent(out);
            }
            out = _jettag_c_set_33_2_saved_out;
            _jettag_c_set_33_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_34_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_34_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_34_2.setRuntimeParent(_jettag_ws_project_16_1);
            _jettag_c_set_34_2.setTagInfo(_td_c_set_34_2);
            _jettag_c_set_34_2.doStart(context, out);
            JET2Writer _jettag_c_set_34_2_saved_out = out;
            while (_jettag_c_set_34_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_34_43 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_43); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_34_43.setRuntimeParent(_jettag_c_set_34_2);
                _jettag_c_get_34_43.setTagInfo(_td_c_get_34_43);
                _jettag_c_get_34_43.doStart(context, out);
                _jettag_c_get_34_43.doEnd();
                RuntimeTagElement _jettag_c_get_34_81 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_81); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_34_81.setRuntimeParent(_jettag_c_set_34_2);
                _jettag_c_get_34_81.setTagInfo(_td_c_get_34_81);
                _jettag_c_get_34_81.doStart(context, out);
                _jettag_c_get_34_81.doEnd();
                _jettag_c_set_34_2.handleBodyContent(out);
            }
            out = _jettag_c_set_34_2_saved_out;
            _jettag_c_set_34_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_35_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_35_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_35_2.setRuntimeParent(_jettag_ws_project_16_1);
            _jettag_c_set_35_2.setTagInfo(_td_c_set_35_2);
            _jettag_c_set_35_2.doStart(context, out);
            JET2Writer _jettag_c_set_35_2_saved_out = out;
            while (_jettag_c_set_35_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_35_46 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_46); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_35_46.setRuntimeParent(_jettag_c_set_35_2);
                _jettag_c_get_35_46.setTagInfo(_td_c_get_35_46);
                _jettag_c_get_35_46.doStart(context, out);
                _jettag_c_get_35_46.doEnd();
                RuntimeTagElement _jettag_c_get_35_84 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_35_84); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_35_84.setRuntimeParent(_jettag_c_set_35_2);
                _jettag_c_get_35_84.setTagInfo(_td_c_get_35_84);
                _jettag_c_get_35_84.doStart(context, out);
                _jettag_c_get_35_84.doEnd();
                _jettag_c_set_35_2.handleBodyContent(out);
            }
            out = _jettag_c_set_35_2_saved_out;
            _jettag_c_set_35_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_set_36_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_36_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_set_36_2.setRuntimeParent(_jettag_ws_project_16_1);
            _jettag_c_set_36_2.setTagInfo(_td_c_set_36_2);
            _jettag_c_set_36_2.doStart(context, out);
            JET2Writer _jettag_c_set_36_2_saved_out = out;
            while (_jettag_c_set_36_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_36_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_36_50.setRuntimeParent(_jettag_c_set_36_2);
                _jettag_c_get_36_50.setTagInfo(_td_c_get_36_50);
                _jettag_c_get_36_50.doStart(context, out);
                _jettag_c_get_36_50.doEnd();
                RuntimeTagElement _jettag_c_get_36_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_88); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_36_88.setRuntimeParent(_jettag_c_set_36_2);
                _jettag_c_get_36_88.setTagInfo(_td_c_get_36_88);
                _jettag_c_get_36_88.doStart(context, out);
                _jettag_c_get_36_88.doEnd();
                _jettag_c_set_36_2.handleBodyContent(out);
            }
            out = _jettag_c_set_36_2_saved_out;
            _jettag_c_set_36_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_37_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_37_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_37_2.setRuntimeParent(_jettag_ws_project_16_1);
            _jettag_ws_file_37_2.setTagInfo(_td_ws_file_37_2);
            _jettag_ws_file_37_2.doStart(context, out);
            _jettag_ws_file_37_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_38_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_38_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_38_2.setRuntimeParent(_jettag_ws_project_16_1);
            _jettag_ws_file_38_2.setTagInfo(_td_ws_file_38_2);
            _jettag_ws_file_38_2.doStart(context, out);
            _jettag_ws_file_38_2.doEnd();
            out.write(NL);         
            out.write(NL);         
            // Logging subflow
            RuntimeTagElement _jettag_c_if_41_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_41_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_41_2.setRuntimeParent(_jettag_ws_project_16_1);
            _jettag_c_if_41_2.setTagInfo(_td_c_if_41_2);
            _jettag_c_if_41_2.doStart(context, out);
            while (_jettag_c_if_41_2.okToProcessBody()) {
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_set_42_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_42_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_42_3.setRuntimeParent(_jettag_c_if_41_2);
                _jettag_c_set_42_3.setTagInfo(_td_c_set_42_3);
                _jettag_c_set_42_3.doStart(context, out);
                JET2Writer _jettag_c_set_42_3_saved_out = out;
                while (_jettag_c_set_42_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_get_42_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_41); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_42_41.setRuntimeParent(_jettag_c_set_42_3);
                    _jettag_c_get_42_41.setTagInfo(_td_c_get_42_41);
                    _jettag_c_get_42_41.doStart(context, out);
                    _jettag_c_get_42_41.doEnd();
                    out.write("Log");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_42_78 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_78); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_42_78.setRuntimeParent(_jettag_c_set_42_3);
                    _jettag_c_get_42_78.setTagInfo(_td_c_get_42_78);
                    _jettag_c_get_42_78.doStart(context, out);
                    _jettag_c_get_42_78.doEnd();
                    _jettag_c_set_42_3.handleBodyContent(out);
                }
                out = _jettag_c_set_42_3_saved_out;
                _jettag_c_set_42_3.doEnd();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_set_43_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_43_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_43_3.setRuntimeParent(_jettag_c_if_41_2);
                _jettag_c_set_43_3.setTagInfo(_td_c_set_43_3);
                _jettag_c_set_43_3.doStart(context, out);
                JET2Writer _jettag_c_set_43_3_saved_out = out;
                while (_jettag_c_set_43_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_get_43_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_43_44); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_43_44.setRuntimeParent(_jettag_c_set_43_3);
                    _jettag_c_get_43_44.setTagInfo(_td_c_get_43_44);
                    _jettag_c_get_43_44.doStart(context, out);
                    _jettag_c_get_43_44.doEnd();
                    RuntimeTagElement _jettag_c_get_43_82 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_43_82); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_43_82.setRuntimeParent(_jettag_c_set_43_3);
                    _jettag_c_get_43_82.setTagInfo(_td_c_get_43_82);
                    _jettag_c_get_43_82.doStart(context, out);
                    _jettag_c_get_43_82.doEnd();
                    _jettag_c_set_43_3.handleBodyContent(out);
                }
                out = _jettag_c_set_43_3_saved_out;
                _jettag_c_set_43_3.doEnd();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_set_44_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_44_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_44_3.setRuntimeParent(_jettag_c_if_41_2);
                _jettag_c_set_44_3.setTagInfo(_td_c_set_44_3);
                _jettag_c_set_44_3.doStart(context, out);
                JET2Writer _jettag_c_set_44_3_saved_out = out;
                while (_jettag_c_set_44_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_get_44_47 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_44_47); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_44_47.setRuntimeParent(_jettag_c_set_44_3);
                    _jettag_c_get_44_47.setTagInfo(_td_c_get_44_47);
                    _jettag_c_get_44_47.doStart(context, out);
                    _jettag_c_get_44_47.doEnd();
                    RuntimeTagElement _jettag_c_get_44_85 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_44_85); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_44_85.setRuntimeParent(_jettag_c_set_44_3);
                    _jettag_c_get_44_85.setTagInfo(_td_c_get_44_85);
                    _jettag_c_get_44_85.doStart(context, out);
                    _jettag_c_get_44_85.doEnd();
                    _jettag_c_set_44_3.handleBodyContent(out);
                }
                out = _jettag_c_set_44_3_saved_out;
                _jettag_c_set_44_3.doEnd();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_set_45_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_45_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_45_3.setRuntimeParent(_jettag_c_if_41_2);
                _jettag_c_set_45_3.setTagInfo(_td_c_set_45_3);
                _jettag_c_set_45_3.doStart(context, out);
                JET2Writer _jettag_c_set_45_3_saved_out = out;
                while (_jettag_c_set_45_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_get_45_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_51); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_45_51.setRuntimeParent(_jettag_c_set_45_3);
                    _jettag_c_get_45_51.setTagInfo(_td_c_get_45_51);
                    _jettag_c_get_45_51.doStart(context, out);
                    _jettag_c_get_45_51.doEnd();
                    RuntimeTagElement _jettag_c_get_45_89 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_89); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_45_89.setRuntimeParent(_jettag_c_set_45_3);
                    _jettag_c_get_45_89.setTagInfo(_td_c_get_45_89);
                    _jettag_c_get_45_89.doStart(context, out);
                    _jettag_c_get_45_89.doEnd();
                    _jettag_c_set_45_3.handleBodyContent(out);
                }
                out = _jettag_c_set_45_3_saved_out;
                _jettag_c_set_45_3.doEnd();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_ws_file_46_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_46_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_file_46_3.setRuntimeParent(_jettag_c_if_41_2);
                _jettag_ws_file_46_3.setTagInfo(_td_ws_file_46_3);
                _jettag_ws_file_46_3.doStart(context, out);
                _jettag_ws_file_46_3.doEnd();
                out.write("   ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_ws_file_47_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_47_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_file_47_3.setRuntimeParent(_jettag_c_if_41_2);
                _jettag_ws_file_47_3.setTagInfo(_td_ws_file_47_3);
                _jettag_ws_file_47_3.doStart(context, out);
                _jettag_ws_file_47_3.doEnd();
                out.write(NL);         
                _jettag_c_if_41_2.handleBodyContent(out);
            }
            _jettag_c_if_41_2.doEnd();
            _jettag_ws_project_16_1.handleBodyContent(out);
        }
        _jettag_ws_project_16_1.doEnd();
        out.write(NL);         
 com.ibm.etools.mft.pattern.sv.plugin.PatternUtility.getPatternConfigurationFolderName(context, "patternConfigurationFolderName"); 
        out.write(NL);         
        // Build pattern reference project with summary file 
        RuntimeTagElement _jettag_ws_project_54_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "project", "ws:project", _td_ws_project_54_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_project_54_1.setRuntimeParent(null);
        _jettag_ws_project_54_1.setTagInfo(_td_ws_project_54_1);
        _jettag_ws_project_54_1.doStart(context, out);
        while (_jettag_ws_project_54_1.okToProcessBody()) {
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_file_55_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_55_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_file_55_2.setRuntimeParent(_jettag_ws_project_54_1);
            _jettag_ws_file_55_2.setTagInfo(_td_ws_file_55_2);
            _jettag_ws_file_55_2.doStart(context, out);
            _jettag_ws_file_55_2.doEnd();
            out.write(NL);         
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_ws_copyFile_57_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_57_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_copyFile_57_2.setRuntimeParent(_jettag_ws_project_54_1);
            _jettag_ws_copyFile_57_2.setTagInfo(_td_ws_copyFile_57_2);
            _jettag_ws_copyFile_57_2.doStart(context, out);
            _jettag_ws_copyFile_57_2.doEnd();
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_ws_folder_60_2 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_60_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_ws_folder_60_2.setRuntimeParent(_jettag_ws_project_54_1);
            _jettag_ws_folder_60_2.setTagInfo(_td_ws_folder_60_2);
            _jettag_ws_folder_60_2.doStart(context, out);
            while (_jettag_ws_folder_60_2.okToProcessBody()) {
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_ws_copyFile_61_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_61_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_copyFile_61_3.setRuntimeParent(_jettag_ws_folder_60_2);
                _jettag_ws_copyFile_61_3.setTagInfo(_td_ws_copyFile_61_3);
                _jettag_ws_copyFile_61_3.doStart(context, out);
                _jettag_ws_copyFile_61_3.doEnd();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_ws_copyFile_63_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_63_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_copyFile_63_3.setRuntimeParent(_jettag_ws_folder_60_2);
                _jettag_ws_copyFile_63_3.setTagInfo(_td_ws_copyFile_63_3);
                _jettag_ws_copyFile_63_3.doStart(context, out);
                _jettag_ws_copyFile_63_3.doEnd();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_ws_copyFile_65_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_65_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_copyFile_65_3.setRuntimeParent(_jettag_ws_folder_60_2);
                _jettag_ws_copyFile_65_3.setTagInfo(_td_ws_copyFile_65_3);
                _jettag_ws_copyFile_65_3.doStart(context, out);
                _jettag_ws_copyFile_65_3.doEnd();
                out.write(NL);         
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_ws_copyFile_67_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_67_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_copyFile_67_3.setRuntimeParent(_jettag_ws_folder_60_2);
                _jettag_ws_copyFile_67_3.setTagInfo(_td_ws_copyFile_67_3);
                _jettag_ws_copyFile_67_3.doStart(context, out);
                _jettag_ws_copyFile_67_3.doEnd();
                out.write(NL);         
                _jettag_ws_folder_60_2.handleBodyContent(out);
            }
            _jettag_ws_folder_60_2.doEnd();
            _jettag_ws_project_54_1.handleBodyContent(out);
        }
        _jettag_ws_project_54_1.doEnd();
    }
}
