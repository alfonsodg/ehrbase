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
 * <p>Java class for BiologicallyDerivedProductCategory-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BiologicallyDerivedProductCategory-list">
 *   &lt;restriction base="{http://hl7.org/fhir}code-primitive">
 *     &lt;enumeration value="organ"/>
 *     &lt;enumeration value="tissue"/>
 *     &lt;enumeration value="fluid"/>
 *     &lt;enumeration value="cells"/>
 *     &lt;enumeration value="biologicalAgent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BiologicallyDerivedProductCategory-list")
@XmlEnum
public enum BiologicallyDerivedProductCategoryList {


    /**
     * Organ
     * 
     */
    @XmlEnumValue("organ")
    ORGAN("organ"),

    /**
     * Tissue
     * 
     */
    @XmlEnumValue("tissue")
    TISSUE("tissue"),

    /**
     * Fluid
     * 
     */
    @XmlEnumValue("fluid")
    FLUID("fluid"),

    /**
     * Cells
     * 
     */
    @XmlEnumValue("cells")
    CELLS("cells"),

    /**
     * BiologicalAgent
     * 
     */
    @XmlEnumValue("biologicalAgent")
    BIOLOGICAL_AGENT("biologicalAgent");
    private final java.lang.String value;

    BiologicallyDerivedProductCategoryList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static BiologicallyDerivedProductCategoryList fromValue(java.lang.String v) {
        for (BiologicallyDerivedProductCategoryList c: BiologicallyDerivedProductCategoryList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
