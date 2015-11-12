package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_main_0 implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_main_0() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_setVariable_3_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            3, 1,
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
                "brokerSchema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_8_1 = new TagInfo("c:set", //$NON-NLS-1$
            8, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_9_1 = new TagInfo("c:set", //$NON-NLS-1$
            9, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_10_1 = new TagInfo("c:set", //$NON-NLS-1$
            10, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_14_1 = new TagInfo("c:if", //$NON-NLS-1$
            14, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "boolean($root/brokerSchema)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_16_1 = new TagInfo("c:if", //$NON-NLS-1$
            16, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "string-length($root/brokerSchema) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_18_1 = new TagInfo("c:set", //$NON-NLS-1$
            18, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "brokerSchema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_43 = new TagInfo("c:get", //$NON-NLS-1$
            18, 43,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/brokerSchema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_19_1 = new TagInfo("c:set", //$NON-NLS-1$
            19, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "brokerSchema1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_44 = new TagInfo("c:get", //$NON-NLS-1$
            19, 44,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/brokerSchema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_20_1 = new TagInfo("c:set", //$NON-NLS-1$
            20, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "brokerSchema2", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_44 = new TagInfo("c:get", //$NON-NLS-1$
            20, 44,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$brokerSchemaFolderName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_set_21_1 = new TagInfo("c:set", //$NON-NLS-1$
            21, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "name", //$NON-NLS-1$
            },
            new String[] {
                "$root", //$NON-NLS-1$
                "esqlQualifier", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_44 = new TagInfo("c:get", //$NON-NLS-1$
            21, 44,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/brokerSchema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_25_1 = new TagInfo("c:choose", //$NON-NLS-1$
            25, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_26_2 = new TagInfo("c:when", //$NON-NLS-1$
            26, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "namespace-uri($root) = 'com.ibm.etools.mft.pattern.sv.sp.ssp'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_27_6 = new TagInfo("c:include", //$NON-NLS-1$
            27, 6,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "sv/sp/ssp/templates/main.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_29_2 = new TagInfo("c:otherwise", //$NON-NLS-1$
            29, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_log_30_3 = new TagInfo("c:log", //$NON-NLS-1$
            30, 3,
            new String[] {
                "severity", //$NON-NLS-1$
            },
            new String[] {
                "error", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_51 = new TagInfo("c:get", //$NON-NLS-1$
            30, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "namespace-uri($root)", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write(NL);         
        RuntimeTagElement _jettag_c_setVariable_3_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_3_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_3_1.setRuntimeParent(null);
        _jettag_c_setVariable_3_1.setTagInfo(_td_c_setVariable_3_1);
        _jettag_c_setVariable_3_1.doStart(context, out);
        _jettag_c_setVariable_3_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        // Use the default broker schema unless value set 
        RuntimeTagElement _jettag_c_set_7_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_7_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_7_1.setRuntimeParent(null);
        _jettag_c_set_7_1.setTagInfo(_td_c_set_7_1);
        _jettag_c_set_7_1.doStart(context, out);
        JET2Writer _jettag_c_set_7_1_saved_out = out;
        while (_jettag_c_set_7_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
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
            _jettag_c_set_9_1.handleBodyContent(out);
        }
        out = _jettag_c_set_9_1_saved_out;
        _jettag_c_set_9_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_set_10_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_10_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_set_10_1.setRuntimeParent(null);
        _jettag_c_set_10_1.setTagInfo(_td_c_set_10_1);
        _jettag_c_set_10_1.doStart(context, out);
        JET2Writer _jettag_c_set_10_1_saved_out = out;
        while (_jettag_c_set_10_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("#");  //$NON-NLS-1$        
            _jettag_c_set_10_1.handleBodyContent(out);
        }
        out = _jettag_c_set_10_1_saved_out;
        _jettag_c_set_10_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        // set the broker schema values if it is not null 
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_14_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_14_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_14_1.setRuntimeParent(null);
        _jettag_c_if_14_1.setTagInfo(_td_c_if_14_1);
        _jettag_c_if_14_1.doStart(context, out);
        while (_jettag_c_if_14_1.okToProcessBody()) {
            // Tag exists 
            RuntimeTagElement _jettag_c_if_16_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_16_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_16_1.setRuntimeParent(_jettag_c_if_14_1);
            _jettag_c_if_16_1.setTagInfo(_td_c_if_16_1);
            _jettag_c_if_16_1.doStart(context, out);
            while (_jettag_c_if_16_1.okToProcessBody()) {
         com.ibm.etools.mft.pattern.sv.plugin.PatternUtility.getBrokerSchemaFolderName(context, "$root/brokerSchema", "brokerSchemaFolderName"); 
                RuntimeTagElement _jettag_c_set_18_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_18_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_18_1.setRuntimeParent(_jettag_c_if_16_1);
                _jettag_c_set_18_1.setTagInfo(_td_c_set_18_1);
                _jettag_c_set_18_1.doStart(context, out);
                JET2Writer _jettag_c_set_18_1_saved_out = out;
                while (_jettag_c_set_18_1.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_get_18_43 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_43); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_18_43.setRuntimeParent(_jettag_c_set_18_1);
                    _jettag_c_get_18_43.setTagInfo(_td_c_get_18_43);
                    _jettag_c_get_18_43.doStart(context, out);
                    _jettag_c_get_18_43.doEnd();
                    _jettag_c_set_18_1.handleBodyContent(out);
                }
                out = _jettag_c_set_18_1_saved_out;
                _jettag_c_set_18_1.doEnd();
                out.write(NL);         
                RuntimeTagElement _jettag_c_set_19_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_19_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_19_1.setRuntimeParent(_jettag_c_if_16_1);
                _jettag_c_set_19_1.setTagInfo(_td_c_set_19_1);
                _jettag_c_set_19_1.doStart(context, out);
                JET2Writer _jettag_c_set_19_1_saved_out = out;
                while (_jettag_c_set_19_1.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_get_19_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_44); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_19_44.setRuntimeParent(_jettag_c_set_19_1);
                    _jettag_c_get_19_44.setTagInfo(_td_c_get_19_44);
                    _jettag_c_get_19_44.doStart(context, out);
                    _jettag_c_get_19_44.doEnd();
                    out.write("_");  //$NON-NLS-1$        
                    _jettag_c_set_19_1.handleBodyContent(out);
                }
                out = _jettag_c_set_19_1_saved_out;
                _jettag_c_set_19_1.doEnd();
                out.write(NL);         
                RuntimeTagElement _jettag_c_set_20_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_20_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_20_1.setRuntimeParent(_jettag_c_if_16_1);
                _jettag_c_set_20_1.setTagInfo(_td_c_set_20_1);
                _jettag_c_set_20_1.doStart(context, out);
                JET2Writer _jettag_c_set_20_1_saved_out = out;
                while (_jettag_c_set_20_1.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_get_20_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_44); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_20_44.setRuntimeParent(_jettag_c_set_20_1);
                    _jettag_c_get_20_44.setTagInfo(_td_c_get_20_44);
                    _jettag_c_get_20_44.doStart(context, out);
                    _jettag_c_get_20_44.doEnd();
                    out.write("/");  //$NON-NLS-1$        
                    _jettag_c_set_20_1.handleBodyContent(out);
                }
                out = _jettag_c_set_20_1_saved_out;
                _jettag_c_set_20_1.doEnd();
                out.write(NL);         
                RuntimeTagElement _jettag_c_set_21_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "set", "c:set", _td_c_set_21_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_set_21_1.setRuntimeParent(_jettag_c_if_16_1);
                _jettag_c_set_21_1.setTagInfo(_td_c_set_21_1);
                _jettag_c_set_21_1.doStart(context, out);
                JET2Writer _jettag_c_set_21_1_saved_out = out;
                while (_jettag_c_set_21_1.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_get_21_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_44); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_21_44.setRuntimeParent(_jettag_c_set_21_1);
                    _jettag_c_get_21_44.setTagInfo(_td_c_get_21_44);
                    _jettag_c_get_21_44.doStart(context, out);
                    _jettag_c_get_21_44.doEnd();
                    out.write("#");  //$NON-NLS-1$        
                    _jettag_c_set_21_1.handleBodyContent(out);
                }
                out = _jettag_c_set_21_1_saved_out;
                _jettag_c_set_21_1.doEnd();
                out.write(NL);         
                _jettag_c_if_16_1.handleBodyContent(out);
            }
            _jettag_c_if_16_1.doEnd();
            _jettag_c_if_14_1.handleBodyContent(out);
        }
        _jettag_c_if_14_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_choose_25_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_25_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_25_1.setRuntimeParent(null);
        _jettag_c_choose_25_1.setTagInfo(_td_c_choose_25_1);
        _jettag_c_choose_25_1.doStart(context, out);
        JET2Writer _jettag_c_choose_25_1_saved_out = out;
        while (_jettag_c_choose_25_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_26_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_26_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_26_2.setRuntimeParent(_jettag_c_choose_25_1);
            _jettag_c_when_26_2.setTagInfo(_td_c_when_26_2);
            _jettag_c_when_26_2.doStart(context, out);
            JET2Writer _jettag_c_when_26_2_saved_out = out;
            while (_jettag_c_when_26_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_include_27_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_27_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_27_6.setRuntimeParent(_jettag_c_when_26_2);
                _jettag_c_include_27_6.setTagInfo(_td_c_include_27_6);
                _jettag_c_include_27_6.doStart(context, out);
                _jettag_c_include_27_6.doEnd();
                _jettag_c_when_26_2.handleBodyContent(out);
            }
            out = _jettag_c_when_26_2_saved_out;
            _jettag_c_when_26_2.doEnd();
            RuntimeTagElement _jettag_c_otherwise_29_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_29_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_29_2.setRuntimeParent(_jettag_c_choose_25_1);
            _jettag_c_otherwise_29_2.setTagInfo(_td_c_otherwise_29_2);
            _jettag_c_otherwise_29_2.doStart(context, out);
            JET2Writer _jettag_c_otherwise_29_2_saved_out = out;
            while (_jettag_c_otherwise_29_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_log_30_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "log", "c:log", _td_c_log_30_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_log_30_3.setRuntimeParent(_jettag_c_otherwise_29_2);
                _jettag_c_log_30_3.setTagInfo(_td_c_log_30_3);
                _jettag_c_log_30_3.doStart(context, out);
                JET2Writer _jettag_c_log_30_3_saved_out = out;
                while (_jettag_c_log_30_3.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("Unrecognized transform [");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_30_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_51); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_30_51.setRuntimeParent(_jettag_c_log_30_3);
                    _jettag_c_get_30_51.setTagInfo(_td_c_get_30_51);
                    _jettag_c_get_30_51.doStart(context, out);
                    _jettag_c_get_30_51.doEnd();
                    out.write("]");  //$NON-NLS-1$        
                    _jettag_c_log_30_3.handleBodyContent(out);
                }
                out = _jettag_c_log_30_3_saved_out;
                _jettag_c_log_30_3.doEnd();
                out.write(NL);         
                _jettag_c_otherwise_29_2.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_29_2_saved_out;
            _jettag_c_otherwise_29_2.doEnd();
            _jettag_c_choose_25_1.handleBodyContent(out);
        }
        out = _jettag_c_choose_25_1_saved_out;
        _jettag_c_choose_25_1.doEnd();
        out.write(NL);         
    }
}
