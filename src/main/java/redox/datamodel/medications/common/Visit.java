
package redox.datamodel.medications.common;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import redox.datamodel.common.Location;
import redox.datamodel.medications.common.AttendingProvider;
import redox.datamodel.medications.common.ReferringProvider;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "VisitDateTime",
    "VisitNumber",
    "AccountNumber",
    "PatientClass",
    "Location",
    "AttendingProvider",
    "ReferringProvider",
    "Insurances"
})
public class Visit {

    @JsonProperty("VisitDateTime")
    private String visitDateTime;
    @JsonProperty("VisitNumber")
    private String visitNumber;
    @JsonProperty("AccountNumber")
    private Object accountNumber;
    @JsonProperty("PatientClass")
    private Object patientClass;
    @JsonProperty("Location")
    private Location location;
    @JsonProperty("AttendingProvider")
    private AttendingProvider attendingProvider;
    @JsonProperty("ReferringProvider")
    private ReferringProvider referringProvider;
    @JsonProperty("Insurances")
    private List<Object> insurances = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("VisitDateTime")
    public String getVisitDateTime() {
        return visitDateTime;
    }

    @JsonProperty("VisitDateTime")
    public void setVisitDateTime(String visitDateTime) {
        this.visitDateTime = visitDateTime;
    }

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
    public Object getPatientClass() {
        return patientClass;
    }

    @JsonProperty("PatientClass")
    public void setPatientClass(Object patientClass) {
        this.patientClass = patientClass;
    }

    @JsonProperty("Location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("Location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonProperty("AttendingProvider")
    public AttendingProvider getAttendingProvider() {
        return attendingProvider;
    }

    @JsonProperty("AttendingProvider")
    public void setAttendingProvider(AttendingProvider attendingProvider) {
        this.attendingProvider = attendingProvider;
    }

    @JsonProperty("ReferringProvider")
    public ReferringProvider getReferringProvider() {
        return referringProvider;
    }

    @JsonProperty("ReferringProvider")
    public void setReferringProvider(ReferringProvider referringProvider) {
        this.referringProvider = referringProvider;
    }

    @JsonProperty("Insurances")
    public List<Object> getInsurances() {
        return insurances;
    }

    @JsonProperty("Insurances")
    public void setInsurances(List<Object> insurances) {
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
