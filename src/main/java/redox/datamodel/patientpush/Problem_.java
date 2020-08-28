
package redox.datamodel.patientpush;

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
    "Comment"
})
public class Problem_ {

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
    private List<AltCode__> altCodes = null;
    @JsonProperty("Category")
    private Category category;
    @JsonProperty("HealthStatus")
    private HealthStatus healthStatus;
    @JsonProperty("Status")
    private Status_ status;
    @JsonProperty("Comment")
    private Object comment;
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
    public List<AltCode__> getAltCodes() {
        return altCodes;
    }

    @JsonProperty("AltCodes")
    public void setAltCodes(List<AltCode__> altCodes) {
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
    public Status_ getStatus() {
        return status;
    }

    @JsonProperty("Status")
    public void setStatus(Status_ status) {
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
