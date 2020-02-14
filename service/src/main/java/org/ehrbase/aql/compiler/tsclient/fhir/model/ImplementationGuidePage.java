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
 * A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.
 * 
 * <p>Java class for ImplementationGuide.Page complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImplementationGuide.Page">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="nameUrl" type="{http://hl7.org/fhir}url" minOccurs="0"/>
 *         &lt;element name="nameReference" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="title" type="{http://hl7.org/fhir}string"/>
 *         &lt;element name="generation" type="{http://hl7.org/fhir}GuidePageGeneration"/>
 *         &lt;element name="page" type="{http://hl7.org/fhir}ImplementationGuide.Page" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImplementationGuide.Page", propOrder = {
    "nameUrl",
    "nameReference",
    "title",
    "generation",
    "page"
})
public class ImplementationGuidePage
    extends BackboneElement
{

    protected Url nameUrl;
    protected Reference nameReference;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected GuidePageGeneration generation;
    protected List<ImplementationGuidePage> page;

    /**
     * Gets the value of the nameUrl property.
     * 
     * @return
     *     possible object is
     *     {@link Url }
     *     
     */
    public Url getNameUrl() {
        return nameUrl;
    }

    /**
     * Sets the value of the nameUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Url }
     *     
     */
    public void setNameUrl(Url value) {
        this.nameUrl = value;
    }

    /**
     * Gets the value of the nameReference property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getNameReference() {
        return nameReference;
    }

    /**
     * Sets the value of the nameReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setNameReference(Reference value) {
        this.nameReference = value;
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
     * Gets the value of the generation property.
     * 
     * @return
     *     possible object is
     *     {@link GuidePageGeneration }
     *     
     */
    public GuidePageGeneration getGeneration() {
        return generation;
    }

    /**
     * Sets the value of the generation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuidePageGeneration }
     *     
     */
    public void setGeneration(GuidePageGeneration value) {
        this.generation = value;
    }

    /**
     * Gets the value of the page property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the page property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImplementationGuidePage }
     * 
     * 
     */
    public List<ImplementationGuidePage> getPage() {
        if (page == null) {
            page = new ArrayList<ImplementationGuidePage>();
        }
        return this.page;
    }

}
