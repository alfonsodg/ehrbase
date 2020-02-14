//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.26 at 01:33:12 PM CET 
//


package org.ehrbase.aql.compiler.tsclient.fhir.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * This is the base resource type for everything.
 * 
 * <p>Java class for Resource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Resource">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://hl7.org/fhir}id" minOccurs="0"/>
 *         &lt;element name="meta" type="{http://hl7.org/fhir}Meta" minOccurs="0"/>
 *         &lt;element name="implicitRules" type="{http://hl7.org/fhir}uri" minOccurs="0"/>
 *         &lt;element name="language" type="{http://hl7.org/fhir}code" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Resource", propOrder = {
    "id",
    "meta",
    "implicitRules",
    "language"
})
@XmlSeeAlso({
    Parameters.class,
    Binary.class,
    Bundle.class,
    DomainResource.class
})
public class Resource {

    protected Id id;
    protected Meta meta;
    protected Uri implicitRules;
    protected Code language;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setId(Id value) {
        this.id = value;
    }

    /**
     * Gets the value of the meta property.
     * 
     * @return
     *     possible object is
     *     {@link Meta }
     *     
     */
    public Meta getMeta() {
        return meta;
    }

    /**
     * Sets the value of the meta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meta }
     *     
     */
    public void setMeta(Meta value) {
        this.meta = value;
    }

    /**
     * Gets the value of the implicitRules property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getImplicitRules() {
        return implicitRules;
    }

    /**
     * Sets the value of the implicitRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setImplicitRules(Uri value) {
        this.implicitRules = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setLanguage(Code value) {
        this.language = value;
    }

}
