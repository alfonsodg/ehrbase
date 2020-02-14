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
 * <p>Java class for CodeSystemContentMode-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CodeSystemContentMode-list">
 *   &lt;restriction base="{http://hl7.org/fhir}code-primitive">
 *     &lt;enumeration value="not-present"/>
 *     &lt;enumeration value="example"/>
 *     &lt;enumeration value="fragment"/>
 *     &lt;enumeration value="complete"/>
 *     &lt;enumeration value="supplement"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CodeSystemContentMode-list")
@XmlEnum
public enum CodeSystemContentModeList {


    /**
     * Not Present
     * 
     */
    @XmlEnumValue("not-present")
    NOT_PRESENT("not-present"),

    /**
     * Example
     * 
     */
    @XmlEnumValue("example")
    EXAMPLE("example"),

    /**
     * Fragment
     * 
     */
    @XmlEnumValue("fragment")
    FRAGMENT("fragment"),

    /**
     * Complete
     * 
     */
    @XmlEnumValue("complete")
    COMPLETE("complete"),

    /**
     * Supplement
     * 
     */
    @XmlEnumValue("supplement")
    SUPPLEMENT("supplement");
    private final java.lang.String value;

    CodeSystemContentModeList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static CodeSystemContentModeList fromValue(java.lang.String v) {
        for (CodeSystemContentModeList c: CodeSystemContentModeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
