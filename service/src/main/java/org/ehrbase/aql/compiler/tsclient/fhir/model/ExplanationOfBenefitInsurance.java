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
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 * 
 * <p>Java class for ExplanationOfBenefit.Insurance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExplanationOfBenefit.Insurance">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="focal" type="{http://hl7.org/fhir}boolean"/>
 *         &lt;element name="coverage" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="preAuthRef" type="{http://hl7.org/fhir}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExplanationOfBenefit.Insurance", propOrder = {
    "focal",
    "coverage",
    "preAuthRef"
})
public class ExplanationOfBenefitInsurance
    extends BackboneElement
{

    @XmlElement(required = true)
    protected Boolean focal;
    @XmlElement(required = true)
    protected Reference coverage;
    protected List<String> preAuthRef;

    /**
     * Gets the value of the focal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFocal() {
        return focal;
    }

    /**
     * Sets the value of the focal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFocal(Boolean value) {
        this.focal = value;
    }

    /**
     * Gets the value of the coverage property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getCoverage() {
        return coverage;
    }

    /**
     * Sets the value of the coverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setCoverage(Reference value) {
        this.coverage = value;
    }

    /**
     * Gets the value of the preAuthRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preAuthRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreAuthRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPreAuthRef() {
        if (preAuthRef == null) {
            preAuthRef = new ArrayList<String>();
        }
        return this.preAuthRef;
    }

}
