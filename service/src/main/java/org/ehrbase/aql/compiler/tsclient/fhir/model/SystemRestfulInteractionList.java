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
 * <p>Java class for SystemRestfulInteraction-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SystemRestfulInteraction-list">
 *   &lt;restriction base="{http://hl7.org/fhir}code-primitive">
 *     &lt;enumeration value="transaction"/>
 *     &lt;enumeration value="batch"/>
 *     &lt;enumeration value="search-system"/>
 *     &lt;enumeration value="history-system"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SystemRestfulInteraction-list")
@XmlEnum
public enum SystemRestfulInteractionList {


    /**
     * transaction
     * 
     */
    @XmlEnumValue("transaction")
    TRANSACTION("transaction"),

    /**
     * batch
     * 
     */
    @XmlEnumValue("batch")
    BATCH("batch"),

    /**
     * search-system
     * 
     */
    @XmlEnumValue("search-system")
    SEARCH_SYSTEM("search-system"),

    /**
     * history-system
     * 
     */
    @XmlEnumValue("history-system")
    HISTORY_SYSTEM("history-system");
    private final java.lang.String value;

    SystemRestfulInteractionList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SystemRestfulInteractionList fromValue(java.lang.String v) {
        for (SystemRestfulInteractionList c: SystemRestfulInteractionList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
