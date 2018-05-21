
package com.cdyne.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnIndicator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnIndicator">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResponseText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResponseCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LastMailServer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GoodEmail" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnIndicator", propOrder = {
    "responseText",
    "responseCode",
    "lastMailServer",
    "goodEmail"
})
public class ReturnIndicator {

    @XmlElement(name = "ResponseText")
    protected String responseText;
    @XmlElement(name = "ResponseCode")
    protected int responseCode;
    @XmlElement(name = "LastMailServer")
    protected String lastMailServer;
    @XmlElement(name = "GoodEmail")
    protected boolean goodEmail;

    /**
     * Gets the value of the responseText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseText() {
        return responseText;
    }

    /**
     * Sets the value of the responseText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseText(String value) {
        this.responseText = value;
    }

    /**
     * Gets the value of the responseCode property.
     * 
     */
    public int getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the value of the responseCode property.
     * 
     */
    public void setResponseCode(int value) {
        this.responseCode = value;
    }

    /**
     * Gets the value of the lastMailServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastMailServer() {
        return lastMailServer;
    }

    /**
     * Sets the value of the lastMailServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastMailServer(String value) {
        this.lastMailServer = value;
    }

    /**
     * Gets the value of the goodEmail property.
     * 
     */
    public boolean isGoodEmail() {
        return goodEmail;
    }

    /**
     * Sets the value of the goodEmail property.
     * 
     */
    public void setGoodEmail(boolean value) {
        this.goodEmail = value;
    }

}
