
package redox.datamodel.common;

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
    "Code",
    "CodeSystem",
    "CodeSystemName",
    "Name"
})
public class Criticality {

    @JsonProperty("Code")
    private String code;
    @JsonProperty("CodeSystem")
    private String codeSystem;
    @JsonProperty("CodeSystemName")
    private String codeSystemName;
    @JsonProperty("Name")
    private String name;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
