
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
    "Status",
    "EffectiveDate",
    "Notification"
})
public class Consent {

    @JsonProperty("Status")
    private Object status;
    @JsonProperty("EffectiveDate")
    private Object effectiveDate;
    @JsonProperty("Notification")
    private Object notification;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Status")
    public Object getStatus() {
        return status;
    }

    @JsonProperty("Status")
    public void setStatus(Object status) {
        this.status = status;
    }

    @JsonProperty("EffectiveDate")
    public Object getEffectiveDate() {
        return effectiveDate;
    }

    @JsonProperty("EffectiveDate")
    public void setEffectiveDate(Object effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    @JsonProperty("Notification")
    public Object getNotification() {
        return notification;
    }

    @JsonProperty("Notification")
    public void setNotification(Object notification) {
        this.notification = notification;
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
