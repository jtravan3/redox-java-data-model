
package redox.datamodel.vaccination.patientQueryResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import redox.datamodel.common.Meta;
import redox.datamodel.vaccination.common.Patient;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Meta",
    "Patient",
    "PotentialMatches"
})
public class PatientQueryResponse {

    @JsonProperty("Meta")
    private Meta meta;
    @JsonProperty("Patient")
    private Patient patient;
    @JsonProperty("PotentialMatches")
    private List<Object> potentialMatches = null;
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

    @JsonProperty("Patient")
    public Patient getPatient() {
        return patient;
    }

    @JsonProperty("Patient")
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @JsonProperty("PotentialMatches")
    public List<Object> getPotentialMatches() {
        return potentialMatches;
    }

    @JsonProperty("PotentialMatches")
    public void setPotentialMatches(List<Object> potentialMatches) {
        this.potentialMatches = potentialMatches;
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
