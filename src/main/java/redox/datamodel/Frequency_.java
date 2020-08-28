
package redox.datamodel;

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
    "Period",
    "Unit"
})
public class Frequency_ {

    @JsonProperty("Period")
    private Object period;
    @JsonProperty("Unit")
    private Object unit;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Period")
    public Object getPeriod() {
        return period;
    }

    @JsonProperty("Period")
    public void setPeriod(Object period) {
        this.period = period;
    }

    @JsonProperty("Unit")
    public Object getUnit() {
        return unit;
    }

    @JsonProperty("Unit")
    public void setUnit(Object unit) {
        this.unit = unit;
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
