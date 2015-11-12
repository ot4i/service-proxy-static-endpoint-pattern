package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_Logsubflow implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_Logsubflow() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_8_9 = new TagInfo("c:get", //$NON-NLS-1$
            8, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowURI", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_15 = new TagInfo("c:get", //$NON-NLS-1$
            9, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_61 = new TagInfo("c:get", //$NON-NLS-1$
            19, 61,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_108 = new TagInfo("c:get", //$NON-NLS-1$
            19, 108,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_163 = new TagInfo("c:get", //$NON-NLS-1$
            19, 163,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_86 = new TagInfo("c:get", //$NON-NLS-1$
            20, 86,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_86 = new TagInfo("c:get", //$NON-NLS-1$
            21, 86,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_26 = new TagInfo("c:get", //$NON-NLS-1$
            24, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_71 = new TagInfo("c:get", //$NON-NLS-1$
            24, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_15 = new TagInfo("c:get", //$NON-NLS-1$
            25, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/longDescription", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_33 = new TagInfo("c:get", //$NON-NLS-1$
            26, 33,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_27_36 = new TagInfo("c:get", //$NON-NLS-1$
            27, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_95 = new TagInfo("c:get", //$NON-NLS-1$
            32, 95,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_150 = new TagInfo("c:get", //$NON-NLS-1$
            32, 150,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_141 = new TagInfo("c:get", //$NON-NLS-1$
            34, 141,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_27 = new TagInfo("c:get", //$NON-NLS-1$
            38, 27,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/logQueueManager", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_20 = new TagInfo("c:get", //$NON-NLS-1$
            39, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queuePrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_55 = new TagInfo("c:get", //$NON-NLS-1$
            39, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/logQueue", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_87 = new TagInfo("c:get", //$NON-NLS-1$
            39, 87,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queueSuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_43_140 = new TagInfo("c:get", //$NON-NLS-1$
            43, 140,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_49_141 = new TagInfo("c:get", //$NON-NLS-1$
            49, 141,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_65_105 = new TagInfo("c:get", //$NON-NLS-1$
            65, 105,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_65_160 = new TagInfo("c:get", //$NON-NLS-1$
            65, 160,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_106 = new TagInfo("c:get", //$NON-NLS-1$
            67, 106,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_161 = new TagInfo("c:get", //$NON-NLS-1$
            67, 161,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<ecore:EPackage xmi:version=\"2.0\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:ComIbmCompute.msgnode=\"ComIbmCompute.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmFilter.msgnode=\"ComIbmFilter.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmMQOutput.msgnode=\"ComIbmMQOutput.msgnode\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmTrace.msgnode=\"ComIbmTrace.msgnode\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmTryCatch.msgnode=\"ComIbmTryCatch.msgnode\" xmlns:ecore=\"http://www.eclipse.org/emf/2002/Ecore\" xmlns:eflow=\"http://www.ibm.com/wbi/2005/eflow\" xmlns:utility=\"http://www.ibm.com/wbi/2005/eflow_utility\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tnsURI=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_8_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_8_9.setRuntimeParent(null);
        _jettag_c_get_8_9.setTagInfo(_td_c_get_8_9);
        _jettag_c_get_8_9.doStart(context, out);
        _jettag_c_get_8_9.doEnd();
        out.write(".subflow\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    nsPrefix=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_9_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_9_15.setRuntimeParent(null);
        _jettag_c_get_9_15.setTagInfo(_td_c_get_9_15);
        _jettag_c_get_9_15.doStart(context, out);
        _jettag_c_get_9_15.doEnd();
        out.write(".subflow\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  <eClassifiers xmi:type=\"eflow:FCMComposite\" name=\"FCMComposite_1\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <eSuperTypes href=\"http://www.ibm.com/wbi/2005/eflow#//FCMBlock\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <eStructuralFeatures xmi:type=\"ecore:EAttribute\" xmi:id=\"Property.RequestLoggingOn\" name=\"RequestLoggingOn\" lowerBound=\"1\" defaultValueLiteral=\"false\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <eType xmi:type=\"ecore:EDataType\" href=\"http://www.eclipse.org/emf/2002/Ecore#//EBoolean\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    </eStructuralFeatures>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <eStructuralFeatures xmi:type=\"ecore:EAttribute\" xmi:id=\"Property.ResponseLoggingOn\" name=\"ResponseLoggingOn\" lowerBound=\"1\" defaultValueLiteral=\"false\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <eType xmi:type=\"ecore:EDataType\" href=\"http://www.eclipse.org/emf/2002/Ecore#//EBoolean\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    </eStructuralFeatures>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <translation xmi:type=\"utility:TranslatableString\" key=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_19_61 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_61); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_19_61.setRuntimeParent(null);
        _jettag_c_get_19_61.setTagInfo(_td_c_get_19_61);
        _jettag_c_get_19_61.doStart(context, out);
        _jettag_c_get_19_61.doEnd();
        out.write("\" bundleName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_19_108 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_108); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_19_108.setRuntimeParent(null);
        _jettag_c_get_19_108.setTagInfo(_td_c_get_19_108);
        _jettag_c_get_19_108.doStart(context, out);
        _jettag_c_get_19_108.doEnd();
        out.write("\" pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_19_163 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_163); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_19_163.setRuntimeParent(null);
        _jettag_c_get_19_163.setTagInfo(_td_c_get_19_163);
        _jettag_c_get_19_163.doStart(context, out);
        _jettag_c_get_19_163.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <colorGraphic16 xmi:type=\"utility:GIFFileGraphic\" resourceName=\"platform:/plugin/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_20_86 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_86); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_20_86.setRuntimeParent(null);
        _jettag_c_get_20_86.setTagInfo(_td_c_get_20_86);
        _jettag_c_get_20_86.doStart(context, out);
        _jettag_c_get_20_86.doEnd();
        out.write("/icons/full/obj16/Log.gif\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <colorGraphic32 xmi:type=\"utility:GIFFileGraphic\" resourceName=\"platform:/plugin/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_21_86 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_86); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_21_86.setRuntimeParent(null);
        _jettag_c_get_21_86.setTagInfo(_td_c_get_21_86);
        _jettag_c_get_21_86.doStart(context, out);
        _jettag_c_get_21_86.doEnd();
        out.write("/icons/full/obj30/Log.gif\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <shortDescription xmi:type=\"utility:ConstantString\" string=\"\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <longDescription xmi:type=\"utility:ConstantString\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    string=\"Generated by ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_24_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_24_26.setRuntimeParent(null);
        _jettag_c_get_24_26.setTagInfo(_td_c_get_24_26);
        _jettag_c_get_24_26.doStart(context, out);
        _jettag_c_get_24_26.doEnd();
        out.write(" Version ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_24_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_71); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_24_71.setRuntimeParent(null);
        _jettag_c_get_24_71.setTagInfo(_td_c_get_24_71);
        _jettag_c_get_24_71.doStart(context, out);
        _jettag_c_get_24_71.doEnd();
        out.write(NL);         
        out.write("    &#xD;&#xA;");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_25_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_25_15.setRuntimeParent(null);
        _jettag_c_get_25_15.setTagInfo(_td_c_get_25_15);
        _jettag_c_get_25_15.doStart(context, out);
        _jettag_c_get_25_15.doEnd();
        out.write(NL);         
        out.write("    &#xD;&#xA;$MQSI patternName=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_26_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_33); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_26_33.setRuntimeParent(null);
        _jettag_c_get_26_33.setTagInfo(_td_c_get_26_33);
        _jettag_c_get_26_33.doStart(context, out);
        _jettag_c_get_26_33.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    &#xD;&#xA;$MQSI patternVersion=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_27_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_27_36.setRuntimeParent(null);
        _jettag_c_get_27_36.setTagInfo(_td_c_get_27_36);
        _jettag_c_get_27_36.doStart(context, out);
        _jettag_c_get_27_36.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    \"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <version xmi:type=\"utility:ConstantString\" string=\"1\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <composition>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"eflow:FCMSource\" xmi:id=\"InTerminal.Input\" location=\"53,69\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:TranslatableString\" key=\"InTerminal.Input\" bundleName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_32_95 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_95); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_32_95.setRuntimeParent(null);
        _jettag_c_get_32_95.setTagInfo(_td_c_get_32_95);
        _jettag_c_get_32_95.doStart(context, out);
        _jettag_c_get_32_95.doEnd();
        out.write("\" pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_32_150 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_150); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_32_150.setRuntimeParent(null);
        _jettag_c_get_32_150.setTagInfo(_td_c_get_32_150);
        _jettag_c_get_32_150.doStart(context, out);
        _jettag_c_get_32_150.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmCompute.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_3\" location=\"391,150\" computeExpression=\"esql://routine/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_34_141 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_141); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_34_141.setRuntimeParent(null);
        _jettag_c_get_34_141.setTagInfo(_td_c_get_34_141);
        _jettag_c_get_34_141.doStart(context, out);
        _jettag_c_get_34_141.doEnd();
        out.write("CreateLogMessage.Main\" computeMode=\"destinationAndMessage\" throwExceptionOnDatabaseError=\"false\" >");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Create Log Message\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmMQOutput.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_6\" location=\"695,151\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      \t\tqueueManagerName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_38_27 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_27); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_38_27.setRuntimeParent(null);
        _jettag_c_get_38_27.setTagInfo(_td_c_get_38_27);
        _jettag_c_get_38_27.doStart(context, out);
        _jettag_c_get_38_27.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      \t\tqueueName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_39_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_20); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_39_20.setRuntimeParent(null);
        _jettag_c_get_39_20.setTagInfo(_td_c_get_39_20);
        _jettag_c_get_39_20.doStart(context, out);
        _jettag_c_get_39_20.doEnd();
        RuntimeTagElement _jettag_c_get_39_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_55); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_39_55.setRuntimeParent(null);
        _jettag_c_get_39_55.setTagInfo(_td_c_get_39_55);
        _jettag_c_get_39_55.doStart(context, out);
        _jettag_c_get_39_55.doEnd();
        RuntimeTagElement _jettag_c_get_39_87 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_87); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_39_87.setRuntimeParent(null);
        _jettag_c_get_39_87.setTagInfo(_td_c_get_39_87);
        _jettag_c_get_39_87.doStart(context, out);
        _jettag_c_get_39_87.doEnd();
        out.write("\"  ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\ttransactionMode=\"no\" persistenceMode=\"yes\" validateMaster=\"none\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"MQOutput\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmFilter.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_11\" location=\"305,138\" filterExpression=\"esql://routine/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_43_140 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_43_140); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_43_140.setRuntimeParent(null);
        _jettag_c_get_43_140.setTagInfo(_td_c_get_43_140);
        _jettag_c_get_43_140.doStart(context, out);
        _jettag_c_get_43_140.doEnd();
        out.write("CheckLogging.Main\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Filter\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmTryCatch.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_15\" location=\"214,69\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"TryCatch\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmCompute.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_17\" location=\"402,65\" computeExpression=\"esql://routine/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_49_141 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_49_141); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_49_141.setRuntimeParent(null);
        _jettag_c_get_49_141.setTagInfo(_td_c_get_49_141);
        _jettag_c_get_49_141.doStart(context, out);
        _jettag_c_get_49_141.doEnd();
        out.write("CreateTraceData.Main\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"CreateTraceData\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmTrace.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_4\" location=\"601,66\" pattern=\"${Environment.PatternVariables}\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Trace\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_15\" targetNode=\"FCMComposite_1_17\" sourceNode=\"FCMComposite_1_15\" sourceTerminalName=\"OutTerminal.catch\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_4\" targetNode=\"FCMComposite_1_4\" sourceNode=\"FCMComposite_1_17\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_6\" targetNode=\"FCMComposite_1_11\" sourceNode=\"FCMComposite_1_15\" sourceTerminalName=\"OutTerminal.try\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_1\" targetNode=\"FCMComposite_1_15\" sourceNode=\"InTerminal.Input\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_4\" targetNode=\"FCMComposite_1_3\" sourceNode=\"FCMComposite_1_11\" sourceTerminalName=\"OutTerminal.true\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_2\" targetNode=\"FCMComposite_1_6\" sourceNode=\"FCMComposite_1_3\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    </composition>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <propertyOrganizer>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <propertyDescriptor groupName=\"Group.Basic\" configurable=\"true\" userDefined=\"true\" describedAttribute=\"Property.RequestLoggingOn\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <propertyName xmi:type=\"utility:TranslatableString\" key=\"Property.RequestLoggingOn\" bundleName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_65_105 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_65_105); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_65_105.setRuntimeParent(null);
        _jettag_c_get_65_105.setTagInfo(_td_c_get_65_105);
        _jettag_c_get_65_105.doStart(context, out);
        _jettag_c_get_65_105.doEnd();
        out.write("\" pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_65_160 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_65_160); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_65_160.setRuntimeParent(null);
        _jettag_c_get_65_160.setTagInfo(_td_c_get_65_160);
        _jettag_c_get_65_160.doStart(context, out);
        _jettag_c_get_65_160.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <propertyDescriptor groupName=\"Group.Basic\" configurable=\"true\" userDefined=\"true\" describedAttribute=\"Property.ResponseLoggingOn\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <propertyName xmi:type=\"utility:TranslatableString\" key=\"Property.ResponseLoggingOn\" bundleName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_67_106 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_106); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_67_106.setRuntimeParent(null);
        _jettag_c_get_67_106.setTagInfo(_td_c_get_67_106);
        _jettag_c_get_67_106.doStart(context, out);
        _jettag_c_get_67_106.doEnd();
        out.write("\" pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_67_161 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_161); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_67_161.setRuntimeParent(null);
        _jettag_c_get_67_161.setTagInfo(_td_c_get_67_161);
        _jettag_c_get_67_161.doStart(context, out);
        _jettag_c_get_67_161.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </propertyDescriptor>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      </propertyDescriptor>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    </propertyOrganizer>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  </eClassifiers>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</ecore:EPackage>");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
