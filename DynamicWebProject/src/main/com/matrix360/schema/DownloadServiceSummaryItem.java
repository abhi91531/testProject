//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.16 at 12:22:21 AM IST 
//


package com.matrix360.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DownloadServiceSummaryItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DownloadServiceSummaryItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="siteAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="clientCircuitNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DownloadServiceSummaryItem", propOrder = {
    "accountNumber",
    "siteAddress",
    "clientCircuitNumber",
    "serviceType",
    "productName",
    "quantity"
})
public class DownloadServiceSummaryItem {

    protected long accountNumber;
    @XmlElement(required = true)
    protected String siteAddress;
    @XmlElement(required = true)
    protected String clientCircuitNumber;
    @XmlElement(required = true)
    protected String serviceType;
    @XmlElement(required = true)
    protected String productName;
    protected long quantity;

    /**
     * Gets the value of the accountNumber property.
     * 
     */
    public long getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     */
    public void setAccountNumber(long value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the siteAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteAddress() {
        return siteAddress;
    }

    /**
     * Sets the value of the siteAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteAddress(String value) {
        this.siteAddress = value;
    }

    /**
     * Gets the value of the clientCircuitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientCircuitNumber() {
        return clientCircuitNumber;
    }

    /**
     * Sets the value of the clientCircuitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientCircuitNumber(String value) {
        this.clientCircuitNumber = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public long getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(long value) {
        this.quantity = value;
    }

}
