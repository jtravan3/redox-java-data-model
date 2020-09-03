
package redox.datamodel.clinicalsummary.common;

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
    "Low",
    "High",
    "Text"
})
public class ReferenceRange {

    @JsonProperty("Low")
    private Object low;
    @JsonProperty("High")
    private Object high;
    @JsonProperty("Text")
    private Object text;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Low")
    public Object getLow() {
        return low;
    }

    @JsonProperty("Low")
    public void setLow(Object low) {
        this.low = low;
    }

    @JsonProperty("High")
    public Object getHigh() {
        return high;
    }

    @JsonProperty("High")
    public void setHigh(Object high) {
        this.high = high;
    }

    @JsonProperty("Text")
    public Object getText() {
        return text;
    }

    @JsonProperty("Text")
    public void setText(Object text) {
        this.text = text;
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
