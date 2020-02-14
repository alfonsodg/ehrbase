//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.26 at 01:33:12 PM CET 
//


package org.ehrbase.aql.compiler.tsclient.fhir.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 * 
 * <p>Java class for ExplanationOfBenefit.Financial complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExplanationOfBenefit.Financial">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://hl7.org/fhir}CodeableConcept"/>
 *         &lt;element name="allowedUnsignedInt" type="{http://hl7.org/fhir}unsignedInt" minOccurs="0"/>
 *         &lt;element name="allowedString" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="allowedMoney" type="{http://hl7.org/fhir}Money" minOccurs="0"/>
 *         &lt;element name="usedUnsignedInt" type="{http://hl7.org/fhir}unsignedInt" minOccurs="0"/>
 *         &lt;element name="usedMoney" type="{http://hl7.org/fhir}Money" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExplanationOfBenefit.Financial", propOrder = {
    "type",
    "allowedUnsignedInt",
    "allowedString",
    "allowedMoney",
    "usedUnsignedInt",
    "usedMoney"
})
public class ExplanationOfBenefitFinancial
    extends BackboneElement
{

    @XmlElement(required = true)
    protected CodeableConcept type;
    protected UnsignedInt allowedUnsignedInt;
    protected String allowedString;
    protected Money allowedMoney;
    protected UnsignedInt usedUnsignedInt;
    protected Money usedMoney;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setType(CodeableConcept value) {
        this.type = value;
    }

    /**
     * Gets the value of the allowedUnsignedInt property.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedInt }
     *     
     */
    public UnsignedInt getAllowedUnsignedInt() {
        return allowedUnsignedInt;
    }

    /**
     * Sets the value of the allowedUnsignedInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedInt }
     *     
     */
    public void setAllowedUnsignedInt(UnsignedInt value) {
        this.allowedUnsignedInt = value;
    }

    /**
     * Gets the value of the allowedString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowedString() {
        return allowedString;
    }

    /**
     * Sets the value of the allowedString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowedString(String value) {
        this.allowedString = value;
    }

    /**
     * Gets the value of the allowedMoney property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAllowedMoney() {
        return allowedMoney;
    }

    /**
     * Sets the value of the allowedMoney property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAllowedMoney(Money value) {
        this.allowedMoney = value;
    }

    /**
     * Gets the value of the usedUnsignedInt property.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedInt }
     *     
     */
    public UnsignedInt getUsedUnsignedInt() {
        return usedUnsignedInt;
    }

    /**
     * Sets the value of the usedUnsignedInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedInt }
     *     
     */
    public void setUsedUnsignedInt(UnsignedInt value) {
        this.usedUnsignedInt = value;
    }

    /**
     * Gets the value of the usedMoney property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getUsedMoney() {
        return usedMoney;
    }

    /**
     * Sets the value of the usedMoney property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setUsedMoney(Money value) {
        this.usedMoney = value;
    }

}
