
package com.rajesh.webservice.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.rajesh.webservice.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddProduct_QNAME = new QName("http://service.webservice.rajesh.com", "addProduct");
    private final static QName _FetchProductsResponse_QNAME = new QName("http://service.webservice.rajesh.com", "fetchProductsResponse");
    private final static QName _FetchProducts_QNAME = new QName("http://service.webservice.rajesh.com", "fetchProducts");
    private final static QName _AddProductResponse_QNAME = new QName("http://service.webservice.rajesh.com", "addProductResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.rajesh.webservice.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddProduct }
     * 
     */
    public AddProduct createAddProduct() {
        return new AddProduct();
    }

    /**
     * Create an instance of {@link FetchProductsResponse }
     * 
     */
    public FetchProductsResponse createFetchProductsResponse() {
        return new FetchProductsResponse();
    }

    /**
     * Create an instance of {@link AddProductResponse }
     * 
     */
    public AddProductResponse createAddProductResponse() {
        return new AddProductResponse();
    }

    /**
     * Create an instance of {@link FetchProducts }
     * 
     */
    public FetchProducts createFetchProducts() {
        return new FetchProducts();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.rajesh.com", name = "addProduct")
    public JAXBElement<AddProduct> createAddProduct(AddProduct value) {
        return new JAXBElement<AddProduct>(_AddProduct_QNAME, AddProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchProductsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.rajesh.com", name = "fetchProductsResponse")
    public JAXBElement<FetchProductsResponse> createFetchProductsResponse(FetchProductsResponse value) {
        return new JAXBElement<FetchProductsResponse>(_FetchProductsResponse_QNAME, FetchProductsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchProducts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.rajesh.com", name = "fetchProducts")
    public JAXBElement<FetchProducts> createFetchProducts(FetchProducts value) {
        return new JAXBElement<FetchProducts>(_FetchProducts_QNAME, FetchProducts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.rajesh.com", name = "addProductResponse")
    public JAXBElement<AddProductResponse> createAddProductResponse(AddProductResponse value) {
        return new JAXBElement<AddProductResponse>(_AddProductResponse_QNAME, AddProductResponse.class, null, value);
    }

}
