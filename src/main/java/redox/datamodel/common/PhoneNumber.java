
package redox.datamodel.common;

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
    "Office",
        "Home",
        "Mobile"
})
public class PhoneNumber {

    @JsonProperty("Office")
    private String office;
    @JsonProperty("Home")
    private String home;
    @JsonProperty("Mobile")
    private Object mobile;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Office")
    public String getOffice() {
        return office;
    }

    @JsonProperty("Office")
    public void setOffice(String office) {
        this.office = office;
    }

    @JsonProperty("Home")
    public String getHome() {
        return home;
    }
    @JsonProperty("Home")
    public void setHome(String home) {
        this.home = home;
    }
    @JsonProperty("Mobile")
    public Object getMobile() {
        return mobile;
    }
    @JsonProperty("Mobile")
    public void setMobile(Object mobile) {
        this.mobile = mobile;
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
