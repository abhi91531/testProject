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
 * <p>Java class for CustomerContact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerContact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contactName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="primaryPhone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="altPhone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contactAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerContact", propOrder = {
    "contactType",
    "contactName",
    "primaryPhone",
    "altPhone",
    "email",
    "fax",
    "contactAddress"
})
public class CustomerContact {

    @XmlElement(required = true)
    protected String contactType;
    @XmlElement(required = true)
    protected String contactName;
    @XmlElement(required = true)
    protected String primaryPhone;
    @XmlElement(required = true)
    protected String altPhone;
    @XmlElement(required = true)
    protected String email;
    @XmlElement(required = true)
    protected String fax;
    @XmlElement(required = true)
    protected String contactAddress;

    /**
     * Gets the value of the contactType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactType() {
        return contactType;
    }

    /**
     * Sets the value of the contactType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactType(String value) {
        this.contactType = value;
    }

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the primaryPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryPhone() {
        return primaryPhone;
    }

    /**
     * Sets the value of the primaryPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryPhone(String value) {
        this.primaryPhone = value;
    }

    /**
     * Gets the value of the altPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltPhone() {
        return altPhone;
    }

    /**
     * Sets the value of the altPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltPhone(String value) {
        this.altPhone = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the contactAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactAddress() {
        return contactAddress;
    }

    /**
     * Sets the value of the contactAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactAddress(String value) {
        this.contactAddress = value;
    }

}
