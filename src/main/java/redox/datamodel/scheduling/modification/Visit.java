
package redox.datamodel.scheduling.modification;

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
import redox.datamodel.common.Location;
import redox.datamodel.common.AttendingProvider;
import redox.datamodel.common.ConsultingProvider;
import redox.datamodel.common.ReferringProvider;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "VisitNumber",
    "AccountNumber",
    "VisitDateTime",
    "PatientClass",
    "Status",
    "Duration",
    "Reason",
    "Type",
    "Instructions",
    "AttendingProvider",
    "ConsultingProvider",
    "ReferringProvider",
    "VisitProvider",
    "Location",
    "AdditionalStaff",
    "Diagnoses",
    "Equipment"
})
@Generated("jsonschema2pojo")
public class Visit {

    @JsonProperty("VisitNumber")
    private String visitNumber;
    @JsonProperty("AccountNumber")
    private Object accountNumber;
    @JsonProperty("VisitDateTime")
    private String visitDateTime;
    @JsonProperty("PatientClass")
    private Object patientClass;
    @JsonProperty("Status")
    private Object status;
    @JsonProperty("Duration")
    private Integer duration;
    @JsonProperty("Reason")
    private String reason;
    @JsonProperty("Type")
    private Object type;
    @JsonProperty("Instructions")
    private List<Object> instructions = null;
    @JsonProperty("AttendingProvider")
    private AttendingProvider attendingProvider;
    @JsonProperty("ConsultingProvider")
    private ConsultingProvider consultingProvider;
    @JsonProperty("ReferringProvider")
    private ReferringProvider referringProvider;
    @JsonProperty("VisitProvider")
    private VisitProvider visitProvider;
    @JsonProperty("Location")
    private Location location;
    @JsonProperty("AdditionalStaff")
    private List<Object> additionalStaff = null;
    @JsonProperty("Diagnoses")
    private List<Diagnosis> diagnoses = null;
    @JsonProperty("Equipment")
    private List<Object> equipment = null;
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

    @JsonProperty("VisitDateTime")
    public String getVisitDateTime() {
        return visitDateTime;
    }

    @JsonProperty("VisitDateTime")
    public void setVisitDateTime(String visitDateTime) {
        this.visitDateTime = visitDateTime;
    }

    @JsonProperty("PatientClass")
    public Object getPatientClass() {
        return patientClass;
    }

    @JsonProperty("PatientClass")
    public void setPatientClass(Object patientClass) {
        this.patientClass = patientClass;
    }

    @JsonProperty("Status")
    public Object getStatus() {
        return status;
    }

    @JsonProperty("Status")
    public void setStatus(Object status) {
        this.status = status;
    }

    @JsonProperty("Duration")
    public Integer getDuration() {
        return duration;
    }

    @JsonProperty("Duration")
    public void setDuration(Integer duration) {
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

    @JsonProperty("Type")
    public Object getType() {
        return type;
    }

    @JsonProperty("Type")
    public void setType(Object type) {
        this.type = type;
    }

    @JsonProperty("Instructions")
    public List<Object> getInstructions() {
        return instructions;
    }

    @JsonProperty("Instructions")
    public void setInstructions(List<Object> instructions) {
        this.instructions = instructions;
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

    @JsonProperty("VisitProvider")
    public VisitProvider getVisitProvider() {
        return visitProvider;
    }

    @JsonProperty("VisitProvider")
    public void setVisitProvider(VisitProvider visitProvider) {
        this.visitProvider = visitProvider;
    }

    @JsonProperty("Location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("Location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonProperty("AdditionalStaff")
    public List<Object> getAdditionalStaff() {
        return additionalStaff;
    }

    @JsonProperty("AdditionalStaff")
    public void setAdditionalStaff(List<Object> additionalStaff) {
        this.additionalStaff = additionalStaff;
    }

    @JsonProperty("Diagnoses")
    public List<Diagnosis> getDiagnoses() {
        return diagnoses;
    }

    @JsonProperty("Diagnoses")
    public void setDiagnoses(List<Diagnosis> diagnoses) {
        this.diagnoses = diagnoses;
    }

    @JsonProperty("Equipment")
    public List<Object> getEquipment() {
        return equipment;
    }

    @JsonProperty("Equipment")
    public void setEquipment(List<Object> equipment) {
        this.equipment = equipment;
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
