
package redox.datamodel.patientqueryresponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Observations",
    "Procedures",
    "Services"
})
public class Procedures {

    @JsonProperty("Observations")
    private List<Observation> observations = null;
    @JsonProperty("Procedures")
    private List<Procedure_> procedures = null;
    @JsonProperty("Services")
    private List<Service_> services = null;
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

    @JsonProperty("Procedures")
    public List<Procedure_> getProcedures() {
        return procedures;
    }

    @JsonProperty("Procedures")
    public void setProcedures(List<Procedure_> procedures) {
        this.procedures = procedures;
    }

    @JsonProperty("Services")
    public List<Service_> getServices() {
        return services;
    }

    @JsonProperty("Services")
    public void setServices(List<Service_> services) {
        this.services = services;
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
