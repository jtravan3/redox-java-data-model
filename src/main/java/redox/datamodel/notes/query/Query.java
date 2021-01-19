
package redox.datamodel.notes.query;

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
    "VisitNumbers",
    "DocumentTypes",
    "DocumentIDs"
})
public class Query {

    @JsonProperty("Meta")
    private Meta meta;
    @JsonProperty("Patients")
    private List<Patient> patients = null;
    @JsonProperty("VisitNumbers")
    private List<String> visitNumbers = null;
    @JsonProperty("DocumentTypes")
    private List<String> documentTypes = null;
    @JsonProperty("DocumentIDs")
    private List<String> documentIDs = null;
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

    @JsonProperty("VisitNumbers")
    public List<String> getVisitNumbers() {
        return visitNumbers;
    }

    @JsonProperty("VisitNumbers")
    public void setVisitNumbers(List<String> visitNumbers) {
        this.visitNumbers = visitNumbers;
    }

    @JsonProperty("DocumentTypes")
    public List<String> getDocumentTypes() {
        return documentTypes;
    }

    @JsonProperty("DocumentTypes")
    public void setDocumentTypes(List<String> documentTypes) {
        this.documentTypes = documentTypes;
    }

    @JsonProperty("DocumentIDs")
    public List<String> getDocumentIDs() {
        return documentIDs;
    }

    @JsonProperty("DocumentIDs")
    public void setDocumentIDs(List<String> documentIDs) {
        this.documentIDs = documentIDs;
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
