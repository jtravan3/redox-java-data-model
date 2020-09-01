
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
    "Dose",
    "Rate",
    "Route",
    "StartDate",
    "EndDate",
    "Frequency",
    "Product"
})
public class MedicationAdministration {

    @JsonProperty("Status")
    private String status;
    @JsonProperty("Dose")
    private Dose dose;
    @JsonProperty("Rate")
    private Rate_ rate;
    @JsonProperty("Route")
    private Route__ route;
    @JsonProperty("StartDate")
    private String startDate;
    @JsonProperty("EndDate")
    private String endDate;
    @JsonProperty("Frequency")
    private Frequency frequency;
    @JsonProperty("Product")
    private Product___ product;
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

    @JsonProperty("Dose")
    public Dose getDose() {
        return dose;
    }

    @JsonProperty("Dose")
    public void setDose(Dose dose) {
        this.dose = dose;
    }

    @JsonProperty("Rate")
    public Rate_ getRate() {
        return rate;
    }

    @JsonProperty("Rate")
    public void setRate(Rate_ rate) {
        this.rate = rate;
    }

    @JsonProperty("Route")
    public Route__ getRoute() {
        return route;
    }

    @JsonProperty("Route")
    public void setRoute(Route__ route) {
        this.route = route;
    }

    @JsonProperty("StartDate")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("StartDate")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("EndDate")
    public String getEndDate() {
        return endDate;
    }

    @JsonProperty("EndDate")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("Frequency")
    public Frequency getFrequency() {
        return frequency;
    }

    @JsonProperty("Frequency")
    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }

    @JsonProperty("Product")
    public Product___ getProduct() {
        return product;
    }

    @JsonProperty("Product")
    public void setProduct(Product___ product) {
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
