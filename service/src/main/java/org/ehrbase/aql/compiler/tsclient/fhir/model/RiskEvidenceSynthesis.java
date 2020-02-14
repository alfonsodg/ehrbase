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
 * <p>Java class for RiskEvidenceSynthesis complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RiskEvidenceSynthesis">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="url" type="{http://hl7.org/fhir}uri" minOccurs="0"/>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="version" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}PublicationStatus"/>
 *         &lt;element name="date" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="publisher" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="contact" type="{http://hl7.org/fhir}ContactDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="description" type="{http://hl7.org/fhir}markdown" minOccurs="0"/>
 *         &lt;element name="note" type="{http://hl7.org/fhir}Annotation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="useContext" type="{http://hl7.org/fhir}UsageContext" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="jurisdiction" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="copyright" type="{http://hl7.org/fhir}markdown" minOccurs="0"/>
 *         &lt;element name="approvalDate" type="{http://hl7.org/fhir}date" minOccurs="0"/>
 *         &lt;element name="lastReviewDate" type="{http://hl7.org/fhir}date" minOccurs="0"/>
 *         &lt;element name="effectivePeriod" type="{http://hl7.org/fhir}Period" minOccurs="0"/>
 *         &lt;element name="topic" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="author" type="{http://hl7.org/fhir}ContactDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="editor" type="{http://hl7.org/fhir}ContactDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reviewer" type="{http://hl7.org/fhir}ContactDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="endorser" type="{http://hl7.org/fhir}ContactDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="relatedArtifact" type="{http://hl7.org/fhir}RelatedArtifact" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="synthesisType" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="studyType" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="population" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="exposure" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="outcome" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="sampleSize" type="{http://hl7.org/fhir}RiskEvidenceSynthesis.SampleSize" minOccurs="0"/>
 *         &lt;element name="riskEstimate" type="{http://hl7.org/fhir}RiskEvidenceSynthesis.RiskEstimate" minOccurs="0"/>
 *         &lt;element name="certainty" type="{http://hl7.org/fhir}RiskEvidenceSynthesis.Certainty" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RiskEvidenceSynthesis", propOrder = {
    "url",
    "identifier",
    "version",
    "name",
    "title",
    "status",
    "date",
    "publisher",
    "contact",
    "description",
    "note",
    "useContext",
    "jurisdiction",
    "copyright",
    "approvalDate",
    "lastReviewDate",
    "effectivePeriod",
    "topic",
    "author",
    "editor",
    "reviewer",
    "endorser",
    "relatedArtifact",
    "synthesisType",
    "studyType",
    "population",
    "exposure",
    "outcome",
    "sampleSize",
    "riskEstimate",
    "certainty"
})
public class RiskEvidenceSynthesis
    extends DomainResource
{

    protected Uri url;
    protected List<Identifier> identifier;
    protected String version;
    protected String name;
    protected String title;
    @XmlElement(required = true)
    protected PublicationStatus status;
    protected DateTime date;
    protected String publisher;
    protected List<ContactDetail> contact;
    protected Markdown description;
    protected List<Annotation> note;
    protected List<UsageContext> useContext;
    protected List<CodeableConcept> jurisdiction;
    protected Markdown copyright;
    protected Date approvalDate;
    protected Date lastReviewDate;
    protected Period effectivePeriod;
    protected List<CodeableConcept> topic;
    protected List<ContactDetail> author;
    protected List<ContactDetail> editor;
    protected List<ContactDetail> reviewer;
    protected List<ContactDetail> endorser;
    protected List<RelatedArtifact> relatedArtifact;
    protected CodeableConcept synthesisType;
    protected CodeableConcept studyType;
    @XmlElement(required = true)
    protected Reference population;
    protected Reference exposure;
    @XmlElement(required = true)
    protected Reference outcome;
    protected RiskEvidenceSynthesisSampleSize sampleSize;
    protected RiskEvidenceSynthesisRiskEstimate riskEstimate;
    protected List<RiskEvidenceSynthesisCertainty> certainty;

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setUrl(Uri value) {
        this.url = value;
    }

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
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PublicationStatus }
     *     
     */
    public PublicationStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicationStatus }
     *     
     */
    public void setStatus(PublicationStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setDate(DateTime value) {
        this.date = value;
    }

    /**
     * Gets the value of the publisher property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Sets the value of the publisher property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisher(String value) {
        this.publisher = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactDetail }
     * 
     * 
     */
    public List<ContactDetail> getContact() {
        if (contact == null) {
            contact = new ArrayList<ContactDetail>();
        }
        return this.contact;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Markdown }
     *     
     */
    public Markdown getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Markdown }
     *     
     */
    public void setDescription(Markdown value) {
        this.description = value;
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

    /**
     * Gets the value of the useContext property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the useContext property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUseContext().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UsageContext }
     * 
     * 
     */
    public List<UsageContext> getUseContext() {
        if (useContext == null) {
            useContext = new ArrayList<UsageContext>();
        }
        return this.useContext;
    }

    /**
     * Gets the value of the jurisdiction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jurisdiction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJurisdiction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getJurisdiction() {
        if (jurisdiction == null) {
            jurisdiction = new ArrayList<CodeableConcept>();
        }
        return this.jurisdiction;
    }

    /**
     * Gets the value of the copyright property.
     * 
     * @return
     *     possible object is
     *     {@link Markdown }
     *     
     */
    public Markdown getCopyright() {
        return copyright;
    }

    /**
     * Sets the value of the copyright property.
     * 
     * @param value
     *     allowed object is
     *     {@link Markdown }
     *     
     */
    public void setCopyright(Markdown value) {
        this.copyright = value;
    }

    /**
     * Gets the value of the approvalDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getApprovalDate() {
        return approvalDate;
    }

    /**
     * Sets the value of the approvalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setApprovalDate(Date value) {
        this.approvalDate = value;
    }

    /**
     * Gets the value of the lastReviewDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getLastReviewDate() {
        return lastReviewDate;
    }

    /**
     * Sets the value of the lastReviewDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setLastReviewDate(Date value) {
        this.lastReviewDate = value;
    }

    /**
     * Gets the value of the effectivePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getEffectivePeriod() {
        return effectivePeriod;
    }

    /**
     * Sets the value of the effectivePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setEffectivePeriod(Period value) {
        this.effectivePeriod = value;
    }

    /**
     * Gets the value of the topic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getTopic() {
        if (topic == null) {
            topic = new ArrayList<CodeableConcept>();
        }
        return this.topic;
    }

    /**
     * Gets the value of the author property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the author property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactDetail }
     * 
     * 
     */
    public List<ContactDetail> getAuthor() {
        if (author == null) {
            author = new ArrayList<ContactDetail>();
        }
        return this.author;
    }

    /**
     * Gets the value of the editor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the editor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEditor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactDetail }
     * 
     * 
     */
    public List<ContactDetail> getEditor() {
        if (editor == null) {
            editor = new ArrayList<ContactDetail>();
        }
        return this.editor;
    }

    /**
     * Gets the value of the reviewer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reviewer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReviewer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactDetail }
     * 
     * 
     */
    public List<ContactDetail> getReviewer() {
        if (reviewer == null) {
            reviewer = new ArrayList<ContactDetail>();
        }
        return this.reviewer;
    }

    /**
     * Gets the value of the endorser property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endorser property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndorser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactDetail }
     * 
     * 
     */
    public List<ContactDetail> getEndorser() {
        if (endorser == null) {
            endorser = new ArrayList<ContactDetail>();
        }
        return this.endorser;
    }

    /**
     * Gets the value of the relatedArtifact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedArtifact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedArtifact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedArtifact }
     * 
     * 
     */
    public List<RelatedArtifact> getRelatedArtifact() {
        if (relatedArtifact == null) {
            relatedArtifact = new ArrayList<RelatedArtifact>();
        }
        return this.relatedArtifact;
    }

    /**
     * Gets the value of the synthesisType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getSynthesisType() {
        return synthesisType;
    }

    /**
     * Sets the value of the synthesisType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setSynthesisType(CodeableConcept value) {
        this.synthesisType = value;
    }

    /**
     * Gets the value of the studyType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getStudyType() {
        return studyType;
    }

    /**
     * Sets the value of the studyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setStudyType(CodeableConcept value) {
        this.studyType = value;
    }

    /**
     * Gets the value of the population property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getPopulation() {
        return population;
    }

    /**
     * Sets the value of the population property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setPopulation(Reference value) {
        this.population = value;
    }

    /**
     * Gets the value of the exposure property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getExposure() {
        return exposure;
    }

    /**
     * Sets the value of the exposure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setExposure(Reference value) {
        this.exposure = value;
    }

    /**
     * Gets the value of the outcome property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getOutcome() {
        return outcome;
    }

    /**
     * Sets the value of the outcome property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setOutcome(Reference value) {
        this.outcome = value;
    }

    /**
     * Gets the value of the sampleSize property.
     * 
     * @return
     *     possible object is
     *     {@link RiskEvidenceSynthesisSampleSize }
     *     
     */
    public RiskEvidenceSynthesisSampleSize getSampleSize() {
        return sampleSize;
    }

    /**
     * Sets the value of the sampleSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskEvidenceSynthesisSampleSize }
     *     
     */
    public void setSampleSize(RiskEvidenceSynthesisSampleSize value) {
        this.sampleSize = value;
    }

    /**
     * Gets the value of the riskEstimate property.
     * 
     * @return
     *     possible object is
     *     {@link RiskEvidenceSynthesisRiskEstimate }
     *     
     */
    public RiskEvidenceSynthesisRiskEstimate getRiskEstimate() {
        return riskEstimate;
    }

    /**
     * Sets the value of the riskEstimate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskEvidenceSynthesisRiskEstimate }
     *     
     */
    public void setRiskEstimate(RiskEvidenceSynthesisRiskEstimate value) {
        this.riskEstimate = value;
    }

    /**
     * Gets the value of the certainty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certainty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertainty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RiskEvidenceSynthesisCertainty }
     * 
     * 
     */
    public List<RiskEvidenceSynthesisCertainty> getCertainty() {
        if (certainty == null) {
            certainty = new ArrayList<RiskEvidenceSynthesisCertainty>();
        }
        return this.certainty;
    }

}
