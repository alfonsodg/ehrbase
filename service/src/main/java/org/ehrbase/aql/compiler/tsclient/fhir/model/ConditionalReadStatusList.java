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
 * <p>Java class for ConditionalReadStatus-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConditionalReadStatus-list">
 *   &lt;restriction base="{http://hl7.org/fhir}code-primitive">
 *     &lt;enumeration value="not-supported"/>
 *     &lt;enumeration value="modified-since"/>
 *     &lt;enumeration value="not-match"/>
 *     &lt;enumeration value="full-support"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConditionalReadStatus-list")
@XmlEnum
public enum ConditionalReadStatusList {


    /**
     * Not Supported
     * 
     */
    @XmlEnumValue("not-supported")
    NOT_SUPPORTED("not-supported"),

    /**
     * If-Modified-Since
     * 
     */
    @XmlEnumValue("modified-since")
    MODIFIED_SINCE("modified-since"),

    /**
     * If-None-Match
     * 
     */
    @XmlEnumValue("not-match")
    NOT_MATCH("not-match"),

    /**
     * Full Support
     * 
     */
    @XmlEnumValue("full-support")
    FULL_SUPPORT("full-support");
    private final java.lang.String value;

    ConditionalReadStatusList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ConditionalReadStatusList fromValue(java.lang.String v) {
        for (ConditionalReadStatusList c: ConditionalReadStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
