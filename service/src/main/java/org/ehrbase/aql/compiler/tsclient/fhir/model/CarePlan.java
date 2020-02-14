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
 * <p>Java class for CarePlan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarePlan">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="instantiatesCanonical" type="{http://hl7.org/fhir}canonical" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="instantiatesUri" type="{http://hl7.org/fhir}uri" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="basedOn" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="replaces" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="partOf" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}RequestStatus"/>
 *         &lt;element name="intent" type="{http://hl7.org/fhir}CarePlanIntent"/>
 *         &lt;element name="category" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="title" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="subject" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="encounter" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="period" type="{http://hl7.org/fhir}Period" minOccurs="0"/>
 *         &lt;element name="created" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="author" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="contributor" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="careTeam" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="addresses" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="supportingInfo" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="goal" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="activity" type="{http://hl7.org/fhir}CarePlan.Activity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="note" type="{http://hl7.org/fhir}Annotation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarePlan", propOrder = {
    "identifier",
    "instantiatesCanonical",
    "instantiatesUri",
    "basedOn",
    "replaces",
    "partOf",
    "status",
    "intent",
    "category",
    "title",
    "description",
    "subject",
    "encounter",
    "period",
    "created",
    "author",
    "contributor",
    "careTeam",
    "addresses",
    "supportingInfo",
    "goal",
    "activity",
    "note"
})
public class CarePlan
    extends DomainResource
{

    protected List<Identifier> identifier;
    protected List<Canonical> instantiatesCanonical;
    protected List<Uri> instantiatesUri;
    protected List<Reference> basedOn;
    protected List<Reference> replaces;
    protected List<Reference> partOf;
    @XmlElement(required = true)
    protected RequestStatus status;
    @XmlElement(required = true)
    protected CarePlanIntent intent;
    protected List<CodeableConcept> category;
    protected String title;
    protected String description;
    @XmlElement(required = true)
    protected Reference subject;
    protected Reference encounter;
    protected Period period;
    protected DateTime created;
    protected Reference author;
    protected List<Reference> contributor;
    protected List<Reference> careTeam;
    protected List<Reference> addresses;
    protected List<Reference> supportingInfo;
    protected List<Reference> goal;
    protected List<CarePlanActivity> activity;
    protected List<Annotation> note;

    /**
     * Gets the value of the identifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Identifier }
     * 
     * 
     */
    public List<Identifier> getIdentifier() {
        if (identifier == null) {
            identifier = new ArrayList<Identifier>();
        }
        return this.identifier;
    }

    /**
     * Gets the value of the instantiatesCanonical property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instantiatesCanonical property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstantiatesCanonical().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Canonical }
     * 
     * 
     */
    public List<Canonical> getInstantiatesCanonical() {
        if (instantiatesCanonical == null) {
            instantiatesCanonical = new ArrayList<Canonical>();
        }
        return this.instantiatesCanonical;
    }

    /**
     * Gets the value of the instantiatesUri property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instantiatesUri property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstantiatesUri().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Uri }
     * 
     * 
     */
    public List<Uri> getInstantiatesUri() {
        if (instantiatesUri == null) {
            instantiatesUri = new ArrayList<Uri>();
        }
        return this.instantiatesUri;
    }

    /**
     * Gets the value of the basedOn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the basedOn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBasedOn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getBasedOn() {
        if (basedOn == null) {
            basedOn = new ArrayList<Reference>();
        }
        return this.basedOn;
    }

    /**
     * Gets the value of the replaces property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the replaces property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReplaces().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getReplaces() {
        if (replaces == null) {
            replaces = new ArrayList<Reference>();
        }
        return this.replaces;
    }

    /**
     * Gets the value of the partOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getPartOf() {
        if (partOf == null) {
            partOf = new ArrayList<Reference>();
        }
        return this.partOf;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link RequestStatus }
     *     
     */
    public RequestStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestStatus }
     *     
     */
    public void setStatus(RequestStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the intent property.
     * 
     * @return
     *     possible object is
     *     {@link CarePlanIntent }
     *     
     */
    public CarePlanIntent getIntent() {
        return intent;
    }

    /**
     * Sets the value of the intent property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarePlanIntent }
     *     
     */
    public void setIntent(CarePlanIntent value) {
        this.intent = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the category property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getCategory() {
        if (category == null) {
            category = new ArrayList<CodeableConcept>();
        }
        return this.category;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
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
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setSubject(Reference value) {
        this.subject = value;
    }

    /**
     * Gets the value of the encounter property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getEncounter() {
        return encounter;
    }

    /**
     * Sets the value of the encounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setEncounter(Reference value) {
        this.encounter = value;
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
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setCreated(DateTime value) {
        this.created = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setAuthor(Reference value) {
        this.author = value;
    }

    /**
     * Gets the value of the contributor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contributor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContributor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getContributor() {
        if (contributor == null) {
            contributor = new ArrayList<Reference>();
        }
        return this.contributor;
    }

    /**
     * Gets the value of the careTeam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the careTeam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCareTeam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getCareTeam() {
        if (careTeam == null) {
            careTeam = new ArrayList<Reference>();
        }
        return this.careTeam;
    }

    /**
     * Gets the value of the addresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getAddresses() {
        if (addresses == null) {
            addresses = new ArrayList<Reference>();
        }
        return this.addresses;
    }

    /**
     * Gets the value of the supportingInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportingInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getSupportingInfo() {
        if (supportingInfo == null) {
            supportingInfo = new ArrayList<Reference>();
        }
        return this.supportingInfo;
    }

    /**
     * Gets the value of the goal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the goal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getGoal() {
        if (goal == null) {
            goal = new ArrayList<Reference>();
        }
        return this.goal;
    }

    /**
     * Gets the value of the activity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarePlanActivity }
     * 
     * 
     */
    public List<CarePlanActivity> getActivity() {
        if (activity == null) {
            activity = new ArrayList<CarePlanActivity>();
        }
        return this.activity;
    }

    /**
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Annotation }
     * 
     * 
     */
    public List<Annotation> getNote() {
        if (note == null) {
            note = new ArrayList<Annotation>();
        }
        return this.note;
    }

}
