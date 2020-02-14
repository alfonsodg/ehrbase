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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * 
 * <p>Java class for BackboneElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BackboneElement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Element">
 *       &lt;sequence>
 *         &lt;element name="modifierExtension" type="{http://hl7.org/fhir}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BackboneElement", propOrder = {
    "modifierExtension"
})
@XmlSeeAlso({
    ContractSigner.class,
    DeviceDefinitionCapability.class,
    ProvenanceEntity.class,
    SpecimenDefinitionHandling.class,
    DocumentReferenceRelatesTo.class,
    CapabilityStatementSecurity.class,
    ElementDefinitionSlicing.class,
    ContractRule.class,
    MeasureStratifier.class,
    ExplanationOfBenefitAddItem.class,
    EncounterClassHistory.class,
    MedicinalProductIngredientReferenceStrength.class,
    ClaimResponseError.class,
    ClaimResponseDetail.class,
    DeviceUdiCarrier.class,
    SubstanceIngredient.class,
    ClaimResponsePayment.class,
    ProductShelfLife.class,
    SubstanceSourceMaterialAuthor.class,
    ConsentPolicy.class,
    TerminologyCapabilitiesExpansion.class,
    NutritionOrderSupplement.class,
    VisionPrescriptionLensSpecification.class,
    SpecimenContainer.class,
    ExplanationOfBenefitPayee.class,
    ValueSetContains.class,
    ExplanationOfBenefitTotal.class,
    NamingSystemUniqueId.class,
    CareTeamParticipant.class,
    MeasureReportStratifier.class,
    MedicationDispensePerformer.class,
    DiagnosticReportMedia.class,
    ResearchStudyObjective.class,
    TestScriptCapability.class,
    DeviceDefinitionProperty.class,
    MolecularSequenceOuter.class,
    OperationDefinitionBinding.class,
    PractitionerRoleNotAvailable.class,
    AuditEventSource.class,
    CapabilityStatementImplementation.class,
    Dosage.class,
    SubstanceSourceMaterialFractionDescription.class,
    MedicationRequestInitialFill.class,
    SubstancePolymerRepeatUnit.class,
    ClinicalImpressionInvestigation.class,
    ClaimResponseAdjudication.class,
    MedicationAdministrationDosage.class,
    SubstanceReferenceInformationGeneElement.class,
    ImplementationGuideResource1 .class,
    SubstancePolymerStructuralRepresentation.class,
    QuestionnaireResponseItem.class,
    QuestionnaireAnswerOption.class,
    SupplyDeliverySuppliedItem.class,
    SubstanceReferenceInformationTarget.class,
    CoverageCostToBeneficiary.class,
    SubstanceSourceMaterialOrganismGeneral.class,
    StructureDefinitionMapping.class,
    ValueSetFilter.class,
    TestReportSetup.class,
    MedicinalProductIngredientSpecifiedSubstance.class,
    ClaimResponseProcessNote.class,
    HealthcareServiceNotAvailable.class,
    MedicationKnowledgeSubstitution.class,
    CodeSystemConcept.class,
    CarePlanActivity.class,
    TestScriptLink.class,
    MedicationKnowledgeKinetics.class,
    NutritionOrderAdministration.class,
    SubstanceSpecificationRepresentation.class,
    CommunicationRequestPayload.class,
    SubstanceSpecificationIsotope.class,
    ContractAnswer.class,
    TaskInput.class,
    MedicationKnowledgeMonitoringProgram.class,
    ImplementationGuideDefinition.class,
    MessageDefinitionFocus.class,
    MedicationRequestDispenseRequest.class,
    PractitionerRoleAvailableTime.class,
    DeviceVersion.class,
    VerificationResultPrimarySource.class,
    CapabilityStatementDocument.class,
    SubstanceNucleicAcidSugar.class,
    ExplanationOfBenefitProcessNote.class,
    MedicinalProductNamePart.class,
    SubstanceNucleicAcidLinkage.class,
    ContractContentDefinition.class,
    ExplanationOfBenefitProcedure.class,
    OperationOutcomeIssue.class,
    Timing.class,
    EffectEvidenceSynthesisEffectEstimate.class,
    MolecularSequenceRepository.class,
    CapabilityStatementEndpoint.class,
    EpisodeOfCareDiagnosis.class,
    TerminologyCapabilitiesSoftware.class,
    ExampleScenarioVersion.class,
    NutritionOrderNutrient.class,
    MarketingStatus.class,
    MedicinalProductPharmaceuticalRouteOfAdministration.class,
    ImmunizationEducation.class,
    Population.class,
    ExplanationOfBenefitSubDetail.class,
    GroupMember.class,
    ConditionStage.class,
    CoverageEligibilityRequestItem.class,
    StructureDefinitionContext.class,
    TestReportAction.class,
    RiskEvidenceSynthesisPrecisionEstimate.class,
    MedicationKnowledgeIngredient.class,
    ImagingStudyPerformer.class,
    ExampleScenarioOperation.class,
    MolecularSequenceReferenceSeq.class,
    SearchParameterComponent.class,
    QuestionnaireResponseAnswer.class,
    SubstanceAmount.class,
    MedicinalProductName.class,
    ImplementationGuideGlobal.class,
    MedicationDispenseSubstitution.class,
    MedicationKnowledgeSchedule.class,
    StructureDefinitionDifferential.class,
    MessageDefinitionAllowedResponse.class,
    TestReportAction1 .class,
    TestReportOperation.class,
    TestReportAction2 .class,
    PersonLink.class,
    PlanDefinitionRelatedAction.class,
    ChargeItemDefinitionApplicability.class,
    TimingRepeat.class,
    InsurancePlanLimit.class,
    CommunicationPayload.class,
    ExplanationOfBenefitDetail1 .class,
    EncounterDiagnosis.class,
    GraphDefinitionTarget.class,
    DeviceDefinitionDeviceName.class,
    CompositionEvent.class,
    PatientContact.class,
    ValueSetCompose.class,
    ExampleScenarioAlternative.class,
    ResearchStudyArm.class,
    ListEntry.class,
    VisionPrescriptionPrism.class,
    SubstanceNucleicAcidSubunit.class,
    TaskOutput.class,
    SubstancePolymerStartingMaterial.class,
    AuditEventNetwork.class,
    MedicinalProductCountryLanguage.class,
    ConceptMapUnmapped.class,
    ConceptMapGroup.class,
    SubstancePolymerRepeat.class,
    EncounterParticipant.class,
    SubstanceSourceMaterialPartDescription.class,
    AllergyIntoleranceReaction.class,
    DeviceMetricCalibration.class,
    ImmunizationProtocolApplied.class,
    ProcedurePerformer.class,
    MedicinalProductPharmaceuticalCharacteristics.class,
    RiskAssessmentPrediction.class,
    MeasureReportComponent.class,
    ImplementationGuideTemplate.class,
    NutritionOrderEnteralFormula.class,
    SpecimenCollection.class,
    DeviceSpecialization.class,
    MedicinalProductIngredientStrength.class,
    DeviceDeviceName.class,
    QuestionnaireItem.class,
    MedicinalProductAuthorizationJurisdictionalAuthorization.class,
    MedicinalProductPharmaceuticalTargetSpecies.class,
    ExampleScenarioProcess.class,
    CapabilityStatementSupportedMessage.class,
    CodeSystemProperty.class,
    StructureMapRule.class,
    ValueSetConcept.class,
    MedicationKnowledgeCost.class,
    ConsentProvision.class,
    RelatedPersonCommunication.class,
    EffectEvidenceSynthesisResultsByExposure.class,
    TestReportTeardown.class,
    MedicationKnowledgeDrugCharacteristic.class,
    PlanDefinitionAction.class,
    ImplementationGuideGrouping.class,
    ClaimSupportingInfo.class,
    ProcedureFocalDevice.class,
    OrganizationContact.class,
    ObservationReferenceRange.class,
    RequestGroupAction.class,
    MedicinalProductAuthorizationProcedure.class,
    TestScriptFixture.class,
    TestReportTest.class,
    MedicinalProductPharmaceuticalWithdrawalPeriod.class,
    MeasureReportPopulation1 .class,
    ImplementationGuidePage1 .class,
    QuestionnaireEnableWhen.class,
    SubstanceAmountReferenceRange.class,
    SubstanceInstance.class,
    CapabilityStatementSearchParam.class,
    ClinicalImpressionFinding.class,
    ExplanationOfBenefitBenefitBalance.class,
    CoverageEligibilityResponseItem.class,
    DeviceDefinitionUdiDeviceIdentifier.class,
    MeasureComponent.class,
    TestScriptRequestHeader.class,
    DeviceProperty.class,
    ImmunizationPerformer.class,
    InvoicePriceComponent.class,
    SubstancePolymerDegreeOfPolymerisation.class,
    CoverageEligibilityRequestSupportingInfo.class,
    ImmunizationReaction.class,
    TestScriptAssert.class,
    ElementDefinitionDiscriminator.class,
    InsurancePlanBenefit.class,
    CapabilityStatementMessaging.class,
    ConceptMapElement.class,
    ExplanationOfBenefitAccident.class,
    ContractFriendly.class,
    EncounterLocation.class,
    MedicationBatch.class,
    MedicationKnowledgeMaxDispense.class,
    ExplanationOfBenefitAdjudication.class,
    MolecularSequenceStructureVariant.class,
    CoverageEligibilityResponseInsurance.class,
    TaskRestriction.class,
    HealthcareServiceEligibility.class,
    ClaimResponseItem.class,
    ElementDefinitionMapping.class,
    ElementDefinitionBase.class,
    MedicationAdministrationPerformer.class,
    PatientLink.class,
    ExplanationOfBenefitRelated.class,
    MedicationKnowledgePatientCharacteristics.class,
    ClaimDetail.class,
    InsurancePlanCost.class,
    StructureMapInput.class,
    CoverageException.class,
    ElementDefinitionConstraint.class,
    TestScriptTeardown.class,
    ClaimResponseTotal.class,
    TerminologyCapabilitiesClosure.class,
    MedicationKnowledgeRelatedMedicationKnowledge.class,
    EpisodeOfCareStatusHistory.class,
    OperationDefinitionReferencedFrom.class,
    CodeSystemDesignation.class,
    ProdCharacteristic.class,
    ExplanationOfBenefitItem.class,
    SubstanceSpecificationCode.class,
    StructureMapSource.class,
    MedicationKnowledgeMedicineClassification.class,
    ClaimAccident.class,
    BundleResponse.class,
    TerminologyCapabilitiesCodeSystem.class,
    CapabilityStatementOperation.class,
    MedicationKnowledgeAdministrationGuidelines.class,
    ElementDefinitionType.class,
    ParametersParameter.class,
    ClaimPayee.class,
    ExplanationOfBenefitDetail.class,
    ChargeItemDefinitionPropertyGroup.class,
    ImmunizationRecommendationRecommendation.class,
    QuestionnaireInitial.class,
    CompartmentDefinitionResource.class,
    MedicinalProductPackagedPackageItem.class,
    ValueSetDesignation.class,
    SubstanceSpecificationProperty.class,
    ChargeItemDefinitionPriceComponent.class,
    BiologicallyDerivedProductStorage.class,
    MedicationRequestSubstitution.class,
    ResearchElementDefinitionCharacteristic.class,
    EncounterStatusHistory.class,
    SpecimenDefinitionAdditive.class,
    EffectEvidenceSynthesisPrecisionEstimate.class,
    SubstanceSourceMaterialHybrid.class,
    ValueSetParameter.class,
    DosageDoseAndRate.class,
    MedicationKnowledgeMonograph.class,
    ContractAsset.class,
    ElementDefinitionExample.class,
    ImmunizationRecommendationDateCriterion.class,
    DetectedIssueMitigation.class,
    VerificationResultValidator.class,
    CompositionSection.class,
    EffectEvidenceSynthesisCertaintySubcomponent.class,
    CapabilityStatementInteraction1 .class,
    CapabilityStatementRest.class,
    CompositionAttester.class,
    TerminologyCapabilitiesVersion.class,
    PatientCommunication.class,
    TestScriptTest.class,
    SubstanceSpecificationName.class,
    ClaimResponseDetail1 .class,
    ClaimResponseInsurance.class,
    InsurancePlanCoverage.class,
    DocumentReferenceContext.class,
    MeasureGroup.class,
    SpecimenDefinitionContainer.class,
    BundleRequest.class,
    MessageHeaderDestination.class,
    CoverageClass.class,
    SubstanceSpecificationOfficial.class,
    ContractValuedItem.class,
    InsurancePlanBenefit1 .class,
    AccountCoverage.class,
    GraphDefinitionLink.class,
    RequestGroupCondition.class,
    TerminologyCapabilitiesFilter.class,
    TerminologyCapabilitiesValidateCode.class,
    ClaimInsurance.class,
    ExampleScenarioContainedInstance.class,
    ConsentVerification.class,
    ImagingStudySeries.class,
    MedicinalProductIndicationOtherTherapy.class,
    ExampleScenarioStep.class,
    CapabilityStatementSoftware.class,
    MeasureReportPopulation.class,
    AuditEventEntity.class,
    StructureMapGroup.class,
    ContractParty.class,
    InvoiceParticipant.class,
    ActivityDefinitionDynamicValue.class,
    MedicinalProductPackagedBatchIdentifier.class,
    BiologicallyDerivedProductProcessing.class,
    ClaimResponseAddItem.class,
    ActivityDefinitionParticipant.class,
    TestScriptDestination.class,
    CapabilityStatementInteraction.class,
    ImplementationGuideManifest.class,
    StructureMapDependent.class,
    ConditionEvidence.class,
    ExplanationOfBenefitPayment.class,
    ElementDefinition.class,
    ContractSecurityLabel.class,
    MedicinalProductInteractionInteractant.class,
    ClaimSubDetail.class,
    InvoiceLineItem.class,
    TestScriptAction.class,
    MeasureReportStratum.class,
    StructureMapStructure.class,
    SubstanceSpecificationMolecularWeight.class,
    CodeSystemProperty1 .class,
    InsurancePlanSpecificCost.class,
    ClaimProcedure.class,
    ContractContext.class,
    MeasureSupplementalData.class,
    ContractOffer.class,
    ContractLegal.class,
    ClaimResponseSubDetail1 .class,
    ConsentData.class,
    ConceptMapTarget.class,
    HealthcareServiceAvailableTime.class,
    EvidenceVariableCharacteristic.class,
    MedicationKnowledgeRegulatory.class,
    ExampleScenarioInstance.class,
    ContractTerm.class,
    ClaimDiagnosis.class,
    TestScriptMetadata.class,
    DeviceRequestParameter.class,
    ClaimCareTeam.class,
    SupplyRequestParameter.class,
    NutritionOrderTexture.class,
    InsurancePlanContact.class,
    DocumentManifestRelated.class,
    RiskEvidenceSynthesisSampleSize.class,
    ImagingStudyInstance.class,
    SpecimenProcessing.class,
    DocumentReferenceContent.class,
    PaymentReconciliationProcessNote.class,
    AdverseEventCausality.class,
    GraphDefinitionCompartment.class,
    CarePlanDetail.class,
    ContractSubject.class,
    SubstanceSourceMaterialOrganism.class,
    AuditEventAgent.class,
    MedicinalProductManufacturingBusinessOperation.class,
    SubstancePolymerMonomerSet.class,
    ConceptMapDependsOn.class,
    ExplanationOfBenefitCareTeam.class,
    MolecularSequenceRoc.class,
    MolecularSequenceInner.class,
    RequestGroupRelatedAction.class,
    TerminologyCapabilitiesTranslation.class,
    ExplanationOfBenefitFinancial.class,
    OperationDefinitionOverload.class,
    ContractAction.class,
    SubstanceSpecificationStructure.class,
    RiskEvidenceSynthesisCertainty.class,
    TestScriptSetup.class,
    AuditEventDetail.class,
    CodeSystemFilter.class,
    CoverageEligibilityResponseBenefit.class,
    ClaimResponseSubDetail.class,
    MedicinalProductIngredientSubstance.class,
    StructureMapTarget.class,
    PlanDefinitionDynamicValue.class,
    ObservationDefinitionQualifiedInterval.class,
    ClaimItem.class,
    MolecularSequenceQuality.class,
    CapabilityStatementResource.class,
    InsurancePlanGeneralCost.class,
    MedicationKnowledgePackaging.class,
    CatalogEntryRelatedEntry.class,
    DetectedIssueEvidence.class,
    ProvenanceAgent.class,
    ExplanationOfBenefitDiagnosis.class,
    LinkageItem.class,
    ObservationComponent.class,
    ImplementationGuideParameter.class,
    ExplanationOfBenefitSupportingInfo.class,
    ChargeItemPerformer.class,
    CompositionRelatesTo.class,
    CoverageEligibilityRequestDiagnosis.class,
    RiskEvidenceSynthesisCertaintySubcomponent.class,
    SpecimenDefinitionTypeTested.class,
    TestScriptVariable.class,
    GoalTarget.class,
    EffectEvidenceSynthesisCertainty.class,
    ImplementationGuideDependsOn.class,
    PlanDefinitionParticipant.class,
    MedicinalProductContraindicationOtherTherapy.class,
    OperationDefinitionParameter.class,
    GroupCharacteristic.class,
    MedicationKnowledgeDosage.class,
    StructureDefinitionSnapshot.class,
    BundleEntry.class,
    BundleSearch.class,
    ExplanationOfBenefitSubDetail1 .class,
    AppointmentParticipant.class,
    BiologicallyDerivedProductCollection.class,
    ConsentActor.class,
    MedicationIngredient.class,
    PractitionerQualification.class,
    MeasureReportGroup.class,
    SubscriptionChannel.class,
    SubstanceSpecificationRelationship.class,
    VerificationResultAttestation.class,
    MedicinalProductSpecialDesignation.class,
    TestScriptOperation.class,
    TestScriptOrigin.class,
    StructureMapParameter.class,
    TestScriptAction2 .class,
    TestScriptAction1 .class,
    ImplementationGuideResource.class,
    SubstanceReferenceInformationGene.class,
    ExampleScenarioActor.class,
    FamilyMemberHistoryCondition.class,
    ElementDefinitionBinding.class,
    DeviceDefinitionSpecialization.class,
    ExplanationOfBenefitInsurance.class,
    PlanDefinitionCondition.class,
    SubstanceReferenceInformationClassification.class,
    SubstanceProteinSubunit.class,
    TerminologyCapabilitiesImplementation.class,
    EncounterHospitalization.class,
    LocationHoursOfOperation.class,
    NutritionOrderOralDiet.class,
    TestReportAssert.class,
    CoverageEligibilityResponseError.class,
    BiologicallyDerivedProductManipulation.class,
    LocationPosition.class,
    DeviceDefinitionMaterial.class,
    RiskEvidenceSynthesisRiskEstimate.class,
    EffectEvidenceSynthesisSampleSize.class,
    ImplementationGuidePage.class,
    MolecularSequenceVariant.class,
    PlanDefinitionTarget.class,
    AdverseEventSuspectEntity.class,
    TestReportParticipant.class,
    PaymentReconciliationDetail.class,
    ValueSetInclude.class,
    SubstanceSpecificationMoiety.class,
    MessageHeaderSource.class,
    MessageHeaderResponse.class,
    TerminologyCapabilitiesParameter.class,
    AccountGuarantor.class,
    PlanDefinitionGoal.class,
    MeasurePopulation.class,
    ObservationDefinitionQuantitativeDetails.class,
    ValueSetExpansion.class,
    InsurancePlanPlan.class,
    CoverageEligibilityRequestInsurance.class,
    BundleLink.class,
    ClaimRelated.class
})
public class BackboneElement
    extends Element
{

    protected List<Extension> modifierExtension;

    /**
     * Gets the value of the modifierExtension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modifierExtension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModifierExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension }
     * 
     * 
     */
    public List<Extension> getModifierExtension() {
        if (modifierExtension == null) {
            modifierExtension = new ArrayList<Extension>();
        }
        return this.modifierExtension;
    }

}
