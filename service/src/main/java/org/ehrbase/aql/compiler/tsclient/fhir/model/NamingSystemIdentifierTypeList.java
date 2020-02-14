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
 * <p>Java class for NamingSystemIdentifierType-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NamingSystemIdentifierType-list">
 *   &lt;restriction base="{http://hl7.org/fhir}code-primitive">
 *     &lt;enumeration value="oid"/>
 *     &lt;enumeration value="uuid"/>
 *     &lt;enumeration value="uri"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NamingSystemIdentifierType-list")
@XmlEnum
public enum NamingSystemIdentifierTypeList {


    /**
     * OID
     * 
     */
    @XmlEnumValue("oid")
    OID("oid"),

    /**
     * UUID
     * 
     */
    @XmlEnumValue("uuid")
    UUID("uuid"),

    /**
     * URI
     * 
     */
    @XmlEnumValue("uri")
    URI("uri"),

    /**
     * Other
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final java.lang.String value;

    NamingSystemIdentifierTypeList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static NamingSystemIdentifierTypeList fromValue(java.lang.String v) {
        for (NamingSystemIdentifierTypeList c: NamingSystemIdentifierTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
