
package redox.datamodel.patientadmin.discharge;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import redox.datamodel.common.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "VisitNumber",
    "AccountNumber",
    "PatientClass",
    "VisitDateTime",
    "DischargeDateTime",
    "DischargeStatus",
    "DischargeLocation",
    "Duration",
    "Reason",
    "Instructions",
    "Balance",
    "DiagnosisRelatedGroup",
    "DiagnosisRelatedGroupType",
    "AttendingProvider",
    "ConsultingProvider",
    "ReferringProvider",
    "AdmittingProvider",
    "AdditionalStaff",
    "Location",
    "Guarantor",
    "Insurances",
})
@Generated("jsonschema2pojo")
public class Visit {

    @JsonProperty("VisitNumber")
    private String visitNumber;
    @JsonProperty("AccountNumber")
    private Object accountNumber;
    @JsonProperty("PatientClass")
    private String patientClass;
    @JsonProperty("VisitDateTime")
    private String visitDateTime;
    @JsonProperty("DischargeDateTime")
    private String dischargeDateTime;
    @JsonProperty("DischargeStatus")
    private DischargeStatus dischargeStatus;
    @JsonProperty("DischargeLocation")
    private DischargeLocation dischargeLocation;
    @JsonProperty("Duration")
    private Object duration;
    @JsonProperty("Reason")
    private String reason;
    @JsonProperty("Instructions")
    private List<Object> instructions = null;
    @JsonProperty("Balance")
    private Object balance;
    @JsonProperty("DiagnosisRelatedGroup")
    private Object diagnosisRelatedGroup;
    @JsonProperty("DiagnosisRelatedGroupType")
    private Object diagnosisRelatedGroupType;
    @JsonProperty("AttendingProvider")
    private AttendingProvider attendingProvider;
    @JsonProperty("ConsultingProvider")
    private ConsultingProvider consultingProvider;
    @JsonProperty("ReferringProvider")
    private ReferringProvider referringProvider;
    @JsonProperty("AdmittingProvider")
    private AdmittingProvider admittingProvider;
    @JsonProperty("AdditionalStaff")
    private List<Object> additionalStaff = null;
    @JsonProperty("Location")
    private Location location;
    @JsonProperty("Guarantor")
    private Guarantor guarantor;
    @JsonProperty("Insurances")
    private List<Insurance> insurances = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("VisitNumber")
    public String getVisitNumber() {
        return visitNumber;
    }

    @JsonProperty("VisitNumber")
    public void setVisitNumber(String visitNumber) {
        this.visitNumber = visitNumber;
    }

    @JsonProperty("AccountNumber")
    public Object getAccountNumber() {
        return accountNumber;
    }

    @JsonProperty("AccountNumber")
    public void setAccountNumber(Object accountNumber) {
        this.accountNumber = accountNumber;
    }

    @JsonProperty("PatientClass")
    public String getPatientClass() {
        return patientClass;
    }

    @JsonProperty("PatientClass")
    public void setPatientClass(String patientClass) {
        this.patientClass = patientClass;
    }

    @JsonProperty("VisitDateTime")
    public String getVisitDateTime() {
        return visitDateTime;
    }

    @JsonProperty("VisitDateTime")
    public void setVisitDateTime(String visitDateTime) {
        this.visitDateTime = visitDateTime;
    }

    @JsonProperty("DischargeDateTime")
    public String getDischargeDateTime() {
        return dischargeDateTime;
    }

    @JsonProperty("DischargeDateTime")
    public void setDischargeDateTime(String dischargeDateTime) {
        this.dischargeDateTime = dischargeDateTime;
    }

    @JsonProperty("DischargeStatus")
    public DischargeStatus getDischargeStatus() {
        return dischargeStatus;
    }

    @JsonProperty("DischargeStatus")
    public void setDischargeStatus(DischargeStatus dischargeStatus) {
        this.dischargeStatus = dischargeStatus;
    }

    @JsonProperty("DischargeLocation")
    public DischargeLocation getDischargeLocation() {
        return dischargeLocation;
    }

    @JsonProperty("DischargeLocation")
    public void setDischargeLocation(DischargeLocation dischargeLocation) {
        this.dischargeLocation = dischargeLocation;
    }

    @JsonProperty("Duration")
    public Object getDuration() {
        return duration;
    }

    @JsonProperty("Duration")
    public void setDuration(Object duration) {
        this.duration = duration;
    }

    @JsonProperty("Reason")
    public String getReason() {
        return reason;
    }

    @JsonProperty("Reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    @JsonProperty("Instructions")
    public List<Object> getInstructions() {
        return instructions;
    }

    @JsonProperty("Instructions")
    public void setInstructions(List<Object> instructions) {
        this.instructions = instructions;
    }

    @JsonProperty("Balance")
    public Object getBalance() {
        return balance;
    }

    @JsonProperty("Balance")
    public void setBalance(Object balance) {
        this.balance = balance;
    }

    @JsonProperty("DiagnosisRelatedGroup")
    public Object getDiagnosisRelatedGroup() {
        return diagnosisRelatedGroup;
    }

    @JsonProperty("DiagnosisRelatedGroup")
    public void setDiagnosisRelatedGroup(Object diagnosisRelatedGroup) {
        this.diagnosisRelatedGroup = diagnosisRelatedGroup;
    }

    @JsonProperty("DiagnosisRelatedGroupType")
    public Object getDiagnosisRelatedGroupType() {
        return diagnosisRelatedGroupType;
    }

    @JsonProperty("DiagnosisRelatedGroupType")
    public void setDiagnosisRelatedGroupType(Object diagnosisRelatedGroupType) {
        this.diagnosisRelatedGroupType = diagnosisRelatedGroupType;
    }

    @JsonProperty("AttendingProvider")
    public AttendingProvider getAttendingProvider() {
        return attendingProvider;
    }

    @JsonProperty("AttendingProvider")
    public void setAttendingProvider(AttendingProvider attendingProvider) {
        this.attendingProvider = attendingProvider;
    }

    @JsonProperty("ConsultingProvider")
    public ConsultingProvider getConsultingProvider() {
        return consultingProvider;
    }

    @JsonProperty("ConsultingProvider")
    public void setConsultingProvider(ConsultingProvider consultingProvider) {
        this.consultingProvider = consultingProvider;
    }

    @JsonProperty("ReferringProvider")
    public ReferringProvider getReferringProvider() {
        return referringProvider;
    }

    @JsonProperty("ReferringProvider")
    public void setReferringProvider(ReferringProvider referringProvider) {
        this.referringProvider = referringProvider;
    }

    @JsonProperty("AdmittingProvider")
    public AdmittingProvider getAdmittingProvider() {
        return admittingProvider;
    }

    @JsonProperty("AdmittingProvider")
    public void setAdmittingProvider(AdmittingProvider admittingProvider) {
        this.admittingProvider = admittingProvider;
    }

    @JsonProperty("AdditionalStaff")
    public List<Object> getAdditionalStaff() {
        return additionalStaff;
    }

    @JsonProperty("AdditionalStaff")
    public void setAdditionalStaff(List<Object> additionalStaff) {
        this.additionalStaff = additionalStaff;
    }

    @JsonProperty("Location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("Location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonProperty("Guarantor")
    public Guarantor getGuarantor() {
        return guarantor;
    }

    @JsonProperty("Guarantor")
    public void setGuarantor(Guarantor guarantor) {
        this.guarantor = guarantor;
    }

    @JsonProperty("Insurances")
    public List<Insurance> getInsurances() {
        return insurances;
    }

    @JsonProperty("Insurances")
    public void setInsurances(List<Insurance> insurances) {
        this.insurances = insurances;
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
