
package redox.clinicalsummary.common;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import redox.clinicalsummary.patientpush.Observation;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Observations",
    "Pregnancy",
    "TobaccoUse"
})
public class SocialHistory {

    @JsonProperty("Observations")
    private List<Observation> observations = null;
    @JsonProperty("Pregnancy")
    private List<Object> pregnancy = null;
    @JsonProperty("TobaccoUse")
    private List<TobaccoUse> tobaccoUse = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Observations")
    public List<Observation> getObservations() {
        return observations;
    }

    @JsonProperty("Observations")
    public void setObservations(List<Observation> observations) {
        this.observations = observations;
    }

    @JsonProperty("Pregnancy")
    public List<Object> getPregnancy() {
        return pregnancy;
    }

    @JsonProperty("Pregnancy")
    public void setPregnancy(List<Object> pregnancy) {
        this.pregnancy = pregnancy;
    }

    @JsonProperty("TobaccoUse")
    public List<TobaccoUse> getTobaccoUse() {
        return tobaccoUse;
    }

    @JsonProperty("TobaccoUse")
    public void setTobaccoUse(List<TobaccoUse> tobaccoUse) {
        this.tobaccoUse = tobaccoUse;
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
