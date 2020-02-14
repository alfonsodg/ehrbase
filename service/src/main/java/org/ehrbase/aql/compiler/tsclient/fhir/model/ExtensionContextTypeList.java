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
 * <p>Java class for ExtensionContextType-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExtensionContextType-list">
 *   &lt;restriction base="{http://hl7.org/fhir}code-primitive">
 *     &lt;enumeration value="fhirpath"/>
 *     &lt;enumeration value="element"/>
 *     &lt;enumeration value="extension"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExtensionContextType-list")
@XmlEnum
public enum ExtensionContextTypeList {


    /**
     * FHIRPath
     * 
     */
    @XmlEnumValue("fhirpath")
    FHIRPATH("fhirpath"),

    /**
     * Element ID
     * 
     */
    @XmlEnumValue("element")
    ELEMENT("element"),

    /**
     * Extension URL
     * 
     */
    @XmlEnumValue("extension")
    EXTENSION("extension");
    private final java.lang.String value;

    ExtensionContextTypeList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ExtensionContextTypeList fromValue(java.lang.String v) {
        for (ExtensionContextTypeList c: ExtensionContextTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
