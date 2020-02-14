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
 * <p>Java class for OperationDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="url" type="{http://hl7.org/fhir}uri" minOccurs="0"/>
 *         &lt;element name="version" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://hl7.org/fhir}string"/>
 *         &lt;element name="title" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}PublicationStatus"/>
 *         &lt;element name="kind" type="{http://hl7.org/fhir}OperationKind"/>
 *         &lt;element name="experimental" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="date" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="publisher" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="contact" type="{http://hl7.org/fhir}ContactDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="description" type="{http://hl7.org/fhir}markdown" minOccurs="0"/>
 *         &lt;element name="useContext" type="{http://hl7.org/fhir}UsageContext" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="jurisdiction" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="purpose" type="{http://hl7.org/fhir}markdown" minOccurs="0"/>
 *         &lt;element name="affectsState" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="code" type="{http://hl7.org/fhir}code"/>
 *         &lt;element name="comment" type="{http://hl7.org/fhir}markdown" minOccurs="0"/>
 *         &lt;element name="base" type="{http://hl7.org/fhir}canonical" minOccurs="0"/>
 *         &lt;element name="resource" type="{http://hl7.org/fhir}code" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="system" type="{http://hl7.org/fhir}boolean"/>
 *         &lt;element name="type" type="{http://hl7.org/fhir}boolean"/>
 *         &lt;element name="instance" type="{http://hl7.org/fhir}boolean"/>
 *         &lt;element name="inputProfile" type="{http://hl7.org/fhir}canonical" minOccurs="0"/>
 *         &lt;element name="outputProfile" type="{http://hl7.org/fhir}canonical" minOccurs="0"/>
 *         &lt;element name="parameter" type="{http://hl7.org/fhir}OperationDefinition.Parameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="overload" type="{http://hl7.org/fhir}OperationDefinition.Overload" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationDefinition", propOrder = {
    "url",
    "version",
    "name",
    "title",
    "status",
    "kind",
    "experimental",
    "date",
    "publisher",
    "contact",
    "description",
    "useContext",
    "jurisdiction",
    "purpose",
    "affectsState",
    "code",
    "comment",
    "base",
    "resource",
    "system",
    "type",
    "instance",
    "inputProfile",
    "outputProfile",
    "parameter",
    "overload"
})
public class OperationDefinition
    extends DomainResource
{

    protected Uri url;
    protected String version;
    @XmlElement(required = true)
    protected String name;
    protected String title;
    @XmlElement(required = true)
    protected PublicationStatus status;
    @XmlElement(required = true)
    protected OperationKind kind;
    protected Boolean experimental;
    protected DateTime date;
    protected String publisher;
    protected List<ContactDetail> contact;
    protected Markdown description;
    protected List<UsageContext> useContext;
    protected List<CodeableConcept> jurisdiction;
    protected Markdown purpose;
    protected Boolean affectsState;
    @XmlElement(required = true)
    protected Code code;
    protected Markdown comment;
    protected Canonical base;
    protected List<Code> resource;
    @XmlElement(required = true)
    protected Boolean system;
    @XmlElement(required = true)
    protected Boolean type;
    @XmlElement(required = true)
    protected Boolean instance;
    protected Canonical inputProfile;
    protected Canonical outputProfile;
    protected List<OperationDefinitionParameter> parameter;
    protected List<OperationDefinitionOverload> overload;

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
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link OperationKind }
     *     
     */
    public OperationKind getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationKind }
     *     
     */
    public void setKind(OperationKind value) {
        this.kind = value;
    }

    /**
     * Gets the value of the experimental property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getExperimental() {
        return experimental;
    }

    /**
     * Sets the value of the experimental property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExperimental(Boolean value) {
        this.experimental = value;
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
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link Markdown }
     *     
     */
    public Markdown getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link Markdown }
     *     
     */
    public void setPurpose(Markdown value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the affectsState property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAffectsState() {
        return affectsState;
    }

    /**
     * Sets the value of the affectsState property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAffectsState(Boolean value) {
        this.affectsState = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setCode(Code value) {
        this.code = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link Markdown }
     *     
     */
    public Markdown getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Markdown }
     *     
     */
    public void setComment(Markdown value) {
        this.comment = value;
    }

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link Canonical }
     *     
     */
    public Canonical getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link Canonical }
     *     
     */
    public void setBase(Canonical value) {
        this.base = value;
    }

    /**
     * Gets the value of the resource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Code }
     * 
     * 
     */
    public List<Code> getResource() {
        if (resource == null) {
            resource = new ArrayList<Code>();
        }
        return this.resource;
    }

    /**
     * Gets the value of the system property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getSystem() {
        return system;
    }

    /**
     * Sets the value of the system property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSystem(Boolean value) {
        this.system = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setType(Boolean value) {
        this.type = value;
    }

    /**
     * Gets the value of the instance property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getInstance() {
        return instance;
    }

    /**
     * Sets the value of the instance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInstance(Boolean value) {
        this.instance = value;
    }

    /**
     * Gets the value of the inputProfile property.
     * 
     * @return
     *     possible object is
     *     {@link Canonical }
     *     
     */
    public Canonical getInputProfile() {
        return inputProfile;
    }

    /**
     * Sets the value of the inputProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Canonical }
     *     
     */
    public void setInputProfile(Canonical value) {
        this.inputProfile = value;
    }

    /**
     * Gets the value of the outputProfile property.
     * 
     * @return
     *     possible object is
     *     {@link Canonical }
     *     
     */
    public Canonical getOutputProfile() {
        return outputProfile;
    }

    /**
     * Sets the value of the outputProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Canonical }
     *     
     */
    public void setOutputProfile(Canonical value) {
        this.outputProfile = value;
    }

    /**
     * Gets the value of the parameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationDefinitionParameter }
     * 
     * 
     */
    public List<OperationDefinitionParameter> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<OperationDefinitionParameter>();
        }
        return this.parameter;
    }

    /**
     * Gets the value of the overload property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overload property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverload().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationDefinitionOverload }
     * 
     * 
     */
    public List<OperationDefinitionOverload> getOverload() {
        if (overload == null) {
            overload = new ArrayList<OperationDefinitionOverload>();
        }
        return this.overload;
    }

}
