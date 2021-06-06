
package redox.datamodel.patientadmin.discharge;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
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
    "Name"
})
@Generated("jsonschema2pojo")
public class Type {

    @JsonProperty("Code")
    private Object code;
    @JsonProperty("Codeset")
    private Object codeset;
    @JsonProperty("Name")
    private Object name;
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

    @JsonProperty("Name")
    public Object getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(Object name) {
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
