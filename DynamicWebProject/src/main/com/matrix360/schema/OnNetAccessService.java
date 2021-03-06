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
 * <p>Java class for OnNetAccessService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OnNetAccessService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceBrand" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="provisioningStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateConnected" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateDisconnected" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="qosValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cosValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="backhaulCircuitName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="backhaulCircuitStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="circuitEndPoint" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="circuitNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="handoffType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="handoffTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="providerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="providerCircuitNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="providerOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnNetAccessService", propOrder = {
    "serviceBrand",
    "serviceStatus",
    "provisioningStatus",
    "dateConnected",
    "dateDisconnected",
    "qosValue",
    "cosValue",
    "backhaulCircuitName",
    "backhaulCircuitStatus",
    "circuitEndPoint",
    "circuitNumber",
    "handoffType",
    "handoffTo",
    "providerName",
    "providerCircuitNumber",
    "providerOrderNumber"
})
public class OnNetAccessService {

    @XmlElement(required = true)
    protected String serviceBrand;
    @XmlElement(required = true)
    protected String serviceStatus;
    @XmlElement(required = true)
    protected String provisioningStatus;
    @XmlElement(required = true)
    protected String dateConnected;
    @XmlElement(required = true)
    protected String dateDisconnected;
    @XmlElement(required = true)
    protected String qosValue;
    @XmlElement(required = true)
    protected String cosValue;
    @XmlElement(required = true)
    protected String backhaulCircuitName;
    @XmlElement(required = true)
    protected String backhaulCircuitStatus;
    @XmlElement(required = true)
    protected String circuitEndPoint;
    @XmlElement(required = true)
    protected String circuitNumber;
    @XmlElement(required = true)
    protected String handoffType;
    @XmlElement(required = true)
    protected String handoffTo;
    @XmlElement(required = true)
    protected String providerName;
    @XmlElement(required = true)
    protected String providerCircuitNumber;
    @XmlElement(required = true)
    protected String providerOrderNumber;

    /**
     * Gets the value of the serviceBrand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceBrand() {
        return serviceBrand;
    }

    /**
     * Sets the value of the serviceBrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceBrand(String value) {
        this.serviceBrand = value;
    }

    /**
     * Gets the value of the serviceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceStatus() {
        return serviceStatus;
    }

    /**
     * Sets the value of the serviceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceStatus(String value) {
        this.serviceStatus = value;
    }

    /**
     * Gets the value of the provisioningStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvisioningStatus() {
        return provisioningStatus;
    }

    /**
     * Sets the value of the provisioningStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvisioningStatus(String value) {
        this.provisioningStatus = value;
    }

    /**
     * Gets the value of the dateConnected property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateConnected() {
        return dateConnected;
    }

    /**
     * Sets the value of the dateConnected property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateConnected(String value) {
        this.dateConnected = value;
    }

    /**
     * Gets the value of the dateDisconnected property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateDisconnected() {
        return dateDisconnected;
    }

    /**
     * Sets the value of the dateDisconnected property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateDisconnected(String value) {
        this.dateDisconnected = value;
    }

    /**
     * Gets the value of the qosValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQosValue() {
        return qosValue;
    }

    /**
     * Sets the value of the qosValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQosValue(String value) {
        this.qosValue = value;
    }

    /**
     * Gets the value of the cosValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCosValue() {
        return cosValue;
    }

    /**
     * Sets the value of the cosValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCosValue(String value) {
        this.cosValue = value;
    }

    /**
     * Gets the value of the backhaulCircuitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackhaulCircuitName() {
        return backhaulCircuitName;
    }

    /**
     * Sets the value of the backhaulCircuitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackhaulCircuitName(String value) {
        this.backhaulCircuitName = value;
    }

    /**
     * Gets the value of the backhaulCircuitStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackhaulCircuitStatus() {
        return backhaulCircuitStatus;
    }

    /**
     * Sets the value of the backhaulCircuitStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackhaulCircuitStatus(String value) {
        this.backhaulCircuitStatus = value;
    }

    /**
     * Gets the value of the circuitEndPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCircuitEndPoint() {
        return circuitEndPoint;
    }

    /**
     * Sets the value of the circuitEndPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCircuitEndPoint(String value) {
        this.circuitEndPoint = value;
    }

    /**
     * Gets the value of the circuitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCircuitNumber() {
        return circuitNumber;
    }

    /**
     * Sets the value of the circuitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCircuitNumber(String value) {
        this.circuitNumber = value;
    }

    /**
     * Gets the value of the handoffType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandoffType() {
        return handoffType;
    }

    /**
     * Sets the value of the handoffType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandoffType(String value) {
        this.handoffType = value;
    }

    /**
     * Gets the value of the handoffTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandoffTo() {
        return handoffTo;
    }

    /**
     * Sets the value of the handoffTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandoffTo(String value) {
        this.handoffTo = value;
    }

    /**
     * Gets the value of the providerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * Sets the value of the providerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderName(String value) {
        this.providerName = value;
    }

    /**
     * Gets the value of the providerCircuitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderCircuitNumber() {
        return providerCircuitNumber;
    }

    /**
     * Sets the value of the providerCircuitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderCircuitNumber(String value) {
        this.providerCircuitNumber = value;
    }

    /**
     * Gets the value of the providerOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderOrderNumber() {
        return providerOrderNumber;
    }

    /**
     * Sets the value of the providerOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderOrderNumber(String value) {
        this.providerOrderNumber = value;
    }

}
