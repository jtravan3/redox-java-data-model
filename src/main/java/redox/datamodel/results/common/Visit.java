
package redox.datamodel.results.common;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import redox.datamodel.common.Location;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "VisitDateTime",
    "VisitNumber",
    "AccountNumber",
    "PatientClass",
    "Location",
    "AttendingProvider",
    "ReferringProvider"
})
public class Visit {

    @JsonProperty("VisitDateTime")
    private Object visitDateTime;
    @JsonProperty("VisitNumber")
    private Object visitNumber;
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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("VisitDateTime")
    public Object getVisitDateTime() {
        return visitDateTime;
    }

    @JsonProperty("VisitDateTime")
    public void setVisitDateTime(Object visitDateTime) {
        this.visitDateTime = visitDateTime;
    }

    @JsonProperty("VisitNumber")
    public Object getVisitNumber() {
        return visitNumber;
    }

    @JsonProperty("VisitNumber")
    public void setVisitNumber(Object visitNumber) {
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
