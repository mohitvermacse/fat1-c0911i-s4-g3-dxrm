
package service;

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
 * JAX-WS RI 2.2.6b20 
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "MatrimonyBankService", targetNamespace = "http://bankService/", wsdlLocation = "http://localhost:8080/MatrimonyService/MatrimonyBankService?WSDL")
public class MatrimonyBankService_Service
    extends Service
{

    private final static URL MATRIMONYBANKSERVICE_WSDL_LOCATION;
    private final static WebServiceException MATRIMONYBANKSERVICE_EXCEPTION;
    private final static QName MATRIMONYBANKSERVICE_QNAME = new QName("http://bankService/", "MatrimonyBankService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/MatrimonyService/MatrimonyBankService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MATRIMONYBANKSERVICE_WSDL_LOCATION = url;
        MATRIMONYBANKSERVICE_EXCEPTION = e;
    }

    public MatrimonyBankService_Service() {
        super(__getWsdlLocation(), MATRIMONYBANKSERVICE_QNAME);
    }

    public MatrimonyBankService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns MatrimonyBankService
     */
    @WebEndpoint(name = "MatrimonyBankServicePort")
    public MatrimonyBankService getMatrimonyBankServicePort() {
        return super.getPort(new QName("http://bankService/", "MatrimonyBankServicePort"), MatrimonyBankService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MatrimonyBankService
     */
    @WebEndpoint(name = "MatrimonyBankServicePort")
    public MatrimonyBankService getMatrimonyBankServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://bankService/", "MatrimonyBankServicePort"), MatrimonyBankService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MATRIMONYBANKSERVICE_EXCEPTION!= null) {
            throw MATRIMONYBANKSERVICE_EXCEPTION;
        }
        return MATRIMONYBANKSERVICE_WSDL_LOCATION;
    }

}