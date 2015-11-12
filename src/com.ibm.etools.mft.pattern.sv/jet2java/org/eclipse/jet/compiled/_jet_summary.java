package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_summary implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_summary() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_8_9 = new TagInfo("c:get", //$NON-NLS-1$
            8, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_41_45 = new TagInfo("c:get", //$NON-NLS-1$
            41, 45,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_41_88 = new TagInfo("c:get", //$NON-NLS-1$
            41, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_41_128 = new TagInfo("c:get", //$NON-NLS-1$
            41, 128,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@proxy", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_6 = new TagInfo("c:get", //$NON-NLS-1$
            42, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@proxy", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_45 = new TagInfo("c:get", //$NON-NLS-1$
            51, 45,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_88 = new TagInfo("c:get", //$NON-NLS-1$
            51, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_51_128 = new TagInfo("c:get", //$NON-NLS-1$
            51, 128,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_52_6 = new TagInfo("c:get", //$NON-NLS-1$
            52, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_55_4 = new TagInfo("c:if", //$NON-NLS-1$
            55, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_57_45 = new TagInfo("c:get", //$NON-NLS-1$
            57, 45,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/instanceName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_57_88 = new TagInfo("c:get", //$NON-NLS-1$
            57, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_57_128 = new TagInfo("c:get", //$NON-NLS-1$
            57, 128,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_58_6 = new TagInfo("c:get", //$NON-NLS-1$
            58, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@log", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_76_4 = new TagInfo("c:if", //$NON-NLS-1$
            76, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_78_6 = new TagInfo("c:choose", //$NON-NLS-1$
            78, 6,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_79_7 = new TagInfo("c:when", //$NON-NLS-1$
            79, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "string-length($root/errorQueueManager) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_82_7 = new TagInfo("c:otherwise", //$NON-NLS-1$
            82, 7,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_if_88_4 = new TagInfo("c:if", //$NON-NLS-1$
            88, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_90_6 = new TagInfo("c:choose", //$NON-NLS-1$
            90, 6,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_91_7 = new TagInfo("c:when", //$NON-NLS-1$
            91, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "string-length($root/logQueueManager) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_94_7 = new TagInfo("c:otherwise", //$NON-NLS-1$
            94, 7,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_choose_113_3 = new TagInfo("c:choose", //$NON-NLS-1$
            113, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_114_4 = new TagInfo("c:when", //$NON-NLS-1$
            114, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/loggingRequired='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_123_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            123, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_choose_130_3 = new TagInfo("c:choose", //$NON-NLS-1$
            130, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_131_4 = new TagInfo("c:when", //$NON-NLS-1$
            131, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$root/errorMessageRequired='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_140_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            140, 4,
            new String[] {
            },
            new String[] {
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;

com.ibm.etools.mft.pattern.sv.plugin.PatternPlugin pattern = com.ibm.etools.mft.pattern.sv.plugin.PatternPlugin.getInstance();
com.ibm.etools.mft.pattern.sv.sp.ssp.PatternMessages messages = new com.ibm.etools.mft.pattern.sv.sp.ssp.PatternMessages();

        out.write("<html>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<head>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<title>");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_8_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_8_9.setRuntimeParent(null);
        _jettag_c_get_8_9.setTagInfo(_td_c_get_8_9);
        _jettag_c_get_8_9.doStart(context, out);
        _jettag_c_get_8_9.doEnd();
        out.write("_summary.html</title>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<link rel=\"stylesheet\" href=\"summary.css\" media=\"screen\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</head>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("<script type=\"text/javascript\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tfunction setStatus(txt){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\twindow.status = txt;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\twindow.status = \"\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</script>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("<body>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<a name=\"NoPlace\"></a>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("<div id=\"banner\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<h2>");  //$NON-NLS-1$        
        out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.sv.sp.ssp.summary.35", new Object[] { "$root/instanceName" }) );
        out.write("</h2>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<p>");  //$NON-NLS-1$        
        out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.sv.sp.ssp.summary.1", new Object[] { "$root/instanceName" }) );
        out.write("</p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</div>\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("<div class=\"section\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<div class=\"tl\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<h2>");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.sv.sp.ssp.summary.2") );
        out.write("</h2>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<div class=\"content\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.sv.sp.ssp.summary.3") );
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.sv.sp.ssp.summary.4") );
        out.write(NL);         
        out.write("\t\t</p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.sv.sp.ssp.summary.5", new Object[] { "$root/@projectname" }) );
        out.write(NL);         
        out.write("\t\t</p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<ul>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t<a href=\"#NoPlace\" onclick=\"setStatus('/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_41_45 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_45); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_41_45.setRuntimeParent(null);
        _jettag_c_get_41_45.setTagInfo(_td_c_get_41_45);
        _jettag_c_get_41_45.doStart(context, out);
        _jettag_c_get_41_45.doEnd();
        out.write("_Flows/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_41_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_88); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_41_88.setRuntimeParent(null);
        _jettag_c_get_41_88.setTagInfo(_td_c_get_41_88);
        _jettag_c_get_41_88.doStart(context, out);
        _jettag_c_get_41_88.doEnd();
        RuntimeTagElement _jettag_c_get_41_128 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_128); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_41_128.setRuntimeParent(null);
        _jettag_c_get_41_128.setTagInfo(_td_c_get_41_128);
        _jettag_c_get_41_128.doStart(context, out);
        _jettag_c_get_41_128.doEnd();
        out.write(".msgflow')\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_42_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_42_6.setRuntimeParent(null);
        _jettag_c_get_42_6.setTagInfo(_td_c_get_42_6);
        _jettag_c_get_42_6.doStart(context, out);
        _jettag_c_get_42_6.doEnd();
        out.write(NL);         
        out.write("\t\t\t\t</a>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t</li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</ul>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.sv.sp.ssp.summary.6") );
        out.write(NL);         
        out.write("\t\t</p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<ul>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<li>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t<a href=\"#NoPlace\" onclick=\"setStatus('/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_51_45 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_45); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_51_45.setRuntimeParent(null);
        _jettag_c_get_51_45.setTagInfo(_td_c_get_51_45);
        _jettag_c_get_51_45.doStart(context, out);
        _jettag_c_get_51_45.doEnd();
        out.write("_Flows/");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_51_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_88); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_51_88.setRuntimeParent(null);
        _jettag_c_get_51_88.setTagInfo(_td_c_get_51_88);
        _jettag_c_get_51_88.doStart(context, out);
        _jettag_c_get_51_88.doEnd();
        RuntimeTagElement _jettag_c_get_51_128 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_51_128); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_51_128.setRuntimeParent(null);
        _jettag_c_get_51_128.setTagInfo(_td_c_get_51_128);
        _jettag_c_get_51_128.doStart(context, out);
        _jettag_c_get_51_128.doEnd();
        out.write(".subflow')\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_52_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_52_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_52_6.setRuntimeParent(null);
        _jettag_c_get_52_6.setTagInfo(_td_c_get_52_6);
        _jettag_c_get_52_6.doStart(context, out);
        _jettag_c_get_52_6.doEnd();
        out.write(NL);         
        out.write("\t\t\t\t</a>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t</li>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_55_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_55_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_55_4.setRuntimeParent(null);
        _jettag_c_if_55_4.setTagInfo(_td_c_if_55_4);
        _jettag_c_if_55_4.doStart(context, out);
        while (_jettag_c_if_55_4.okToProcessBody()) {
            out.write("\t\t\t<li>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t<a href=\"#NoPlace\" onclick=\"setStatus('/");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_57_45 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_57_45); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_57_45.setRuntimeParent(_jettag_c_if_55_4);
            _jettag_c_get_57_45.setTagInfo(_td_c_get_57_45);
            _jettag_c_get_57_45.doStart(context, out);
            _jettag_c_get_57_45.doEnd();
            out.write("_Flows/");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_57_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_57_88); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_57_88.setRuntimeParent(_jettag_c_if_55_4);
            _jettag_c_get_57_88.setTagInfo(_td_c_get_57_88);
            _jettag_c_get_57_88.doStart(context, out);
            _jettag_c_get_57_88.doEnd();
            RuntimeTagElement _jettag_c_get_57_128 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_57_128); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_57_128.setRuntimeParent(_jettag_c_if_55_4);
            _jettag_c_get_57_128.setTagInfo(_td_c_get_57_128);
            _jettag_c_get_57_128.doStart(context, out);
            _jettag_c_get_57_128.doEnd();
            out.write(".subflow')\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_58_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_58_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_58_6.setRuntimeParent(_jettag_c_if_55_4);
            _jettag_c_get_58_6.setTagInfo(_td_c_get_58_6);
            _jettag_c_get_58_6.doStart(context, out);
            _jettag_c_get_58_6.doEnd();
            out.write(NL);         
            out.write("\t\t\t\t</a>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t</li>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_55_4.handleBodyContent(out);
        }
        _jettag_c_if_55_4.doEnd();
        out.write("\t\t</ul>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<div class=\"section\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<div class=\"tl\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<h2>");  //$NON-NLS-1$        
        out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.sv.sp.ssp.summary.7", new Object[] { "$root/instanceName" }) );
        out.write("</h2>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<div class=\"content\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<h3>");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.sv.sp.ssp.summary.8") );
        out.write("</h3>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.sv.sp.ssp.summary.9") );
        out.write(NL);         
        out.write("\t\t</p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<ul>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_76_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_76_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_76_4.setRuntimeParent(null);
        _jettag_c_if_76_4.setTagInfo(_td_c_if_76_4);
        _jettag_c_if_76_4.doStart(context, out);
        while (_jettag_c_if_76_4.okToProcessBody()) {
            out.write("\t\t\t\t<li>");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_choose_78_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_78_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_choose_78_6.setRuntimeParent(_jettag_c_if_76_4);
            _jettag_c_choose_78_6.setTagInfo(_td_c_choose_78_6);
            _jettag_c_choose_78_6.doStart(context, out);
            JET2Writer _jettag_c_choose_78_6_saved_out = out;
            while (_jettag_c_choose_78_6.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_when_79_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_79_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_when_79_7.setRuntimeParent(_jettag_c_choose_78_6);
                _jettag_c_when_79_7.setTagInfo(_td_c_when_79_7);
                _jettag_c_when_79_7.doStart(context, out);
                JET2Writer _jettag_c_when_79_7_saved_out = out;
                while (_jettag_c_when_79_7.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
                    out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.sv.sp.ssp.summary.14.queueManager", new Object[] { "$root/queuePrefix", "$root/errorQueue", "$root/queueSuffix", "$root/errorQueueManager" }) );
                    out.write(NL);         
                    _jettag_c_when_79_7.handleBodyContent(out);
                }
                out = _jettag_c_when_79_7_saved_out;
                _jettag_c_when_79_7.doEnd();
                RuntimeTagElement _jettag_c_otherwise_82_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_82_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_otherwise_82_7.setRuntimeParent(_jettag_c_choose_78_6);
                _jettag_c_otherwise_82_7.setTagInfo(_td_c_otherwise_82_7);
                _jettag_c_otherwise_82_7.doStart(context, out);
                JET2Writer _jettag_c_otherwise_82_7_saved_out = out;
                while (_jettag_c_otherwise_82_7.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
                    out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.sv.sp.ssp.summary.14", new Object[] { "$root/queuePrefix", "$root/errorQueue", "$root/queueSuffix", "$root/errorQueueManager" }) );
                    out.write(NL);         
                    _jettag_c_otherwise_82_7.handleBodyContent(out);
                }
                out = _jettag_c_otherwise_82_7_saved_out;
                _jettag_c_otherwise_82_7.doEnd();
                _jettag_c_choose_78_6.handleBodyContent(out);
            }
            out = _jettag_c_choose_78_6_saved_out;
            _jettag_c_choose_78_6.doEnd();
            out.write("\t\t\t\t</li>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_76_4.handleBodyContent(out);
        }
        _jettag_c_if_76_4.doEnd();
        RuntimeTagElement _jettag_c_if_88_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_88_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_88_4.setRuntimeParent(null);
        _jettag_c_if_88_4.setTagInfo(_td_c_if_88_4);
        _jettag_c_if_88_4.doStart(context, out);
        while (_jettag_c_if_88_4.okToProcessBody()) {
            out.write("\t\t\t\t<li>");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_choose_90_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_90_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_choose_90_6.setRuntimeParent(_jettag_c_if_88_4);
            _jettag_c_choose_90_6.setTagInfo(_td_c_choose_90_6);
            _jettag_c_choose_90_6.doStart(context, out);
            JET2Writer _jettag_c_choose_90_6_saved_out = out;
            while (_jettag_c_choose_90_6.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_when_91_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_91_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_when_91_7.setRuntimeParent(_jettag_c_choose_90_6);
                _jettag_c_when_91_7.setTagInfo(_td_c_when_91_7);
                _jettag_c_when_91_7.doStart(context, out);
                JET2Writer _jettag_c_when_91_7_saved_out = out;
                while (_jettag_c_when_91_7.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
                    out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.sv.sp.ssp.summary.15.queueManager", new Object[] { "$root/queuePrefix", "$root/logQueue", "$root/queueSuffix", "$root/logQueueManager" }) );
                    out.write(" ");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_when_91_7.handleBodyContent(out);
                }
                out = _jettag_c_when_91_7_saved_out;
                _jettag_c_when_91_7.doEnd();
                RuntimeTagElement _jettag_c_otherwise_94_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_94_7); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_otherwise_94_7.setRuntimeParent(_jettag_c_choose_90_6);
                _jettag_c_otherwise_94_7.setTagInfo(_td_c_otherwise_94_7);
                _jettag_c_otherwise_94_7.doStart(context, out);
                JET2Writer _jettag_c_otherwise_94_7_saved_out = out;
                while (_jettag_c_otherwise_94_7.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t\t\t\t\t\t\t");  //$NON-NLS-1$        
                    out.write( pattern.getMessage(context, "com.ibm.etools.mft.pattern.sv.sp.ssp.summary.15", new Object[] { "$root/queuePrefix", "$root/logQueue", "$root/queueSuffix" }) );
                    out.write(" ");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_otherwise_94_7.handleBodyContent(out);
                }
                out = _jettag_c_otherwise_94_7_saved_out;
                _jettag_c_otherwise_94_7.doEnd();
                _jettag_c_choose_90_6.handleBodyContent(out);
            }
            out = _jettag_c_choose_90_6_saved_out;
            _jettag_c_choose_90_6.doEnd();
            out.write("\t\t\t\t</li>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_88_4.handleBodyContent(out);
        }
        _jettag_c_if_88_4.doEnd();
        out.write("\t\t</ul>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<h3>");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.sv.sp.ssp.summary.22") );
        out.write("</h3>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.sv.sp.ssp.summary.32") );
        out.write(NL);         
        out.write("\t\t</p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("<div class=\"section\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<div class=\"tl\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<h2>");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.sv.sp.ssp.summary.25") );
        out.write("</h2>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<div class=\"content\">");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_choose_113_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_113_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_113_3.setRuntimeParent(null);
        _jettag_c_choose_113_3.setTagInfo(_td_c_choose_113_3);
        _jettag_c_choose_113_3.doStart(context, out);
        JET2Writer _jettag_c_choose_113_3_saved_out = out;
        while (_jettag_c_choose_113_3.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_114_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_114_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_114_4.setRuntimeParent(_jettag_c_choose_113_3);
            _jettag_c_when_114_4.setTagInfo(_td_c_when_114_4);
            _jettag_c_when_114_4.doStart(context, out);
            JET2Writer _jettag_c_when_114_4_saved_out = out;
            while (_jettag_c_when_114_4.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.sv.sp.ssp.summary.26") );
                out.write(NL);         
                out.write("\t\t\t\t</p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t<br>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.sv.sp.ssp.summary.27") );
                out.write(" ");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t</p>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_114_4.handleBodyContent(out);
            }
            out = _jettag_c_when_114_4_saved_out;
            _jettag_c_when_114_4.doEnd();
            RuntimeTagElement _jettag_c_otherwise_123_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_123_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_123_4.setRuntimeParent(_jettag_c_choose_113_3);
            _jettag_c_otherwise_123_4.setTagInfo(_td_c_otherwise_123_4);
            _jettag_c_otherwise_123_4.doStart(context, out);
            JET2Writer _jettag_c_otherwise_123_4_saved_out = out;
            while (_jettag_c_otherwise_123_4.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.sv.sp.ssp.summary.28") );
                out.write(NL);         
                out.write("\t\t\t\t</p>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_otherwise_123_4.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_123_4_saved_out;
            _jettag_c_otherwise_123_4.doEnd();
            _jettag_c_choose_113_3.handleBodyContent(out);
        }
        out = _jettag_c_choose_113_3_saved_out;
        _jettag_c_choose_113_3.doEnd();
        out.write("\t\t<br>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_choose_130_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_130_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_130_3.setRuntimeParent(null);
        _jettag_c_choose_130_3.setTagInfo(_td_c_choose_130_3);
        _jettag_c_choose_130_3.doStart(context, out);
        JET2Writer _jettag_c_choose_130_3_saved_out = out;
        while (_jettag_c_choose_130_3.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_131_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_131_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_131_4.setRuntimeParent(_jettag_c_choose_130_3);
            _jettag_c_when_131_4.setTagInfo(_td_c_when_131_4);
            _jettag_c_when_131_4.doStart(context, out);
            JET2Writer _jettag_c_when_131_4_saved_out = out;
            while (_jettag_c_when_131_4.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.sv.sp.ssp.summary.29") );
                out.write(NL);         
                out.write("\t\t\t\t</p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t<br>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.sv.sp.ssp.summary.30") );
                out.write(NL);         
                out.write("\t\t\t\t</p>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_131_4.handleBodyContent(out);
            }
            out = _jettag_c_when_131_4_saved_out;
            _jettag_c_when_131_4.doEnd();
            RuntimeTagElement _jettag_c_otherwise_140_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_140_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_140_4.setRuntimeParent(_jettag_c_choose_130_3);
            _jettag_c_otherwise_140_4.setTagInfo(_td_c_otherwise_140_4);
            _jettag_c_otherwise_140_4.doStart(context, out);
            JET2Writer _jettag_c_otherwise_140_4_saved_out = out;
            while (_jettag_c_otherwise_140_4.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\t\t\t<p>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                out.write( pattern.getString("com.ibm.etools.mft.pattern.sv.sp.ssp.summary.31") );
                out.write(NL);         
                out.write("\t\t\t\t</p>");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_otherwise_140_4.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_140_4_saved_out;
            _jettag_c_otherwise_140_4.doEnd();
            _jettag_c_choose_130_3.handleBodyContent(out);
        }
        out = _jettag_c_choose_130_3_saved_out;
        _jettag_c_choose_130_3.doEnd();
        out.write("\t\t<br>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.sv.sp.ssp.summary.33") );
        out.write(NL);         
        out.write("\t\t</p>\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<br>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.sv.sp.ssp.summary.34") );
        out.write(NL);         
        out.write("\t\t</p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</div>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</body>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</html>");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
