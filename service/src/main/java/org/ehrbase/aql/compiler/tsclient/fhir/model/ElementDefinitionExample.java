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
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * 
 * <p>Java class for ElementDefinition.Example complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElementDefinition.Example">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="label" type="{http://hl7.org/fhir}string"/>
 *         &lt;element name="valueBase64Binary" type="{http://hl7.org/fhir}base64Binary" minOccurs="0"/>
 *         &lt;element name="valueBoolean" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *         &lt;element name="valueCanonical" type="{http://hl7.org/fhir}canonical" minOccurs="0"/>
 *         &lt;element name="valueCode" type="{http://hl7.org/fhir}code" minOccurs="0"/>
 *         &lt;element name="valueDate" type="{http://hl7.org/fhir}date" minOccurs="0"/>
 *         &lt;element name="valueDateTime" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="valueDecimal" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *         &lt;element name="valueId" type="{http://hl7.org/fhir}id" minOccurs="0"/>
 *         &lt;element name="valueInstant" type="{http://hl7.org/fhir}instant" minOccurs="0"/>
 *         &lt;element name="valueInteger" type="{http://hl7.org/fhir}integer" minOccurs="0"/>
 *         &lt;element name="valueMarkdown" type="{http://hl7.org/fhir}markdown" minOccurs="0"/>
 *         &lt;element name="valueOid" type="{http://hl7.org/fhir}oid" minOccurs="0"/>
 *         &lt;element name="valuePositiveInt" type="{http://hl7.org/fhir}positiveInt" minOccurs="0"/>
 *         &lt;element name="valueString" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="valueTime" type="{http://hl7.org/fhir}time" minOccurs="0"/>
 *         &lt;element name="valueUnsignedInt" type="{http://hl7.org/fhir}unsignedInt" minOccurs="0"/>
 *         &lt;element name="valueUri" type="{http://hl7.org/fhir}uri" minOccurs="0"/>
 *         &lt;element name="valueUrl" type="{http://hl7.org/fhir}url" minOccurs="0"/>
 *         &lt;element name="valueUuid" type="{http://hl7.org/fhir}uuid" minOccurs="0"/>
 *         &lt;element name="valueAddress" type="{http://hl7.org/fhir}Address" minOccurs="0"/>
 *         &lt;element name="valueAge" type="{http://hl7.org/fhir}Age" minOccurs="0"/>
 *         &lt;element name="valueAnnotation" type="{http://hl7.org/fhir}Annotation" minOccurs="0"/>
 *         &lt;element name="valueAttachment" type="{http://hl7.org/fhir}Attachment" minOccurs="0"/>
 *         &lt;element name="valueCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="valueCoding" type="{http://hl7.org/fhir}Coding" minOccurs="0"/>
 *         &lt;element name="valueContactPoint" type="{http://hl7.org/fhir}ContactPoint" minOccurs="0"/>
 *         &lt;element name="valueCount" type="{http://hl7.org/fhir}Count" minOccurs="0"/>
 *         &lt;element name="valueDistance" type="{http://hl7.org/fhir}Distance" minOccurs="0"/>
 *         &lt;element name="valueDuration" type="{http://hl7.org/fhir}Duration" minOccurs="0"/>
 *         &lt;element name="valueHumanName" type="{http://hl7.org/fhir}HumanName" minOccurs="0"/>
 *         &lt;element name="valueIdentifier" type="{http://hl7.org/fhir}Identifier" minOccurs="0"/>
 *         &lt;element name="valueMoney" type="{http://hl7.org/fhir}Money" minOccurs="0"/>
 *         &lt;element name="valuePeriod" type="{http://hl7.org/fhir}Period" minOccurs="0"/>
 *         &lt;element name="valueQuantity" type="{http://hl7.org/fhir}Quantity" minOccurs="0"/>
 *         &lt;element name="valueRange" type="{http://hl7.org/fhir}Range" minOccurs="0"/>
 *         &lt;element name="valueRatio" type="{http://hl7.org/fhir}Ratio" minOccurs="0"/>
 *         &lt;element name="valueReference" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="valueSampledData" type="{http://hl7.org/fhir}SampledData" minOccurs="0"/>
 *         &lt;element name="valueSignature" type="{http://hl7.org/fhir}Signature" minOccurs="0"/>
 *         &lt;element name="valueTiming" type="{http://hl7.org/fhir}Timing" minOccurs="0"/>
 *         &lt;element name="valueContactDetail" type="{http://hl7.org/fhir}ContactDetail" minOccurs="0"/>
 *         &lt;element name="valueContributor" type="{http://hl7.org/fhir}Contributor" minOccurs="0"/>
 *         &lt;element name="valueDataRequirement" type="{http://hl7.org/fhir}DataRequirement" minOccurs="0"/>
 *         &lt;element name="valueExpression" type="{http://hl7.org/fhir}Expression" minOccurs="0"/>
 *         &lt;element name="valueParameterDefinition" type="{http://hl7.org/fhir}ParameterDefinition" minOccurs="0"/>
 *         &lt;element name="valueRelatedArtifact" type="{http://hl7.org/fhir}RelatedArtifact" minOccurs="0"/>
 *         &lt;element name="valueTriggerDefinition" type="{http://hl7.org/fhir}TriggerDefinition" minOccurs="0"/>
 *         &lt;element name="valueUsageContext" type="{http://hl7.org/fhir}UsageContext" minOccurs="0"/>
 *         &lt;element name="valueDosage" type="{http://hl7.org/fhir}Dosage" minOccurs="0"/>
 *         &lt;element name="valueMeta" type="{http://hl7.org/fhir}Meta" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementDefinition.Example", propOrder = {
    "label",
    "valueBase64Binary",
    "valueBoolean",
    "valueCanonical",
    "valueCode",
    "valueDate",
    "valueDateTime",
    "valueDecimal",
    "valueId",
    "valueInstant",
    "valueInteger",
    "valueMarkdown",
    "valueOid",
    "valuePositiveInt",
    "valueString",
    "valueTime",
    "valueUnsignedInt",
    "valueUri",
    "valueUrl",
    "valueUuid",
    "valueAddress",
    "valueAge",
    "valueAnnotation",
    "valueAttachment",
    "valueCodeableConcept",
    "valueCoding",
    "valueContactPoint",
    "valueCount",
    "valueDistance",
    "valueDuration",
    "valueHumanName",
    "valueIdentifier",
    "valueMoney",
    "valuePeriod",
    "valueQuantity",
    "valueRange",
    "valueRatio",
    "valueReference",
    "valueSampledData",
    "valueSignature",
    "valueTiming",
    "valueContactDetail",
    "valueContributor",
    "valueDataRequirement",
    "valueExpression",
    "valueParameterDefinition",
    "valueRelatedArtifact",
    "valueTriggerDefinition",
    "valueUsageContext",
    "valueDosage",
    "valueMeta"
})
public class ElementDefinitionExample
    extends BackboneElement
{

    @XmlElement(required = true)
    protected String label;
    protected Base64Binary valueBase64Binary;
    protected Boolean valueBoolean;
    protected Canonical valueCanonical;
    protected Code valueCode;
    protected Date valueDate;
    protected DateTime valueDateTime;
    protected Decimal valueDecimal;
    protected Id valueId;
    protected Instant valueInstant;
    protected Integer valueInteger;
    protected Markdown valueMarkdown;
    protected Oid valueOid;
    protected PositiveInt valuePositiveInt;
    protected String valueString;
    protected Time valueTime;
    protected UnsignedInt valueUnsignedInt;
    protected Uri valueUri;
    protected Url valueUrl;
    protected Uuid valueUuid;
    protected Address valueAddress;
    protected Age valueAge;
    protected Annotation valueAnnotation;
    protected Attachment valueAttachment;
    protected CodeableConcept valueCodeableConcept;
    protected Coding valueCoding;
    protected ContactPoint valueContactPoint;
    protected Count valueCount;
    protected Distance valueDistance;
    protected Duration valueDuration;
    protected HumanName valueHumanName;
    protected Identifier valueIdentifier;
    protected Money valueMoney;
    protected Period valuePeriod;
    protected Quantity valueQuantity;
    protected Range valueRange;
    protected Ratio valueRatio;
    protected Reference valueReference;
    protected SampledData valueSampledData;
    protected Signature valueSignature;
    protected Timing valueTiming;
    protected ContactDetail valueContactDetail;
    protected Contributor valueContributor;
    protected DataRequirement valueDataRequirement;
    protected Expression valueExpression;
    protected ParameterDefinition valueParameterDefinition;
    protected RelatedArtifact valueRelatedArtifact;
    protected TriggerDefinition valueTriggerDefinition;
    protected UsageContext valueUsageContext;
    protected Dosage valueDosage;
    protected Meta valueMeta;

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the valueBase64Binary property.
     * 
     * @return
     *     possible object is
     *     {@link Base64Binary }
     *     
     */
    public Base64Binary getValueBase64Binary() {
        return valueBase64Binary;
    }

    /**
     * Sets the value of the valueBase64Binary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Base64Binary }
     *     
     */
    public void setValueBase64Binary(Base64Binary value) {
        this.valueBase64Binary = value;
    }

    /**
     * Gets the value of the valueBoolean property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getValueBoolean() {
        return valueBoolean;
    }

    /**
     * Sets the value of the valueBoolean property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValueBoolean(Boolean value) {
        this.valueBoolean = value;
    }

    /**
     * Gets the value of the valueCanonical property.
     * 
     * @return
     *     possible object is
     *     {@link Canonical }
     *     
     */
    public Canonical getValueCanonical() {
        return valueCanonical;
    }

    /**
     * Sets the value of the valueCanonical property.
     * 
     * @param value
     *     allowed object is
     *     {@link Canonical }
     *     
     */
    public void setValueCanonical(Canonical value) {
        this.valueCanonical = value;
    }

    /**
     * Gets the value of the valueCode property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getValueCode() {
        return valueCode;
    }

    /**
     * Sets the value of the valueCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setValueCode(Code value) {
        this.valueCode = value;
    }

    /**
     * Gets the value of the valueDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getValueDate() {
        return valueDate;
    }

    /**
     * Sets the value of the valueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setValueDate(Date value) {
        this.valueDate = value;
    }

    /**
     * Gets the value of the valueDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getValueDateTime() {
        return valueDateTime;
    }

    /**
     * Sets the value of the valueDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setValueDateTime(DateTime value) {
        this.valueDateTime = value;
    }

    /**
     * Gets the value of the valueDecimal property.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getValueDecimal() {
        return valueDecimal;
    }

    /**
     * Sets the value of the valueDecimal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setValueDecimal(Decimal value) {
        this.valueDecimal = value;
    }

    /**
     * Gets the value of the valueId property.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getValueId() {
        return valueId;
    }

    /**
     * Sets the value of the valueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setValueId(Id value) {
        this.valueId = value;
    }

    /**
     * Gets the value of the valueInstant property.
     * 
     * @return
     *     possible object is
     *     {@link Instant }
     *     
     */
    public Instant getValueInstant() {
        return valueInstant;
    }

    /**
     * Sets the value of the valueInstant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Instant }
     *     
     */
    public void setValueInstant(Instant value) {
        this.valueInstant = value;
    }

    /**
     * Gets the value of the valueInteger property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValueInteger() {
        return valueInteger;
    }

    /**
     * Sets the value of the valueInteger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValueInteger(Integer value) {
        this.valueInteger = value;
    }

    /**
     * Gets the value of the valueMarkdown property.
     * 
     * @return
     *     possible object is
     *     {@link Markdown }
     *     
     */
    public Markdown getValueMarkdown() {
        return valueMarkdown;
    }

    /**
     * Sets the value of the valueMarkdown property.
     * 
     * @param value
     *     allowed object is
     *     {@link Markdown }
     *     
     */
    public void setValueMarkdown(Markdown value) {
        this.valueMarkdown = value;
    }

    /**
     * Gets the value of the valueOid property.
     * 
     * @return
     *     possible object is
     *     {@link Oid }
     *     
     */
    public Oid getValueOid() {
        return valueOid;
    }

    /**
     * Sets the value of the valueOid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Oid }
     *     
     */
    public void setValueOid(Oid value) {
        this.valueOid = value;
    }

    /**
     * Gets the value of the valuePositiveInt property.
     * 
     * @return
     *     possible object is
     *     {@link PositiveInt }
     *     
     */
    public PositiveInt getValuePositiveInt() {
        return valuePositiveInt;
    }

    /**
     * Sets the value of the valuePositiveInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveInt }
     *     
     */
    public void setValuePositiveInt(PositiveInt value) {
        this.valuePositiveInt = value;
    }

    /**
     * Gets the value of the valueString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueString() {
        return valueString;
    }

    /**
     * Sets the value of the valueString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueString(String value) {
        this.valueString = value;
    }

    /**
     * Gets the value of the valueTime property.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getValueTime() {
        return valueTime;
    }

    /**
     * Sets the value of the valueTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setValueTime(Time value) {
        this.valueTime = value;
    }

    /**
     * Gets the value of the valueUnsignedInt property.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedInt }
     *     
     */
    public UnsignedInt getValueUnsignedInt() {
        return valueUnsignedInt;
    }

    /**
     * Sets the value of the valueUnsignedInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedInt }
     *     
     */
    public void setValueUnsignedInt(UnsignedInt value) {
        this.valueUnsignedInt = value;
    }

    /**
     * Gets the value of the valueUri property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getValueUri() {
        return valueUri;
    }

    /**
     * Sets the value of the valueUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setValueUri(Uri value) {
        this.valueUri = value;
    }

    /**
     * Gets the value of the valueUrl property.
     * 
     * @return
     *     possible object is
     *     {@link Url }
     *     
     */
    public Url getValueUrl() {
        return valueUrl;
    }

    /**
     * Sets the value of the valueUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Url }
     *     
     */
    public void setValueUrl(Url value) {
        this.valueUrl = value;
    }

    /**
     * Gets the value of the valueUuid property.
     * 
     * @return
     *     possible object is
     *     {@link Uuid }
     *     
     */
    public Uuid getValueUuid() {
        return valueUuid;
    }

    /**
     * Sets the value of the valueUuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uuid }
     *     
     */
    public void setValueUuid(Uuid value) {
        this.valueUuid = value;
    }

    /**
     * Gets the value of the valueAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getValueAddress() {
        return valueAddress;
    }

    /**
     * Sets the value of the valueAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setValueAddress(Address value) {
        this.valueAddress = value;
    }

    /**
     * Gets the value of the valueAge property.
     * 
     * @return
     *     possible object is
     *     {@link Age }
     *     
     */
    public Age getValueAge() {
        return valueAge;
    }

    /**
     * Sets the value of the valueAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Age }
     *     
     */
    public void setValueAge(Age value) {
        this.valueAge = value;
    }

    /**
     * Gets the value of the valueAnnotation property.
     * 
     * @return
     *     possible object is
     *     {@link Annotation }
     *     
     */
    public Annotation getValueAnnotation() {
        return valueAnnotation;
    }

    /**
     * Sets the value of the valueAnnotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Annotation }
     *     
     */
    public void setValueAnnotation(Annotation value) {
        this.valueAnnotation = value;
    }

    /**
     * Gets the value of the valueAttachment property.
     * 
     * @return
     *     possible object is
     *     {@link Attachment }
     *     
     */
    public Attachment getValueAttachment() {
        return valueAttachment;
    }

    /**
     * Sets the value of the valueAttachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachment }
     *     
     */
    public void setValueAttachment(Attachment value) {
        this.valueAttachment = value;
    }

    /**
     * Gets the value of the valueCodeableConcept property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getValueCodeableConcept() {
        return valueCodeableConcept;
    }

    /**
     * Sets the value of the valueCodeableConcept property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setValueCodeableConcept(CodeableConcept value) {
        this.valueCodeableConcept = value;
    }

    /**
     * Gets the value of the valueCoding property.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getValueCoding() {
        return valueCoding;
    }

    /**
     * Sets the value of the valueCoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setValueCoding(Coding value) {
        this.valueCoding = value;
    }

    /**
     * Gets the value of the valueContactPoint property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPoint }
     *     
     */
    public ContactPoint getValueContactPoint() {
        return valueContactPoint;
    }

    /**
     * Sets the value of the valueContactPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPoint }
     *     
     */
    public void setValueContactPoint(ContactPoint value) {
        this.valueContactPoint = value;
    }

    /**
     * Gets the value of the valueCount property.
     * 
     * @return
     *     possible object is
     *     {@link Count }
     *     
     */
    public Count getValueCount() {
        return valueCount;
    }

    /**
     * Sets the value of the valueCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Count }
     *     
     */
    public void setValueCount(Count value) {
        this.valueCount = value;
    }

    /**
     * Gets the value of the valueDistance property.
     * 
     * @return
     *     possible object is
     *     {@link Distance }
     *     
     */
    public Distance getValueDistance() {
        return valueDistance;
    }

    /**
     * Sets the value of the valueDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distance }
     *     
     */
    public void setValueDistance(Distance value) {
        this.valueDistance = value;
    }

    /**
     * Gets the value of the valueDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getValueDuration() {
        return valueDuration;
    }

    /**
     * Sets the value of the valueDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setValueDuration(Duration value) {
        this.valueDuration = value;
    }

    /**
     * Gets the value of the valueHumanName property.
     * 
     * @return
     *     possible object is
     *     {@link HumanName }
     *     
     */
    public HumanName getValueHumanName() {
        return valueHumanName;
    }

    /**
     * Sets the value of the valueHumanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link HumanName }
     *     
     */
    public void setValueHumanName(HumanName value) {
        this.valueHumanName = value;
    }

    /**
     * Gets the value of the valueIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getValueIdentifier() {
        return valueIdentifier;
    }

    /**
     * Sets the value of the valueIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setValueIdentifier(Identifier value) {
        this.valueIdentifier = value;
    }

    /**
     * Gets the value of the valueMoney property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getValueMoney() {
        return valueMoney;
    }

    /**
     * Sets the value of the valueMoney property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setValueMoney(Money value) {
        this.valueMoney = value;
    }

    /**
     * Gets the value of the valuePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getValuePeriod() {
        return valuePeriod;
    }

    /**
     * Sets the value of the valuePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setValuePeriod(Period value) {
        this.valuePeriod = value;
    }

    /**
     * Gets the value of the valueQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getValueQuantity() {
        return valueQuantity;
    }

    /**
     * Sets the value of the valueQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setValueQuantity(Quantity value) {
        this.valueQuantity = value;
    }

    /**
     * Gets the value of the valueRange property.
     * 
     * @return
     *     possible object is
     *     {@link Range }
     *     
     */
    public Range getValueRange() {
        return valueRange;
    }

    /**
     * Sets the value of the valueRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Range }
     *     
     */
    public void setValueRange(Range value) {
        this.valueRange = value;
    }

    /**
     * Gets the value of the valueRatio property.
     * 
     * @return
     *     possible object is
     *     {@link Ratio }
     *     
     */
    public Ratio getValueRatio() {
        return valueRatio;
    }

    /**
     * Sets the value of the valueRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ratio }
     *     
     */
    public void setValueRatio(Ratio value) {
        this.valueRatio = value;
    }

    /**
     * Gets the value of the valueReference property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getValueReference() {
        return valueReference;
    }

    /**
     * Sets the value of the valueReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setValueReference(Reference value) {
        this.valueReference = value;
    }

    /**
     * Gets the value of the valueSampledData property.
     * 
     * @return
     *     possible object is
     *     {@link SampledData }
     *     
     */
    public SampledData getValueSampledData() {
        return valueSampledData;
    }

    /**
     * Sets the value of the valueSampledData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SampledData }
     *     
     */
    public void setValueSampledData(SampledData value) {
        this.valueSampledData = value;
    }

    /**
     * Gets the value of the valueSignature property.
     * 
     * @return
     *     possible object is
     *     {@link Signature }
     *     
     */
    public Signature getValueSignature() {
        return valueSignature;
    }

    /**
     * Sets the value of the valueSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Signature }
     *     
     */
    public void setValueSignature(Signature value) {
        this.valueSignature = value;
    }

    /**
     * Gets the value of the valueTiming property.
     * 
     * @return
     *     possible object is
     *     {@link Timing }
     *     
     */
    public Timing getValueTiming() {
        return valueTiming;
    }

    /**
     * Sets the value of the valueTiming property.
     * 
     * @param value
     *     allowed object is
     *     {@link Timing }
     *     
     */
    public void setValueTiming(Timing value) {
        this.valueTiming = value;
    }

    /**
     * Gets the value of the valueContactDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ContactDetail }
     *     
     */
    public ContactDetail getValueContactDetail() {
        return valueContactDetail;
    }

    /**
     * Sets the value of the valueContactDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDetail }
     *     
     */
    public void setValueContactDetail(ContactDetail value) {
        this.valueContactDetail = value;
    }

    /**
     * Gets the value of the valueContributor property.
     * 
     * @return
     *     possible object is
     *     {@link Contributor }
     *     
     */
    public Contributor getValueContributor() {
        return valueContributor;
    }

    /**
     * Sets the value of the valueContributor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contributor }
     *     
     */
    public void setValueContributor(Contributor value) {
        this.valueContributor = value;
    }

    /**
     * Gets the value of the valueDataRequirement property.
     * 
     * @return
     *     possible object is
     *     {@link DataRequirement }
     *     
     */
    public DataRequirement getValueDataRequirement() {
        return valueDataRequirement;
    }

    /**
     * Sets the value of the valueDataRequirement property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataRequirement }
     *     
     */
    public void setValueDataRequirement(DataRequirement value) {
        this.valueDataRequirement = value;
    }

    /**
     * Gets the value of the valueExpression property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getValueExpression() {
        return valueExpression;
    }

    /**
     * Sets the value of the valueExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setValueExpression(Expression value) {
        this.valueExpression = value;
    }

    /**
     * Gets the value of the valueParameterDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link ParameterDefinition }
     *     
     */
    public ParameterDefinition getValueParameterDefinition() {
        return valueParameterDefinition;
    }

    /**
     * Sets the value of the valueParameterDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterDefinition }
     *     
     */
    public void setValueParameterDefinition(ParameterDefinition value) {
        this.valueParameterDefinition = value;
    }

    /**
     * Gets the value of the valueRelatedArtifact property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedArtifact }
     *     
     */
    public RelatedArtifact getValueRelatedArtifact() {
        return valueRelatedArtifact;
    }

    /**
     * Sets the value of the valueRelatedArtifact property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedArtifact }
     *     
     */
    public void setValueRelatedArtifact(RelatedArtifact value) {
        this.valueRelatedArtifact = value;
    }

    /**
     * Gets the value of the valueTriggerDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerDefinition }
     *     
     */
    public TriggerDefinition getValueTriggerDefinition() {
        return valueTriggerDefinition;
    }

    /**
     * Sets the value of the valueTriggerDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerDefinition }
     *     
     */
    public void setValueTriggerDefinition(TriggerDefinition value) {
        this.valueTriggerDefinition = value;
    }

    /**
     * Gets the value of the valueUsageContext property.
     * 
     * @return
     *     possible object is
     *     {@link UsageContext }
     *     
     */
    public UsageContext getValueUsageContext() {
        return valueUsageContext;
    }

    /**
     * Sets the value of the valueUsageContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsageContext }
     *     
     */
    public void setValueUsageContext(UsageContext value) {
        this.valueUsageContext = value;
    }

    /**
     * Gets the value of the valueDosage property.
     * 
     * @return
     *     possible object is
     *     {@link Dosage }
     *     
     */
    public Dosage getValueDosage() {
        return valueDosage;
    }

    /**
     * Sets the value of the valueDosage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dosage }
     *     
     */
    public void setValueDosage(Dosage value) {
        this.valueDosage = value;
    }

    /**
     * Gets the value of the valueMeta property.
     * 
     * @return
     *     possible object is
     *     {@link Meta }
     *     
     */
    public Meta getValueMeta() {
        return valueMeta;
    }

    /**
     * Sets the value of the valueMeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meta }
     *     
     */
    public void setValueMeta(Meta value) {
        this.valueMeta = value;
    }

}
