
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
    "Code",
    "CodeSystem",
    "CodeSystemName",
    "Name",
    "AltCodes",
    "DateTime",
    "Status"
})
public class Service_ {

    @JsonProperty("Code")
    private String code;
    @JsonProperty("CodeSystem")
    private String codeSystem;
    @JsonProperty("CodeSystemName")
    private String codeSystemName;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("AltCodes")
    private List<Object> altCodes = null;
    @JsonProperty("DateTime")
    private String dateTime;
    @JsonProperty("Status")
    private String status;
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
    public List<Object> getAltCodes() {
        return altCodes;
    }

    @JsonProperty("AltCodes")
    public void setAltCodes(List<Object> altCodes) {
        this.altCodes = altCodes;
    }

    @JsonProperty("DateTime")
    public String getDateTime() {
        return dateTime;
    }

    @JsonProperty("DateTime")
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    @JsonProperty("Status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("Status")
    public void setStatus(String status) {
        this.status = status;
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