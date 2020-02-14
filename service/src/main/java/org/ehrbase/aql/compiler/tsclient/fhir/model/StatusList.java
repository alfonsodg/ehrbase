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
 * <p>Java class for status-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="status-list">
 *   &lt;restriction base="{http://hl7.org/fhir}code-primitive">
 *     &lt;enumeration value="attested"/>
 *     &lt;enumeration value="validated"/>
 *     &lt;enumeration value="in-process"/>
 *     &lt;enumeration value="req-revalid"/>
 *     &lt;enumeration value="val-fail"/>
 *     &lt;enumeration value="reval-fail"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "status-list")
@XmlEnum
public enum StatusList {


    /**
     * Attested
     * 
     */
    @XmlEnumValue("attested")
    ATTESTED("attested"),

    /**
     * Validated
     * 
     */
    @XmlEnumValue("validated")
    VALIDATED("validated"),

    /**
     * In process
     * 
     */
    @XmlEnumValue("in-process")
    IN_PROCESS("in-process"),

    /**
     * Requires revalidation
     * 
     */
    @XmlEnumValue("req-revalid")
    REQ_REVALID("req-revalid"),

    /**
     * Validation failed
     * 
     */
    @XmlEnumValue("val-fail")
    VAL_FAIL("val-fail"),

    /**
     * Re-Validation failed
     * 
     */
    @XmlEnumValue("reval-fail")
    REVAL_FAIL("reval-fail");
    private final java.lang.String value;

    StatusList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static StatusList fromValue(java.lang.String v) {
        for (StatusList c: StatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
