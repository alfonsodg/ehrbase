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
 * An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.
 * 
 * <p>Java class for Encounter.Diagnosis complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Encounter.Diagnosis">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="condition" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="use" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="rank" type="{http://hl7.org/fhir}positiveInt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Encounter.Diagnosis", propOrder = {
    "condition",
    "use",
    "rank"
})
public class EncounterDiagnosis
    extends BackboneElement
{

    @XmlElement(required = true)
    protected Reference condition;
    protected CodeableConcept use;
    protected PositiveInt rank;

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setCondition(Reference value) {
        this.condition = value;
    }

    /**
     * Gets the value of the use property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getUse() {
        return use;
    }

    /**
     * Sets the value of the use property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setUse(CodeableConcept value) {
        this.use = value;
    }

    /**
     * Gets the value of the rank property.
     * 
     * @return
     *     possible object is
     *     {@link PositiveInt }
     *     
     */
    public PositiveInt getRank() {
        return rank;
    }

    /**
     * Sets the value of the rank property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveInt }
     *     
     */
    public void setRank(PositiveInt value) {
        this.rank = value;
    }

}
