
package redox.datamodel.clinicalsummary.common;

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
    "StartDate",
    "EndDate",
    "Code",
    "CodeSystem",
    "CodeSystemName",
    "Name",
    "AltCodes",
    "Category",
    "HealthStatus",
    "Status",
    "Comment",
        "Type",
        "DateTime",
        "AgeAtOnset",
        "IsCauseOfDeath"
})
public class Problem {

    @JsonProperty("StartDate")
    private String startDate;
    @JsonProperty("EndDate")
    private String endDate;
    @JsonProperty("Code")
    private String code;
    @JsonProperty("CodeSystem")
    private String codeSystem;
    @JsonProperty("CodeSystemName")
    private String codeSystemName;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("AltCodes")
    private List<AltCode> altCodes = null;
    @JsonProperty("Category")
    private Category category;
    @JsonProperty("HealthStatus")
    private HealthStatus healthStatus;
    @JsonProperty("Status")
    private Status status;
    @JsonProperty("Comment")
    private Object comment;
    @JsonProperty("Type")
    private Type type;
    @JsonProperty("DateTime")
    private String dateTime;
    @JsonProperty("AgeAtOnset")
    private String ageAtOnset;
    @JsonProperty("IsCauseOfDeath")
    private Object isCauseOfDeath;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("StartDate")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("StartDate")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("EndDate")
    public String getEndDate() {
        return endDate;
    }

    @JsonProperty("EndDate")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("Code")
    public String getCode() {
        return code;
    }

    @JsonProperty("Code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("CodeSystem")
    public String getCodeSystem() {
        return codeSystem;
    }

    @JsonProperty("CodeSystem")
    public void setCodeSystem(String codeSystem) {
        this.codeSystem = codeSystem;
    }

    @JsonProperty("CodeSystemName")
    public String getCodeSystemName() {
        return codeSystemName;
    }

    @JsonProperty("CodeSystemName")
    public void setCodeSystemName(String codeSystemName) {
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
    public List<AltCode> getAltCodes() {
        return altCodes;
    }

    @JsonProperty("AltCodes")
    public void setAltCodes(List<AltCode> altCodes) {
        this.altCodes = altCodes;
    }

    @JsonProperty("Category")
    public Category getCategory() {
        return category;
    }

    @JsonProperty("Category")
    public void setCategory(Category category) {
        this.category = category;
    }

    @JsonProperty("HealthStatus")
    public HealthStatus getHealthStatus() {
        return healthStatus;
    }

    @JsonProperty("HealthStatus")
    public void setHealthStatus(HealthStatus healthStatus) {
        this.healthStatus = healthStatus;
    }

    @JsonProperty("Status")
    public Status getStatus() {
        return status;
    }

    @JsonProperty("Status")
    public void setStatus(Status status) {
        this.status = status;
    }

    @JsonProperty("Comment")
    public Object getComment() {
        return comment;
    }

    @JsonProperty("Comment")
    public void setComment(Object comment) {
        this.comment = comment;
    }

    @JsonProperty("Type")
    public Type getType() {
        return type;
    }
    @JsonProperty("Type")
    public void setType(Type type) {
        this.type = type;
    }
    @JsonProperty("DateTime")
    public String getDateTime() {
        return dateTime;
    }
    @JsonProperty("DateTime")
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
    @JsonProperty("AgeAtOnset")
    public String getAgeAtOnset() {
        return ageAtOnset;
    }
    @JsonProperty("AgeAtOnset")
    public void setAgeAtOnset(String ageAtOnset) {
        this.ageAtOnset = ageAtOnset;
    }
    @JsonProperty("IsCauseOfDeath")
    public Object getIsCauseOfDeath() {
        return isCauseOfDeath;
    }
    @JsonProperty("IsCauseOfDeath")
    public void setIsCauseOfDeath(Object isCauseOfDeath) {
        this.isCauseOfDeath = isCauseOfDeath;
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
