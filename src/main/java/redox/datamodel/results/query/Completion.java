
package redox.datamodel.results.query;

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
    "StartDateTime",
    "EndDateTime"
})
public class Completion {

    @JsonProperty("StartDateTime")
    private String startDateTime;
    @JsonProperty("EndDateTime")
    private String endDateTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("StartDateTime")
    public String getStartDateTime() {
        return startDateTime;
    }

    @JsonProperty("StartDateTime")
    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }

    @JsonProperty("EndDateTime")
    public String getEndDateTime() {
        return endDateTime;
    }

    @JsonProperty("EndDateTime")
    public void setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
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
