//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.16 at 12:22:21 AM IST 
//


package com.matrix360.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerOverview complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerOverview">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountDetails" type="{http://www.megapath.com/m360}AccountDetails"/>
 *         &lt;element name="billingOverview" type="{http://www.megapath.com/m360}BillingOverview"/>
 *         &lt;element name="serviceSummary" type="{http://www.megapath.com/m360}ServiceSummary" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="site" type="{http://www.megapath.com/m360}ChildAccount" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerOverview", propOrder = {
    "accountDetails",
    "billingOverview",
    "serviceSummary",
    "site"
})
public class CustomerOverview {

    @XmlElement(required = true)
    protected AccountDetails accountDetails;
    @XmlElement(required = true)
    protected BillingOverview billingOverview;
    protected List<ServiceSummary> serviceSummary;
    protected List<ChildAccount> site;

    /**
     * Gets the value of the accountDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AccountDetails }
     *     
     */
    public AccountDetails getAccountDetails() {
        return accountDetails;
    }

    /**
     * Sets the value of the accountDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountDetails }
     *     
     */
    public void setAccountDetails(AccountDetails value) {
        this.accountDetails = value;
    }

    /**
     * Gets the value of the billingOverview property.
     * 
     * @return
     *     possible object is
     *     {@link BillingOverview }
     *     
     */
    public BillingOverview getBillingOverview() {
        return billingOverview;
    }

    /**
     * Sets the value of the billingOverview property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingOverview }
     *     
     */
    public void setBillingOverview(BillingOverview value) {
        this.billingOverview = value;
    }

    /**
     * Gets the value of the serviceSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceSummary }
     * 
     * 
     */
    public List<ServiceSummary> getServiceSummary() {
        if (serviceSummary == null) {
            serviceSummary = new ArrayList<ServiceSummary>();
        }
        return this.serviceSummary;
    }

    /**
     * Gets the value of the site property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the site property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChildAccount }
     * 
     * 
     */
    public List<ChildAccount> getSite() {
        if (site == null) {
            site = new ArrayList<ChildAccount>();
        }
        return this.site;
    }

}