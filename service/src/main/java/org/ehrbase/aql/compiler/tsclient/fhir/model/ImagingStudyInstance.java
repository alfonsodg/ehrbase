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
 * Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a common context.  A series is of only one modality (e.g. X-ray, CT, MR, ultrasound), but a study may have multiple series of different modalities.
 * 
 * <p>Java class for ImagingStudy.Instance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImagingStudy.Instance">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="uid" type="{http://hl7.org/fhir}id"/>
 *         &lt;element name="sopClass" type="{http://hl7.org/fhir}Coding"/>
 *         &lt;element name="number" type="{http://hl7.org/fhir}unsignedInt" minOccurs="0"/>
 *         &lt;element name="title" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImagingStudy.Instance", propOrder = {
    "uid",
    "sopClass",
    "number",
    "title"
})
public class ImagingStudyInstance
    extends BackboneElement
{

    @XmlElement(required = true)
    protected Id uid;
    @XmlElement(required = true)
    protected Coding sopClass;
    protected UnsignedInt number;
    protected String title;

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setUid(Id value) {
        this.uid = value;
    }

    /**
     * Gets the value of the sopClass property.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getSopClass() {
        return sopClass;
    }

    /**
     * Sets the value of the sopClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setSopClass(Coding value) {
        this.sopClass = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedInt }
     *     
     */
    public UnsignedInt getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedInt }
     *     
     */
    public void setNumber(UnsignedInt value) {
        this.number = value;
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

}
