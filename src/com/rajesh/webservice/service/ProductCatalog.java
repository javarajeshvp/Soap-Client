
package com.rajesh.webservice.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ProductCatalog", targetNamespace = "http://service.webservice.rajesh.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ProductCatalog {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod(action = "FetchProducts")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "fetchProducts", targetNamespace = "http://service.webservice.rajesh.com", className = "com.rajesh.webservice.service.FetchProducts")
    @ResponseWrapper(localName = "fetchProductsResponse", targetNamespace = "http://service.webservice.rajesh.com", className = "com.rajesh.webservice.service.FetchProductsResponse")
    @Action(input = "FetchProducts", output = "http://service.webservice.rajesh.com/ProductCatalog/fetchProductsResponse")
    public List<String> fetchProducts(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addProduct", targetNamespace = "http://service.webservice.rajesh.com", className = "com.rajesh.webservice.service.AddProduct")
    @ResponseWrapper(localName = "addProductResponse", targetNamespace = "http://service.webservice.rajesh.com", className = "com.rajesh.webservice.service.AddProductResponse")
    @Action(input = "http://service.webservice.rajesh.com/ProductCatalog/addProductRequest", output = "http://service.webservice.rajesh.com/ProductCatalog/addProductResponse")
    public Boolean addProduct(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}