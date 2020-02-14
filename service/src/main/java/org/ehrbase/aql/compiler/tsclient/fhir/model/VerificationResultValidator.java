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
 * Describes validation requirements, source(s), status and dates for one or more elements.
 * 
 * <p>Java class for VerificationResult.Validator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerificationResult.Validator">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="organization" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="identityCertificate" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="attestationSignature" type="{http://hl7.org/fhir}Signature" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerificationResult.Validator", propOrder = {
    "organization",
    "identityCertificate",
    "attestationSignature"
})
public class VerificationResultValidator
    extends BackboneElement
{

    @XmlElement(required = true)
    protected Reference organization;
    protected String identityCertificate;
    protected Signature attestationSignature;

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setOrganization(Reference value) {
        this.organization = value;
    }

    /**
     * Gets the value of the identityCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityCertificate() {
        return identityCertificate;
    }

    /**
     * Sets the value of the identityCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityCertificate(String value) {
        this.identityCertificate = value;
    }

    /**
     * Gets the value of the attestationSignature property.
     * 
     * @return
     *     possible object is
     *     {@link Signature }
     *     
     */
    public Signature getAttestationSignature() {
        return attestationSignature;
    }

    /**
     * Sets the value of the attestationSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Signature }
     *     
     */
    public void setAttestationSignature(Signature value) {
        this.attestationSignature = value;
    }

}
