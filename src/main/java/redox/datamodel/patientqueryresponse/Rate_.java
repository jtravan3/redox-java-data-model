
package redox.datamodel.patientqueryresponse;

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
    "Quantity",
    "Units"
})
public class Rate_ {

    @JsonProperty("Quantity")
    private Object quantity;
    @JsonProperty("Units")
    private Object units;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Quantity")
    public Object getQuantity() {
        return quantity;
    }

    @JsonProperty("Quantity")
    public void setQuantity(Object quantity) {
        this.quantity = quantity;
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
