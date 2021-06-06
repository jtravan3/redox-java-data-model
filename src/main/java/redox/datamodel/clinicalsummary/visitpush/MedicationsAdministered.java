
package redox.datamodel.clinicalsummary.visitpush;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import redox.datamodel.common.Dose;
import redox.datamodel.common.Rate;
import redox.datamodel.common.Route;
import redox.datamodel.common.Frequency;
import redox.datamodel.common.Product;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Dose",
    "Rate",
    "Route",
    "StartDate",
    "EndDate",
    "Frequency",
    "Product",
    "ReasonNotGiven"
})
@Generated("jsonschema2pojo")
public class MedicationsAdministered {

    @JsonProperty("Dose")
    private Dose dose;
    @JsonProperty("Rate")
    private Rate rate;
    @JsonProperty("Route")
    private Route route;
    @JsonProperty("StartDate")
    private String startDate;
    @JsonProperty("EndDate")
    private String endDate;
    @JsonProperty("Frequency")
    private Frequency frequency;
    @JsonProperty("Product")
    private Product product;
    @JsonProperty("ReasonNotGiven")
    private Object reasonNotGiven;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Dose")
    public Dose getDose() {
        return dose;
    }

    @JsonProperty("Dose")
    public void setDose(Dose dose) {
        this.dose = dose;
    }

    @JsonProperty("Rate")
    public Rate getRate() {
        return rate;
    }

    @JsonProperty("Rate")
    public void setRate(Rate rate) {
        this.rate = rate;
    }

    @JsonProperty("Route")
    public Route getRoute() {
        return route;
    }

    @JsonProperty("Route")
    public void setRoute(Route route) {
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
    public Product getProduct() {
        return product;
    }

    @JsonProperty("Product")
    public void setProduct(Product product) {
        this.product = product;
    }

    @JsonProperty("ReasonNotGiven")
    public Object getReasonNotGiven() {
        return reasonNotGiven;
    }

    @JsonProperty("ReasonNotGiven")
    public void setReasonNotGiven(Object reasonNotGiven) {
        this.reasonNotGiven = reasonNotGiven;
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
