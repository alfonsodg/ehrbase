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
 * <p>Java class for NarrativeStatus-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NarrativeStatus-list">
 *   &lt;restriction base="{http://hl7.org/fhir}code-primitive">
 *     &lt;enumeration value="generated"/>
 *     &lt;enumeration value="extensions"/>
 *     &lt;enumeration value="additional"/>
 *     &lt;enumeration value="empty"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NarrativeStatus-list")
@XmlEnum
public enum NarrativeStatusList {


    /**
     * Generated
     * 
     */
    @XmlEnumValue("generated")
    GENERATED("generated"),

    /**
     * Extensions
     * 
     */
    @XmlEnumValue("extensions")
    EXTENSIONS("extensions"),

    /**
     * Additional
     * 
     */
    @XmlEnumValue("additional")
    ADDITIONAL("additional"),

    /**
     * Empty
     * 
     */
    @XmlEnumValue("empty")
    EMPTY("empty");
    private final java.lang.String value;

    NarrativeStatusList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static NarrativeStatusList fromValue(java.lang.String v) {
        for (NarrativeStatusList c: NarrativeStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
