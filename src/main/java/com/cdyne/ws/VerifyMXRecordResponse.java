
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
 *         &lt;element name="VerifyMXRecordResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "verifyMXRecordResult"
})
@XmlRootElement(name = "VerifyMXRecordResponse")
public class VerifyMXRecordResponse {

    @XmlElement(name = "VerifyMXRecordResult")
    protected int verifyMXRecordResult;

    /**
     * Gets the value of the verifyMXRecordResult property.
     * 
     */
    public int getVerifyMXRecordResult() {
        return verifyMXRecordResult;
    }

    /**
     * Sets the value of the verifyMXRecordResult property.
     * 
     */
    public void setVerifyMXRecordResult(int value) {
        this.verifyMXRecordResult = value;
    }

}
