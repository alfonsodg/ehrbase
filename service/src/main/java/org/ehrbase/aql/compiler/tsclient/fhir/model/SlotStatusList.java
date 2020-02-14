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
 * <p>Java class for SlotStatus-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SlotStatus-list">
 *   &lt;restriction base="{http://hl7.org/fhir}code-primitive">
 *     &lt;enumeration value="busy"/>
 *     &lt;enumeration value="free"/>
 *     &lt;enumeration value="busy-unavailable"/>
 *     &lt;enumeration value="busy-tentative"/>
 *     &lt;enumeration value="entered-in-error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SlotStatus-list")
@XmlEnum
public enum SlotStatusList {


    /**
     * Busy
     * 
     */
    @XmlEnumValue("busy")
    BUSY("busy"),

    /**
     * Free
     * 
     */
    @XmlEnumValue("free")
    FREE("free"),

    /**
     * Busy (Unavailable)
     * 
     */
    @XmlEnumValue("busy-unavailable")
    BUSY_UNAVAILABLE("busy-unavailable"),

    /**
     * Busy (Tentative)
     * 
     */
    @XmlEnumValue("busy-tentative")
    BUSY_TENTATIVE("busy-tentative"),

    /**
     * Entered in error
     * 
     */
    @XmlEnumValue("entered-in-error")
    ENTERED_IN_ERROR("entered-in-error");
    private final java.lang.String value;

    SlotStatusList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SlotStatusList fromValue(java.lang.String v) {
        for (SlotStatusList c: SlotStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
