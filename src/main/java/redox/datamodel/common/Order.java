
package redox.datamodel.common;

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
    "ID",
    "Notes",
    "Medication",
    "Indications",
    "Provider",
    "EnteredBy",
    "VerifiedBy",
    "Priority",
    "Pharmacy",
        "Name"
})
public class Order {

    @JsonProperty("ID")
    private String iD;
    @JsonProperty("Notes")
    private List<Object> notes = null;
    @JsonProperty("Medication")
    private Medication medication;
    @JsonProperty("Indications")
    private List<Object> indications = null;
    @JsonProperty("Provider")
    private Provider provider;
    @JsonProperty("EnteredBy")
    private EnteredBy enteredBy;
    @JsonProperty("VerifiedBy")
    private VerifiedBy verifiedBy;
    @JsonProperty("Priority")
    private Object priority;
    @JsonProperty("Pharmacy")
    private Pharmacy pharmacy;
    @JsonProperty("Name")
    private String name;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ID")
    public String getID() {
        return iD;
    }

    @JsonProperty("ID")
    public void setID(String iD) {
        this.iD = iD;
    }

    @JsonProperty("Notes")
    public List<Object> getNotes() {
        return notes;
    }

    @JsonProperty("Notes")
    public void setNotes(List<Object> notes) {
        this.notes = notes;
    }

    @JsonProperty("Medication")
    public Medication getMedication() {
        return medication;
    }

    @JsonProperty("Medication")
    public void setMedication(Medication medication) {
        this.medication = medication;
    }

    @JsonProperty("Indications")
    public List<Object> getIndications() {
        return indications;
    }

    @JsonProperty("Indications")
    public void setIndications(List<Object> indications) {
        this.indications = indications;
    }

    @JsonProperty("Provider")
    public Provider getProvider() {
        return provider;
    }

    @JsonProperty("Provider")
    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    @JsonProperty("EnteredBy")
    public EnteredBy getEnteredBy() {
        return enteredBy;
    }

    @JsonProperty("EnteredBy")
    public void setEnteredBy(EnteredBy enteredBy) {
        this.enteredBy = enteredBy;
    }

    @JsonProperty("VerifiedBy")
    public VerifiedBy getVerifiedBy() {
        return verifiedBy;
    }

    @JsonProperty("VerifiedBy")
    public void setVerifiedBy(VerifiedBy verifiedBy) {
        this.verifiedBy = verifiedBy;
    }

    @JsonProperty("Priority")
    public Object getPriority() {
        return priority;
    }

    @JsonProperty("Priority")
    public void setPriority(Object priority) {
        this.priority = priority;
    }

    @JsonProperty("Pharmacy")
    public Pharmacy getPharmacy() {
        return pharmacy;
    }

    @JsonProperty("Pharmacy")
    public void setPharmacy(Pharmacy pharmacy) {
        this.pharmacy = pharmacy;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
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
