
package redox.datamodel.vaccination.common;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import redox.datamodel.common.Dose;
import redox.datamodel.common.Provider;
import redox.datamodel.common.Location;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DateTime",
    "Product",
    "Route",
    "Site",
    "Dose",
    "Order",
    "ClinicalInfo",
    "Notes",
    "RefusalReason",
    "Provider",
    "Location"
})
public class Vaccination {

    @JsonProperty("DateTime")
    private String dateTime;
    @JsonProperty("Product")
    private Product product;
    @JsonProperty("Route")
    private Route route;
    @JsonProperty("Site")
    private Site site;
    @JsonProperty("Dose")
    private Dose dose;
    @JsonProperty("Order")
    private Order order;
    @JsonProperty("ClinicalInfo")
    private List<Object> clinicalInfo = null;
    @JsonProperty("Notes")
    private List<String> notes = null;
    @JsonProperty("RefusalReason")
    private Object refusalReason;
    @JsonProperty("Provider")
    private Provider provider;
    @JsonProperty("Location")
    private Location location;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("DateTime")
    public String getDateTime() {
        return dateTime;
    }

    @JsonProperty("DateTime")
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    @JsonProperty("Product")
    public Product getProduct() {
        return product;
    }

    @JsonProperty("Product")
    public void setProduct(Product product) {
        this.product = product;
    }

    @JsonProperty("Route")
    public Route getRoute() {
        return route;
    }

    @JsonProperty("Route")
    public void setRoute(Route route) {
        this.route = route;
    }

    @JsonProperty("Site")
    public Site getSite() {
        return site;
    }

    @JsonProperty("Site")
    public void setSite(Site site) {
        this.site = site;
    }

    @JsonProperty("Dose")
    public Dose getDose() {
        return dose;
    }

    @JsonProperty("Dose")
    public void setDose(Dose dose) {
        this.dose = dose;
    }

    @JsonProperty("Order")
    public Order getOrder() {
        return order;
    }

    @JsonProperty("Order")
    public void setOrder(Order order) {
        this.order = order;
    }

    @JsonProperty("ClinicalInfo")
    public List<Object> getClinicalInfo() {
        return clinicalInfo;
    }

    @JsonProperty("ClinicalInfo")
    public void setClinicalInfo(List<Object> clinicalInfo) {
        this.clinicalInfo = clinicalInfo;
    }

    @JsonProperty("Notes")
    public List<String> getNotes() {
        return notes;
    }

    @JsonProperty("Notes")
    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    @JsonProperty("RefusalReason")
    public Object getRefusalReason() {
        return refusalReason;
    }

    @JsonProperty("RefusalReason")
    public void setRefusalReason(Object refusalReason) {
        this.refusalReason = refusalReason;
    }

    @JsonProperty("Provider")
    public Provider getProvider() {
        return provider;
    }

    @JsonProperty("Provider")
    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    @JsonProperty("Location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("Location")
    public void setLocation(Location location) {
        this.location = location;
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
