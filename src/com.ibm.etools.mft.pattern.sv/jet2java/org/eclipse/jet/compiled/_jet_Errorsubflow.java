package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_Errorsubflow implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_Errorsubflow() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_17_12 = new TagInfo("c:get", //$NON-NLS-1$
            17, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowURI", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_15 = new TagInfo("c:get", //$NON-NLS-1$
            18, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_21_1 = new TagInfo("c:if", //$NON-NLS-1$
            21, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired= 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_27_10 = new TagInfo("c:get", //$NON-NLS-1$
            27, 10,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlow", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_17 = new TagInfo("c:get", //$NON-NLS-1$
            28, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_15 = new TagInfo("c:get", //$NON-NLS-1$
            29, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_31_36 = new TagInfo("c:get", //$NON-NLS-1$
            31, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_36 = new TagInfo("c:get", //$NON-NLS-1$
            33, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_62 = new TagInfo("c:get", //$NON-NLS-1$
            34, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/shortDescription", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_26 = new TagInfo("c:get", //$NON-NLS-1$
            36, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_71 = new TagInfo("c:get", //$NON-NLS-1$
            36, 71,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_15 = new TagInfo("c:get", //$NON-NLS-1$
            37, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/longDescription", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_33 = new TagInfo("c:get", //$NON-NLS-1$
            38, 33,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_36 = new TagInfo("c:get", //$NON-NLS-1$
            39, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_45_19 = new TagInfo("c:get", //$NON-NLS-1$
            45, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_46_19 = new TagInfo("c:get", //$NON-NLS-1$
            46, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_52_41 = new TagInfo("c:get", //$NON-NLS-1$
            52, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_60_1 = new TagInfo("c:if", //$NON-NLS-1$
            60, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired= 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_62_40 = new TagInfo("c:get", //$NON-NLS-1$
            62, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_70_41 = new TagInfo("c:get", //$NON-NLS-1$
            70, 41,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_74_25 = new TagInfo("c:get", //$NON-NLS-1$
            74, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorQueueManager", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_75_18 = new TagInfo("c:get", //$NON-NLS-1$
            75, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queuePrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_75_55 = new TagInfo("c:get", //$NON-NLS-1$
            75, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorQueue", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_75_91 = new TagInfo("c:get", //$NON-NLS-1$
            75, 91,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/queueSuffix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_84_1 = new TagInfo("c:if", //$NON-NLS-1$
            84, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired= 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_96_1 = new TagInfo("c:if", //$NON-NLS-1$
            96, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired= 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_100_21 = new TagInfo("c:get", //$NON-NLS-1$
            100, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@thisFlowBundleName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_101_19 = new TagInfo("c:get", //$NON-NLS-1$
            101, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@projectname", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;

com.ibm.etools.mft.pattern.sv.plugin.PatternPlugin pattern = com.ibm.etools.mft.pattern.sv.plugin.PatternPlugin.getInstance();
com.ibm.etools.mft.pattern.sv.sp.ssp.PatternMessages messages = new com.ibm.etools.mft.pattern.sv.sp.ssp.PatternMessages();

        out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<ecore:EPackage xmi:version=\"2.0\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:xmi=\"http://www.omg.org/XMI\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmCompute.msgnode=\"ComIbmCompute.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmFilter.msgnode=\"ComIbmFilter.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmFlowOrder.msgnode=\"ComIbmFlowOrder.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmMQOutput.msgnode=\"ComIbmMQOutput.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmSOAPReply.msgnode=\"ComIbmSOAPReply.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ComIbmThrow.msgnode=\"ComIbmThrow.msgnode\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:ecore=\"http://www.eclipse.org/emf/2002/Ecore\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:eflow=\"http://www.ibm.com/wbi/2005/eflow\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    xmlns:utility=\"http://www.ibm.com/wbi/2005/eflow_utility\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    nsURI=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_17_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_12); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_17_12.setRuntimeParent(null);
        _jettag_c_get_17_12.setTagInfo(_td_c_get_17_12);
        _jettag_c_get_17_12.doStart(context, out);
        _jettag_c_get_17_12.doEnd();
        out.write(".subflow\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    nsPrefix=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_18_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_18_15.setRuntimeParent(null);
        _jettag_c_get_18_15.setTagInfo(_td_c_get_18_15);
        _jettag_c_get_18_15.doStart(context, out);
        _jettag_c_get_18_15.doEnd();
        out.write(".subflow\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  <eClassifiers xmi:type=\"eflow:FCMComposite\" name=\"FCMComposite_1\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <eSuperTypes href=\"http://www.ibm.com/wbi/2005/eflow#//FCMBlock\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_21_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_21_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_21_1.setRuntimeParent(null);
        _jettag_c_if_21_1.setTagInfo(_td_c_if_21_1);
        _jettag_c_if_21_1.doStart(context, out);
        while (_jettag_c_if_21_1.okToProcessBody()) {
            out.write("    <eStructuralFeatures xmi:type=\"ecore:EAttribute\" xmi:id=\"Property.ErrorLoggingOn\" name=\"ErrorLoggingOn\" lowerBound=\"1\" defaultValueLiteral=\"true\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <eType xmi:type=\"ecore:EDataType\" href=\"http://www.eclipse.org/emf/2002/Ecore#//EBoolean\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    </eStructuralFeatures>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_21_1.handleBodyContent(out);
        }
        _jettag_c_if_21_1.doEnd();
        out.write("    <translation xmi:type=\"utility:TranslatableString\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    key=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_27_10 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_10); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_27_10.setRuntimeParent(null);
        _jettag_c_get_27_10.setTagInfo(_td_c_get_27_10);
        _jettag_c_get_27_10.doStart(context, out);
        _jettag_c_get_27_10.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    bundleName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_28_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_17); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_28_17.setRuntimeParent(null);
        _jettag_c_get_28_17.setTagInfo(_td_c_get_28_17);
        _jettag_c_get_28_17.doStart(context, out);
        _jettag_c_get_28_17.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_29_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_29_15.setRuntimeParent(null);
        _jettag_c_get_29_15.setTagInfo(_td_c_get_29_15);
        _jettag_c_get_29_15.doStart(context, out);
        _jettag_c_get_29_15.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <colorGraphic16 xmi:type=\"utility:GIFFileGraphic\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    resourceName=\"platform:/plugin/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_31_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_31_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_31_36.setRuntimeParent(null);
        _jettag_c_get_31_36.setTagInfo(_td_c_get_31_36);
        _jettag_c_get_31_36.doStart(context, out);
        _jettag_c_get_31_36.doEnd();
        out.write("/icons/full/obj16/Error.gif\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <colorGraphic32 xmi:type=\"utility:GIFFileGraphic\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    resourceName=\"platform:/plugin/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_33_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_33_36.setRuntimeParent(null);
        _jettag_c_get_33_36.setTagInfo(_td_c_get_33_36);
        _jettag_c_get_33_36.doStart(context, out);
        _jettag_c_get_33_36.doEnd();
        out.write("/icons/full/obj30/Error.gif\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<shortDescription xmi:type=\"utility:ConstantString\" string=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_34_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_62); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_34_62.setRuntimeParent(null);
        _jettag_c_get_34_62.setTagInfo(_td_c_get_34_62);
        _jettag_c_get_34_62.doStart(context, out);
        _jettag_c_get_34_62.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <longDescription xmi:type=\"utility:ConstantString\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    string=\"Generated by ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_36_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_36_26.setRuntimeParent(null);
        _jettag_c_get_36_26.setTagInfo(_td_c_get_36_26);
        _jettag_c_get_36_26.doStart(context, out);
        _jettag_c_get_36_26.doEnd();
        out.write(" Version ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_36_71 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_71); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_36_71.setRuntimeParent(null);
        _jettag_c_get_36_71.setTagInfo(_td_c_get_36_71);
        _jettag_c_get_36_71.doStart(context, out);
        _jettag_c_get_36_71.doEnd();
        out.write(NL);         
        out.write("    &#xD;&#xA;");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_37_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_15); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_37_15.setRuntimeParent(null);
        _jettag_c_get_37_15.setTagInfo(_td_c_get_37_15);
        _jettag_c_get_37_15.doStart(context, out);
        _jettag_c_get_37_15.doEnd();
        out.write(NL);         
        out.write("    &#xD;&#xA;$MQSI patternName=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_38_33 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_33); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_38_33.setRuntimeParent(null);
        _jettag_c_get_38_33.setTagInfo(_td_c_get_38_33);
        _jettag_c_get_38_33.doStart(context, out);
        _jettag_c_get_38_33.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    &#xD;&#xA;$MQSI patternVersion=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_39_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_36); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_39_36.setRuntimeParent(null);
        _jettag_c_get_39_36.setTagInfo(_td_c_get_39_36);
        _jettag_c_get_39_36.doStart(context, out);
        _jettag_c_get_39_36.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    \"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <version xmi:type=\"utility:ConstantString\" string=\"1\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    <composition>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"eflow:FCMSource\" xmi:id=\"InTerminal.Input\" location=\"14,28\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:TranslatableString\" key=\"InTerminal.Input\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      bundleName=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_45_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_19); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_45_19.setRuntimeParent(null);
        _jettag_c_get_45_19.setTagInfo(_td_c_get_45_19);
        _jettag_c_get_45_19.doStart(context, out);
        _jettag_c_get_45_19.doEnd();
        out.write("\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        pluginId=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_46_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_46_19); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_46_19.setRuntimeParent(null);
        _jettag_c_get_46_19.setTagInfo(_td_c_get_46_19);
        _jettag_c_get_46_19.doStart(context, out);
        _jettag_c_get_46_19.doEnd();
        out.write("\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmFlowOrder.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_2\" location=\"104,28\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Flow Order\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmCompute.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_6\" location=\"361,28\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      computeExpression=\"esql://routine/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_52_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_52_41); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_52_41.setRuntimeParent(null);
        _jettag_c_get_52_41.setTagInfo(_td_c_get_52_41);
        _jettag_c_get_52_41.doStart(context, out);
        _jettag_c_get_52_41.doEnd();
        out.write("#Build_SOAP_Fault.Main\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      computeMode=\"destinationAndMessage\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Build Fault\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <nodes xmi:type=\"ComIbmSOAPReply.msgnode:FCMComposite_1\" ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      xmi:id=\"FCMComposite_1_1\" location=\"504,29\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Return Fault\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      </nodes>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_60_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_60_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_60_1.setRuntimeParent(null);
        _jettag_c_if_60_1.setTagInfo(_td_c_if_60_1);
        _jettag_c_if_60_1.doStart(context, out);
        while (_jettag_c_if_60_1.okToProcessBody()) {
            out.write("      <nodes xmi:type=\"ComIbmFilter.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_3\" location=\"246,167\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      filterExpression=\"esql://routine/");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_62_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_62_40); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_62_40.setRuntimeParent(_jettag_c_if_60_1);
            _jettag_c_get_62_40.setTagInfo(_td_c_get_62_40);
            _jettag_c_get_62_40.doStart(context, out);
            _jettag_c_get_62_40.doEnd();
            out.write("#CheckErrorLoggingOn.Main\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Error Logging On?\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      </nodes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <nodes xmi:type=\"ComIbmThrow.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_4\" location=\"385,129\" messageText=\"");  //$NON-NLS-1$        
            out.write( pattern.getString("com.ibm.etools.mft.pattern.sv.sp.ssp.flow.1") );
            out.write("\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Throw\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      </nodes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("      <nodes xmi:type=\"ComIbmCompute.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_7\" location=\"419,229\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      computeExpression=\"esql://routine/");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_70_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_70_41); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_70_41.setRuntimeParent(_jettag_c_if_60_1);
            _jettag_c_get_70_41.setTagInfo(_td_c_get_70_41);
            _jettag_c_get_70_41.doStart(context, out);
            _jettag_c_get_70_41.doEnd();
            out.write("#Build_Error_Message.Main\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Build Error Message\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      </nodes>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <nodes xmi:type=\"ComIbmMQOutput.msgnode:FCMComposite_1\" xmi:id=\"FCMComposite_1_8\" location=\"583,219\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      queueManagerName=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_74_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_74_25); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_74_25.setRuntimeParent(_jettag_c_if_60_1);
            _jettag_c_get_74_25.setTagInfo(_td_c_get_74_25);
            _jettag_c_get_74_25.doStart(context, out);
            _jettag_c_get_74_25.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      queueName=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_75_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_75_18); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_75_18.setRuntimeParent(_jettag_c_if_60_1);
            _jettag_c_get_75_18.setTagInfo(_td_c_get_75_18);
            _jettag_c_get_75_18.doStart(context, out);
            _jettag_c_get_75_18.doEnd();
            RuntimeTagElement _jettag_c_get_75_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_75_55); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_75_55.setRuntimeParent(_jettag_c_if_60_1);
            _jettag_c_get_75_55.setTagInfo(_td_c_get_75_55);
            _jettag_c_get_75_55.doStart(context, out);
            _jettag_c_get_75_55.doEnd();
            RuntimeTagElement _jettag_c_get_75_91 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_75_91); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_75_91.setRuntimeParent(_jettag_c_if_60_1);
            _jettag_c_get_75_91.setTagInfo(_td_c_get_75_91);
            _jettag_c_get_75_91.doStart(context, out);
            _jettag_c_get_75_91.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      transactionMode=\"no\" persistenceMode=\"yes\" validateMaster=\"none\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        <translation xmi:type=\"utility:ConstantString\" string=\"Write Error To Queue\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      </nodes>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_60_1.handleBodyContent(out);
        }
        _jettag_c_if_60_1.doEnd();
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_5\" targetNode=\"FCMComposite_1_2\" sourceNode=\"InTerminal.Input\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_6\" targetNode=\"FCMComposite_1_6\" sourceNode=\"FCMComposite_1_2\" sourceTerminalName=\"OutTerminal.first\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_8\" targetNode=\"FCMComposite_1_1\" sourceNode=\"FCMComposite_1_6\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_84_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_84_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_84_1.setRuntimeParent(null);
        _jettag_c_if_84_1.setTagInfo(_td_c_if_84_1);
        _jettag_c_if_84_1.doStart(context, out);
        while (_jettag_c_if_84_1.okToProcessBody()) {
            out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_1\" targetNode=\"FCMComposite_1_3\" sourceNode=\"FCMComposite_1_2\" sourceTerminalName=\"OutTerminal.second\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_2\" targetNode=\"FCMComposite_1_4\" sourceNode=\"FCMComposite_1_3\" sourceTerminalName=\"OutTerminal.failure\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_3\" targetNode=\"FCMComposite_1_4\" sourceNode=\"FCMComposite_1_3\" sourceTerminalName=\"OutTerminal.unknown\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_4\" targetNode=\"FCMComposite_1_4\" sourceNode=\"FCMComposite_1_3\" sourceTerminalName=\"OutTerminal.false\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_9\" targetNode=\"FCMComposite_1_7\" sourceNode=\"FCMComposite_1_3\" sourceTerminalName=\"OutTerminal.true\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_10\" targetNode=\"FCMComposite_1_8\" sourceNode=\"FCMComposite_1_7\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_7\" targetNode=\"FCMComposite_1_4\" sourceNode=\"FCMComposite_1_8\" sourceTerminalName=\"OutTerminal.failure\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      <connections xmi:type=\"eflow:FCMConnection\" xmi:id=\"FCMConnection_12\" targetNode=\"FCMComposite_1_4\" sourceNode=\"FCMComposite_1_8\" sourceTerminalName=\"OutTerminal.out\" targetTerminalName=\"InTerminal.in\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_84_1.handleBodyContent(out);
        }
        _jettag_c_if_84_1.doEnd();
        out.write("    </composition>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        <propertyOrganizer>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_96_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_96_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_96_1.setRuntimeParent(null);
        _jettag_c_if_96_1.setTagInfo(_td_c_if_96_1);
        _jettag_c_if_96_1.doStart(context, out);
        while (_jettag_c_if_96_1.okToProcessBody()) {
            out.write(NL);         
            out.write("      <propertyDescriptor groupName=\"Group.Basic\" configurable=\"true\" userDefined=\"true\" describedAttribute=\"Property.ErrorLoggingOn\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        <propertyName xmi:type=\"utility:TranslatableString\" key=\"Property.ErrorLoggingOn\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        bundleName=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_100_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_100_21); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_100_21.setRuntimeParent(_jettag_c_if_96_1);
            _jettag_c_get_100_21.setTagInfo(_td_c_get_100_21);
            _jettag_c_get_100_21.doStart(context, out);
            _jettag_c_get_100_21.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("        pluginId=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_101_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_101_19); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_101_19.setRuntimeParent(_jettag_c_if_96_1);
            _jettag_c_get_101_19.setTagInfo(_td_c_get_101_19);
            _jettag_c_get_101_19.doStart(context, out);
            _jettag_c_get_101_19.doEnd();
            out.write("\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      </propertyDescriptor>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_96_1.handleBodyContent(out);
        }
        _jettag_c_if_96_1.doEnd();
        out.write("    </propertyOrganizer>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  </eClassifiers>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</ecore:EPackage>");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
