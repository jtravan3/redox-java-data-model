
package redox.datamodel.vaccination.common;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import redox.datamodel.common.Provider;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ID",
    "EHRID",
    "Provider"
})
public class Order {

    @JsonProperty("ID")
    private String iD;
    @JsonProperty("EHRID")
    private String eHRID;
    @JsonProperty("Provider")
    private Provider provider;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ID")
    public String getID() {
        return iD;
    }

    @JsonProperty("ID")
    public void setID(String iD) {
        this.iD = iD;
    }

    @JsonProperty("EHRID")
    public String getEHRID() {
        return eHRID;
    }

    @JsonProperty("EHRID")
    public void setEHRID(String eHRID) {
        this.eHRID = eHRID;
    }

    @JsonProperty("Provider")
    public Provider getProvider() {
        return provider;
    }

    @JsonProperty("Provider")
    public void setProvider(Provider provider) {
        this.provider = provider;
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
