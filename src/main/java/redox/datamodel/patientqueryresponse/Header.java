
package redox.datamodel.patientqueryresponse;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Document",
    "Patient",
    "PCP"
})
public class Header {

    @JsonProperty("Document")
    private Document document;
    @JsonProperty("Patient")
    private Patient patient;
    @JsonProperty("PCP")
    private PCP pCP;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Document")
    public Document getDocument() {
        return document;
    }

    @JsonProperty("Document")
    public void setDocument(Document document) {
        this.document = document;
    }

    @JsonProperty("Patient")
    public Patient getPatient() {
        return patient;
    }

    @JsonProperty("Patient")
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @JsonProperty("PCP")
    public PCP getPCP() {
        return pCP;
    }

    @JsonProperty("PCP")
    public void setPCP(PCP pCP) {
        this.pCP = pCP;
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
