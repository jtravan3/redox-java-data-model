
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
    "Code",
    "CodeSystem",
    "CodeSystemName",
    "Name",
    "AltCodes",
    "Type",
    "Substance",
    "Reaction",
    "Severity",
    "Criticality",
    "Status",
    "StartDate",
    "EndDate",
    "Comment",
    "Codeset",
    "OnsetDateTime"
})
public class Allergy {

    @JsonProperty("Code")
    private String code;
    @JsonProperty("CodeSystem")
    private Object codeSystem;
    @JsonProperty("CodeSystemName")
    private Object codeSystemName;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("AltCodes")
    private List<Object> altCodes = null;
    @JsonProperty("Type")
    private Type type;
    @JsonProperty("Substance")
    private Substance substance;
    @JsonProperty("Reaction")
    private List<Reaction> reaction = null;
    @JsonProperty("Severity")
    private Severity severity;
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
    @JsonProperty("Codeset")
    private String codeset;
    @JsonProperty("OnsetDateTime")
    private Object onsetDateTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Code")
    public String getCode() {
        return code;
    }

    @JsonProperty("Code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("CodeSystem")
    public Object getCodeSystem() {
        return codeSystem;
    }

    @JsonProperty("CodeSystem")
    public void setCodeSystem(Object codeSystem) {
        this.codeSystem = codeSystem;
    }

    @JsonProperty("CodeSystemName")
    public Object getCodeSystemName() {
        return codeSystemName;
    }

    @JsonProperty("CodeSystemName")
    public void setCodeSystemName(Object codeSystemName) {
        this.codeSystemName = codeSystemName;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("AltCodes")
    public List<Object> getAltCodes() {
        return altCodes;
    }

    @JsonProperty("AltCodes")
    public void setAltCodes(List<Object> altCodes) {
        this.altCodes = altCodes;
    }

    @JsonProperty("Type")
    public Type getType() {
        return type;
    }

    @JsonProperty("Type")
    public void setType(Type type) {
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
    public Severity getSeverity() {
        return severity;
    }

    @JsonProperty("Severity")
    public void setSeverity(Severity severity) {
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

    @JsonProperty("Codeset")
    public String getCodeset() {
        return codeset;
    }

    @JsonProperty("Codeset")
    public void setCodeset(String codeset) {
        this.codeset = codeset;
    }

    @JsonProperty("OnsetDateTime")
    public Object getOnsetDateTime() {
        return onsetDateTime;
    }

    @JsonProperty("OnsetDateTime")
    public void setOnsetDateTime(Object onsetDateTime) {
        this.onsetDateTime = onsetDateTime;
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
