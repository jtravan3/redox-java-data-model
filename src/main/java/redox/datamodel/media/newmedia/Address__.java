
package redox.datamodel.media.newmedia;

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
    "StreetAddress",
    "City",
    "State",
    "ZIP",
    "County",
    "Country"
})
public class Address__ {

    @JsonProperty("StreetAddress")
    private Object streetAddress;
    @JsonProperty("City")
    private Object city;
    @JsonProperty("State")
    private Object state;
    @JsonProperty("ZIP")
    private Object zIP;
    @JsonProperty("County")
    private Object county;
    @JsonProperty("Country")
    private Object country;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("StreetAddress")
    public Object getStreetAddress() {
        return streetAddress;
    }

    @JsonProperty("StreetAddress")
    public void setStreetAddress(Object streetAddress) {
        this.streetAddress = streetAddress;
    }

    @JsonProperty("City")
    public Object getCity() {
        return city;
    }

    @JsonProperty("City")
    public void setCity(Object city) {
        this.city = city;
    }

    @JsonProperty("State")
    public Object getState() {
        return state;
    }

    @JsonProperty("State")
    public void setState(Object state) {
        this.state = state;
    }

    @JsonProperty("ZIP")
    public Object getZIP() {
        return zIP;
    }

    @JsonProperty("ZIP")
    public void setZIP(Object zIP) {
        this.zIP = zIP;
    }

    @JsonProperty("County")
    public Object getCounty() {
        return county;
    }

    @JsonProperty("County")
    public void setCounty(Object county) {
        this.county = county;
    }

    @JsonProperty("Country")
    public Object getCountry() {
        return country;
    }

    @JsonProperty("Country")
    public void setCountry(Object country) {
        this.country = country;
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
