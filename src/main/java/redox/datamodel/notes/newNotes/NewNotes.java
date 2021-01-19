
package redox.datamodel.notes.newNotes;

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
import redox.datamodel.notes.common.Visit;
import redox.datamodel.notes.common.Note;
import redox.datamodel.common.Order;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Meta",
    "Patient",
    "Visit",
    "Note",
    "Orders"
})
public class NewNotes {

    @JsonProperty("Meta")
    private Meta meta;
    @JsonProperty("Patient")
    private Patient patient;
    @JsonProperty("Visit")
    private Visit visit;
    @JsonProperty("Note")
    private Note note;
    @JsonProperty("Orders")
    private List<Order> orders = null;
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

    @JsonProperty("Note")
    public Note getNote() {
        return note;
    }

    @JsonProperty("Note")
    public void setNote(Note note) {
        this.note = note;
    }

    @JsonProperty("Orders")
    public List<Order> getOrders() {
        return orders;
    }

    @JsonProperty("Orders")
    public void setOrders(List<Order> orders) {
        this.orders = orders;
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
