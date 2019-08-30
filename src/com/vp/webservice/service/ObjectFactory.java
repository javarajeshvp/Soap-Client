
package com.vp.webservice.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.vp.webservice.service package. 
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

    private final static QName _ProductName_QNAME = new QName("http://service.webservice.vp.com", "productName");
    private final static QName _GetProductsReturn_QNAME = new QName("http://service.webservice.vp.com", "getProductsReturn");
    private final static QName _State_QNAME = new QName("http://service.webservice.vp.com", "state");
    private final static QName _AddProductReturn_QNAME = new QName("http://service.webservice.vp.com", "addProductReturn");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.vp.webservice.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfXsdAnyType }
     * 
     */
    public ArrayOfXsdAnyType createArrayOfXsdAnyType() {
        return new ArrayOfXsdAnyType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.vp.com", name = "productName")
    public JAXBElement<String> createProductName(String value) {
        return new JAXBElement<String>(_ProductName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfXsdAnyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.vp.com", name = "getProductsReturn")
    public JAXBElement<ArrayOfXsdAnyType> createGetProductsReturn(ArrayOfXsdAnyType value) {
        return new JAXBElement<ArrayOfXsdAnyType>(_GetProductsReturn_QNAME, ArrayOfXsdAnyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.vp.com", name = "state")
    public JAXBElement<String> createState(String value) {
        return new JAXBElement<String>(_State_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.vp.com", name = "addProductReturn")
    public JAXBElement<Boolean> createAddProductReturn(Boolean value) {
        return new JAXBElement<Boolean>(_AddProductReturn_QNAME, Boolean.class, null, value);
    }

}
