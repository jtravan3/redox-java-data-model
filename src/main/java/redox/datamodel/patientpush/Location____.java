
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
    "Address",
    "Type",
    "Name"
})
public class Location____ {

    @JsonProperty("Address")
    private Address_____ address;
    @JsonProperty("Type")
    private Type___ type;
    @JsonProperty("Name")
    private String name;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Address")
    public Address_____ getAddress() {
        return address;
    }

    @JsonProperty("Address")
    public void setAddress(Address_____ address) {
        this.address = address;
    }

    @JsonProperty("Type")
    public Type___ getType() {
        return type;
    }

    @JsonProperty("Type")
    public void setType(Type___ type) {
        this.type = type;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
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
