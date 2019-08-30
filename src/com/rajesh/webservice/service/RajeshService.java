
package com.rajesh.webservice.service;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "RajeshService", targetNamespace = "http://service.webservice.rajesh.com", wsdlLocation = "http://localhost:8082/SoapService/services/ProductService?wsdl")
public class RajeshService
    extends Service
{

    private final static URL RAJESHSERVICE_WSDL_LOCATION;
    private final static WebServiceException RAJESHSERVICE_EXCEPTION;
    private final static QName RAJESHSERVICE_QNAME = new QName("http://service.webservice.rajesh.com", "RajeshService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8082/SoapService/services/ProductService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RAJESHSERVICE_WSDL_LOCATION = url;
        RAJESHSERVICE_EXCEPTION = e;
    }

    public RajeshService() {
        super(__getWsdlLocation(), RAJESHSERVICE_QNAME);
    }

    public RajeshService(WebServiceFeature... features) {
        super(__getWsdlLocation(), RAJESHSERVICE_QNAME, features);
    }

    public RajeshService(URL wsdlLocation) {
        super(wsdlLocation, RAJESHSERVICE_QNAME);
    }

    public RajeshService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, RAJESHSERVICE_QNAME, features);
    }

    public RajeshService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RajeshService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ProductCatalog
     */
    @WebEndpoint(name = "ProductCatalogPort")
    public ProductCatalog getProductCatalogPort() {
        return super.getPort(new QName("http://service.webservice.rajesh.com", "ProductCatalogPort"), ProductCatalog.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProductCatalog
     */
    @WebEndpoint(name = "ProductCatalogPort")
    public ProductCatalog getProductCatalogPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.webservice.rajesh.com", "ProductCatalogPort"), ProductCatalog.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RAJESHSERVICE_EXCEPTION!= null) {
            throw RAJESHSERVICE_EXCEPTION;
        }
        return RAJESHSERVICE_WSDL_LOCATION;
    }

}