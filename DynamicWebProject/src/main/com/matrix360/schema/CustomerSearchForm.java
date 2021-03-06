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
 * <p>Java class for CustomerSearchForm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerSearchForm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="affiliateId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="client" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contactName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ticketNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="csaCircuitNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="csaOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="csaTicketNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lsn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="voipPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="invoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="wildcardPrefix" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="filterByActiveService" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="filterByOrgAccount" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="filterByPendingInstall" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mosesTicketNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mosesBillAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="excelMode" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="gbRefId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerSearchForm", propOrder = {
    "accountNumber",
    "affiliateId",
    "client",
    "companyName",
    "serviceAddress",
    "phoneNumber",
    "contactName",
    "ticketNumber",
    "orderNumber",
    "csaCircuitNumber",
    "csaOrderNumber",
    "csaTicketNumber",
    "lsn",
    "billcode",
    "voipPhoneNumber",
    "invoiceNumber",
    "wildcardPrefix",
    "filterByActiveService",
    "filterByOrgAccount",
    "filterByPendingInstall",
    "mosesTicketNumber",
    "mosesBillAccountNumber",
    "excelMode",
    "gbRefId",
    "emailAddress",
    "ipAddress"
})
public class CustomerSearchForm {

    @XmlElement(required = true)
    protected String accountNumber;
    @XmlElement(required = true)
    protected String affiliateId;
    @XmlElement(required = true)
    protected String client;
    @XmlElement(required = true)
    protected String companyName;
    @XmlElement(required = true)
    protected String serviceAddress;
    @XmlElement(required = true)
    protected String phoneNumber;
    @XmlElement(required = true)
    protected String contactName;
    @XmlElement(required = true)
    protected String ticketNumber;
    @XmlElement(required = true)
    protected String orderNumber;
    @XmlElement(required = true)
    protected String csaCircuitNumber;
    @XmlElement(required = true)
    protected String csaOrderNumber;
    @XmlElement(required = true)
    protected String csaTicketNumber;
    @XmlElement(required = true)
    protected String lsn;
    @XmlElement(required = true)
    protected String billcode;
    @XmlElement(required = true)
    protected String voipPhoneNumber;
    @XmlElement(required = true)
    protected String invoiceNumber;
    protected boolean wildcardPrefix;
    protected boolean filterByActiveService;
    protected boolean filterByOrgAccount;
    protected boolean filterByPendingInstall;
    @XmlElement(required = true)
    protected String mosesTicketNumber;
    @XmlElement(required = true)
    protected String mosesBillAccountNumber;
    protected boolean excelMode;
    @XmlElement(required = true)
    protected String gbRefId;
    @XmlElement(required = true)
    protected String emailAddress;
    @XmlElement(required = true)
    protected String ipAddress;

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the affiliateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffiliateId() {
        return affiliateId;
    }

    /**
     * Sets the value of the affiliateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffiliateId(String value) {
        this.affiliateId = value;
    }

    /**
     * Gets the value of the client property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClient() {
        return client;
    }

    /**
     * Sets the value of the client property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClient(String value) {
        this.client = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the serviceAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceAddress() {
        return serviceAddress;
    }

    /**
     * Sets the value of the serviceAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceAddress(String value) {
        this.serviceAddress = value;
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
     * Gets the value of the ticketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Sets the value of the ticketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketNumber(String value) {
        this.ticketNumber = value;
    }

    /**
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNumber(String value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the csaCircuitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsaCircuitNumber() {
        return csaCircuitNumber;
    }

    /**
     * Sets the value of the csaCircuitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsaCircuitNumber(String value) {
        this.csaCircuitNumber = value;
    }

    /**
     * Gets the value of the csaOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsaOrderNumber() {
        return csaOrderNumber;
    }

    /**
     * Sets the value of the csaOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsaOrderNumber(String value) {
        this.csaOrderNumber = value;
    }

    /**
     * Gets the value of the csaTicketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsaTicketNumber() {
        return csaTicketNumber;
    }

    /**
     * Sets the value of the csaTicketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsaTicketNumber(String value) {
        this.csaTicketNumber = value;
    }

    /**
     * Gets the value of the lsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLsn() {
        return lsn;
    }

    /**
     * Sets the value of the lsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLsn(String value) {
        this.lsn = value;
    }

    /**
     * Gets the value of the billcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillcode() {
        return billcode;
    }

    /**
     * Sets the value of the billcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillcode(String value) {
        this.billcode = value;
    }

    /**
     * Gets the value of the voipPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoipPhoneNumber() {
        return voipPhoneNumber;
    }

    /**
     * Sets the value of the voipPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoipPhoneNumber(String value) {
        this.voipPhoneNumber = value;
    }

    /**
     * Gets the value of the invoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNumber(String value) {
        this.invoiceNumber = value;
    }

    /**
     * Gets the value of the wildcardPrefix property.
     * 
     */
    public boolean isWildcardPrefix() {
        return wildcardPrefix;
    }

    /**
     * Sets the value of the wildcardPrefix property.
     * 
     */
    public void setWildcardPrefix(boolean value) {
        this.wildcardPrefix = value;
    }

    /**
     * Gets the value of the filterByActiveService property.
     * 
     */
    public boolean isFilterByActiveService() {
        return filterByActiveService;
    }

    /**
     * Sets the value of the filterByActiveService property.
     * 
     */
    public void setFilterByActiveService(boolean value) {
        this.filterByActiveService = value;
    }

    /**
     * Gets the value of the filterByOrgAccount property.
     * 
     */
    public boolean isFilterByOrgAccount() {
        return filterByOrgAccount;
    }

    /**
     * Sets the value of the filterByOrgAccount property.
     * 
     */
    public void setFilterByOrgAccount(boolean value) {
        this.filterByOrgAccount = value;
    }

    /**
     * Gets the value of the filterByPendingInstall property.
     * 
     */
    public boolean isFilterByPendingInstall() {
        return filterByPendingInstall;
    }

    /**
     * Sets the value of the filterByPendingInstall property.
     * 
     */
    public void setFilterByPendingInstall(boolean value) {
        this.filterByPendingInstall = value;
    }

    /**
     * Gets the value of the mosesTicketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMosesTicketNumber() {
        return mosesTicketNumber;
    }

    /**
     * Sets the value of the mosesTicketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMosesTicketNumber(String value) {
        this.mosesTicketNumber = value;
    }

    /**
     * Gets the value of the mosesBillAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMosesBillAccountNumber() {
        return mosesBillAccountNumber;
    }

    /**
     * Sets the value of the mosesBillAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMosesBillAccountNumber(String value) {
        this.mosesBillAccountNumber = value;
    }

    /**
     * Gets the value of the excelMode property.
     * 
     */
    public boolean isExcelMode() {
        return excelMode;
    }

    /**
     * Sets the value of the excelMode property.
     * 
     */
    public void setExcelMode(boolean value) {
        this.excelMode = value;
    }

    /**
     * Gets the value of the gbRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGbRefId() {
        return gbRefId;
    }

    /**
     * Sets the value of the gbRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGbRefId(String value) {
        this.gbRefId = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

}
