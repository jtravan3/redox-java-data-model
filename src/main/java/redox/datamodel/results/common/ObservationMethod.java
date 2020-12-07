
package redox.datamodel.results.common;

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
    "Codeset",
    "Description"
})
public class ObservationMethod {

    @JsonProperty("Code")
    private Object code;
    @JsonProperty("Codeset")
    private Object codeset;
    @JsonProperty("Description")
    private Object description;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Code")
    public Object getCode() {
        return code;
    }

    @JsonProperty("Code")
    public void setCode(Object code) {
        this.code = code;
    }

    @JsonProperty("Codeset")
    public Object getCodeset() {
        return codeset;
    }

    @JsonProperty("Codeset")
    public void setCodeset(Object codeset) {
        this.codeset = codeset;
    }

    @JsonProperty("Description")
    public Object getDescription() {
        return description;
    }

    @JsonProperty("Description")
    public void setDescription(Object description) {
        this.description = description;
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
