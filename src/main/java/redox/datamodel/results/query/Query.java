
package redox.datamodel.results.query;

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
import redox.datamodel.common.Patient;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Meta",
    "Patients",
    "Completion",
    "ResultStatuses",
    "OrderIDs",
    "Procedures"
})
public class Query {

    @JsonProperty("Meta")
    private Meta meta;
    @JsonProperty("Patients")
    private List<Patient> patients = null;
    @JsonProperty("Completion")
    private Completion completion;
    @JsonProperty("ResultStatuses")
    private List<String> resultStatuses = null;
    @JsonProperty("OrderIDs")
    private List<String> orderIDs = null;
    @JsonProperty("Procedures")
    private List<Object> procedures = null;
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

    @JsonProperty("Patients")
    public List<Patient> getPatients() {
        return patients;
    }

    @JsonProperty("Patients")
    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    @JsonProperty("Completion")
    public Completion getCompletion() {
        return completion;
    }

    @JsonProperty("Completion")
    public void setCompletion(Completion completion) {
        this.completion = completion;
    }

    @JsonProperty("ResultStatuses")
    public List<String> getResultStatuses() {
        return resultStatuses;
    }

    @JsonProperty("ResultStatuses")
    public void setResultStatuses(List<String> resultStatuses) {
        this.resultStatuses = resultStatuses;
    }

    @JsonProperty("OrderIDs")
    public List<String> getOrderIDs() {
        return orderIDs;
    }

    @JsonProperty("OrderIDs")
    public void setOrderIDs(List<String> orderIDs) {
        this.orderIDs = orderIDs;
    }

    @JsonProperty("Procedures")
    public List<Object> getProcedures() {
        return procedures;
    }

    @JsonProperty("Procedures")
    public void setProcedures(List<Object> procedures) {
        this.procedures = procedures;
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
