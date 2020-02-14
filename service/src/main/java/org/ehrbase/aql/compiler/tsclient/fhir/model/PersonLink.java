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
 * Demographics and administrative information about a person independent of a specific health-related context.
 * 
 * <p>Java class for Person.Link complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Person.Link">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="target" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="assurance" type="{http://hl7.org/fhir}IdentityAssuranceLevel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Person.Link", propOrder = {
    "target",
    "assurance"
})
public class PersonLink
    extends BackboneElement
{

    @XmlElement(required = true)
    protected Reference target;
    protected IdentityAssuranceLevel assurance;

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setTarget(Reference value) {
        this.target = value;
    }

    /**
     * Gets the value of the assurance property.
     * 
     * @return
     *     possible object is
     *     {@link IdentityAssuranceLevel }
     *     
     */
    public IdentityAssuranceLevel getAssurance() {
        return assurance;
    }

    /**
     * Sets the value of the assurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityAssuranceLevel }
     *     
     */
    public void setAssurance(IdentityAssuranceLevel value) {
        this.assurance = value;
    }

}
