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
 * A patient's point-in-time set of recommendations (i.e. forecasting) according to a published schedule with optional supporting justification.
 * 
 * <p>Java class for ImmunizationRecommendation.Recommendation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImmunizationRecommendation.Recommendation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="vaccineCode" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="targetDisease" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="contraindicatedVaccineCode" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="forecastStatus" type="{http://hl7.org/fhir}CodeableConcept"/>
 *         &lt;element name="forecastReason" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dateCriterion" type="{http://hl7.org/fhir}ImmunizationRecommendation.DateCriterion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="series" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="doseNumberPositiveInt" type="{http://hl7.org/fhir}positiveInt" minOccurs="0"/>
 *         &lt;element name="doseNumberString" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="seriesDosesPositiveInt" type="{http://hl7.org/fhir}positiveInt" minOccurs="0"/>
 *         &lt;element name="seriesDosesString" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="supportingImmunization" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="supportingPatientInformation" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImmunizationRecommendation.Recommendation", propOrder = {
    "vaccineCode",
    "targetDisease",
    "contraindicatedVaccineCode",
    "forecastStatus",
    "forecastReason",
    "dateCriterion",
    "description",
    "series",
    "doseNumberPositiveInt",
    "doseNumberString",
    "seriesDosesPositiveInt",
    "seriesDosesString",
    "supportingImmunization",
    "supportingPatientInformation"
})
public class ImmunizationRecommendationRecommendation
    extends BackboneElement
{

    protected List<CodeableConcept> vaccineCode;
    protected CodeableConcept targetDisease;
    protected List<CodeableConcept> contraindicatedVaccineCode;
    @XmlElement(required = true)
    protected CodeableConcept forecastStatus;
    protected List<CodeableConcept> forecastReason;
    protected List<ImmunizationRecommendationDateCriterion> dateCriterion;
    protected String description;
    protected String series;
    protected PositiveInt doseNumberPositiveInt;
    protected String doseNumberString;
    protected PositiveInt seriesDosesPositiveInt;
    protected String seriesDosesString;
    protected List<Reference> supportingImmunization;
    protected List<Reference> supportingPatientInformation;

    /**
     * Gets the value of the vaccineCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vaccineCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVaccineCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getVaccineCode() {
        if (vaccineCode == null) {
            vaccineCode = new ArrayList<CodeableConcept>();
        }
        return this.vaccineCode;
    }

    /**
     * Gets the value of the targetDisease property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getTargetDisease() {
        return targetDisease;
    }

    /**
     * Sets the value of the targetDisease property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setTargetDisease(CodeableConcept value) {
        this.targetDisease = value;
    }

    /**
     * Gets the value of the contraindicatedVaccineCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contraindicatedVaccineCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContraindicatedVaccineCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getContraindicatedVaccineCode() {
        if (contraindicatedVaccineCode == null) {
            contraindicatedVaccineCode = new ArrayList<CodeableConcept>();
        }
        return this.contraindicatedVaccineCode;
    }

    /**
     * Gets the value of the forecastStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getForecastStatus() {
        return forecastStatus;
    }

    /**
     * Sets the value of the forecastStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setForecastStatus(CodeableConcept value) {
        this.forecastStatus = value;
    }

    /**
     * Gets the value of the forecastReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forecastReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForecastReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getForecastReason() {
        if (forecastReason == null) {
            forecastReason = new ArrayList<CodeableConcept>();
        }
        return this.forecastReason;
    }

    /**
     * Gets the value of the dateCriterion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateCriterion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateCriterion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImmunizationRecommendationDateCriterion }
     * 
     * 
     */
    public List<ImmunizationRecommendationDateCriterion> getDateCriterion() {
        if (dateCriterion == null) {
            dateCriterion = new ArrayList<ImmunizationRecommendationDateCriterion>();
        }
        return this.dateCriterion;
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
     * Gets the value of the series property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeries() {
        return series;
    }

    /**
     * Sets the value of the series property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeries(String value) {
        this.series = value;
    }

    /**
     * Gets the value of the doseNumberPositiveInt property.
     * 
     * @return
     *     possible object is
     *     {@link PositiveInt }
     *     
     */
    public PositiveInt getDoseNumberPositiveInt() {
        return doseNumberPositiveInt;
    }

    /**
     * Sets the value of the doseNumberPositiveInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveInt }
     *     
     */
    public void setDoseNumberPositiveInt(PositiveInt value) {
        this.doseNumberPositiveInt = value;
    }

    /**
     * Gets the value of the doseNumberString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoseNumberString() {
        return doseNumberString;
    }

    /**
     * Sets the value of the doseNumberString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoseNumberString(String value) {
        this.doseNumberString = value;
    }

    /**
     * Gets the value of the seriesDosesPositiveInt property.
     * 
     * @return
     *     possible object is
     *     {@link PositiveInt }
     *     
     */
    public PositiveInt getSeriesDosesPositiveInt() {
        return seriesDosesPositiveInt;
    }

    /**
     * Sets the value of the seriesDosesPositiveInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveInt }
     *     
     */
    public void setSeriesDosesPositiveInt(PositiveInt value) {
        this.seriesDosesPositiveInt = value;
    }

    /**
     * Gets the value of the seriesDosesString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeriesDosesString() {
        return seriesDosesString;
    }

    /**
     * Sets the value of the seriesDosesString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeriesDosesString(String value) {
        this.seriesDosesString = value;
    }

    /**
     * Gets the value of the supportingImmunization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportingImmunization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportingImmunization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getSupportingImmunization() {
        if (supportingImmunization == null) {
            supportingImmunization = new ArrayList<Reference>();
        }
        return this.supportingImmunization;
    }

    /**
     * Gets the value of the supportingPatientInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportingPatientInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportingPatientInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getSupportingPatientInformation() {
        if (supportingPatientInformation == null) {
            supportingPatientInformation = new ArrayList<Reference>();
        }
        return this.supportingPatientInformation;
    }

}
