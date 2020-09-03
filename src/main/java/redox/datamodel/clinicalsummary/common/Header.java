
package redox.datamodel.clinicalsummary.common;

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
        //patientpush, not patientqueryresponse
    "DirectAddressFrom",
        //patientpush, not patientqueryresponse
    "DirectAddressTo",
    "Document",
    "Patient",
    "PCP"
})
public class Header {

    @JsonProperty("DirectAddressFrom")
    private String directAddressFrom;
    @JsonProperty("DirectAddressTo")
    private String directAddressTo;
    @JsonProperty("Document")
    private Document document;
    @JsonProperty("Patient")
    private Patient patient;
    @JsonProperty("PCP")
    private PCP pCP;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    //patientpush, not patientqueryresponse
    @JsonProperty("DirectAddressFrom")
    public String getDirectAddressFrom() {
        return directAddressFrom;
    }

    @JsonProperty("DirectAddressFrom")
    public void setDirectAddressFrom(String directAddressFrom) {
        this.directAddressFrom = directAddressFrom;
    }
    //patientpush, not patientqueryresponse
    @JsonProperty("DirectAddressTo")
    public String getDirectAddressTo() {
        return directAddressTo;
    }

    @JsonProperty("DirectAddressTo")
    public void setDirectAddressTo(String directAddressTo) {
        this.directAddressTo = directAddressTo;
    }

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
