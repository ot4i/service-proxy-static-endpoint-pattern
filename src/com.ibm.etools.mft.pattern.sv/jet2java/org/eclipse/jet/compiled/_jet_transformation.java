package org.eclipse.jet.compiled;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2TemplateLoader;
import org.eclipse.jet.JET2TemplateLoaderExtension;

public class _jet_transformation implements JET2TemplateLoader,
        JET2TemplateLoaderExtension {

    private JET2TemplateLoader delegate = null;

    private final static Map pathToTemplateOrdinalMap = new HashMap(12);
    static {
        pathToTemplateOrdinalMap.put("sv/sp/ssp/templates/dump.jet", //$NON-NLS-1$
                new Integer(0));
        pathToTemplateOrdinalMap.put("sv/sp/ssp/templates/main.jet", //$NON-NLS-1$
                new Integer(1));
        pathToTemplateOrdinalMap.put("sv/sp/ssp/templates/root/Error.esql.jet", //$NON-NLS-1$
                new Integer(2));
        pathToTemplateOrdinalMap.put("sv/sp/ssp/templates/root/Error.subflow.jet", //$NON-NLS-1$
                new Integer(3));
        pathToTemplateOrdinalMap.put("sv/sp/ssp/templates/root/Log.esql.jet", //$NON-NLS-1$
                new Integer(4));
        pathToTemplateOrdinalMap.put("sv/sp/ssp/templates/root/Log.subflow.jet", //$NON-NLS-1$
                new Integer(5));
        pathToTemplateOrdinalMap.put("sv/sp/ssp/templates/root/Proxy.esql.jet", //$NON-NLS-1$
                new Integer(6));
        pathToTemplateOrdinalMap.put("sv/sp/ssp/templates/root/Proxy.msgflow.jet", //$NON-NLS-1$
                new Integer(7));
        pathToTemplateOrdinalMap.put("sv/sp/ssp/templates/root/project.jet", //$NON-NLS-1$
                new Integer(8));
        pathToTemplateOrdinalMap.put("sv/sp/ssp/templates/root/summary.jet", //$NON-NLS-1$
                new Integer(9));
        pathToTemplateOrdinalMap.put("templates/dump.jet", //$NON-NLS-1$
                new Integer(10));
        pathToTemplateOrdinalMap.put("templates/main.jet", //$NON-NLS-1$
                new Integer(11));
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jet.JET2TemplateLoader#getTemplate(java.lang.String)
     */
    public JET2Template getTemplate(final String templatePath) {
        final Integer ordinal = (Integer)pathToTemplateOrdinalMap.get(templatePath);
        if(ordinal != null) {
           switch (ordinal.intValue()) {
            case 0: // sv/sp/ssp/templates/dump.jet
                return new org.eclipse.jet.compiled._jet_dump_0();
            case 1: // sv/sp/ssp/templates/main.jet
                return new org.eclipse.jet.compiled._jet_main();
            case 2: // sv/sp/ssp/templates/root/Error.esql.jet
                return new org.eclipse.jet.compiled._jet_Erroresql();
            case 3: // sv/sp/ssp/templates/root/Error.subflow.jet
                return new org.eclipse.jet.compiled._jet_Errorsubflow();
            case 4: // sv/sp/ssp/templates/root/Log.esql.jet
                return new org.eclipse.jet.compiled._jet_Logesql();
            case 5: // sv/sp/ssp/templates/root/Log.subflow.jet
                return new org.eclipse.jet.compiled._jet_Logsubflow();
            case 6: // sv/sp/ssp/templates/root/Proxy.esql.jet
                return new org.eclipse.jet.compiled._jet_Proxyesql();
            case 7: // sv/sp/ssp/templates/root/Proxy.msgflow.jet
                return new org.eclipse.jet.compiled._jet_Proxymsgflow();
            case 8: // sv/sp/ssp/templates/root/project.jet
                return new org.eclipse.jet.compiled._jet_project();
            case 9: // sv/sp/ssp/templates/root/summary.jet
                return new org.eclipse.jet.compiled._jet_summary();
            case 10: // templates/dump.jet
                return new org.eclipse.jet.compiled._jet_dump();
            case 11: // templates/main.jet
                return new org.eclipse.jet.compiled._jet_main_0();
            default:
                break;
            }
        }
        return this.delegate != null ? this.delegate.getTemplate(templatePath) : null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jet.JET2TemplateLoaderExtension#getDelegateLoader()
     */
    public JET2TemplateLoader getDelegateLoader() {
        return this.delegate;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.jet.JET2TemplateLoaderExtension#setDelegateLoader(org.eclipse
     * .jet.JET2TemplateLoader)
     */
    public void setDelegateLoader(final JET2TemplateLoader loader) {
        this.delegate = loader;
    }
}
