
package redox.datamodel.clinicalsummary.visitpush;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import redox.datamodel.clinicalsummary.common.Header;
import redox.datamodel.clinicalsummary.common.AdvanceDirective;
import redox.datamodel.clinicalsummary.common.Encounter;
import redox.datamodel.clinicalsummary.common.FamilyHistory;
import redox.datamodel.clinicalsummary.common.Immunization;
import redox.datamodel.common.Insurance;
import redox.datamodel.clinicalsummary.common.MedicalEquipment;
import redox.datamodel.clinicalsummary.common.PlanOfCare;
import redox.datamodel.clinicalsummary.common.Problem;
import redox.datamodel.clinicalsummary.common.Procedures;
import redox.datamodel.clinicalsummary.common.Result;
import redox.datamodel.clinicalsummary.common.SocialHistory;
import redox.datamodel.clinicalsummary.common.VitalSign;
import redox.datamodel.common.Allergy;
import redox.datamodel.common.Meta;
import redox.datamodel.common.Medication;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Meta",
    "Header",
    "AdvanceDirectivesText",
    "AdvanceDirectives",
    "AllergyText",
    "Allergies",
    "AssessmentText",
    "Assessment",
    "ChiefComplaintText",
    "EncountersText",
    "Encounters",
    "FamilyHistoryText",
    "FamilyHistory",
    "HistoryOfPresentIllnessText",
    "ImmunizationText",
    "Immunizations",
    "InstructionsText",
    "InsurancesText",
    "Insurances",
    "InterventionsText",
    "MedicalEquipmentText",
    "MedicalEquipment",
    "MedicationsText",
    "Medications",
    "MedicationsAdministeredText",
    "MedicationsAdministered",
    "ObjectiveText",
    "PhysicalExamText",
    "PlanOfCareText",
    "PlanOfCare",
    "ProblemsText",
    "Problems",
    "ProceduresText",
    "Procedures",
    "ReasonForReferralText",
    "ReasonForVisitText",
    "ResultText",
    "Results",
    "ReviewOfSystemsText",
    "SocialHistoryText",
    "SocialHistory",
    "SubjectiveText",
    "VitalSignsText",
    "VitalSigns"
})
public class VisitPush {

    @JsonProperty("Meta")
    private Meta meta;
    @JsonProperty("Header")
    private Header header;
    @JsonProperty("AdvanceDirectivesText")
    private String advanceDirectivesText;
    @JsonProperty("AdvanceDirectives")
    private List<AdvanceDirective> advanceDirectives = null;
    @JsonProperty("AllergyText")
    private String allergyText;
    @JsonProperty("Allergies")
    private List<Allergy> allergies = null;
    @JsonProperty("AssessmentText")
    private String assessmentText;
    @JsonProperty("Assessment")
    private Assessment assessment;
    @JsonProperty("ChiefComplaintText")
    private String chiefComplaintText;
    @JsonProperty("EncountersText")
    private String encountersText;
    @JsonProperty("Encounters")
    private List<Encounter> encounters = null;
    @JsonProperty("FamilyHistoryText")
    private String familyHistoryText;
    @JsonProperty("FamilyHistory")
    private List<FamilyHistory> familyHistory = null;
    @JsonProperty("HistoryOfPresentIllnessText")
    private String historyOfPresentIllnessText;
    @JsonProperty("ImmunizationText")
    private String immunizationText;
    @JsonProperty("Immunizations")
    private List<Immunization> immunizations = null;
    @JsonProperty("InstructionsText")
    private String instructionsText;
    @JsonProperty("InsurancesText")
    private Object insurancesText;
    @JsonProperty("Insurances")
    private List<Insurance> insurances = null;
    @JsonProperty("InterventionsText")
    private String interventionsText;
    @JsonProperty("MedicalEquipmentText")
    private String medicalEquipmentText;
    @JsonProperty("MedicalEquipment")
    private List<MedicalEquipment> medicalEquipment = null;
    @JsonProperty("MedicationsText")
    private String medicationsText;
    @JsonProperty("Medications")
    private List<Medication> medications = null;
    @JsonProperty("MedicationsAdministeredText")
    private String medicationsAdministeredText;
    @JsonProperty("MedicationsAdministered")
    private List<MedicationsAdministered> medicationsAdministered = null;
    @JsonProperty("ObjectiveText")
    private String objectiveText;
    @JsonProperty("PhysicalExamText")
    private String physicalExamText;
    @JsonProperty("PlanOfCareText")
    private String planOfCareText;
    @JsonProperty("PlanOfCare")
    private PlanOfCare planOfCare;
    @JsonProperty("ProblemsText")
    private String problemsText;
    @JsonProperty("Problems")
    private List<Problem> problems = null;
    @JsonProperty("ProceduresText")
    private String proceduresText;
    @JsonProperty("Procedures")
    private Procedures procedures;
    @JsonProperty("ReasonForReferralText")
    private String reasonForReferralText;
    @JsonProperty("ReasonForVisitText")
    private String reasonForVisitText;
    @JsonProperty("ResultText")
    private String resultText;
    @JsonProperty("Results")
    private List<Result> results = null;
    @JsonProperty("ReviewOfSystemsText")
    private String reviewOfSystemsText;
    @JsonProperty("SocialHistoryText")
    private String socialHistoryText;
    @JsonProperty("SocialHistory")
    private SocialHistory socialHistory;
    @JsonProperty("SubjectiveText")
    private String subjectiveText;
    @JsonProperty("VitalSignsText")
    private String vitalSignsText;
    @JsonProperty("VitalSigns")
    private List<VitalSign> vitalSigns = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Meta")
    public Meta getMeta() {
        return meta;
    }

    @JsonProperty("Meta")
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    @JsonProperty("Header")
    public Header getHeader() {
        return header;
    }

    @JsonProperty("Header")
    public void setHeader(Header header) {
        this.header = header;
    }

    @JsonProperty("AdvanceDirectivesText")
    public String getAdvanceDirectivesText() {
        return advanceDirectivesText;
    }

    @JsonProperty("AdvanceDirectivesText")
    public void setAdvanceDirectivesText(String advanceDirectivesText) {
        this.advanceDirectivesText = advanceDirectivesText;
    }

    @JsonProperty("AdvanceDirectives")
    public List<AdvanceDirective> getAdvanceDirectives() {
        return advanceDirectives;
    }

    @JsonProperty("AdvanceDirectives")
    public void setAdvanceDirectives(List<AdvanceDirective> advanceDirectives) {
        this.advanceDirectives = advanceDirectives;
    }

    @JsonProperty("AllergyText")
    public String getAllergyText() {
        return allergyText;
    }

    @JsonProperty("AllergyText")
    public void setAllergyText(String allergyText) {
        this.allergyText = allergyText;
    }

    @JsonProperty("Allergies")
    public List<Allergy> getAllergies() {
        return allergies;
    }

    @JsonProperty("Allergies")
    public void setAllergies(List<Allergy> allergies) {
        this.allergies = allergies;
    }

    @JsonProperty("AssessmentText")
    public String getAssessmentText() {
        return assessmentText;
    }

    @JsonProperty("AssessmentText")
    public void setAssessmentText(String assessmentText) {
        this.assessmentText = assessmentText;
    }

    @JsonProperty("Assessment")
    public Assessment getAssessment() {
        return assessment;
    }

    @JsonProperty("Assessment")
    public void setAssessment(Assessment assessment) {
        this.assessment = assessment;
    }

    @JsonProperty("ChiefComplaintText")
    public String getChiefComplaintText() {
        return chiefComplaintText;
    }

    @JsonProperty("ChiefComplaintText")
    public void setChiefComplaintText(String chiefComplaintText) {
        this.chiefComplaintText = chiefComplaintText;
    }

    @JsonProperty("EncountersText")
    public String getEncountersText() {
        return encountersText;
    }

    @JsonProperty("EncountersText")
    public void setEncountersText(String encountersText) {
        this.encountersText = encountersText;
    }

    @JsonProperty("Encounters")
    public List<Encounter> getEncounters() {
        return encounters;
    }

    @JsonProperty("Encounters")
    public void setEncounters(List<Encounter> encounters) {
        this.encounters = encounters;
    }

    @JsonProperty("FamilyHistoryText")
    public String getFamilyHistoryText() {
        return familyHistoryText;
    }

    @JsonProperty("FamilyHistoryText")
    public void setFamilyHistoryText(String familyHistoryText) {
        this.familyHistoryText = familyHistoryText;
    }

    @JsonProperty("FamilyHistory")
    public List<FamilyHistory> getFamilyHistory() {
        return familyHistory;
    }

    @JsonProperty("FamilyHistory")
    public void setFamilyHistory(List<FamilyHistory> familyHistory) {
        this.familyHistory = familyHistory;
    }

    @JsonProperty("HistoryOfPresentIllnessText")
    public String getHistoryOfPresentIllnessText() {
        return historyOfPresentIllnessText;
    }

    @JsonProperty("HistoryOfPresentIllnessText")
    public void setHistoryOfPresentIllnessText(String historyOfPresentIllnessText) {
        this.historyOfPresentIllnessText = historyOfPresentIllnessText;
    }

    @JsonProperty("ImmunizationText")
    public String getImmunizationText() {
        return immunizationText;
    }

    @JsonProperty("ImmunizationText")
    public void setImmunizationText(String immunizationText) {
        this.immunizationText = immunizationText;
    }

    @JsonProperty("Immunizations")
    public List<Immunization> getImmunizations() {
        return immunizations;
    }

    @JsonProperty("Immunizations")
    public void setImmunizations(List<Immunization> immunizations) {
        this.immunizations = immunizations;
    }

    @JsonProperty("InstructionsText")
    public String getInstructionsText() {
        return instructionsText;
    }

    @JsonProperty("InstructionsText")
    public void setInstructionsText(String instructionsText) {
        this.instructionsText = instructionsText;
    }

    @JsonProperty("InsurancesText")
    public Object getInsurancesText() {
        return insurancesText;
    }

    @JsonProperty("InsurancesText")
    public void setInsurancesText(Object insurancesText) {
        this.insurancesText = insurancesText;
    }

    @JsonProperty("Insurances")
    public List<Insurance> getInsurances() {
        return insurances;
    }

    @JsonProperty("Insurances")
    public void setInsurances(List<Insurance> insurances) {
        this.insurances = insurances;
    }

    @JsonProperty("InterventionsText")
    public String getInterventionsText() {
        return interventionsText;
    }

    @JsonProperty("InterventionsText")
    public void setInterventionsText(String interventionsText) {
        this.interventionsText = interventionsText;
    }

    @JsonProperty("MedicalEquipmentText")
    public String getMedicalEquipmentText() {
        return medicalEquipmentText;
    }

    @JsonProperty("MedicalEquipmentText")
    public void setMedicalEquipmentText(String medicalEquipmentText) {
        this.medicalEquipmentText = medicalEquipmentText;
    }

    @JsonProperty("MedicalEquipment")
    public List<MedicalEquipment> getMedicalEquipment() {
        return medicalEquipment;
    }

    @JsonProperty("MedicalEquipment")
    public void setMedicalEquipment(List<MedicalEquipment> medicalEquipment) {
        this.medicalEquipment = medicalEquipment;
    }

    @JsonProperty("MedicationsText")
    public String getMedicationsText() {
        return medicationsText;
    }

    @JsonProperty("MedicationsText")
    public void setMedicationsText(String medicationsText) {
        this.medicationsText = medicationsText;
    }

    @JsonProperty("Medications")
    public List<Medication> getMedications() {
        return medications;
    }

    @JsonProperty("Medications")
    public void setMedications(List<Medication> medications) {
        this.medications = medications;
    }

    @JsonProperty("MedicationsAdministeredText")
    public String getMedicationsAdministeredText() {
        return medicationsAdministeredText;
    }

    @JsonProperty("MedicationsAdministeredText")
    public void setMedicationsAdministeredText(String medicationsAdministeredText) {
        this.medicationsAdministeredText = medicationsAdministeredText;
    }

    @JsonProperty("MedicationsAdministered")
    public List<MedicationsAdministered> getMedicationsAdministered() {
        return medicationsAdministered;
    }

    @JsonProperty("MedicationsAdministered")
    public void setMedicationsAdministered(List<MedicationsAdministered> medicationsAdministered) {
        this.medicationsAdministered = medicationsAdministered;
    }

    @JsonProperty("ObjectiveText")
    public String getObjectiveText() {
        return objectiveText;
    }

    @JsonProperty("ObjectiveText")
    public void setObjectiveText(String objectiveText) {
        this.objectiveText = objectiveText;
    }

    @JsonProperty("PhysicalExamText")
    public String getPhysicalExamText() {
        return physicalExamText;
    }

    @JsonProperty("PhysicalExamText")
    public void setPhysicalExamText(String physicalExamText) {
        this.physicalExamText = physicalExamText;
    }

    @JsonProperty("PlanOfCareText")
    public String getPlanOfCareText() {
        return planOfCareText;
    }

    @JsonProperty("PlanOfCareText")
    public void setPlanOfCareText(String planOfCareText) {
        this.planOfCareText = planOfCareText;
    }

    @JsonProperty("PlanOfCare")
    public PlanOfCare getPlanOfCare() {
        return planOfCare;
    }

    @JsonProperty("PlanOfCare")
    public void setPlanOfCare(PlanOfCare planOfCare) {
        this.planOfCare = planOfCare;
    }

    @JsonProperty("ProblemsText")
    public String getProblemsText() {
        return problemsText;
    }

    @JsonProperty("ProblemsText")
    public void setProblemsText(String problemsText) {
        this.problemsText = problemsText;
    }

    @JsonProperty("Problems")
    public List<Problem> getProblems() {
        return problems;
    }

    @JsonProperty("Problems")
    public void setProblems(List<Problem> problems) {
        this.problems = problems;
    }

    @JsonProperty("ProceduresText")
    public String getProceduresText() {
        return proceduresText;
    }

    @JsonProperty("ProceduresText")
    public void setProceduresText(String proceduresText) {
        this.proceduresText = proceduresText;
    }

    @JsonProperty("Procedures")
    public Procedures getProcedures() {
        return procedures;
    }

    @JsonProperty("Procedures")
    public void setProcedures(Procedures procedures) {
        this.procedures = procedures;
    }

    @JsonProperty("ReasonForReferralText")
    public String getReasonForReferralText() {
        return reasonForReferralText;
    }

    @JsonProperty("ReasonForReferralText")
    public void setReasonForReferralText(String reasonForReferralText) {
        this.reasonForReferralText = reasonForReferralText;
    }

    @JsonProperty("ReasonForVisitText")
    public String getReasonForVisitText() {
        return reasonForVisitText;
    }

    @JsonProperty("ReasonForVisitText")
    public void setReasonForVisitText(String reasonForVisitText) {
        this.reasonForVisitText = reasonForVisitText;
    }

    @JsonProperty("ResultText")
    public String getResultText() {
        return resultText;
    }

    @JsonProperty("ResultText")
    public void setResultText(String resultText) {
        this.resultText = resultText;
    }

    @JsonProperty("Results")
    public List<Result> getResults() {
        return results;
    }

    @JsonProperty("Results")
    public void setResults(List<Result> results) {
        this.results = results;
    }

    @JsonProperty("ReviewOfSystemsText")
    public String getReviewOfSystemsText() {
        return reviewOfSystemsText;
    }

    @JsonProperty("ReviewOfSystemsText")
    public void setReviewOfSystemsText(String reviewOfSystemsText) {
        this.reviewOfSystemsText = reviewOfSystemsText;
    }

    @JsonProperty("SocialHistoryText")
    public String getSocialHistoryText() {
        return socialHistoryText;
    }

    @JsonProperty("SocialHistoryText")
    public void setSocialHistoryText(String socialHistoryText) {
        this.socialHistoryText = socialHistoryText;
    }

    @JsonProperty("SocialHistory")
    public SocialHistory getSocialHistory() {
        return socialHistory;
    }

    @JsonProperty("SocialHistory")
    public void setSocialHistory(SocialHistory socialHistory) {
        this.socialHistory = socialHistory;
    }

    @JsonProperty("SubjectiveText")
    public String getSubjectiveText() {
        return subjectiveText;
    }

    @JsonProperty("SubjectiveText")
    public void setSubjectiveText(String subjectiveText) {
        this.subjectiveText = subjectiveText;
    }

    @JsonProperty("VitalSignsText")
    public String getVitalSignsText() {
        return vitalSignsText;
    }

    @JsonProperty("VitalSignsText")
    public void setVitalSignsText(String vitalSignsText) {
        this.vitalSignsText = vitalSignsText;
    }

    @JsonProperty("VitalSigns")
    public List<VitalSign> getVitalSigns() {
        return vitalSigns;
    }

    @JsonProperty("VitalSigns")
    public void setVitalSigns(List<VitalSign> vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
