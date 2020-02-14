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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for AuditEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuditEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://hl7.org/fhir}Coding"/>
 *         &lt;element name="subtype" type="{http://hl7.org/fhir}Coding" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="action" type="{http://hl7.org/fhir}AuditEventAction" minOccurs="0"/>
 *         &lt;element name="period" type="{http://hl7.org/fhir}Period" minOccurs="0"/>
 *         &lt;element name="recorded" type="{http://hl7.org/fhir}instant"/>
 *         &lt;element name="outcome" type="{http://hl7.org/fhir}AuditEventOutcome" minOccurs="0"/>
 *         &lt;element name="outcomeDesc" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="purposeOfEvent" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="agent" type="{http://hl7.org/fhir}AuditEvent.Agent" maxOccurs="unbounded"/>
 *         &lt;element name="source" type="{http://hl7.org/fhir}AuditEvent.Source"/>
 *         &lt;element name="entity" type="{http://hl7.org/fhir}AuditEvent.Entity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditEvent", propOrder = {
    "type",
    "subtype",
    "action",
    "period",
    "recorded",
    "outcome",
    "outcomeDesc",
    "purposeOfEvent",
    "agent",
    "source",
    "entity"
})
public class AuditEvent
    extends DomainResource
{

    @XmlElement(required = true)
    protected Coding type;
    protected List<Coding> subtype;
    protected AuditEventAction action;
    protected Period period;
    @XmlElement(required = true)
    protected Instant recorded;
    protected AuditEventOutcome outcome;
    protected String outcomeDesc;
    protected List<CodeableConcept> purposeOfEvent;
    @XmlElement(required = true)
    protected List<AuditEventAgent> agent;
    @XmlElement(required = true)
    protected AuditEventSource source;
    protected List<AuditEventEntity> entity;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setType(Coding value) {
        this.type = value;
    }

    /**
     * Gets the value of the subtype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subtype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubtype().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coding }
     * 
     * 
     */
    public List<Coding> getSubtype() {
        if (subtype == null) {
            subtype = new ArrayList<Coding>();
        }
        return this.subtype;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link AuditEventAction }
     *     
     */
    public AuditEventAction getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditEventAction }
     *     
     */
    public void setAction(AuditEventAction value) {
        this.action = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setPeriod(Period value) {
        this.period = value;
    }

    /**
     * Gets the value of the recorded property.
     * 
     * @return
     *     possible object is
     *     {@link Instant }
     *     
     */
    public Instant getRecorded() {
        return recorded;
    }

    /**
     * Sets the value of the recorded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Instant }
     *     
     */
    public void setRecorded(Instant value) {
        this.recorded = value;
    }

    /**
     * Gets the value of the outcome property.
     * 
     * @return
     *     possible object is
     *     {@link AuditEventOutcome }
     *     
     */
    public AuditEventOutcome getOutcome() {
        return outcome;
    }

    /**
     * Sets the value of the outcome property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditEventOutcome }
     *     
     */
    public void setOutcome(AuditEventOutcome value) {
        this.outcome = value;
    }

    /**
     * Gets the value of the outcomeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutcomeDesc() {
        return outcomeDesc;
    }

    /**
     * Sets the value of the outcomeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutcomeDesc(String value) {
        this.outcomeDesc = value;
    }

    /**
     * Gets the value of the purposeOfEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purposeOfEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurposeOfEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getPurposeOfEvent() {
        if (purposeOfEvent == null) {
            purposeOfEvent = new ArrayList<CodeableConcept>();
        }
        return this.purposeOfEvent;
    }

    /**
     * Gets the value of the agent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuditEventAgent }
     * 
     * 
     */
    public List<AuditEventAgent> getAgent() {
        if (agent == null) {
            agent = new ArrayList<AuditEventAgent>();
        }
        return this.agent;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link AuditEventSource }
     *     
     */
    public AuditEventSource getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditEventSource }
     *     
     */
    public void setSource(AuditEventSource value) {
        this.source = value;
    }

    /**
     * Gets the value of the entity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuditEventEntity }
     * 
     * 
     */
    public List<AuditEventEntity> getEntity() {
        if (entity == null) {
            entity = new ArrayList<AuditEventEntity>();
        }
        return this.entity;
    }

}
