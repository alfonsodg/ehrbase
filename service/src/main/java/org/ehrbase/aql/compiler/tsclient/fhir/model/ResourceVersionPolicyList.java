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
 * <p>Java class for ResourceVersionPolicy-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResourceVersionPolicy-list">
 *   &lt;restriction base="{http://hl7.org/fhir}code-primitive">
 *     &lt;enumeration value="no-version"/>
 *     &lt;enumeration value="versioned"/>
 *     &lt;enumeration value="versioned-update"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResourceVersionPolicy-list")
@XmlEnum
public enum ResourceVersionPolicyList {


    /**
     * No VersionId Support
     * 
     */
    @XmlEnumValue("no-version")
    NO_VERSION("no-version"),

    /**
     * Versioned
     * 
     */
    @XmlEnumValue("versioned")
    VERSIONED("versioned"),

    /**
     * VersionId tracked fully
     * 
     */
    @XmlEnumValue("versioned-update")
    VERSIONED_UPDATE("versioned-update");
    private final java.lang.String value;

    ResourceVersionPolicyList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ResourceVersionPolicyList fromValue(java.lang.String v) {
        for (ResourceVersionPolicyList c: ResourceVersionPolicyList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
