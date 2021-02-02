
package redox.datamodel.medications.newMedications;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import redox.datamodel.common.Meta;
import redox.datamodel.medications.common.Patient;
import redox.datamodel.common.Order;
import redox.datamodel.medications.common.Visit;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Meta",
    "Patient",
    "Visit",
    "Order"
})
public class NewMedications {

    @JsonProperty("Meta")
    private Meta meta;
    @JsonProperty("Patient")
    private Patient patient;
    @JsonProperty("Visit")
    private Visit visit;
    @JsonProperty("Order")
    private Order order;
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

    @JsonProperty("Visit")
    public Visit getVisit() {
        return visit;
    }

    @JsonProperty("Visit")
    public void setVisit(Visit visit) {
        this.visit = visit;
    }

    @JsonProperty("Order")
    public Order getOrder() {
        return order;
    }

    @JsonProperty("Order")
    public void setOrder(Order order) {
        this.order = order;
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
