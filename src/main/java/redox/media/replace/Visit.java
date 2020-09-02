
package redox.media.replace;

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
    "VisitNumber",
    "AccountNumber"
})
public class Visit {

    @JsonProperty("VisitNumber")
    private String visitNumber;
    @JsonProperty("AccountNumber")
    private Object accountNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("VisitNumber")
    public String getVisitNumber() {
        return visitNumber;
    }

    @JsonProperty("VisitNumber")
    public void setVisitNumber(String visitNumber) {
        this.visitNumber = visitNumber;
    }

    @JsonProperty("AccountNumber")
    public Object getAccountNumber() {
        return accountNumber;
    }

    @JsonProperty("AccountNumber")
    public void setAccountNumber(Object accountNumber) {
        this.accountNumber = accountNumber;
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
