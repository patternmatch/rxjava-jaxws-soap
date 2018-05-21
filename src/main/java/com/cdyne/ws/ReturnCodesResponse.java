
package com.cdyne.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReturnCodesResult" type="{http://ws.cdyne.com/}ArrayOfAnyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "returnCodesResult"
})
@XmlRootElement(name = "ReturnCodesResponse")
public class ReturnCodesResponse {

    @XmlElement(name = "ReturnCodesResult")
    protected ArrayOfAnyType returnCodesResult;

    /**
     * Gets the value of the returnCodesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAnyType }
     *     
     */
    public ArrayOfAnyType getReturnCodesResult() {
        return returnCodesResult;
    }

    /**
     * Sets the value of the returnCodesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAnyType }
     *     
     */
    public void setReturnCodesResult(ArrayOfAnyType value) {
        this.returnCodesResult = value;
    }

}
