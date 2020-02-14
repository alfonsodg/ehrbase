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
 * <p>Java class for TaskIntent-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaskIntent-list">
 *   &lt;restriction base="{http://hl7.org/fhir}code-primitive">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="proposal"/>
 *     &lt;enumeration value="plan"/>
 *     &lt;enumeration value="order"/>
 *     &lt;enumeration value="original-order"/>
 *     &lt;enumeration value="reflex-order"/>
 *     &lt;enumeration value="filler-order"/>
 *     &lt;enumeration value="instance-order"/>
 *     &lt;enumeration value="option"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaskIntent-list")
@XmlEnum
public enum TaskIntentList {


    /**
     * Unknown
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * Proposal
     * 
     */
    @XmlEnumValue("proposal")
    PROPOSAL("proposal"),

    /**
     * Plan
     * 
     */
    @XmlEnumValue("plan")
    PLAN("plan"),

    /**
     * Order
     * 
     */
    @XmlEnumValue("order")
    ORDER("order"),

    /**
     * Original Order
     * 
     */
    @XmlEnumValue("original-order")
    ORIGINAL_ORDER("original-order"),

    /**
     * Reflex Order
     * 
     */
    @XmlEnumValue("reflex-order")
    REFLEX_ORDER("reflex-order"),

    /**
     * Filler Order
     * 
     */
    @XmlEnumValue("filler-order")
    FILLER_ORDER("filler-order"),

    /**
     * Instance Order
     * 
     */
    @XmlEnumValue("instance-order")
    INSTANCE_ORDER("instance-order"),

    /**
     * Option
     * 
     */
    @XmlEnumValue("option")
    OPTION("option");
    private final java.lang.String value;

    TaskIntentList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static TaskIntentList fromValue(java.lang.String v) {
        for (TaskIntentList c: TaskIntentList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
