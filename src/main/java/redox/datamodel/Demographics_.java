
package redox.datamodel;

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
    "Sex",
    "DOB"
})
public class Demographics_ {

    @JsonProperty("Sex")
    private String sex;
    @JsonProperty("DOB")
    private String dOB;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Sex")
    public String getSex() {
        return sex;
    }

    @JsonProperty("Sex")
    public void setSex(String sex) {
        this.sex = sex;
    }

    @JsonProperty("DOB")
    public String getDOB() {
        return dOB;
    }

    @JsonProperty("DOB")
    public void setDOB(String dOB) {
        this.dOB = dOB;
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
