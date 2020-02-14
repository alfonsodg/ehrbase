//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.26 at 01:33:12 PM CET 
//


package org.ehrbase.aql.compiler.tsclient.fhir.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuideParameterCode-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GuideParameterCode-list">
 *   &lt;restriction base="{http://hl7.org/fhir}code-primitive">
 *     &lt;enumeration value="apply"/>
 *     &lt;enumeration value="path-resource"/>
 *     &lt;enumeration value="path-pages"/>
 *     &lt;enumeration value="path-tx-cache"/>
 *     &lt;enumeration value="expansion-parameter"/>
 *     &lt;enumeration value="rule-broken-links"/>
 *     &lt;enumeration value="generate-xml"/>
 *     &lt;enumeration value="generate-json"/>
 *     &lt;enumeration value="generate-turtle"/>
 *     &lt;enumeration value="html-template"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GuideParameterCode-list")
@XmlEnum
public enum GuideParameterCodeList {


    /**
     * Apply Metadata Value
     * 
     */
    @XmlEnumValue("apply")
    APPLY("apply"),

    /**
     * Resource Path
     * 
     */
    @XmlEnumValue("path-resource")
    PATH_RESOURCE("path-resource"),

    /**
     * Pages Path
     * 
     */
    @XmlEnumValue("path-pages")
    PATH_PAGES("path-pages"),

    /**
     * Terminology Cache Path
     * 
     */
    @XmlEnumValue("path-tx-cache")
    PATH_TX_CACHE("path-tx-cache"),

    /**
     * Expansion Profile
     * 
     */
    @XmlEnumValue("expansion-parameter")
    EXPANSION_PARAMETER("expansion-parameter"),

    /**
     * Broken Links Rule
     * 
     */
    @XmlEnumValue("rule-broken-links")
    RULE_BROKEN_LINKS("rule-broken-links"),

    /**
     * Generate XML
     * 
     */
    @XmlEnumValue("generate-xml")
    GENERATE_XML("generate-xml"),

    /**
     * Generate JSON
     * 
     */
    @XmlEnumValue("generate-json")
    GENERATE_JSON("generate-json"),

    /**
     * Generate Turtle
     * 
     */
    @XmlEnumValue("generate-turtle")
    GENERATE_TURTLE("generate-turtle"),

    /**
     * HTML Template
     * 
     */
    @XmlEnumValue("html-template")
    HTML_TEMPLATE("html-template");
    private final java.lang.String value;

    GuideParameterCodeList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static GuideParameterCodeList fromValue(java.lang.String v) {
        for (GuideParameterCodeList c: GuideParameterCodeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
