
package redox.datamodel.clinicalsummary.visitpush;

import java.util.HashMap;
import java.util.List;
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
    "Value",
    "DateTime",
    "IsNegativeIndicator",
    "Codes"
})
@Generated("jsonschema2pojo")
public class Diagnosis {

    @JsonProperty("Value")
    private String value;
    @JsonProperty("DateTime")
    private String dateTime;
    @JsonProperty("IsNegativeIndicator")
    private Boolean isNegativeIndicator;
    @JsonProperty("Codes")
    private List<Code> codes = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Value")
    public String getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(String value) {
        this.value = value;
    }

    @JsonProperty("DateTime")
    public String getDateTime() {
        return dateTime;
    }

    @JsonProperty("DateTime")
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    @JsonProperty("IsNegativeIndicator")
    public Boolean getIsNegativeIndicator() {
        return isNegativeIndicator;
    }

    @JsonProperty("IsNegativeIndicator")
    public void setIsNegativeIndicator(Boolean isNegativeIndicator) {
        this.isNegativeIndicator = isNegativeIndicator;
    }

    @JsonProperty("Codes")
    public List<Code> getCodes() {
        return codes;
    }

    @JsonProperty("Codes")
    public void setCodes(List<Code> codes) {
        this.codes = codes;
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
