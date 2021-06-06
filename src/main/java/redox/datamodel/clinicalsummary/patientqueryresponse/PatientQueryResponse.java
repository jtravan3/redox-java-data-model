
package redox.datamodel.clinicalsummary.patientqueryresponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import redox.datamodel.clinicalsummary.common.*;
import redox.datamodel.common.Insurance;
import redox.datamodel.common.Medication;
import redox.datamodel.common.Meta;
import redox.datamodel.common.Allergy;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Meta",
    "Header",
    "AdvanceDirectivesText",
    "AdvanceDirectives",
    "AllergyText",
    "Allergies",
    "EncountersText",
    "Encounters",
    "FamilyHistoryText",
    "FamilyHistory",
    "ImmunizationText",
    "Immunizations",
    "InsurancesText",
    "Insurances",
    "MedicalEquipmentText",
    "MedicalEquipment",
    "MedicationsText",
    "Medications",
    "PlanOfCareText",
    "PlanOfCare",
    "ProblemsText",
    "Problems",
    "ProceduresText",
    "Procedures",
    "ResultText",
    "Results",
    "SocialHistoryText",
    "SocialHistory",
    "VitalSignsText",
    "VitalSigns"
})
public class PatientQueryResponse {

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
    @JsonProperty("EncountersText")
    private String encountersText;
    @JsonProperty("Encounters")
    private List<Encounter> encounters = null;
    @JsonProperty("FamilyHistoryText")
    private String familyHistoryText;
    @JsonProperty("FamilyHistory")
    private List<FamilyHistory> familyHistory = null;
    @JsonProperty("ImmunizationText")
    private String immunizationText;
    @JsonProperty("Immunizations")
    private List<Immunization> immunizations = null;
    @JsonProperty("InsurancesText")
    private Object insurancesText;
    @JsonProperty("Insurances")
    private List<Insurance> insurances = null;
    @JsonProperty("MedicalEquipmentText")
    private String medicalEquipmentText;
    @JsonProperty("MedicalEquipment")
    private List<MedicalEquipment> medicalEquipment = null;
    @JsonProperty("MedicationsText")
    private String medicationsText;
    @JsonProperty("Medications")
    private List<Medication> medications = null;
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
    @JsonProperty("ResultText")
    private String resultText;
    @JsonProperty("Results")
    private List<Result> results = null;
    @JsonProperty("SocialHistoryText")
    private String socialHistoryText;
    @JsonProperty("SocialHistory")
    private SocialHistory socialHistory;
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
