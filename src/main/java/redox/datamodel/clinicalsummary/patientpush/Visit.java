
package redox.datamodel.clinicalsummary.patientpush;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import redox.datamodel.clinicalsummary.common.Location;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Location",
    "StartDateTime",
    "EndDateTime",
    "Reason",
    "VisitNumber"
})
public class Visit {

    @JsonProperty("Location")
    private Location location;
    @JsonProperty("StartDateTime")
    private Object startDateTime;
    @JsonProperty("EndDateTime")
    private Object endDateTime;
    @JsonProperty("Reason")
    private Object reason;
    @JsonProperty("VisitNumber")
    private Object visitNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("Location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonProperty("StartDateTime")
    public Object getStartDateTime() {
        return startDateTime;
    }

    @JsonProperty("StartDateTime")
    public void setStartDateTime(Object startDateTime) {
        this.startDateTime = startDateTime;
    }

    @JsonProperty("EndDateTime")
    public Object getEndDateTime() {
        return endDateTime;
    }

    @JsonProperty("EndDateTime")
    public void setEndDateTime(Object endDateTime) {
        this.endDateTime = endDateTime;
    }

    @JsonProperty("Reason")
    public Object getReason() {
        return reason;
    }

    @JsonProperty("Reason")
    public void setReason(Object reason) {
        this.reason = reason;
    }

    @JsonProperty("VisitNumber")
    public Object getVisitNumber() {
        return visitNumber;
    }

    @JsonProperty("VisitNumber")
    public void setVisitNumber(Object visitNumber) {
        this.visitNumber = visitNumber;
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
