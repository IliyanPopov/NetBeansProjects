
package capitalizeclient;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CapitalizeService", targetNamespace = "http://logic/", wsdlLocation = "http://localhost:665/Capitalize?wsdl")
public class CapitalizeService
    extends Service
{

    private final static URL CAPITALIZESERVICE_WSDL_LOCATION;
    private final static WebServiceException CAPITALIZESERVICE_EXCEPTION;
    private final static QName CAPITALIZESERVICE_QNAME = new QName("http://logic/", "CapitalizeService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:665/Capitalize?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CAPITALIZESERVICE_WSDL_LOCATION = url;
        CAPITALIZESERVICE_EXCEPTION = e;
    }

    public CapitalizeService() {
        super(__getWsdlLocation(), CAPITALIZESERVICE_QNAME);
    }

    public CapitalizeService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CAPITALIZESERVICE_QNAME, features);
    }

    public CapitalizeService(URL wsdlLocation) {
        super(wsdlLocation, CAPITALIZESERVICE_QNAME);
    }

    public CapitalizeService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CAPITALIZESERVICE_QNAME, features);
    }

    public CapitalizeService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CapitalizeService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Capitalize
     */
    @WebEndpoint(name = "CapitalizePort")
    public Capitalize getCapitalizePort() {
        return super.getPort(new QName("http://logic/", "CapitalizePort"), Capitalize.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Capitalize
     */
    @WebEndpoint(name = "CapitalizePort")
    public Capitalize getCapitalizePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://logic/", "CapitalizePort"), Capitalize.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CAPITALIZESERVICE_EXCEPTION!= null) {
            throw CAPITALIZESERVICE_EXCEPTION;
        }
        return CAPITALIZESERVICE_WSDL_LOCATION;
    }

}
