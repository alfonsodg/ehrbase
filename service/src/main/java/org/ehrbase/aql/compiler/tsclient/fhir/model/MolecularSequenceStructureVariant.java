//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.26 at 01:33:12 PM CET 
//


package org.ehrbase.aql.compiler.tsclient.fhir.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Raw data describing a biological sequence.
 * 
 * <p>Java class for MolecularSequence.StructureVariant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MolecularSequence.StructureVariant">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="variantType" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="exact" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="length" type="{http://hl7.org/fhir}integer" minOccurs="0"/>
 *         &lt;element name="outer" type="{http://hl7.org/fhir}MolecularSequence.Outer" minOccurs="0"/>
 *         &lt;element name="inner" type="{http://hl7.org/fhir}MolecularSequence.Inner" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MolecularSequence.StructureVariant", propOrder = {
    "variantType",
    "exact",
    "length",
    "outer",
    "inner"
})
public class MolecularSequenceStructureVariant
    extends BackboneElement
{

    protected CodeableConcept variantType;
    protected Boolean exact;
    protected Integer length;
    protected MolecularSequenceOuter outer;
    protected MolecularSequenceInner inner;

    /**
     * Gets the value of the variantType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getVariantType() {
        return variantType;
    }

    /**
     * Sets the value of the variantType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setVariantType(CodeableConcept value) {
        this.variantType = value;
    }

    /**
     * Gets the value of the exact property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getExact() {
        return exact;
    }

    /**
     * Sets the value of the exact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExact(Boolean value) {
        this.exact = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLength(Integer value) {
        this.length = value;
    }

    /**
     * Gets the value of the outer property.
     * 
     * @return
     *     possible object is
     *     {@link MolecularSequenceOuter }
     *     
     */
    public MolecularSequenceOuter getOuter() {
        return outer;
    }

    /**
     * Sets the value of the outer property.
     * 
     * @param value
     *     allowed object is
     *     {@link MolecularSequenceOuter }
     *     
     */
    public void setOuter(MolecularSequenceOuter value) {
        this.outer = value;
    }

    /**
     * Gets the value of the inner property.
     * 
     * @return
     *     possible object is
     *     {@link MolecularSequenceInner }
     *     
     */
    public MolecularSequenceInner getInner() {
        return inner;
    }

    /**
     * Sets the value of the inner property.
     * 
     * @param value
     *     allowed object is
     *     {@link MolecularSequenceInner }
     *     
     */
    public void setInner(MolecularSequenceInner value) {
        this.inner = value;
    }

}
