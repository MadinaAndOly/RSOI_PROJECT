
package rsoi.model;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ModelImpService", targetNamespace = "http://model.rsoi/", wsdlLocation = "http://localhost:6055/model?WSDL")
public class ModelImpService
    extends Service
{

    private final static URL MODELIMPSERVICE_WSDL_LOCATION;
    private final static WebServiceException MODELIMPSERVICE_EXCEPTION;
    private final static QName MODELIMPSERVICE_QNAME = new QName("http://model.rsoi/", "ModelImpService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:6055/model?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MODELIMPSERVICE_WSDL_LOCATION = url;
        MODELIMPSERVICE_EXCEPTION = e;
    }

    public ModelImpService() {
        super(__getWsdlLocation(), MODELIMPSERVICE_QNAME);
    }

    public ModelImpService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MODELIMPSERVICE_QNAME, features);
    }

    public ModelImpService(URL wsdlLocation) {
        super(wsdlLocation, MODELIMPSERVICE_QNAME);
    }

    public ModelImpService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MODELIMPSERVICE_QNAME, features);
    }

    public ModelImpService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ModelImpService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IModel
     */
    @WebEndpoint(name = "ModelImpPort")
    public IModel getModelImpPort() {
        return super.getPort(new QName("http://model.rsoi/", "ModelImpPort"), IModel.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IModel
     */
    @WebEndpoint(name = "ModelImpPort")
    public IModel getModelImpPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://model.rsoi/", "ModelImpPort"), IModel.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MODELIMPSERVICE_EXCEPTION!= null) {
            throw MODELIMPSERVICE_EXCEPTION;
        }
        return MODELIMPSERVICE_WSDL_LOCATION;
    }

}