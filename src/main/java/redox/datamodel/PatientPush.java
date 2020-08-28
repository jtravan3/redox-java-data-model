package redox.datamodel;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PatientPush{

	@JsonProperty("Meta")
	private Meta meta;

	@JsonProperty("FamilyHistoryText")
	private String familyHistoryText;

	@JsonProperty("MedicationsText")
	private String medicationsText;

	@JsonProperty("EncountersText")
	private String encountersText;

	@JsonProperty("Encounters")
	private List<EncountersItem> encounters;

	@JsonProperty("Procedures")
	private Procedures procedures;

	@JsonProperty("ImmunizationText")
	private String immunizationText;

	@JsonProperty("Immunizations")
	private List<ImmunizationsItem> immunizations;

	@JsonProperty("ProblemsText")
	private String problemsText;

	@JsonProperty("VitalSignsText")
	private String vitalSignsText;

	@JsonProperty("AdvanceDirectivesText")
	private String advanceDirectivesText;

	@JsonProperty("FamilyHistory")
	private List<FamilyHistoryItem> familyHistory;

	@JsonProperty("Medications")
	private List<MedicationsItem> medications;

	@JsonProperty("MedicalEquipmentText")
	private String medicalEquipmentText;

	@JsonProperty("VitalSigns")
	private List<VitalSignsItem> vitalSigns;

	@JsonProperty("MedicalEquipment")
	private List<MedicalEquipmentItem> medicalEquipment;

	@JsonProperty("InsurancesText")
	private Object insurancesText;

	@JsonProperty("PlanOfCare")
	private PlanOfCare planOfCare;

	@JsonProperty("Allergies")
	private List<AllergiesItem> allergies;

	@JsonProperty("AllergyText")
	private String allergyText;

	@JsonProperty("SocialHistory")
	private SocialHistory socialHistory;

	@JsonProperty("Problems")
	private List<ProblemsItem> problems;

	@JsonProperty("AdvanceDirectives")
	private List<AdvanceDirectivesItem> advanceDirectives;

	@JsonProperty("Header")
	private Header header;

	@JsonProperty("SocialHistoryText")
	private String socialHistoryText;

	@JsonProperty("Insurances")
	private List<InsurancesItem> insurances;

	@JsonProperty("Results")
	private List<ResultsItem> results;

	@JsonProperty("ResultText")
	private String resultText;

	@JsonProperty("ProceduresText")
	private String proceduresText;

	@JsonProperty("PlanOfCareText")
	private String planOfCareText;

	public void setMeta(Meta meta){
		this.meta = meta;
	}

	public Meta getMeta(){
		return meta;
	}

	public void setFamilyHistoryText(String familyHistoryText){
		this.familyHistoryText = familyHistoryText;
	}

	public String getFamilyHistoryText(){
		return familyHistoryText;
	}

	public void setMedicationsText(String medicationsText){
		this.medicationsText = medicationsText;
	}

	public String getMedicationsText(){
		return medicationsText;
	}

	public void setEncountersText(String encountersText){
		this.encountersText = encountersText;
	}

	public String getEncountersText(){
		return encountersText;
	}

	public void setEncounters(List<EncountersItem> encounters){
		this.encounters = encounters;
	}

	public List<EncountersItem> getEncounters(){
		return encounters;
	}

	public void setProcedures(Procedures procedures){
		this.procedures = procedures;
	}

	public Procedures getProcedures(){
		return procedures;
	}

	public void setImmunizationText(String immunizationText){
		this.immunizationText = immunizationText;
	}

	public String getImmunizationText(){
		return immunizationText;
	}

	public void setImmunizations(List<ImmunizationsItem> immunizations){
		this.immunizations = immunizations;
	}

	public List<ImmunizationsItem> getImmunizations(){
		return immunizations;
	}

	public void setProblemsText(String problemsText){
		this.problemsText = problemsText;
	}

	public String getProblemsText(){
		return problemsText;
	}

	public void setVitalSignsText(String vitalSignsText){
		this.vitalSignsText = vitalSignsText;
	}

	public String getVitalSignsText(){
		return vitalSignsText;
	}

	public void setAdvanceDirectivesText(String advanceDirectivesText){
		this.advanceDirectivesText = advanceDirectivesText;
	}

	public String getAdvanceDirectivesText(){
		return advanceDirectivesText;
	}

	public void setFamilyHistory(List<FamilyHistoryItem> familyHistory){
		this.familyHistory = familyHistory;
	}

	public List<FamilyHistoryItem> getFamilyHistory(){
		return familyHistory;
	}

	public void setMedications(List<MedicationsItem> medications){
		this.medications = medications;
	}

	public List<MedicationsItem> getMedications(){
		return medications;
	}

	public void setMedicalEquipmentText(String medicalEquipmentText){
		this.medicalEquipmentText = medicalEquipmentText;
	}

	public String getMedicalEquipmentText(){
		return medicalEquipmentText;
	}

	public void setVitalSigns(List<VitalSignsItem> vitalSigns){
		this.vitalSigns = vitalSigns;
	}

	public List<VitalSignsItem> getVitalSigns(){
		return vitalSigns;
	}

	public void setMedicalEquipment(List<MedicalEquipmentItem> medicalEquipment){
		this.medicalEquipment = medicalEquipment;
	}

	public List<MedicalEquipmentItem> getMedicalEquipment(){
		return medicalEquipment;
	}

	public void setInsurancesText(Object insurancesText){
		this.insurancesText = insurancesText;
	}

	public Object getInsurancesText(){
		return insurancesText;
	}

	public void setPlanOfCare(PlanOfCare planOfCare){
		this.planOfCare = planOfCare;
	}

	public PlanOfCare getPlanOfCare(){
		return planOfCare;
	}

	public void setAllergies(List<AllergiesItem> allergies){
		this.allergies = allergies;
	}

	public List<AllergiesItem> getAllergies(){
		return allergies;
	}

	public void setAllergyText(String allergyText){
		this.allergyText = allergyText;
	}

	public String getAllergyText(){
		return allergyText;
	}

	public void setSocialHistory(SocialHistory socialHistory){
		this.socialHistory = socialHistory;
	}

	public SocialHistory getSocialHistory(){
		return socialHistory;
	}

	public void setProblems(List<ProblemsItem> problems){
		this.problems = problems;
	}

	public List<ProblemsItem> getProblems(){
		return problems;
	}

	public void setAdvanceDirectives(List<AdvanceDirectivesItem> advanceDirectives){
		this.advanceDirectives = advanceDirectives;
	}

	public List<AdvanceDirectivesItem> getAdvanceDirectives(){
		return advanceDirectives;
	}

	public void setHeader(Header header){
		this.header = header;
	}

	public Header getHeader(){
		return header;
	}

	public void setSocialHistoryText(String socialHistoryText){
		this.socialHistoryText = socialHistoryText;
	}

	public String getSocialHistoryText(){
		return socialHistoryText;
	}

	public void setInsurances(List<InsurancesItem> insurances){
		this.insurances = insurances;
	}

	public List<InsurancesItem> getInsurances(){
		return insurances;
	}

	public void setResults(List<ResultsItem> results){
		this.results = results;
	}

	public List<ResultsItem> getResults(){
		return results;
	}

	public void setResultText(String resultText){
		this.resultText = resultText;
	}

	public String getResultText(){
		return resultText;
	}

	public void setProceduresText(String proceduresText){
		this.proceduresText = proceduresText;
	}

	public String getProceduresText(){
		return proceduresText;
	}

	public void setPlanOfCareText(String planOfCareText){
		this.planOfCareText = planOfCareText;
	}

	public String getPlanOfCareText(){
		return planOfCareText;
	}
}