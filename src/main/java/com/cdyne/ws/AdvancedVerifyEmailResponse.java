
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
 *         &lt;element name="AdvancedVerifyEmailResult" type="{http://ws.cdyne.com/}ReturnIndicator" minOccurs="0"/>
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
    "advancedVerifyEmailResult"
})
@XmlRootElement(name = "AdvancedVerifyEmailResponse")
public class AdvancedVerifyEmailResponse {

    @XmlElement(name = "AdvancedVerifyEmailResult")
    protected ReturnIndicator advancedVerifyEmailResult;

    /**
     * Gets the value of the advancedVerifyEmailResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnIndicator }
     *     
     */
    public ReturnIndicator getAdvancedVerifyEmailResult() {
        return advancedVerifyEmailResult;
    }

    /**
     * Sets the value of the advancedVerifyEmailResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnIndicator }
     *     
     */
    public void setAdvancedVerifyEmailResult(ReturnIndicator value) {
        this.advancedVerifyEmailResult = value;
    }

}
