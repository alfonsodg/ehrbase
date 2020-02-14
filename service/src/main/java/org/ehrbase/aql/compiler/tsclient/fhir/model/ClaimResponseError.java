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
 * This resource provides the adjudication details from the processing of a Claim resource.
 * 
 * <p>Java class for ClaimResponse.Error complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimResponse.Error">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="itemSequence" type="{http://hl7.org/fhir}positiveInt" minOccurs="0"/>
 *         &lt;element name="detailSequence" type="{http://hl7.org/fhir}positiveInt" minOccurs="0"/>
 *         &lt;element name="subDetailSequence" type="{http://hl7.org/fhir}positiveInt" minOccurs="0"/>
 *         &lt;element name="code" type="{http://hl7.org/fhir}CodeableConcept"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimResponse.Error", propOrder = {
    "itemSequence",
    "detailSequence",
    "subDetailSequence",
    "code"
})
public class ClaimResponseError
    extends BackboneElement
{

    protected PositiveInt itemSequence;
    protected PositiveInt detailSequence;
    protected PositiveInt subDetailSequence;
    @XmlElement(required = true)
    protected CodeableConcept code;

    /**
     * Gets the value of the itemSequence property.
     * 
     * @return
     *     possible object is
     *     {@link PositiveInt }
     *     
     */
    public PositiveInt getItemSequence() {
        return itemSequence;
    }

    /**
     * Sets the value of the itemSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveInt }
     *     
     */
    public void setItemSequence(PositiveInt value) {
        this.itemSequence = value;
    }

    /**
     * Gets the value of the detailSequence property.
     * 
     * @return
     *     possible object is
     *     {@link PositiveInt }
     *     
     */
    public PositiveInt getDetailSequence() {
        return detailSequence;
    }

    /**
     * Sets the value of the detailSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveInt }
     *     
     */
    public void setDetailSequence(PositiveInt value) {
        this.detailSequence = value;
    }

    /**
     * Gets the value of the subDetailSequence property.
     * 
     * @return
     *     possible object is
     *     {@link PositiveInt }
     *     
     */
    public PositiveInt getSubDetailSequence() {
        return subDetailSequence;
    }

    /**
     * Sets the value of the subDetailSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveInt }
     *     
     */
    public void setSubDetailSequence(PositiveInt value) {
        this.subDetailSequence = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setCode(CodeableConcept value) {
        this.code = value;
    }

}
