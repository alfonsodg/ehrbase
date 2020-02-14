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
 * <p>Java class for CarePlanActivityKind-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CarePlanActivityKind-list">
 *   &lt;restriction base="{http://hl7.org/fhir}code-primitive">
 *     &lt;enumeration value="Appointment"/>
 *     &lt;enumeration value="CommunicationRequest"/>
 *     &lt;enumeration value="DeviceRequest"/>
 *     &lt;enumeration value="MedicationRequest"/>
 *     &lt;enumeration value="NutritionOrder"/>
 *     &lt;enumeration value="Task"/>
 *     &lt;enumeration value="ServiceRequest"/>
 *     &lt;enumeration value="VisionPrescription"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CarePlanActivityKind-list")
@XmlEnum
public enum CarePlanActivityKindList {


    /**
     * 预约
     * 
     */
    @XmlEnumValue("Appointment")
    APPOINTMENT("Appointment"),

    /**
     * 通讯请求
     * 
     */
    @XmlEnumValue("CommunicationRequest")
    COMMUNICATION_REQUEST("CommunicationRequest"),

    /**
     * 装置请求
     * 
     */
    @XmlEnumValue("DeviceRequest")
    DEVICE_REQUEST("DeviceRequest"),

    /**
     * PrescripciónMedicaciónTODO  /PrescripcionMedicamento
     * 
     */
    @XmlEnumValue("MedicationRequest")
    MEDICATION_REQUEST("MedicationRequest"),

    /**
     * 营养医嘱
     * 
     */
    @XmlEnumValue("NutritionOrder")
    NUTRITION_ORDER("NutritionOrder"),

    /**
     * 任务
     * 
     */
    @XmlEnumValue("Task")
    TASK("Task"),

    /**
     * 服务项目请求
     * 
     */
    @XmlEnumValue("ServiceRequest")
    SERVICE_REQUEST("ServiceRequest"),

    /**
     * 视力处方
     * 
     */
    @XmlEnumValue("VisionPrescription")
    VISION_PRESCRIPTION("VisionPrescription");
    private final java.lang.String value;

    CarePlanActivityKindList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static CarePlanActivityKindList fromValue(java.lang.String v) {
        for (CarePlanActivityKindList c: CarePlanActivityKindList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
