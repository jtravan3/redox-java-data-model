
package redox.datamodel.results.queryResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import redox.datamodel.common.Meta;
import redox.datamodel.results.common.Order;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Meta",
    "Orders"
})
public class QueryResponse {

    @JsonProperty("Meta")
    private Meta meta;
    @JsonProperty("Orders")
    private List<Order> orders = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Meta")
    public Meta getMeta() {
        return meta;
    }

    @JsonProperty("Meta")
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    @JsonProperty("Orders")
    public List<Order> getOrders() {
        return orders;
    }

    @JsonProperty("Orders")
    public void setOrders(List<Order> orders) {
        this.orders = orders;
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
