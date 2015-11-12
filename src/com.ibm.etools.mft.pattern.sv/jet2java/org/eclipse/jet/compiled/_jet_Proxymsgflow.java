package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_Proxymsgflow implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_Proxymsgflow() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_10_11 = new TagInfo("c:get", //$NON-NLS-1$
            10, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_49 = new TagInfo("c:get", //$NON-NLS-1$
            10, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@errorFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_7 = new TagInfo("c:get", //$NON-NLS-1$
            11, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_45 = new TagInfo("c:get", //$NON-NLS-1$
            11, 45,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@errorFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_13_2 = new TagInfo("c:if", //$NON-NLS-1$
            13, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_11 = new TagInfo("c:get", //$NON-NLS-1$
            14, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_49 = new TagInfo("c:get", //$NON-NLS-1$
            14, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@logFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_6 = new TagInfo("c:get", //$NON-NLS-1$
            15, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_44 = new TagInfo("c:get", //$NON-NLS-1$
            15, 44,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@logFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_12 = new TagInfo("c:get", //$NON-NLS-1$
            20, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowURI", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_15 = new TagInfo("c:get", //$NON-NLS-1$
            21, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_25_1 = new TagInfo("c:if", //$NON-NLS-1$
            25, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired= 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_30_1 = new TagInfo("c:if", //$NON-NLS-1$
            30, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_61 = new TagInfo("c:get", //$NON-NLS-1$
            38, 61,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_17 = new TagInfo("c:get", //$NON-NLS-1$
            39, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_64 = new TagInfo("c:get", //$NON-NLS-1$
            39, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_40_86 = new TagInfo("c:get", //$NON-NLS-1$
            40, 86,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_40_140 = new TagInfo("c:get", //$NON-NLS-1$
            40, 140,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_41_86 = new TagInfo("c:get", //$NON-NLS-1$
            41, 86,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_41_140 = new TagInfo("c:get", //$NON-NLS-1$
            41, 140,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_62 = new TagInfo("c:get", //$NON-NLS-1$
            42, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/shortDescription", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_44_26 = new TagInfo("c:get", //$NON-NLS-1$
            44, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_44_71 = new TagInfo("c:get", //$NON-NLS-1$
            44, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_45_15 = new TagInfo("c:get", //$NON-NLS-1$
            45, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/longDescription", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_46_33 = new TagInfo("c:get", //$NON-NLS-1$
            46, 33,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_47_36 = new TagInfo("c:get", //$NON-NLS-1$
            47, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_53_7 = new TagInfo("c:if", //$NON-NLS-1$
            53, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "boolean($root/serviceWSDLData/portType) \r\n   \tand string-length($root/serviceWSDLData/portType) > 0\r\n    and boolean($root/serviceWSDLData/binding)\r\n\tand string-length($root/serviceWSDLData/binding) > 0\r\n    and boolean($root/serviceWSDLData/port)\r\n    and boolean($root/serviceWSDLData/portType)\r\n    and boolean($root/serviceWSDLData/targetNamespace)\r\n\tand string-length($root/serviceWSDLData/targetNamespace) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_61_19 = new TagInfo("c:get", //$NON-NLS-1$
            61, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/serviceWSDLData/fileName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_62_25 = new TagInfo("c:get", //$NON-NLS-1$
            62, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/serviceWSDLData/portType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_63_24 = new TagInfo("c:get", //$NON-NLS-1$
            63, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/serviceWSDLData/binding", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_64_21 = new TagInfo("c:get", //$NON-NLS-1$
            64, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/serviceWSDLData/port", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_65_25 = new TagInfo("c:get", //$NON-NLS-1$
            65, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/serviceWSDLData/targetNamespace", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_67_1 = new TagInfo("c:choose", //$NON-NLS-1$
            67, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_68_1 = new TagInfo("c:when", //$NON-NLS-1$
            68, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "string-length($root/proxyUrl) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_69_14 = new TagInfo("c:get", //$NON-NLS-1$
            69, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/proxyUrl", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_71_1 = new TagInfo("c:otherwise", //$NON-NLS-1$
            71, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_setVariable_74_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            74, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "substring-after($root/serviceWSDLData/address,':')", //$NON-NLS-1$
                "svcAddress", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_77_1 = new TagInfo("c:choose", //$NON-NLS-1$
            77, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_78_1 = new TagInfo("c:when", //$NON-NLS-1$
            78, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "contains($svcAddress,':')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_79_14 = new TagInfo("c:get", //$NON-NLS-1$
            79, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "concat('/',substring-after(substring-after($svcAddress,':'),'/'))", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_81_1 = new TagInfo("c:otherwise", //$NON-NLS-1$
            81, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_82_14 = new TagInfo("c:get", //$NON-NLS-1$
            82, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "concat('/',substring-after($svcAddress,'/'))", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_88_7 = new TagInfo("c:if", //$NON-NLS-1$
            88, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/serviceWSDLData/isMessageSetProject = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_89_27 = new TagInfo("c:get", //$NON-NLS-1$
            89, 27,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/serviceWSDLData/messageSetName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_91_1 = new TagInfo("c:if", //$NON-NLS-1$
            91, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/validationofRequest = 'None'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_94_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            94, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$root/serviceWSDLData/address", //$NON-NLS-1$
                "httpProtocol", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_97_1 = new TagInfo("c:if", //$NON-NLS-1$
            97, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "substring-before($httpProtocol,':') = 'https'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_106_51 = new TagInfo("c:get", //$NON-NLS-1$
            106, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_112_1 = new TagInfo("c:if", //$NON-NLS-1$
            112, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "boolean($root/serviceWSDLData/portType) \r\n   \tand string-length($root/serviceWSDLData/portType) > 0\r\n    and boolean($root/serviceWSDLData/binding)\r\n\tand string-length($root/serviceWSDLData/binding) > 0\r\n    and boolean($root/serviceWSDLData/port)\r\n    and boolean($root/serviceWSDLData/portType)\r\n    and boolean($root/serviceWSDLData/targetNamespace)\r\n\tand string-length($root/serviceWSDLData/targetNamespace) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_121_18 = new TagInfo("c:get", //$NON-NLS-1$
            121, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/serviceWSDLData/fileName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_122_25 = new TagInfo("c:get", //$NON-NLS-1$
            122, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/serviceWSDLData/portType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_123_24 = new TagInfo("c:get", //$NON-NLS-1$
            123, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/serviceWSDLData/binding", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_124_21 = new TagInfo("c:get", //$NON-NLS-1$
            124, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/serviceWSDLData/port", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_125_25 = new TagInfo("c:get", //$NON-NLS-1$
            125, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/serviceWSDLData/targetNamespace", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_126_26 = new TagInfo("c:get", //$NON-NLS-1$
            126, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/serviceWSDLData/operation", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_128_2 = new TagInfo("c:if", //$NON-NLS-1$
            128, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/serviceWSDLData/isMessageSetProject = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_129_25 = new TagInfo("c:get", //$NON-NLS-1$
            129, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/serviceWSDLData/messageSetName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_132_1 = new TagInfo("c:choose", //$NON-NLS-1$
            132, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_133_1 = new TagInfo("c:when", //$NON-NLS-1$
            133, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "string-length($root/targetEndpoint) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_134_16 = new TagInfo("c:get", //$NON-NLS-1$
            134, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/targetEndpoint", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_136_1 = new TagInfo("c:otherwise", //$NON-NLS-1$
            136, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_138_17 = new TagInfo("c:get", //$NON-NLS-1$
            138, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/serviceWSDLData/address", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_145_33 = new TagInfo("c:get", //$NON-NLS-1$
            145, 33,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_149_33 = new TagInfo("c:get", //$NON-NLS-1$
            149, 33,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_154_1 = new TagInfo("c:if", //$NON-NLS-1$
            154, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/validationofRequest = 'Content and Value'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_159_1 = new TagInfo("c:if", //$NON-NLS-1$
            159, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_160_24 = new TagInfo("c:get", //$NON-NLS-1$
            160, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_160_62 = new TagInfo("c:get", //$NON-NLS-1$
            160, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@logFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_167_24 = new TagInfo("c:get", //$NON-NLS-1$
            167, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_167_62 = new TagInfo("c:get", //$NON-NLS-1$
            167, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@errorFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_177_1 = new TagInfo("c:if", //$NON-NLS-1$
            177, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_187_1 = new TagInfo("c:if", //$NON-NLS-1$
            187, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_190_21 = new TagInfo("c:get", //$NON-NLS-1$
            190, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_190_59 = new TagInfo("c:get", //$NON-NLS-1$
            190, 59,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@errorFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_191_19 = new TagInfo("c:get", //$NON-NLS-1$
            191, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_193_1 = new TagInfo("c:if", //$NON-NLS-1$
            193, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_196_23 = new TagInfo("c:get", //$NON-NLS-1$
            196, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_196_61 = new TagInfo("c:get", //$NON-NLS-1$
            196, 61,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@logFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_197_21 = new TagInfo("c:get", //$NON-NLS-1$
            197, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_200_25 = new TagInfo("c:get", //$NON-NLS-1$
            200, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_200_63 = new TagInfo("c:get", //$NON-NLS-1$
            200, 63,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@logFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_201_23 = new TagInfo("c:get", //$NON-NLS-1$
            201, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_205_1 = new TagInfo("c:if", //$NON-NLS-1$
            205, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_209_1 = new TagInfo("c:if", //$NON-NLS-1$
            209, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_212_13 = new TagInfo("c:get", //$NON-NLS-1$
            212, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_212_51 = new TagInfo("c:get", //$NON-NLS-1$
            212, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@errorFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_215_1 = new TagInfo("c:if", //$NON-NLS-1$
            215, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_218_13 = new TagInfo("c:get", //$NON-NLS-1$
            218, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_218_51 = new TagInfo("c:get", //$NON-NLS-1$
            218, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@logFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_222_13 = new TagInfo("c:get", //$NON-NLS-1$
            222, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_222_51 = new TagInfo("c:get", //$NON-NLS-1$
            222, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@logFlow", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<ecore:EPackage xmi:version=\"2.0\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:xmi=\"http://www.omg.org/XMI\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmCompute.msgnode=\"ComIbmCompute.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmDatabase.msgnode=\"ComIbmDatabase.msgnode\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmFlowOrder.msgnode=\"ComIbmFlowOrder.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmSOAPInput.msgnode=\"ComIbmSOAPInput.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmSOAPReply.msgnode=\"ComIbmSOAPReply.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmSOAPRequest.msgnode=\"ComIbmSOAPRequest.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_10_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_11); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_10_11.setRuntimeParent(null);
        _jettag_c_get_10_11.setTagInfo(_td_c_get_10_11);
        _jettag_c_get_10_11.doStart(context, out);
        _jettag_c_get_10_11.doEnd();
        RuntimeTagElement _jettag_c_get_10_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_49); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_10_49.setRuntimeParent(null);
        _jettag_c_get_10_49.setTagInfo(_td_c_get_10_49);
        _jettag_c_get_10_49.doStart(context, out);
        _jettag_c_get_10_49.doEnd();
        out.write(".subflow=");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    \t\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_11_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_7); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_11_7.setRuntimeParent(null);
        _jettag_c_get_11_7.setTagInfo(_td_c_get_11_7);
        _jettag_c_get_11_7.doStart(context, out);
        _jettag_c_get_11_7.doEnd();
        RuntimeTagElement _jettag_c_get_11_45 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_45); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_11_45.setRuntimeParent(null);
        _jettag_c_get_11_45.setTagInfo(_td_c_get_11_45);
        _jettag_c_get_11_45.doStart(context, out);
        _jettag_c_get_11_45.doEnd();
        out.write(".subflow\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_13_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_13_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_13_2.setRuntimeParent(null);
        _jettag_c_if_13_2.setTagInfo(_td_c_if_13_2);
        _jettag_c_if_13_2.doStart(context, out);
        while (_jettag_c_if_13_2.okToProcessBody()) {
            out.write("    xmlns:");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_14_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_14_11.setRuntimeParent(_jettag_c_if_13_2);
            _jettag_c_get_14_11.setTagInfo(_td_c_get_14_11);
            _jettag_c_get_14_11.doStart(context, out);
            _jettag_c_get_14_11.doEnd();
            RuntimeTagElement _jettag_c_get_14_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_49); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_14_49.setRuntimeParent(_jettag_c_if_13_2);
            _jettag_c_get_14_49.setTagInfo(_td_c_get_14_49);
            _jettag_c_get_14_49.doStart(context, out);
            _jettag_c_get_14_49.doEnd();
            out.write(".subflow=");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    \"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_15_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_15_6.setRuntimeParent(_jettag_c_if_13_2);
            _jettag_c_get_15_6.setTagInfo(_td_c_get_15_6);
            _jettag_c_get_15_6.doStart(context, out);
            _jettag_c_get_15_6.doEnd();
            RuntimeTagElement _jettag_c_get_15_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_44); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_15_44.setRuntimeParent(_jettag_c_if_13_2);
            _jettag_c_get_15_44.setTagInfo(_td_c_get_15_44);
            _jettag_c_get_15_44.doStart(context, out);
            _jettag_c_get_15_44.doEnd();
            out.write(".subflow\"");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_13_2.handleBodyContent(out);
        }
        _jettag_c_if_13_2.doEnd();
        out.write("    xmlns:ecore=\"http://www.eclipse.org/emf/2002/Ecore\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:eflow=\"http://www.ibm.com/wbi/2005/eflow\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:utility=\"http://www.ibm.com/wbi/2005/eflow_utility\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    nsURI=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_20_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_12); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_20_12.setRuntimeParent(null);
        _jettag_c_get_20_12.setTagInfo(_td_c_get_20_12);
        _jettag_c_get_20_12.doStart(context, out);
        _jettag_c_get_20_12.doEnd();
        out.write(".msgflow\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    nsPrefix=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_21_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_21_15.setRuntimeParent(null);
        _jettag_c_get_21_15.setTagInfo(_td_c_get_21_15);
        _jettag_c_get_21_15.doStart(context, out);
        _jettag_c_get_21_15.doEnd();
        out.write(".msgflow\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  <eClassifiers xmi:type=\"eflow:FCMComposite\" name=\"FCMComposite_1\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <eSuperTypes href=\"http://www.ibm.com/wbi/2005/eflow#//FCMBlock\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_25_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_25_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_25_1.setRuntimeParent(null);
        _jettag_c_if_25_1.setTagInfo(_td_c_if_25_1);
        _jettag_c_if_25_1.doStart(context, out);
        while (_jettag_c_if_25_1.okToProcessBody()) {
            out.write("\t<eStructuralFeatures xmi:type=\"ecore:EAttribute\" xmi:id=\"Property.ErrorLoggingOn\" name=\"ErrorLoggingOn\" lowerBound=\"1\" defaultValueLiteral=\"true\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <eType xmi:type=\"ecore:EDataType\" href=\"http://www.eclipse.org/emf/2002/Ecore#//EBoolean\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    </eStructuralFeatures>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_25_1.handleBodyContent(out);
        }
        _jettag_c_if_25_1.doEnd();
        RuntimeTagElement _jettag_c_if_30_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_30_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_30_1.setRuntimeParent(null);
        _jettag_c_if_30_1.setTagInfo(_td_c_if_30_1);
        _jettag_c_if_30_1.doStart(context, out);
        while (_jettag_c_if_30_1.okToProcessBody()) {
            out.write("\t<eStructuralFeatures xmi:type=\"ecore:EAttribute\" xmi:id=\"Property.RequestLoggingOn\" name=\"RequestLoggingOn\" lowerBound=\"1\" defaultValueLiteral=\"true\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <eType xmi:type=\"ecore:EDataType\" href=\"http://www.eclipse.org/emf/2002/Ecore#//EBoolean\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    </eStructuralFeatures>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    <eStructuralFeatures xmi:type=\"ecore:EAttribute\" xmi:id=\"Property.ResponseLoggingOn\" name=\"ResponseLoggingOn\" lowerBound=\"1\" defaultValueLiteral=\"true\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <eType xmi:type=\"ecore:EDataType\" href=\"http://www.eclipse.org/emf/2002/Ecore#//EBoolean\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    </eStructuralFeatures>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_30_1.handleBodyContent(out);
        }
        _jettag_c_if_30_1.doEnd();
        out.write("    <translation xmi:type=\"utility:TranslatableString\" key=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_38_61 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_61); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_38_61.setRuntimeParent(null);
        _jettag_c_get_38_61.setTagInfo(_td_c_get_38_61);
        _jettag_c_get_38_61.doStart(context, out);
        _jettag_c_get_38_61.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    bundleName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_39_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_17); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_39_17.setRuntimeParent(null);
        _jettag_c_get_39_17.setTagInfo(_td_c_get_39_17);
        _jettag_c_get_39_17.doStart(context, out);
        _jettag_c_get_39_17.doEnd();
        out.write("\" pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_39_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_64); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_39_64.setRuntimeParent(null);
        _jettag_c_get_39_64.setTagInfo(_td_c_get_39_64);
        _jettag_c_get_39_64.doStart(context, out);
        _jettag_c_get_39_64.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <colorGraphic16 xmi:type=\"utility:GIFFileGraphic\" resourceName=\"platform:/plugin/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_40_86 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_40_86); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_40_86.setRuntimeParent(null);
        _jettag_c_get_40_86.setTagInfo(_td_c_get_40_86);
        _jettag_c_get_40_86.doStart(context, out);
        _jettag_c_get_40_86.doEnd();
        out.write("/icons/full/obj16/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_40_140 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_40_140); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_40_140.setRuntimeParent(null);
        _jettag_c_get_40_140.setTagInfo(_td_c_get_40_140);
        _jettag_c_get_40_140.doStart(context, out);
        _jettag_c_get_40_140.doEnd();
        out.write(".gif\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <colorGraphic32 xmi:type=\"utility:GIFFileGraphic\" resourceName=\"platform:/plugin/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_41_86 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_86); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_41_86.setRuntimeParent(null);
        _jettag_c_get_41_86.setTagInfo(_td_c_get_41_86);
        _jettag_c_get_41_86.doStart(context, out);
        _jettag_c_get_41_86.doEnd();
        out.write("/icons/full/obj30/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_41_140 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_140); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_41_140.setRuntimeParent(null);
        _jettag_c_get_41_140.setTagInfo(_td_c_get_41_140);
        _jettag_c_get_41_140.doStart(context, out);
        _jettag_c_get_41_140.doEnd();
        out.write(".gif\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<shortDescription xmi:type=\"utility:ConstantString\" string=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_42_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_62); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_42_62.setRuntimeParent(null);
        _jettag_c_get_42_62.setTagInfo(_td_c_get_42_62);
        _jettag_c_get_42_62.doStart(context, out);
        _jettag_c_get_42_62.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <longDescription xmi:type=\"utility:ConstantString\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    string=\"Generated by ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_44_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_44_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_44_26.setRuntimeParent(null);
        _jettag_c_get_44_26.setTagInfo(_td_c_get_44_26);
        _jettag_c_get_44_26.doStart(context, out);
        _jettag_c_get_44_26.doEnd();
        out.write(" Version ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_44_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_44_71); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_44_71.setRuntimeParent(null);
        _jettag_c_get_44_71.setTagInfo(_td_c_get_44_71);
        _jettag_c_get_44_71.doStart(context, out);
        _jettag_c_get_44_71.doEnd();
        out.write(NL);         
        out.write("    &#xD;&#xA;");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_45_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_45_15.setRuntimeParent(null);
        _jettag_c_get_45_15.setTagInfo(_td_c_get_45_15);
        _jettag_c_get_45_15.doStart(context, out);
        _jettag_c_get_45_15.doEnd();
        out.write(NL);         
        out.write("    &#xD;&#xA;$MQSI patternName=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_46_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_46_33); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_46_33.setRuntimeParent(null);
        _jettag_c_get_46_33.setTagInfo(_td_c_get_46_33);
        _jettag_c_get_46_33.doStart(context, out);
        _jettag_c_get_46_33.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    &#xD;&#xA;$MQSI patternVersion=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_47_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_47_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_47_36.setRuntimeParent(null);
        _jettag_c_get_47_36.setTagInfo(_td_c_get_47_36);
        _jettag_c_get_47_36.doStart(context, out);
        _jettag_c_get_47_36.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    \"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <version xmi:type=\"utility:ConstantString\" string=\"1\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <composition>    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <nodes xmi:type=\"ComIbmSOAPInput.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_1\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    location=\"1,89\" ");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_53_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_53_7); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_53_7.setRuntimeParent(null);
        _jettag_c_if_53_7.setTagInfo(_td_c_if_53_7);
        _jettag_c_if_53_7.doStart(context, out);
        while (_jettag_c_if_53_7.okToProcessBody()) {
            out.write("    wsdlFileName=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_61_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_61_19); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_61_19.setRuntimeParent(_jettag_c_if_53_7);
            _jettag_c_get_61_19.setTagInfo(_td_c_get_61_19);
            _jettag_c_get_61_19.doStart(context, out);
            _jettag_c_get_61_19.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      selectedPortType=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_62_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_62_25); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_62_25.setRuntimeParent(_jettag_c_if_53_7);
            _jettag_c_get_62_25.setTagInfo(_td_c_get_62_25);
            _jettag_c_get_62_25.doStart(context, out);
            _jettag_c_get_62_25.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      selectedBinding=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_63_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_63_24); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_63_24.setRuntimeParent(_jettag_c_if_53_7);
            _jettag_c_get_63_24.setTagInfo(_td_c_get_63_24);
            _jettag_c_get_63_24.doStart(context, out);
            _jettag_c_get_63_24.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      selectedPort=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_64_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_64_21); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_64_21.setRuntimeParent(_jettag_c_if_53_7);
            _jettag_c_get_64_21.setTagInfo(_td_c_get_64_21);
            _jettag_c_get_64_21.doStart(context, out);
            _jettag_c_get_64_21.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      targetNamespace= \"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_65_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_65_25); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_65_25.setRuntimeParent(_jettag_c_if_53_7);
            _jettag_c_get_65_25.setTagInfo(_td_c_get_65_25);
            _jettag_c_get_65_25.doStart(context, out);
            _jettag_c_get_65_25.doEnd();
            out.write("\"  ");  //$NON-NLS-1$        
            out.write(NL);         
            // Use the parameter if defined 
            RuntimeTagElement _jettag_c_choose_67_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_67_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_choose_67_1.setRuntimeParent(_jettag_c_if_53_7);
            _jettag_c_choose_67_1.setTagInfo(_td_c_choose_67_1);
            _jettag_c_choose_67_1.doStart(context, out);
            JET2Writer _jettag_c_choose_67_1_saved_out = out;
            while (_jettag_c_choose_67_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_when_68_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_68_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_when_68_1.setRuntimeParent(_jettag_c_choose_67_1);
                _jettag_c_when_68_1.setTagInfo(_td_c_when_68_1);
                _jettag_c_when_68_1.doStart(context, out);
                JET2Writer _jettag_c_when_68_1_saved_out = out;
                while (_jettag_c_when_68_1.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("urlSelector=\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_69_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_69_14); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_69_14.setRuntimeParent(_jettag_c_when_68_1);
                    _jettag_c_get_69_14.setTagInfo(_td_c_get_69_14);
                    _jettag_c_get_69_14.doStart(context, out);
                    _jettag_c_get_69_14.doEnd();
                    out.write("\"");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_when_68_1.handleBodyContent(out);
                }
                out = _jettag_c_when_68_1_saved_out;
                _jettag_c_when_68_1.doEnd();
                RuntimeTagElement _jettag_c_otherwise_71_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_71_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_otherwise_71_1.setRuntimeParent(_jettag_c_choose_67_1);
                _jettag_c_otherwise_71_1.setTagInfo(_td_c_otherwise_71_1);
                _jettag_c_otherwise_71_1.doStart(context, out);
                JET2Writer _jettag_c_otherwise_71_1_saved_out = out;
                while (_jettag_c_otherwise_71_1.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    // Get the path from the address in wsdl (path only) 
                    // Remove transport first 
                    RuntimeTagElement _jettag_c_setVariable_74_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_74_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_74_1.setRuntimeParent(_jettag_c_otherwise_71_1);
                    _jettag_c_setVariable_74_1.setTagInfo(_td_c_setVariable_74_1);
                    _jettag_c_setVariable_74_1.doStart(context, out);
                    _jettag_c_setVariable_74_1.doEnd();
                    // Now remove facet containing server:port 
                    RuntimeTagElement _jettag_c_choose_77_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_77_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_choose_77_1.setRuntimeParent(_jettag_c_otherwise_71_1);
                    _jettag_c_choose_77_1.setTagInfo(_td_c_choose_77_1);
                    _jettag_c_choose_77_1.doStart(context, out);
                    JET2Writer _jettag_c_choose_77_1_saved_out = out;
                    while (_jettag_c_choose_77_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        RuntimeTagElement _jettag_c_when_78_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_78_1); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_when_78_1.setRuntimeParent(_jettag_c_choose_77_1);
                        _jettag_c_when_78_1.setTagInfo(_td_c_when_78_1);
                        _jettag_c_when_78_1.doStart(context, out);
                        JET2Writer _jettag_c_when_78_1_saved_out = out;
                        while (_jettag_c_when_78_1.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                            out.write("urlSelector=\"");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_79_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_79_14); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_79_14.setRuntimeParent(_jettag_c_when_78_1);
                            _jettag_c_get_79_14.setTagInfo(_td_c_get_79_14);
                            _jettag_c_get_79_14.doStart(context, out);
                            _jettag_c_get_79_14.doEnd();
                            out.write("\"");  //$NON-NLS-1$        
                            out.write(NL);         
                            _jettag_c_when_78_1.handleBodyContent(out);
                        }
                        out = _jettag_c_when_78_1_saved_out;
                        _jettag_c_when_78_1.doEnd();
                        RuntimeTagElement _jettag_c_otherwise_81_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_81_1); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_otherwise_81_1.setRuntimeParent(_jettag_c_choose_77_1);
                        _jettag_c_otherwise_81_1.setTagInfo(_td_c_otherwise_81_1);
                        _jettag_c_otherwise_81_1.doStart(context, out);
                        JET2Writer _jettag_c_otherwise_81_1_saved_out = out;
                        while (_jettag_c_otherwise_81_1.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                            out.write("urlSelector=\"");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_82_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_82_14); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_82_14.setRuntimeParent(_jettag_c_otherwise_81_1);
                            _jettag_c_get_82_14.setTagInfo(_td_c_get_82_14);
                            _jettag_c_get_82_14.doStart(context, out);
                            _jettag_c_get_82_14.doEnd();
                            out.write("\"");  //$NON-NLS-1$        
                            out.write(NL);         
                            _jettag_c_otherwise_81_1.handleBodyContent(out);
                        }
                        out = _jettag_c_otherwise_81_1_saved_out;
                        _jettag_c_otherwise_81_1.doEnd();
                        _jettag_c_choose_77_1.handleBodyContent(out);
                    }
                    out = _jettag_c_choose_77_1_saved_out;
                    _jettag_c_choose_77_1.doEnd();
                    out.write(NL);         
                    _jettag_c_otherwise_71_1.handleBodyContent(out);
                }
                out = _jettag_c_otherwise_71_1_saved_out;
                _jettag_c_otherwise_71_1.doEnd();
                _jettag_c_choose_67_1.handleBodyContent(out);
            }
            out = _jettag_c_choose_67_1_saved_out;
            _jettag_c_choose_67_1.doEnd();
            RuntimeTagElement _jettag_c_if_88_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_88_7); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_88_7.setRuntimeParent(_jettag_c_if_53_7);
            _jettag_c_if_88_7.setTagInfo(_td_c_if_88_7);
            _jettag_c_if_88_7.doStart(context, out);
            while (_jettag_c_if_88_7.okToProcessBody()) {
                out.write("      messageSetProperty=\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_89_27 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_89_27); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_89_27.setRuntimeParent(_jettag_c_if_88_7);
                _jettag_c_get_89_27.setTagInfo(_td_c_get_89_27);
                _jettag_c_get_89_27.doStart(context, out);
                _jettag_c_get_89_27.doEnd();
                out.write("\"");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_if_88_7.handleBodyContent(out);
            }
            _jettag_c_if_88_7.doEnd();
            RuntimeTagElement _jettag_c_if_91_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_91_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_91_1.setRuntimeParent(_jettag_c_if_53_7);
            _jettag_c_if_91_1.setTagInfo(_td_c_if_91_1);
            _jettag_c_if_91_1.doStart(context, out);
            while (_jettag_c_if_91_1.okToProcessBody()) {
                out.write("      parserXmlnscBuildTreeUsingXMLSchema=\"false\" validateMaster=\"none\"");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_if_91_1.handleBodyContent(out);
            }
            _jettag_c_if_91_1.doEnd();
            out.write(" ");  //$NON-NLS-1$        
            _jettag_c_if_53_7.handleBodyContent(out);
        }
        _jettag_c_if_53_7.doEnd();
        out.write(" ");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_setVariable_94_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_94_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_94_1.setRuntimeParent(null);
        _jettag_c_setVariable_94_1.setTagInfo(_td_c_setVariable_94_1);
        _jettag_c_setVariable_94_1.doStart(context, out);
        _jettag_c_setVariable_94_1.doEnd();
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_97_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_97_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_97_1.setRuntimeParent(null);
        _jettag_c_if_97_1.setTagInfo(_td_c_if_97_1);
        _jettag_c_if_97_1.doStart(context, out);
        while (_jettag_c_if_97_1.okToProcessBody()) {
            out.write("      useHTTPS=\"true\" ");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_97_1.handleBodyContent(out);
        }
        _jettag_c_if_97_1.doEnd();
        out.write(NL);         
        out.write(">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Receive Request\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmDatabase.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_3\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      location=\"163,79\" statement=\"esql://routine/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_106_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_106_51); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_106_51.setRuntimeParent(null);
        _jettag_c_get_106_51.setTagInfo(_td_c_get_106_51);
        _jettag_c_get_106_51.doStart(context, out);
        _jettag_c_get_106_51.doEnd();
        out.write("Initialise_Request_Parameters.Main\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Initialise Request\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <longDescription xmi:type=\"utility:ConstantString\" string=\"Note that database module is used even though no data source is being referenced.&#xD;&#xA;This node is used to enhance performance as no part of the message tree has to be copied.&#xD;&#xA;\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmSOAPRequest.msgnode:FCMComposite_1\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      xmi:id=\"FCMComposite_1_2\" location=\"293,106\" ");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_112_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_112_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_112_1.setRuntimeParent(null);
        _jettag_c_if_112_1.setTagInfo(_td_c_if_112_1);
        _jettag_c_if_112_1.doStart(context, out);
        while (_jettag_c_if_112_1.okToProcessBody()) {
            out.write("\t");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t  wsdlFileName=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_121_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_121_18); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_121_18.setRuntimeParent(_jettag_c_if_112_1);
            _jettag_c_get_121_18.setTagInfo(_td_c_get_121_18);
            _jettag_c_get_121_18.doStart(context, out);
            _jettag_c_get_121_18.doEnd();
            out.write("\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      selectedPortType=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_122_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_122_25); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_122_25.setRuntimeParent(_jettag_c_if_112_1);
            _jettag_c_get_122_25.setTagInfo(_td_c_get_122_25);
            _jettag_c_get_122_25.doStart(context, out);
            _jettag_c_get_122_25.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      selectedBinding=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_123_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_123_24); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_123_24.setRuntimeParent(_jettag_c_if_112_1);
            _jettag_c_get_123_24.setTagInfo(_td_c_get_123_24);
            _jettag_c_get_123_24.doStart(context, out);
            _jettag_c_get_123_24.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      selectedPort=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_124_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_124_21); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_124_21.setRuntimeParent(_jettag_c_if_112_1);
            _jettag_c_get_124_21.setTagInfo(_td_c_get_124_21);
            _jettag_c_get_124_21.doStart(context, out);
            _jettag_c_get_124_21.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      targetNamespace= \"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_125_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_125_25); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_125_25.setRuntimeParent(_jettag_c_if_112_1);
            _jettag_c_get_125_25.setTagInfo(_td_c_get_125_25);
            _jettag_c_get_125_25.doStart(context, out);
            _jettag_c_get_125_25.doEnd();
            out.write("\"  ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      selectedOperation=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_126_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_126_26); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_126_26.setRuntimeParent(_jettag_c_if_112_1);
            _jettag_c_get_126_26.setTagInfo(_td_c_get_126_26);
            _jettag_c_get_126_26.doStart(context, out);
            _jettag_c_get_126_26.doEnd();
            out.write("\"");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_112_1.handleBodyContent(out);
        }
        _jettag_c_if_112_1.doEnd();
        RuntimeTagElement _jettag_c_if_128_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_128_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_128_2.setRuntimeParent(null);
        _jettag_c_if_128_2.setTagInfo(_td_c_if_128_2);
        _jettag_c_if_128_2.doStart(context, out);
        while (_jettag_c_if_128_2.okToProcessBody()) {
            out.write("    messageSetProperty=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_129_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_129_25); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_129_25.setRuntimeParent(_jettag_c_if_128_2);
            _jettag_c_get_129_25.setTagInfo(_td_c_get_129_25);
            _jettag_c_get_129_25.doStart(context, out);
            _jettag_c_get_129_25.doEnd();
            out.write("\"");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_128_2.handleBodyContent(out);
        }
        _jettag_c_if_128_2.doEnd();
        out.write("      useHTTPTransport=\"true\" ");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_choose_132_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_132_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_132_1.setRuntimeParent(null);
        _jettag_c_choose_132_1.setTagInfo(_td_c_choose_132_1);
        _jettag_c_choose_132_1.doStart(context, out);
        JET2Writer _jettag_c_choose_132_1_saved_out = out;
        while (_jettag_c_choose_132_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_133_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_133_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_133_1.setRuntimeParent(_jettag_c_choose_132_1);
            _jettag_c_when_133_1.setTagInfo(_td_c_when_133_1);
            _jettag_c_when_133_1.doStart(context, out);
            JET2Writer _jettag_c_when_133_1_saved_out = out;
            while (_jettag_c_when_133_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("webServiceURL=\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_134_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_134_16); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_134_16.setRuntimeParent(_jettag_c_when_133_1);
                _jettag_c_get_134_16.setTagInfo(_td_c_get_134_16);
                _jettag_c_get_134_16.doStart(context, out);
                _jettag_c_get_134_16.doEnd();
                out.write("\"");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_133_1.handleBodyContent(out);
            }
            out = _jettag_c_when_133_1_saved_out;
            _jettag_c_when_133_1.doEnd();
            RuntimeTagElement _jettag_c_otherwise_136_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_136_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_136_1.setRuntimeParent(_jettag_c_choose_132_1);
            _jettag_c_otherwise_136_1.setTagInfo(_td_c_otherwise_136_1);
            _jettag_c_otherwise_136_1.doStart(context, out);
            JET2Writer _jettag_c_otherwise_136_1_saved_out = out;
            while (_jettag_c_otherwise_136_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                // Get the path from the wsdl service name 
                out.write("\twebServiceURL=\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_138_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_138_17); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_138_17.setRuntimeParent(_jettag_c_otherwise_136_1);
                _jettag_c_get_138_17.setTagInfo(_td_c_get_138_17);
                _jettag_c_get_138_17.doStart(context, out);
                _jettag_c_get_138_17.doEnd();
                out.write("\" ");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_otherwise_136_1.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_136_1_saved_out;
            _jettag_c_otherwise_136_1.doEnd();
            _jettag_c_choose_132_1.handleBodyContent(out);
        }
        out = _jettag_c_choose_132_1_saved_out;
        _jettag_c_choose_132_1.doEnd();
        out.write("      requestTimeout=\"30\" sslProtocol=\"SSL\">      ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <translation xmi:type=\"utility:ConstantString\" string=\"Forward Request\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmDatabase.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_12\" location=\"476,97\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      statement=\"esql://routine/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_145_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_145_33); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_145_33.setRuntimeParent(null);
        _jettag_c_get_145_33.setTagInfo(_td_c_get_145_33);
        _jettag_c_get_145_33.doStart(context, out);
        _jettag_c_get_145_33.doEnd();
        out.write("SetReplyStatus.Main\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Set Response Mode\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmDatabase.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_13\" location=\"476,176\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      statement=\"esql://routine/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_149_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_149_33); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_149_33.setRuntimeParent(null);
        _jettag_c_get_149_33.setTagInfo(_td_c_get_149_33);
        _jettag_c_get_149_33.doStart(context, out);
        _jettag_c_get_149_33.doEnd();
        out.write("SetFaultStatus.Main\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Set Fault Mode\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmSOAPReply.msgnode:FCMComposite_1\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      xmi:id=\"FCMComposite_1_10\" location=\"681,109\"");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_154_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_154_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_154_1.setRuntimeParent(null);
        _jettag_c_if_154_1.setTagInfo(_td_c_if_154_1);
        _jettag_c_if_154_1.doStart(context, out);
        while (_jettag_c_if_154_1.okToProcessBody()) {
            out.write("      \t\tvalidateMaster=\"contentAndValue\"");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_154_1.handleBodyContent(out);
        }
        _jettag_c_if_154_1.doEnd();
        out.write(" >");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Send Reply\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>      ");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_159_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_159_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_159_1.setRuntimeParent(null);
        _jettag_c_if_159_1.setTagInfo(_td_c_if_159_1);
        _jettag_c_if_159_1.doStart(context, out);
        while (_jettag_c_if_159_1.okToProcessBody()) {
            out.write("      <nodes xmi:type=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_160_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_160_24); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_160_24.setRuntimeParent(_jettag_c_if_159_1);
            _jettag_c_get_160_24.setTagInfo(_td_c_get_160_24);
            _jettag_c_get_160_24.doStart(context, out);
            _jettag_c_get_160_24.doEnd();
            RuntimeTagElement _jettag_c_get_160_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_160_62); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_160_62.setRuntimeParent(_jettag_c_if_159_1);
            _jettag_c_get_160_62.setTagInfo(_td_c_get_160_62);
            _jettag_c_get_160_62.doStart(context, out);
            _jettag_c_get_160_62.doEnd();
            out.write(".subflow:FCMComposite_1\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      xmi:id=\"FCMComposite_1_8\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      location=\"635,44\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Log\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      </nodes>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_159_1.handleBodyContent(out);
        }
        _jettag_c_if_159_1.doEnd();
        out.write(NL);         
        out.write("      <nodes xmi:type=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_167_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_167_24); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_167_24.setRuntimeParent(null);
        _jettag_c_get_167_24.setTagInfo(_td_c_get_167_24);
        _jettag_c_get_167_24.doStart(context, out);
        _jettag_c_get_167_24.doEnd();
        RuntimeTagElement _jettag_c_get_167_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_167_62); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_167_62.setRuntimeParent(null);
        _jettag_c_get_167_62.setTagInfo(_td_c_get_167_62);
        _jettag_c_get_167_62.doStart(context, out);
        _jettag_c_get_167_62.doEnd();
        out.write(".subflow:FCMComposite_1\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      xmi:id=\"FCMComposite_1_9\" location=\"168,195\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Handle Errors\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_3\" targetNode=\"FCMComposite_1_9\" sourceNode=\"FCMComposite_1_1\" sourceTerminalName=\"OutTerminal.catch\" targetTerminalName=\"InTerminal.Input\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_22\" targetNode=\"FCMComposite_1_12\" sourceNode=\"FCMComposite_1_2\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_23\" targetNode=\"FCMComposite_1_13\" sourceNode=\"FCMComposite_1_2\" sourceTerminalName=\"OutTerminal.fault\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_24\" targetNode=\"FCMComposite_1_10\" sourceNode=\"FCMComposite_1_12\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_25\" targetNode=\"FCMComposite_1_10\" sourceNode=\"FCMComposite_1_13\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_177_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_177_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_177_1.setRuntimeParent(null);
        _jettag_c_if_177_1.setTagInfo(_td_c_if_177_1);
        _jettag_c_if_177_1.doStart(context, out);
        while (_jettag_c_if_177_1.okToProcessBody()) {
            out.write(NL);         
            out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_2\" targetNode=\"FCMComposite_1_8\" sourceNode=\"FCMComposite_1_3\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.Input\"/> ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_26\" targetNode=\"FCMComposite_1_8\" sourceNode=\"FCMComposite_1_12\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.Input\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_27\" targetNode=\"FCMComposite_1_8\" sourceNode=\"FCMComposite_1_13\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.Input\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_177_1.handleBodyContent(out);
        }
        _jettag_c_if_177_1.doEnd();
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_1\" targetNode=\"FCMComposite_1_3\" sourceNode=\"FCMComposite_1_1\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_4\" targetNode=\"FCMComposite_1_2\" sourceNode=\"FCMComposite_1_3\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    </composition>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <propertyOrganizer>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_187_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_187_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_187_1.setRuntimeParent(null);
        _jettag_c_if_187_1.setTagInfo(_td_c_if_187_1);
        _jettag_c_if_187_1.doStart(context, out);
        while (_jettag_c_if_187_1.okToProcessBody()) {
            out.write("      <propertyDescriptor groupName=\"Group.Basic\" configurable=\"true\" userDefined=\"true\" describedAttribute=\"Property.ErrorLoggingOn\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        <propertyName xmi:type=\"utility:TranslatableString\" key=\"Property.ErrorLoggingOn\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        bundleName=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_190_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_190_21); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_190_21.setRuntimeParent(_jettag_c_if_187_1);
            _jettag_c_get_190_21.setTagInfo(_td_c_get_190_21);
            _jettag_c_get_190_21.doStart(context, out);
            _jettag_c_get_190_21.doEnd();
            RuntimeTagElement _jettag_c_get_190_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_190_59); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_190_59.setRuntimeParent(_jettag_c_if_187_1);
            _jettag_c_get_190_59.setTagInfo(_td_c_get_190_59);
            _jettag_c_get_190_59.doStart(context, out);
            _jettag_c_get_190_59.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        pluginId=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_191_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_191_19); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_191_19.setRuntimeParent(_jettag_c_if_187_1);
            _jettag_c_get_191_19.setTagInfo(_td_c_get_191_19);
            _jettag_c_get_191_19.doStart(context, out);
            _jettag_c_get_191_19.doEnd();
            out.write("\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_187_1.handleBodyContent(out);
        }
        _jettag_c_if_187_1.doEnd();
        RuntimeTagElement _jettag_c_if_193_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_193_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_193_1.setRuntimeParent(null);
        _jettag_c_if_193_1.setTagInfo(_td_c_if_193_1);
        _jettag_c_if_193_1.doStart(context, out);
        while (_jettag_c_if_193_1.okToProcessBody()) {
            out.write("        <propertyDescriptor groupName=\"Group.Basic\" configurable=\"true\" userDefined=\"true\" describedAttribute=\"Property.RequestLoggingOn\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("          <propertyName xmi:type=\"utility:TranslatableString\" key=\"Property.RequestLoggingOn\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("          bundleName=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_196_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_196_23); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_196_23.setRuntimeParent(_jettag_c_if_193_1);
            _jettag_c_get_196_23.setTagInfo(_td_c_get_196_23);
            _jettag_c_get_196_23.doStart(context, out);
            _jettag_c_get_196_23.doEnd();
            RuntimeTagElement _jettag_c_get_196_61 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_196_61); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_196_61.setRuntimeParent(_jettag_c_if_193_1);
            _jettag_c_get_196_61.setTagInfo(_td_c_get_196_61);
            _jettag_c_get_196_61.doStart(context, out);
            _jettag_c_get_196_61.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("          pluginId=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_197_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_197_21); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_197_21.setRuntimeParent(_jettag_c_if_193_1);
            _jettag_c_get_197_21.setTagInfo(_td_c_get_197_21);
            _jettag_c_get_197_21.doStart(context, out);
            _jettag_c_get_197_21.doEnd();
            out.write("\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("          <propertyDescriptor groupName=\"Group.Basic\" configurable=\"true\" userDefined=\"true\" describedAttribute=\"Property.ResponseLoggingOn\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            <propertyName xmi:type=\"utility:TranslatableString\" key=\"Property.ResponseLoggingOn\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            bundleName=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_200_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_200_25); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_200_25.setRuntimeParent(_jettag_c_if_193_1);
            _jettag_c_get_200_25.setTagInfo(_td_c_get_200_25);
            _jettag_c_get_200_25.doStart(context, out);
            _jettag_c_get_200_25.doEnd();
            RuntimeTagElement _jettag_c_get_200_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_200_63); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_200_63.setRuntimeParent(_jettag_c_if_193_1);
            _jettag_c_get_200_63.setTagInfo(_td_c_get_200_63);
            _jettag_c_get_200_63.doStart(context, out);
            _jettag_c_get_200_63.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("            pluginId=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_201_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_201_23); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_201_23.setRuntimeParent(_jettag_c_if_193_1);
            _jettag_c_get_201_23.setTagInfo(_td_c_get_201_23);
            _jettag_c_get_201_23.doStart(context, out);
            _jettag_c_get_201_23.doEnd();
            out.write("\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("          </propertyDescriptor>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        </propertyDescriptor>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_193_1.handleBodyContent(out);
        }
        _jettag_c_if_193_1.doEnd();
        RuntimeTagElement _jettag_c_if_205_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_205_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_205_1.setRuntimeParent(null);
        _jettag_c_if_205_1.setTagInfo(_td_c_if_205_1);
        _jettag_c_if_205_1.doStart(context, out);
        while (_jettag_c_if_205_1.okToProcessBody()) {
            out.write("      </propertyDescriptor>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_205_1.handleBodyContent(out);
        }
        _jettag_c_if_205_1.doEnd();
        out.write("    </propertyOrganizer>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_209_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_209_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_209_1.setRuntimeParent(null);
        _jettag_c_if_209_1.setTagInfo(_td_c_if_209_1);
        _jettag_c_if_209_1.doStart(context, out);
        while (_jettag_c_if_209_1.okToProcessBody()) {
            out.write("    <attributeLinks promotedAttribute=\"Property.ErrorLoggingOn\" overriddenNodes=\"FCMComposite_1_9\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <overriddenAttribute       ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      href=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_212_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_212_13); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_212_13.setRuntimeParent(_jettag_c_if_209_1);
            _jettag_c_get_212_13.setTagInfo(_td_c_get_212_13);
            _jettag_c_get_212_13.doStart(context, out);
            _jettag_c_get_212_13.doEnd();
            RuntimeTagElement _jettag_c_get_212_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_212_51); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_212_51.setRuntimeParent(_jettag_c_if_209_1);
            _jettag_c_get_212_51.setTagInfo(_td_c_get_212_51);
            _jettag_c_get_212_51.doStart(context, out);
            _jettag_c_get_212_51.doEnd();
            out.write(".subflow#Property.ErrorLoggingOn\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    </attributeLinks>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_209_1.handleBodyContent(out);
        }
        _jettag_c_if_209_1.doEnd();
        RuntimeTagElement _jettag_c_if_215_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_215_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_215_1.setRuntimeParent(null);
        _jettag_c_if_215_1.setTagInfo(_td_c_if_215_1);
        _jettag_c_if_215_1.doStart(context, out);
        while (_jettag_c_if_215_1.okToProcessBody()) {
            out.write("    <attributeLinks promotedAttribute=\"Property.RequestLoggingOn\" overriddenNodes=\"FCMComposite_1_8\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <overriddenAttribute ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      href=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_218_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_218_13); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_218_13.setRuntimeParent(_jettag_c_if_215_1);
            _jettag_c_get_218_13.setTagInfo(_td_c_get_218_13);
            _jettag_c_get_218_13.doStart(context, out);
            _jettag_c_get_218_13.doEnd();
            RuntimeTagElement _jettag_c_get_218_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_218_51); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_218_51.setRuntimeParent(_jettag_c_if_215_1);
            _jettag_c_get_218_51.setTagInfo(_td_c_get_218_51);
            _jettag_c_get_218_51.doStart(context, out);
            _jettag_c_get_218_51.doEnd();
            out.write(".subflow#Property.RequestLoggingOn\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    </attributeLinks>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    <attributeLinks promotedAttribute=\"Property.ResponseLoggingOn\" overriddenNodes=\"FCMComposite_1_8\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <overriddenAttribute ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      href=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_222_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_222_13); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_222_13.setRuntimeParent(_jettag_c_if_215_1);
            _jettag_c_get_222_13.setTagInfo(_td_c_get_222_13);
            _jettag_c_get_222_13.doStart(context, out);
            _jettag_c_get_222_13.doEnd();
            RuntimeTagElement _jettag_c_get_222_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_222_51); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_222_51.setRuntimeParent(_jettag_c_if_215_1);
            _jettag_c_get_222_51.setTagInfo(_td_c_get_222_51);
            _jettag_c_get_222_51.doStart(context, out);
            _jettag_c_get_222_51.doEnd();
            out.write(".subflow#Property.ResponseLoggingOn\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    </attributeLinks>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_215_1.handleBodyContent(out);
        }
        _jettag_c_if_215_1.doEnd();
        out.write("  </eClassifiers>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</ecore:EPackage>");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
