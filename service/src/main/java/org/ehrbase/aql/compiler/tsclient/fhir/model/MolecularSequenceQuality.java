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
 * Raw data describing a biological sequence.
 * 
 * <p>Java class for MolecularSequence.Quality complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MolecularSequence.Quality">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://hl7.org/fhir}qualityType"/>
 *         &lt;element name="standardSequence" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="start" type="{http://hl7.org/fhir}integer" minOccurs="0"/>
 *         &lt;element name="end" type="{http://hl7.org/fhir}integer" minOccurs="0"/>
 *         &lt;element name="score" type="{http://hl7.org/fhir}Quantity" minOccurs="0"/>
 *         &lt;element name="method" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="truthTP" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *         &lt;element name="queryTP" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *         &lt;element name="truthFN" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *         &lt;element name="queryFP" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *         &lt;element name="gtFP" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *         &lt;element name="precision" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *         &lt;element name="recall" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *         &lt;element name="fScore" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *         &lt;element name="roc" type="{http://hl7.org/fhir}MolecularSequence.Roc" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MolecularSequence.Quality", propOrder = {
    "type",
    "standardSequence",
    "start",
    "end",
    "score",
    "method",
    "truthTP",
    "queryTP",
    "truthFN",
    "queryFP",
    "gtFP",
    "precision",
    "recall",
    "fScore",
    "roc"
})
public class MolecularSequenceQuality
    extends BackboneElement
{

    @XmlElement(required = true)
    protected QualityType type;
    protected CodeableConcept standardSequence;
    protected Integer start;
    protected Integer end;
    protected Quantity score;
    protected CodeableConcept method;
    protected Decimal truthTP;
    protected Decimal queryTP;
    protected Decimal truthFN;
    protected Decimal queryFP;
    protected Decimal gtFP;
    protected Decimal precision;
    protected Decimal recall;
    protected Decimal fScore;
    protected MolecularSequenceRoc roc;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link QualityType }
     *     
     */
    public QualityType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityType }
     *     
     */
    public void setType(QualityType value) {
        this.type = value;
    }

    /**
     * Gets the value of the standardSequence property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getStandardSequence() {
        return standardSequence;
    }

    /**
     * Sets the value of the standardSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setStandardSequence(CodeableConcept value) {
        this.standardSequence = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStart(Integer value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEnd(Integer value) {
        this.end = value;
    }

    /**
     * Gets the value of the score property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setScore(Quantity value) {
        this.score = value;
    }

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setMethod(CodeableConcept value) {
        this.method = value;
    }

    /**
     * Gets the value of the truthTP property.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getTruthTP() {
        return truthTP;
    }

    /**
     * Sets the value of the truthTP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setTruthTP(Decimal value) {
        this.truthTP = value;
    }

    /**
     * Gets the value of the queryTP property.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getQueryTP() {
        return queryTP;
    }

    /**
     * Sets the value of the queryTP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setQueryTP(Decimal value) {
        this.queryTP = value;
    }

    /**
     * Gets the value of the truthFN property.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getTruthFN() {
        return truthFN;
    }

    /**
     * Sets the value of the truthFN property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setTruthFN(Decimal value) {
        this.truthFN = value;
    }

    /**
     * Gets the value of the queryFP property.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getQueryFP() {
        return queryFP;
    }

    /**
     * Sets the value of the queryFP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setQueryFP(Decimal value) {
        this.queryFP = value;
    }

    /**
     * Gets the value of the gtFP property.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getGtFP() {
        return gtFP;
    }

    /**
     * Sets the value of the gtFP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setGtFP(Decimal value) {
        this.gtFP = value;
    }

    /**
     * Gets the value of the precision property.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getPrecision() {
        return precision;
    }

    /**
     * Sets the value of the precision property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setPrecision(Decimal value) {
        this.precision = value;
    }

    /**
     * Gets the value of the recall property.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getRecall() {
        return recall;
    }

    /**
     * Sets the value of the recall property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setRecall(Decimal value) {
        this.recall = value;
    }

    /**
     * Gets the value of the fScore property.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getFScore() {
        return fScore;
    }

    /**
     * Sets the value of the fScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setFScore(Decimal value) {
        this.fScore = value;
    }

    /**
     * Gets the value of the roc property.
     * 
     * @return
     *     possible object is
     *     {@link MolecularSequenceRoc }
     *     
     */
    public MolecularSequenceRoc getRoc() {
        return roc;
    }

    /**
     * Sets the value of the roc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MolecularSequenceRoc }
     *     
     */
    public void setRoc(MolecularSequenceRoc value) {
        this.roc = value;
    }

}
