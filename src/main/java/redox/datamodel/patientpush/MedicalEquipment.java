
package redox.datamodel.patientpush;

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
    "Status",
    "StartDate",
    "Quantity",
    "Product"
})
public class MedicalEquipment {

    @JsonProperty("Status")
    private String status;
    @JsonProperty("StartDate")
    private String startDate;
    @JsonProperty("Quantity")
    private Object quantity;
    @JsonProperty("Product")
    private Product_ product;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("Status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("StartDate")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("StartDate")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("Quantity")
    public Object getQuantity() {
        return quantity;
    }

    @JsonProperty("Quantity")
    public void setQuantity(Object quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("Product")
    public Product_ getProduct() {
        return product;
    }

    @JsonProperty("Product")
    public void setProduct(Product_ product) {
        this.product = product;
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
