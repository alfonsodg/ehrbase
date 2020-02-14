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
 * <p>Java class for VisionPrescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VisionPrescription">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}FinancialResourceStatusCodes"/>
 *         &lt;element name="created" type="{http://hl7.org/fhir}dateTime"/>
 *         &lt;element name="patient" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="encounter" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="dateWritten" type="{http://hl7.org/fhir}dateTime"/>
 *         &lt;element name="prescriber" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="lensSpecification" type="{http://hl7.org/fhir}VisionPrescription.LensSpecification" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VisionPrescription", propOrder = {
    "identifier",
    "status",
    "created",
    "patient",
    "encounter",
    "dateWritten",
    "prescriber",
    "lensSpecification"
})
public class VisionPrescription
    extends DomainResource
{

    protected List<Identifier> identifier;
    @XmlElement(required = true)
    protected FinancialResourceStatusCodes status;
    @XmlElement(required = true)
    protected DateTime created;
    @XmlElement(required = true)
    protected Reference patient;
    protected Reference encounter;
    @XmlElement(required = true)
    protected DateTime dateWritten;
    @XmlElement(required = true)
    protected Reference prescriber;
    @XmlElement(required = true)
    protected List<VisionPrescriptionLensSpecification> lensSpecification;

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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialResourceStatusCodes }
     *     
     */
    public FinancialResourceStatusCodes getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialResourceStatusCodes }
     *     
     */
    public void setStatus(FinancialResourceStatusCodes value) {
        this.status = value;
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
     * Gets the value of the patient property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getPatient() {
        return patient;
    }

    /**
     * Sets the value of the patient property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setPatient(Reference value) {
        this.patient = value;
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
     * Gets the value of the dateWritten property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getDateWritten() {
        return dateWritten;
    }

    /**
     * Sets the value of the dateWritten property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setDateWritten(DateTime value) {
        this.dateWritten = value;
    }

    /**
     * Gets the value of the prescriber property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getPrescriber() {
        return prescriber;
    }

    /**
     * Sets the value of the prescriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setPrescriber(Reference value) {
        this.prescriber = value;
    }

    /**
     * Gets the value of the lensSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lensSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLensSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VisionPrescriptionLensSpecification }
     * 
     * 
     */
    public List<VisionPrescriptionLensSpecification> getLensSpecification() {
        if (lensSpecification == null) {
            lensSpecification = new ArrayList<VisionPrescriptionLensSpecification>();
        }
        return this.lensSpecification;
    }

}
