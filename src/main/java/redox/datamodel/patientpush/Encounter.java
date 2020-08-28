
package redox.datamodel.patientpush;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import redox.datamodel.common.Identifier;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Identifiers",
    "Type",
    "DateTime",
    "EndDateTime",
    "Providers",
    "Locations",
    "Diagnosis",
    "ReasonForVisit"
})
public class Encounter {

    @JsonProperty("Identifiers")
    private List<Identifier> identifiers = null;
    @JsonProperty("Type")
    private Type__ type;
    @JsonProperty("DateTime")
    private String dateTime;
    @JsonProperty("EndDateTime")
    private Object endDateTime;
    @JsonProperty("Providers")
    private List<Provider> providers = null;
    @JsonProperty("Locations")
    private List<Location____> locations = null;
    @JsonProperty("Diagnosis")
    private List<Diagnosi> diagnosis = null;
    @JsonProperty("ReasonForVisit")
    private List<ReasonForVisit> reasonForVisit = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Identifiers")
    public List<Identifier> getIdentifiers() {
        return identifiers;
    }

    @JsonProperty("Identifiers")
    public void setIdentifiers(List<Identifier> identifiers) {
        this.identifiers = identifiers;
    }

    @JsonProperty("Type")
    public Type__ getType() {
        return type;
    }

    @JsonProperty("Type")
    public void setType(Type__ type) {
        this.type = type;
    }

    @JsonProperty("DateTime")
    public String getDateTime() {
        return dateTime;
    }

    @JsonProperty("DateTime")
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    @JsonProperty("EndDateTime")
    public Object getEndDateTime() {
        return endDateTime;
    }

    @JsonProperty("EndDateTime")
    public void setEndDateTime(Object endDateTime) {
        this.endDateTime = endDateTime;
    }

    @JsonProperty("Providers")
    public List<Provider> getProviders() {
        return providers;
    }

    @JsonProperty("Providers")
    public void setProviders(List<Provider> providers) {
        this.providers = providers;
    }

    @JsonProperty("Locations")
    public List<Location____> getLocations() {
        return locations;
    }

    @JsonProperty("Locations")
    public void setLocations(List<Location____> locations) {
        this.locations = locations;
    }

    @JsonProperty("Diagnosis")
    public List<Diagnosi> getDiagnosis() {
        return diagnosis;
    }

    @JsonProperty("Diagnosis")
    public void setDiagnosis(List<Diagnosi> diagnosis) {
        this.diagnosis = diagnosis;
    }

    @JsonProperty("ReasonForVisit")
    public List<ReasonForVisit> getReasonForVisit() {
        return reasonForVisit;
    }

    @JsonProperty("ReasonForVisit")
    public void setReasonForVisit(List<ReasonForVisit> reasonForVisit) {
        this.reasonForVisit = reasonForVisit;
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
