
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
    "Prescription",
    "FreeTextSig",
    "Dose",
    "Rate",
    "Route",
    "StartDate",
    "EndDate",
    "Frequency",
    "IsPRN",
    "Product"
})
public class Medication {

    @JsonProperty("Prescription")
    private Boolean prescription;
    @JsonProperty("FreeTextSig")
    private Object freeTextSig;
    @JsonProperty("Dose")
    private Dose dose;
    @JsonProperty("Rate")
    private Rate rate;
    @JsonProperty("Route")
    private Route_ route;
    @JsonProperty("StartDate")
    private String startDate;
    @JsonProperty("EndDate")
    private String endDate;
    @JsonProperty("Frequency")
    private Frequency frequency;
    @JsonProperty("IsPRN")
    private Boolean isPRN;
    @JsonProperty("Product")
    private Product__ product;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Prescription")
    public Boolean getPrescription() {
        return prescription;
    }

    @JsonProperty("Prescription")
    public void setPrescription(Boolean prescription) {
        this.prescription = prescription;
    }

    @JsonProperty("FreeTextSig")
    public Object getFreeTextSig() {
        return freeTextSig;
    }

    @JsonProperty("FreeTextSig")
    public void setFreeTextSig(Object freeTextSig) {
        this.freeTextSig = freeTextSig;
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
    public Rate getRate() {
        return rate;
    }

    @JsonProperty("Rate")
    public void setRate(Rate rate) {
        this.rate = rate;
    }

    @JsonProperty("Route")
    public Route_ getRoute() {
        return route;
    }

    @JsonProperty("Route")
    public void setRoute(Route_ route) {
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

    @JsonProperty("IsPRN")
    public Boolean getIsPRN() {
        return isPRN;
    }

    @JsonProperty("IsPRN")
    public void setIsPRN(Boolean isPRN) {
        this.isPRN = isPRN;
    }

    @JsonProperty("Product")
    public Product__ getProduct() {
        return product;
    }

    @JsonProperty("Product")
    public void setProduct(Product__ product) {
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
