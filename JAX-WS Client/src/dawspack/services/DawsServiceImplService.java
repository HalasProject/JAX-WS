
package dawspack.services;

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
@WebServiceClient(name = "dawsServiceImplService", targetNamespace = "http://services.dawspack/", wsdlLocation = "http://localhost:8080/ws/daws?wsdl")
public class DawsServiceImplService
    extends Service
{

    private final static URL DAWSSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException DAWSSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName DAWSSERVICEIMPLSERVICE_QNAME = new QName("http://services.dawspack/", "dawsServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ws/daws?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DAWSSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        DAWSSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public DawsServiceImplService() {
        super(__getWsdlLocation(), DAWSSERVICEIMPLSERVICE_QNAME);
    }

    public DawsServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), DAWSSERVICEIMPLSERVICE_QNAME, features);
    }

    public DawsServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, DAWSSERVICEIMPLSERVICE_QNAME);
    }

    public DawsServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DAWSSERVICEIMPLSERVICE_QNAME, features);
    }

    public DawsServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DawsServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DawsServiceImpl
     */
    @WebEndpoint(name = "dawsServiceImplPort")
    public DawsServiceImpl getDawsServiceImplPort() {
        return super.getPort(new QName("http://services.dawspack/", "dawsServiceImplPort"), DawsServiceImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DawsServiceImpl
     */
    @WebEndpoint(name = "dawsServiceImplPort")
    public DawsServiceImpl getDawsServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.dawspack/", "dawsServiceImplPort"), DawsServiceImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DAWSSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw DAWSSERVICEIMPLSERVICE_EXCEPTION;
        }
        return DAWSSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
