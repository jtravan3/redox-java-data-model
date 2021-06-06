
package redox.datamodel.scheduling.modification;

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
    "Name",
    "Type",
    "DocumentedDateTime"
})
@Generated("jsonschema2pojo")
public class Diagnosis {

    @JsonProperty("Code")
    private String code;
    @JsonProperty("Codeset")
    private String codeset;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Type")
    private Object type;
    @JsonProperty("DocumentedDateTime")
    private Object documentedDateTime;
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

    @JsonProperty("Codeset")
    public String getCodeset() {
        return codeset;
    }

    @JsonProperty("Codeset")
    public void setCodeset(String codeset) {
        this.codeset = codeset;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Type")
    public Object getType() {
        return type;
    }

    @JsonProperty("Type")
    public void setType(Object type) {
        this.type = type;
    }

    @JsonProperty("DocumentedDateTime")
    public Object getDocumentedDateTime() {
        return documentedDateTime;
    }

    @JsonProperty("DocumentedDateTime")
    public void setDocumentedDateTime(Object documentedDateTime) {
        this.documentedDateTime = documentedDateTime;
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
