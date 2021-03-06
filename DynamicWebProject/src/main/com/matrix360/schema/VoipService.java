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
 * <p>Java class for VoipService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VoipService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phoneNumberId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="initialVoicePortalPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="initialWebAccessPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sipUserName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sipPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="equipmentName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="macAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trunkGroupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoipService", propOrder = {
    "serviceName",
    "userName",
    "phoneNumberId",
    "phoneNumber",
    "extension",
    "initialVoicePortalPassword",
    "initialWebAccessPassword",
    "sipUserName",
    "sipPassword",
    "equipmentName",
    "macAddress",
    "trunkGroupName",
    "groupId",
    "status"
})
public class VoipService {

    @XmlElement(required = true)
    protected String serviceName;
    @XmlElement(required = true)
    protected String userName;
    @XmlElement(required = true)
    protected String phoneNumberId;
    @XmlElement(required = true)
    protected String phoneNumber;
    @XmlElement(required = true)
    protected String extension;
    @XmlElement(required = true)
    protected String initialVoicePortalPassword;
    @XmlElement(required = true)
    protected String initialWebAccessPassword;
    @XmlElement(required = true)
    protected String sipUserName;
    @XmlElement(required = true)
    protected String sipPassword;
    @XmlElement(required = true)
    protected String equipmentName;
    @XmlElement(required = true)
    protected String macAddress;
    @XmlElement(required = true)
    protected String trunkGroupName;
    @XmlElement(required = true)
    protected String groupId;
    @XmlElement(required = true)
    protected String status;

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the phoneNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumberId() {
        return phoneNumberId;
    }

    /**
     * Sets the value of the phoneNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumberId(String value) {
        this.phoneNumberId = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

    /**
     * Gets the value of the initialVoicePortalPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialVoicePortalPassword() {
        return initialVoicePortalPassword;
    }

    /**
     * Sets the value of the initialVoicePortalPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialVoicePortalPassword(String value) {
        this.initialVoicePortalPassword = value;
    }

    /**
     * Gets the value of the initialWebAccessPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialWebAccessPassword() {
        return initialWebAccessPassword;
    }

    /**
     * Sets the value of the initialWebAccessPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialWebAccessPassword(String value) {
        this.initialWebAccessPassword = value;
    }

    /**
     * Gets the value of the sipUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSipUserName() {
        return sipUserName;
    }

    /**
     * Sets the value of the sipUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSipUserName(String value) {
        this.sipUserName = value;
    }

    /**
     * Gets the value of the sipPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSipPassword() {
        return sipPassword;
    }

    /**
     * Sets the value of the sipPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSipPassword(String value) {
        this.sipPassword = value;
    }

    /**
     * Gets the value of the equipmentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentName() {
        return equipmentName;
    }

    /**
     * Sets the value of the equipmentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentName(String value) {
        this.equipmentName = value;
    }

    /**
     * Gets the value of the macAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * Sets the value of the macAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMacAddress(String value) {
        this.macAddress = value;
    }

    /**
     * Gets the value of the trunkGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrunkGroupName() {
        return trunkGroupName;
    }

    /**
     * Sets the value of the trunkGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrunkGroupName(String value) {
        this.trunkGroupName = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupId(String value) {
        this.groupId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
