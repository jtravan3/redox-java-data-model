
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
import redox.datamodel.patientpush.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Type",
    "Substance",
    "Reaction",
    "Severity",
    "Criticality",
    "Status",
    "StartDate",
    "EndDate",
    "Comment"
})
public class Allergy {

    @JsonProperty("Type")
    private Type_ type;
    @JsonProperty("Substance")
    private Substance substance;
    @JsonProperty("Reaction")
    private List<Reaction> reaction = null;
    @JsonProperty("Severity")
    private Severity_ severity;
    @JsonProperty("Criticality")
    private Criticality criticality;
    @JsonProperty("Status")
    private Status status;
    @JsonProperty("StartDate")
    private Object startDate;
    @JsonProperty("EndDate")
    private Object endDate;
    @JsonProperty("Comment")
    private Object comment;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Type")
    public Type_ getType() {
        return type;
    }

    @JsonProperty("Type")
    public void setType(Type_ type) {
        this.type = type;
    }

    @JsonProperty("Substance")
    public Substance getSubstance() {
        return substance;
    }

    @JsonProperty("Substance")
    public void setSubstance(Substance substance) {
        this.substance = substance;
    }

    @JsonProperty("Reaction")
    public List<Reaction> getReaction() {
        return reaction;
    }

    @JsonProperty("Reaction")
    public void setReaction(List<Reaction> reaction) {
        this.reaction = reaction;
    }

    @JsonProperty("Severity")
    public Severity_ getSeverity() {
        return severity;
    }

    @JsonProperty("Severity")
    public void setSeverity(Severity_ severity) {
        this.severity = severity;
    }

    @JsonProperty("Criticality")
    public Criticality getCriticality() {
        return criticality;
    }

    @JsonProperty("Criticality")
    public void setCriticality(Criticality criticality) {
        this.criticality = criticality;
    }

    @JsonProperty("Status")
    public Status getStatus() {
        return status;
    }

    @JsonProperty("Status")
    public void setStatus(Status status) {
        this.status = status;
    }

    @JsonProperty("StartDate")
    public Object getStartDate() {
        return startDate;
    }

    @JsonProperty("StartDate")
    public void setStartDate(Object startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("EndDate")
    public Object getEndDate() {
        return endDate;
    }

    @JsonProperty("EndDate")
    public void setEndDate(Object endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("Comment")
    public Object getComment() {
        return comment;
    }

    @JsonProperty("Comment")
    public void setComment(Object comment) {
        this.comment = comment;
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
