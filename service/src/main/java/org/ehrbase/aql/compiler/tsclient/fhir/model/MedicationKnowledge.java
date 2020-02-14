//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.26 at 01:33:12 PM CET 
//


package org.ehrbase.aql.compiler.tsclient.fhir.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for MedicationKnowledge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedicationKnowledge">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}code" minOccurs="0"/>
 *         &lt;element name="manufacturer" type="{http://hl7.org/fhir}Reference" minOccurs="0"/>
 *         &lt;element name="doseForm" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://hl7.org/fhir}Quantity" minOccurs="0"/>
 *         &lt;element name="synonym" type="{http://hl7.org/fhir}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="relatedMedicationKnowledge" type="{http://hl7.org/fhir}MedicationKnowledge.RelatedMedicationKnowledge" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="associatedMedication" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productType" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="monograph" type="{http://hl7.org/fhir}MedicationKnowledge.Monograph" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ingredient" type="{http://hl7.org/fhir}MedicationKnowledge.Ingredient" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="preparationInstruction" type="{http://hl7.org/fhir}markdown" minOccurs="0"/>
 *         &lt;element name="intendedRoute" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cost" type="{http://hl7.org/fhir}MedicationKnowledge.Cost" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="monitoringProgram" type="{http://hl7.org/fhir}MedicationKnowledge.MonitoringProgram" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="administrationGuidelines" type="{http://hl7.org/fhir}MedicationKnowledge.AdministrationGuidelines" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="medicineClassification" type="{http://hl7.org/fhir}MedicationKnowledge.MedicineClassification" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="packaging" type="{http://hl7.org/fhir}MedicationKnowledge.Packaging" minOccurs="0"/>
 *         &lt;element name="drugCharacteristic" type="{http://hl7.org/fhir}MedicationKnowledge.DrugCharacteristic" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contraindication" type="{http://hl7.org/fhir}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="regulatory" type="{http://hl7.org/fhir}MedicationKnowledge.Regulatory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="kinetics" type="{http://hl7.org/fhir}MedicationKnowledge.Kinetics" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicationKnowledge", propOrder = {
    "code",
    "status",
    "manufacturer",
    "doseForm",
    "amount",
    "synonym",
    "relatedMedicationKnowledge",
    "associatedMedication",
    "productType",
    "monograph",
    "ingredient",
    "preparationInstruction",
    "intendedRoute",
    "cost",
    "monitoringProgram",
    "administrationGuidelines",
    "medicineClassification",
    "packaging",
    "drugCharacteristic",
    "contraindication",
    "regulatory",
    "kinetics"
})
public class MedicationKnowledge
    extends DomainResource
{

    protected CodeableConcept code;
    protected Code status;
    protected Reference manufacturer;
    protected CodeableConcept doseForm;
    protected Quantity amount;
    protected List<String> synonym;
    protected List<MedicationKnowledgeRelatedMedicationKnowledge> relatedMedicationKnowledge;
    protected List<Reference> associatedMedication;
    protected List<CodeableConcept> productType;
    protected List<MedicationKnowledgeMonograph> monograph;
    protected List<MedicationKnowledgeIngredient> ingredient;
    protected Markdown preparationInstruction;
    protected List<CodeableConcept> intendedRoute;
    protected List<MedicationKnowledgeCost> cost;
    protected List<MedicationKnowledgeMonitoringProgram> monitoringProgram;
    protected List<MedicationKnowledgeAdministrationGuidelines> administrationGuidelines;
    protected List<MedicationKnowledgeMedicineClassification> medicineClassification;
    protected MedicationKnowledgePackaging packaging;
    protected List<MedicationKnowledgeDrugCharacteristic> drugCharacteristic;
    protected List<Reference> contraindication;
    protected List<MedicationKnowledgeRegulatory> regulatory;
    protected List<MedicationKnowledgeKinetics> kinetics;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setCode(CodeableConcept value) {
        this.code = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setStatus(Code value) {
        this.status = value;
    }

    /**
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setManufacturer(Reference value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the doseForm property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getDoseForm() {
        return doseForm;
    }

    /**
     * Sets the value of the doseForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setDoseForm(CodeableConcept value) {
        this.doseForm = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setAmount(Quantity value) {
        this.amount = value;
    }

    /**
     * Gets the value of the synonym property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the synonym property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSynonym().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSynonym() {
        if (synonym == null) {
            synonym = new ArrayList<String>();
        }
        return this.synonym;
    }

    /**
     * Gets the value of the relatedMedicationKnowledge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedMedicationKnowledge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedMedicationKnowledge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedicationKnowledgeRelatedMedicationKnowledge }
     * 
     * 
     */
    public List<MedicationKnowledgeRelatedMedicationKnowledge> getRelatedMedicationKnowledge() {
        if (relatedMedicationKnowledge == null) {
            relatedMedicationKnowledge = new ArrayList<MedicationKnowledgeRelatedMedicationKnowledge>();
        }
        return this.relatedMedicationKnowledge;
    }

    /**
     * Gets the value of the associatedMedication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedMedication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociatedMedication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getAssociatedMedication() {
        if (associatedMedication == null) {
            associatedMedication = new ArrayList<Reference>();
        }
        return this.associatedMedication;
    }

    /**
     * Gets the value of the productType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getProductType() {
        if (productType == null) {
            productType = new ArrayList<CodeableConcept>();
        }
        return this.productType;
    }

    /**
     * Gets the value of the monograph property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monograph property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonograph().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedicationKnowledgeMonograph }
     * 
     * 
     */
    public List<MedicationKnowledgeMonograph> getMonograph() {
        if (monograph == null) {
            monograph = new ArrayList<MedicationKnowledgeMonograph>();
        }
        return this.monograph;
    }

    /**
     * Gets the value of the ingredient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ingredient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIngredient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedicationKnowledgeIngredient }
     * 
     * 
     */
    public List<MedicationKnowledgeIngredient> getIngredient() {
        if (ingredient == null) {
            ingredient = new ArrayList<MedicationKnowledgeIngredient>();
        }
        return this.ingredient;
    }

    /**
     * Gets the value of the preparationInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link Markdown }
     *     
     */
    public Markdown getPreparationInstruction() {
        return preparationInstruction;
    }

    /**
     * Sets the value of the preparationInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Markdown }
     *     
     */
    public void setPreparationInstruction(Markdown value) {
        this.preparationInstruction = value;
    }

    /**
     * Gets the value of the intendedRoute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intendedRoute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntendedRoute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getIntendedRoute() {
        if (intendedRoute == null) {
            intendedRoute = new ArrayList<CodeableConcept>();
        }
        return this.intendedRoute;
    }

    /**
     * Gets the value of the cost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedicationKnowledgeCost }
     * 
     * 
     */
    public List<MedicationKnowledgeCost> getCost() {
        if (cost == null) {
            cost = new ArrayList<MedicationKnowledgeCost>();
        }
        return this.cost;
    }

    /**
     * Gets the value of the monitoringProgram property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monitoringProgram property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonitoringProgram().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedicationKnowledgeMonitoringProgram }
     * 
     * 
     */
    public List<MedicationKnowledgeMonitoringProgram> getMonitoringProgram() {
        if (monitoringProgram == null) {
            monitoringProgram = new ArrayList<MedicationKnowledgeMonitoringProgram>();
        }
        return this.monitoringProgram;
    }

    /**
     * Gets the value of the administrationGuidelines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the administrationGuidelines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdministrationGuidelines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedicationKnowledgeAdministrationGuidelines }
     * 
     * 
     */
    public List<MedicationKnowledgeAdministrationGuidelines> getAdministrationGuidelines() {
        if (administrationGuidelines == null) {
            administrationGuidelines = new ArrayList<MedicationKnowledgeAdministrationGuidelines>();
        }
        return this.administrationGuidelines;
    }

    /**
     * Gets the value of the medicineClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the medicineClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedicineClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedicationKnowledgeMedicineClassification }
     * 
     * 
     */
    public List<MedicationKnowledgeMedicineClassification> getMedicineClassification() {
        if (medicineClassification == null) {
            medicineClassification = new ArrayList<MedicationKnowledgeMedicineClassification>();
        }
        return this.medicineClassification;
    }

    /**
     * Gets the value of the packaging property.
     * 
     * @return
     *     possible object is
     *     {@link MedicationKnowledgePackaging }
     *     
     */
    public MedicationKnowledgePackaging getPackaging() {
        return packaging;
    }

    /**
     * Sets the value of the packaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicationKnowledgePackaging }
     *     
     */
    public void setPackaging(MedicationKnowledgePackaging value) {
        this.packaging = value;
    }

    /**
     * Gets the value of the drugCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the drugCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDrugCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedicationKnowledgeDrugCharacteristic }
     * 
     * 
     */
    public List<MedicationKnowledgeDrugCharacteristic> getDrugCharacteristic() {
        if (drugCharacteristic == null) {
            drugCharacteristic = new ArrayList<MedicationKnowledgeDrugCharacteristic>();
        }
        return this.drugCharacteristic;
    }

    /**
     * Gets the value of the contraindication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contraindication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContraindication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    public List<Reference> getContraindication() {
        if (contraindication == null) {
            contraindication = new ArrayList<Reference>();
        }
        return this.contraindication;
    }

    /**
     * Gets the value of the regulatory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regulatory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegulatory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedicationKnowledgeRegulatory }
     * 
     * 
     */
    public List<MedicationKnowledgeRegulatory> getRegulatory() {
        if (regulatory == null) {
            regulatory = new ArrayList<MedicationKnowledgeRegulatory>();
        }
        return this.regulatory;
    }

    /**
     * Gets the value of the kinetics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kinetics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKinetics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedicationKnowledgeKinetics }
     * 
     * 
     */
    public List<MedicationKnowledgeKinetics> getKinetics() {
        if (kinetics == null) {
            kinetics = new ArrayList<MedicationKnowledgeKinetics>();
        }
        return this.kinetics;
    }

}
