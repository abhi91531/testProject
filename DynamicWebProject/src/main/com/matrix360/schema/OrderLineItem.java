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
 * <p>Java class for OrderLineItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderLineItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderLineItemNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mrc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nrc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="bundleInstanceId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderLineItem", propOrder = {
    "orderLineItemNumber",
    "productName",
    "productType",
    "mrc",
    "nrc",
    "quantity",
    "bundleInstanceId"
})
public class OrderLineItem {

    protected long orderLineItemNumber;
    @XmlElement(required = true)
    protected String productName;
    @XmlElement(required = true)
    protected String productType;
    @XmlElement(required = true)
    protected String mrc;
    @XmlElement(required = true)
    protected String nrc;
    protected long quantity;
    protected long bundleInstanceId;

    /**
     * Gets the value of the orderLineItemNumber property.
     * 
     */
    public long getOrderLineItemNumber() {
        return orderLineItemNumber;
    }

    /**
     * Sets the value of the orderLineItemNumber property.
     * 
     */
    public void setOrderLineItemNumber(long value) {
        this.orderLineItemNumber = value;
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
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductType(String value) {
        this.productType = value;
    }

    /**
     * Gets the value of the mrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrc() {
        return mrc;
    }

    /**
     * Sets the value of the mrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMrc(String value) {
        this.mrc = value;
    }

    /**
     * Gets the value of the nrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrc() {
        return nrc;
    }

    /**
     * Sets the value of the nrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrc(String value) {
        this.nrc = value;
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

    /**
     * Gets the value of the bundleInstanceId property.
     * 
     */
    public long getBundleInstanceId() {
        return bundleInstanceId;
    }

    /**
     * Sets the value of the bundleInstanceId property.
     * 
     */
    public void setBundleInstanceId(long value) {
        this.bundleInstanceId = value;
    }

}
