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
 * <p>Java class for CompartmentType-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompartmentType-list">
 *   &lt;restriction base="{http://hl7.org/fhir}code-primitive">
 *     &lt;enumeration value="Patient"/>
 *     &lt;enumeration value="Encounter"/>
 *     &lt;enumeration value="RelatedPerson"/>
 *     &lt;enumeration value="Practitioner"/>
 *     &lt;enumeration value="Device"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CompartmentType-list")
@XmlEnum
public enum CompartmentTypeList {


    /**
     * Patient
     * 
     */
    @XmlEnumValue("Patient")
    PATIENT("Patient"),

    /**
     * Encounter
     * 
     */
    @XmlEnumValue("Encounter")
    ENCOUNTER("Encounter"),

    /**
     * RelatedPerson
     * 
     */
    @XmlEnumValue("RelatedPerson")
    RELATED_PERSON("RelatedPerson"),

    /**
     * Practitioner
     * 
     */
    @XmlEnumValue("Practitioner")
    PRACTITIONER("Practitioner"),

    /**
     * Device
     * 
     */
    @XmlEnumValue("Device")
    DEVICE("Device");
    private final java.lang.String value;

    CompartmentTypeList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static CompartmentTypeList fromValue(java.lang.String v) {
        for (CompartmentTypeList c: CompartmentTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
