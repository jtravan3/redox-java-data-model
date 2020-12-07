
package redox.datamodel.results.common;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import redox.datamodel.common.Provider;
import redox.datamodel.common.Patient;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Patient",
        "Visit",
    "ID",
    "ApplicationOrderID",
    "TransactionDateTime",
    "CollectionDateTime",
    "CompletionDateTime",
    "Notes",
    "ResultsStatus",
    "Procedure",
    "Provider",
    "ResultCopyProviders",
    "Status",
    "ResponseFlag",
    "Priority",
    "Results"
})
public class Order {

    @JsonProperty("Patient")
    private Patient patient;
    @JsonProperty("Visit")
    private Visit visit;
    @JsonProperty("ID")
    private String iD;
    @JsonProperty("ApplicationOrderID")
    private Object applicationOrderID;
    @JsonProperty("TransactionDateTime")
    private String transactionDateTime;
    @JsonProperty("CollectionDateTime")
    private String collectionDateTime;
    @JsonProperty("CompletionDateTime")
    private String completionDateTime;
    @JsonProperty("Notes")
    private List<Object> notes = null;
    @JsonProperty("ResultsStatus")
    private String resultsStatus;
    @JsonProperty("Procedure")
    private Procedure procedure;
    @JsonProperty("Provider")
    private Provider provider;
    @JsonProperty("ResultCopyProviders")
    private List<Object> resultCopyProviders = null;
    @JsonProperty("Status")
    private String status;
    @JsonProperty("ResponseFlag")
    private String responseFlag;
    @JsonProperty("Priority")
    private String priority;
    @JsonProperty("Results")
    private List<Result> results = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    @JsonProperty("ID")
    public String getID() {
        return iD;
    }

    @JsonProperty("ID")
    public void setID(String iD) {
        this.iD = iD;
    }

    @JsonProperty("ApplicationOrderID")
    public Object getApplicationOrderID() {
        return applicationOrderID;
    }

    @JsonProperty("ApplicationOrderID")
    public void setApplicationOrderID(Object applicationOrderID) {
        this.applicationOrderID = applicationOrderID;
    }

    @JsonProperty("TransactionDateTime")
    public String getTransactionDateTime() {
        return transactionDateTime;
    }

    @JsonProperty("TransactionDateTime")
    public void setTransactionDateTime(String transactionDateTime) {
        this.transactionDateTime = transactionDateTime;
    }

    @JsonProperty("CollectionDateTime")
    public String getCollectionDateTime() {
        return collectionDateTime;
    }

    @JsonProperty("CollectionDateTime")
    public void setCollectionDateTime(String collectionDateTime) {
        this.collectionDateTime = collectionDateTime;
    }

    @JsonProperty("CompletionDateTime")
    public String getCompletionDateTime() {
        return completionDateTime;
    }

    @JsonProperty("CompletionDateTime")
    public void setCompletionDateTime(String completionDateTime) {
        this.completionDateTime = completionDateTime;
    }

    @JsonProperty("Notes")
    public List<Object> getNotes() {
        return notes;
    }

    @JsonProperty("Notes")
    public void setNotes(List<Object> notes) {
        this.notes = notes;
    }

    @JsonProperty("ResultsStatus")
    public String getResultsStatus() {
        return resultsStatus;
    }

    @JsonProperty("ResultsStatus")
    public void setResultsStatus(String resultsStatus) {
        this.resultsStatus = resultsStatus;
    }

    @JsonProperty("Procedure")
    public Procedure getProcedure() {
        return procedure;
    }

    @JsonProperty("Procedure")
    public void setProcedure(Procedure procedure) {
        this.procedure = procedure;
    }

    @JsonProperty("Provider")
    public Provider getProvider() {
        return provider;
    }

    @JsonProperty("Provider")
    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    @JsonProperty("ResultCopyProviders")
    public List<Object> getResultCopyProviders() {
        return resultCopyProviders;
    }

    @JsonProperty("ResultCopyProviders")
    public void setResultCopyProviders(List<Object> resultCopyProviders) {
        this.resultCopyProviders = resultCopyProviders;
    }

    @JsonProperty("Status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("Status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("ResponseFlag")
    public String getResponseFlag() {
        return responseFlag;
    }

    @JsonProperty("ResponseFlag")
    public void setResponseFlag(String responseFlag) {
        this.responseFlag = responseFlag;
    }

    @JsonProperty("Priority")
    public String getPriority() {
        return priority;
    }

    @JsonProperty("Priority")
    public void setPriority(String priority) {
        this.priority = priority;
    }

    @JsonProperty("Results")
    public List<Result> getResults() {
        return results;
    }

    @JsonProperty("Results")
    public void setResults(List<Result> results) {
        this.results = results;
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
