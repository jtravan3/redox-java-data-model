
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
    "Amount",
    "Units"
})
public class Dispense {

    @JsonProperty("Amount")
    private Object amount;
    @JsonProperty("Units")
    private Object units;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Amount")
    public Object getAmount() {
        return amount;
    }

    @JsonProperty("Amount")
    public void setAmount(Object amount) {
        this.amount = amount;
    }

    @JsonProperty("Units")
    public Object getUnits() {
        return units;
    }

    @JsonProperty("Units")
    public void setUnits(Object units) {
        this.units = units;
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
