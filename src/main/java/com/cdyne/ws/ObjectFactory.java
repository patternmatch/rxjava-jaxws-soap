
package com.cdyne.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cdyne.ws package. 
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

    private final static QName _Int_QNAME = new QName("http://ws.cdyne.com/", "int");
    private final static QName _ReturnIndicator_QNAME = new QName("http://ws.cdyne.com/", "ReturnIndicator");
    private final static QName _ArrayOfAnyType_QNAME = new QName("http://ws.cdyne.com/", "ArrayOfAnyType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cdyne.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReturnCodes }
     * 
     */
    public ReturnCodes createReturnCodes() {
        return new ReturnCodes();
    }

    /**
     * Create an instance of {@link ReturnCodesResponse }
     * 
     */
    public ReturnCodesResponse createReturnCodesResponse() {
        return new ReturnCodesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAnyType }
     * 
     */
    public ArrayOfAnyType createArrayOfAnyType() {
        return new ArrayOfAnyType();
    }

    /**
     * Create an instance of {@link VerifyEmail }
     * 
     */
    public VerifyEmail createVerifyEmail() {
        return new VerifyEmail();
    }

    /**
     * Create an instance of {@link VerifyEmailResponse }
     * 
     */
    public VerifyEmailResponse createVerifyEmailResponse() {
        return new VerifyEmailResponse();
    }

    /**
     * Create an instance of {@link ReturnIndicator }
     * 
     */
    public ReturnIndicator createReturnIndicator() {
        return new ReturnIndicator();
    }

    /**
     * Create an instance of {@link VerifyMXRecord }
     * 
     */
    public VerifyMXRecord createVerifyMXRecord() {
        return new VerifyMXRecord();
    }

    /**
     * Create an instance of {@link AdvancedVerifyEmail }
     * 
     */
    public AdvancedVerifyEmail createAdvancedVerifyEmail() {
        return new AdvancedVerifyEmail();
    }

    /**
     * Create an instance of {@link AdvancedVerifyEmailResponse }
     * 
     */
    public AdvancedVerifyEmailResponse createAdvancedVerifyEmailResponse() {
        return new AdvancedVerifyEmailResponse();
    }

    /**
     * Create an instance of {@link VerifyMXRecordResponse }
     * 
     */
    public VerifyMXRecordResponse createVerifyMXRecordResponse() {
        return new VerifyMXRecordResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.cdyne.com/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnIndicator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.cdyne.com/", name = "ReturnIndicator")
    public JAXBElement<ReturnIndicator> createReturnIndicator(ReturnIndicator value) {
        return new JAXBElement<ReturnIndicator>(_ReturnIndicator_QNAME, ReturnIndicator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAnyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.cdyne.com/", name = "ArrayOfAnyType")
    public JAXBElement<ArrayOfAnyType> createArrayOfAnyType(ArrayOfAnyType value) {
        return new JAXBElement<ArrayOfAnyType>(_ArrayOfAnyType_QNAME, ArrayOfAnyType.class, null, value);
    }

}
