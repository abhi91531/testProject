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
 * <p>Java class for Ticket complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Ticket">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ticketCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subcategory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateOpened" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateClosed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastNotesDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="attentionDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="refType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="refId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="domain" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resolution" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="notesCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="siteAccountNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="siteAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ticket", propOrder = {
    "ticketCode",
    "category",
    "subcategory",
    "dateOpened",
    "dateClosed",
    "lastNotesDate",
    "attentionDate",
    "description",
    "status",
    "priority",
    "refType",
    "refId",
    "domain",
    "resolution",
    "notesCount",
    "siteAccountNumber",
    "siteAddress"
})
public class Ticket {

    @XmlElement(required = true)
    protected String ticketCode;
    @XmlElement(required = true)
    protected String category;
    @XmlElement(required = true)
    protected String subcategory;
    @XmlElement(required = true)
    protected String dateOpened;
    @XmlElement(required = true)
    protected String dateClosed;
    @XmlElement(required = true)
    protected String lastNotesDate;
    @XmlElement(required = true)
    protected String attentionDate;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    protected String priority;
    @XmlElement(required = true)
    protected String refType;
    protected long refId;
    @XmlElement(required = true)
    protected String domain;
    @XmlElement(required = true)
    protected String resolution;
    protected long notesCount;
    protected long siteAccountNumber;
    @XmlElement(required = true)
    protected String siteAddress;

    /**
     * Gets the value of the ticketCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketCode() {
        return ticketCode;
    }

    /**
     * Sets the value of the ticketCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketCode(String value) {
        this.ticketCode = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the subcategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubcategory() {
        return subcategory;
    }

    /**
     * Sets the value of the subcategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubcategory(String value) {
        this.subcategory = value;
    }

    /**
     * Gets the value of the dateOpened property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOpened() {
        return dateOpened;
    }

    /**
     * Sets the value of the dateOpened property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOpened(String value) {
        this.dateOpened = value;
    }

    /**
     * Gets the value of the dateClosed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateClosed() {
        return dateClosed;
    }

    /**
     * Sets the value of the dateClosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateClosed(String value) {
        this.dateClosed = value;
    }

    /**
     * Gets the value of the lastNotesDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastNotesDate() {
        return lastNotesDate;
    }

    /**
     * Sets the value of the lastNotesDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastNotesDate(String value) {
        this.lastNotesDate = value;
    }

    /**
     * Gets the value of the attentionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttentionDate() {
        return attentionDate;
    }

    /**
     * Sets the value of the attentionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttentionDate(String value) {
        this.attentionDate = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the refType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefType() {
        return refType;
    }

    /**
     * Sets the value of the refType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefType(String value) {
        this.refType = value;
    }

    /**
     * Gets the value of the refId property.
     * 
     */
    public long getRefId() {
        return refId;
    }

    /**
     * Sets the value of the refId property.
     * 
     */
    public void setRefId(long value) {
        this.refId = value;
    }

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomain(String value) {
        this.domain = value;
    }

    /**
     * Gets the value of the resolution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolution(String value) {
        this.resolution = value;
    }

    /**
     * Gets the value of the notesCount property.
     * 
     */
    public long getNotesCount() {
        return notesCount;
    }

    /**
     * Sets the value of the notesCount property.
     * 
     */
    public void setNotesCount(long value) {
        this.notesCount = value;
    }

    /**
     * Gets the value of the siteAccountNumber property.
     * 
     */
    public long getSiteAccountNumber() {
        return siteAccountNumber;
    }

    /**
     * Sets the value of the siteAccountNumber property.
     * 
     */
    public void setSiteAccountNumber(long value) {
        this.siteAccountNumber = value;
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

}
