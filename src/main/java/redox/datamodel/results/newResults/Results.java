
package redox.datamodel.results.newResults;

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
import redox.datamodel.results.common.Order;
import redox.datamodel.results.common.Visit;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Meta",
    "Patient",
    "Orders",
    "Visit"
})
public class Results {

    @JsonProperty("Meta")
    private Meta meta;
    @JsonProperty("Patient")
    private Patient patient;
    @JsonProperty("Orders")
    private List<Order> orders = null;
    @JsonProperty("Visit")
    private Visit visit;
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

    @JsonProperty("Orders")
    public List<Order> getOrders() {
        return orders;
    }

    @JsonProperty("Orders")
    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @JsonProperty("Visit")
    public Visit getVisit() {
        return visit;
    }

    @JsonProperty("Visit")
    public void setVisit(Visit visit) {
        this.visit = visit;
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
