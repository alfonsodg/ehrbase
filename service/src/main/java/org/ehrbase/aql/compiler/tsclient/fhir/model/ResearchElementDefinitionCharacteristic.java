//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.26 at 01:33:12 PM CET 
//


package org.ehrbase.aql.compiler.tsclient.fhir.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The ResearchElementDefinition resource describes a "PICO" element that knowledge (evidence, assertion, recommendation) is about.
 * 
 * <p>Java class for ResearchElementDefinition.Characteristic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResearchElementDefinition.Characteristic">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="definitionCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="definitionCanonical" type="{http://hl7.org/fhir}canonical" minOccurs="0"/>
 *         &lt;element name="definitionExpression" type="{http://hl7.org/fhir}Expression" minOccurs="0"/>
 *         &lt;element name="definitionDataRequirement" type="{http://hl7.org/fhir}DataRequirement" minOccurs="0"/>
 *         &lt;element name="usageContext" type="{http://hl7.org/fhir}UsageContext" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="exclude" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="unitOfMeasure" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="studyEffectiveDescription" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="studyEffectiveDateTime" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="studyEffectivePeriod" type="{http://hl7.org/fhir}Period" minOccurs="0"/>
 *         &lt;element name="studyEffectiveDuration" type="{http://hl7.org/fhir}Duration" minOccurs="0"/>
 *         &lt;element name="studyEffectiveTiming" type="{http://hl7.org/fhir}Timing" minOccurs="0"/>
 *         &lt;element name="studyEffectiveTimeFromStart" type="{http://hl7.org/fhir}Duration" minOccurs="0"/>
 *         &lt;element name="studyEffectiveGroupMeasure" type="{http://hl7.org/fhir}GroupMeasure" minOccurs="0"/>
 *         &lt;element name="participantEffectiveDescription" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="participantEffectiveDateTime" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="participantEffectivePeriod" type="{http://hl7.org/fhir}Period" minOccurs="0"/>
 *         &lt;element name="participantEffectiveDuration" type="{http://hl7.org/fhir}Duration" minOccurs="0"/>
 *         &lt;element name="participantEffectiveTiming" type="{http://hl7.org/fhir}Timing" minOccurs="0"/>
 *         &lt;element name="participantEffectiveTimeFromStart" type="{http://hl7.org/fhir}Duration" minOccurs="0"/>
 *         &lt;element name="participantEffectiveGroupMeasure" type="{http://hl7.org/fhir}GroupMeasure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResearchElementDefinition.Characteristic", propOrder = {
    "definitionCodeableConcept",
    "definitionCanonical",
    "definitionExpression",
    "definitionDataRequirement",
    "usageContext",
    "exclude",
    "unitOfMeasure",
    "studyEffectiveDescription",
    "studyEffectiveDateTime",
    "studyEffectivePeriod",
    "studyEffectiveDuration",
    "studyEffectiveTiming",
    "studyEffectiveTimeFromStart",
    "studyEffectiveGroupMeasure",
    "participantEffectiveDescription",
    "participantEffectiveDateTime",
    "participantEffectivePeriod",
    "participantEffectiveDuration",
    "participantEffectiveTiming",
    "participantEffectiveTimeFromStart",
    "participantEffectiveGroupMeasure"
})
public class ResearchElementDefinitionCharacteristic
    extends BackboneElement
{

    protected CodeableConcept definitionCodeableConcept;
    protected Canonical definitionCanonical;
    protected Expression definitionExpression;
    protected DataRequirement definitionDataRequirement;
    protected List<UsageContext> usageContext;
    protected Boolean exclude;
    protected CodeableConcept unitOfMeasure;
    protected String studyEffectiveDescription;
    protected DateTime studyEffectiveDateTime;
    protected Period studyEffectivePeriod;
    protected Duration studyEffectiveDuration;
    protected Timing studyEffectiveTiming;
    protected Duration studyEffectiveTimeFromStart;
    protected GroupMeasure studyEffectiveGroupMeasure;
    protected String participantEffectiveDescription;
    protected DateTime participantEffectiveDateTime;
    protected Period participantEffectivePeriod;
    protected Duration participantEffectiveDuration;
    protected Timing participantEffectiveTiming;
    protected Duration participantEffectiveTimeFromStart;
    protected GroupMeasure participantEffectiveGroupMeasure;

    /**
     * Gets the value of the definitionCodeableConcept property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getDefinitionCodeableConcept() {
        return definitionCodeableConcept;
    }

    /**
     * Sets the value of the definitionCodeableConcept property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setDefinitionCodeableConcept(CodeableConcept value) {
        this.definitionCodeableConcept = value;
    }

    /**
     * Gets the value of the definitionCanonical property.
     * 
     * @return
     *     possible object is
     *     {@link Canonical }
     *     
     */
    public Canonical getDefinitionCanonical() {
        return definitionCanonical;
    }

    /**
     * Sets the value of the definitionCanonical property.
     * 
     * @param value
     *     allowed object is
     *     {@link Canonical }
     *     
     */
    public void setDefinitionCanonical(Canonical value) {
        this.definitionCanonical = value;
    }

    /**
     * Gets the value of the definitionExpression property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getDefinitionExpression() {
        return definitionExpression;
    }

    /**
     * Sets the value of the definitionExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setDefinitionExpression(Expression value) {
        this.definitionExpression = value;
    }

    /**
     * Gets the value of the definitionDataRequirement property.
     * 
     * @return
     *     possible object is
     *     {@link DataRequirement }
     *     
     */
    public DataRequirement getDefinitionDataRequirement() {
        return definitionDataRequirement;
    }

    /**
     * Sets the value of the definitionDataRequirement property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataRequirement }
     *     
     */
    public void setDefinitionDataRequirement(DataRequirement value) {
        this.definitionDataRequirement = value;
    }

    /**
     * Gets the value of the usageContext property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usageContext property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsageContext().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UsageContext }
     * 
     * 
     */
    public List<UsageContext> getUsageContext() {
        if (usageContext == null) {
            usageContext = new ArrayList<UsageContext>();
        }
        return this.usageContext;
    }

    /**
     * Gets the value of the exclude property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getExclude() {
        return exclude;
    }

    /**
     * Sets the value of the exclude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExclude(Boolean value) {
        this.exclude = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setUnitOfMeasure(CodeableConcept value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the studyEffectiveDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudyEffectiveDescription() {
        return studyEffectiveDescription;
    }

    /**
     * Sets the value of the studyEffectiveDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudyEffectiveDescription(String value) {
        this.studyEffectiveDescription = value;
    }

    /**
     * Gets the value of the studyEffectiveDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getStudyEffectiveDateTime() {
        return studyEffectiveDateTime;
    }

    /**
     * Sets the value of the studyEffectiveDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setStudyEffectiveDateTime(DateTime value) {
        this.studyEffectiveDateTime = value;
    }

    /**
     * Gets the value of the studyEffectivePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getStudyEffectivePeriod() {
        return studyEffectivePeriod;
    }

    /**
     * Sets the value of the studyEffectivePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setStudyEffectivePeriod(Period value) {
        this.studyEffectivePeriod = value;
    }

    /**
     * Gets the value of the studyEffectiveDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getStudyEffectiveDuration() {
        return studyEffectiveDuration;
    }

    /**
     * Sets the value of the studyEffectiveDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setStudyEffectiveDuration(Duration value) {
        this.studyEffectiveDuration = value;
    }

    /**
     * Gets the value of the studyEffectiveTiming property.
     * 
     * @return
     *     possible object is
     *     {@link Timing }
     *     
     */
    public Timing getStudyEffectiveTiming() {
        return studyEffectiveTiming;
    }

    /**
     * Sets the value of the studyEffectiveTiming property.
     * 
     * @param value
     *     allowed object is
     *     {@link Timing }
     *     
     */
    public void setStudyEffectiveTiming(Timing value) {
        this.studyEffectiveTiming = value;
    }

    /**
     * Gets the value of the studyEffectiveTimeFromStart property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getStudyEffectiveTimeFromStart() {
        return studyEffectiveTimeFromStart;
    }

    /**
     * Sets the value of the studyEffectiveTimeFromStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setStudyEffectiveTimeFromStart(Duration value) {
        this.studyEffectiveTimeFromStart = value;
    }

    /**
     * Gets the value of the studyEffectiveGroupMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link GroupMeasure }
     *     
     */
    public GroupMeasure getStudyEffectiveGroupMeasure() {
        return studyEffectiveGroupMeasure;
    }

    /**
     * Sets the value of the studyEffectiveGroupMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupMeasure }
     *     
     */
    public void setStudyEffectiveGroupMeasure(GroupMeasure value) {
        this.studyEffectiveGroupMeasure = value;
    }

    /**
     * Gets the value of the participantEffectiveDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantEffectiveDescription() {
        return participantEffectiveDescription;
    }

    /**
     * Sets the value of the participantEffectiveDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantEffectiveDescription(String value) {
        this.participantEffectiveDescription = value;
    }

    /**
     * Gets the value of the participantEffectiveDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getParticipantEffectiveDateTime() {
        return participantEffectiveDateTime;
    }

    /**
     * Sets the value of the participantEffectiveDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setParticipantEffectiveDateTime(DateTime value) {
        this.participantEffectiveDateTime = value;
    }

    /**
     * Gets the value of the participantEffectivePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getParticipantEffectivePeriod() {
        return participantEffectivePeriod;
    }

    /**
     * Sets the value of the participantEffectivePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setParticipantEffectivePeriod(Period value) {
        this.participantEffectivePeriod = value;
    }

    /**
     * Gets the value of the participantEffectiveDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getParticipantEffectiveDuration() {
        return participantEffectiveDuration;
    }

    /**
     * Sets the value of the participantEffectiveDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setParticipantEffectiveDuration(Duration value) {
        this.participantEffectiveDuration = value;
    }

    /**
     * Gets the value of the participantEffectiveTiming property.
     * 
     * @return
     *     possible object is
     *     {@link Timing }
     *     
     */
    public Timing getParticipantEffectiveTiming() {
        return participantEffectiveTiming;
    }

    /**
     * Sets the value of the participantEffectiveTiming property.
     * 
     * @param value
     *     allowed object is
     *     {@link Timing }
     *     
     */
    public void setParticipantEffectiveTiming(Timing value) {
        this.participantEffectiveTiming = value;
    }

    /**
     * Gets the value of the participantEffectiveTimeFromStart property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getParticipantEffectiveTimeFromStart() {
        return participantEffectiveTimeFromStart;
    }

    /**
     * Sets the value of the participantEffectiveTimeFromStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setParticipantEffectiveTimeFromStart(Duration value) {
        this.participantEffectiveTimeFromStart = value;
    }

    /**
     * Gets the value of the participantEffectiveGroupMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link GroupMeasure }
     *     
     */
    public GroupMeasure getParticipantEffectiveGroupMeasure() {
        return participantEffectiveGroupMeasure;
    }

    /**
     * Sets the value of the participantEffectiveGroupMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupMeasure }
     *     
     */
    public void setParticipantEffectiveGroupMeasure(GroupMeasure value) {
        this.participantEffectiveGroupMeasure = value;
    }

}
