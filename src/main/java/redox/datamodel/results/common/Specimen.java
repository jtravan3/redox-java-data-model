
package redox.datamodel.results.common;

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
    "Source",
    "BodySite",
    "ID"
})
public class Specimen {

    @JsonProperty("Source")
    private Object source;
    @JsonProperty("BodySite")
    private Object bodySite;
    @JsonProperty("ID")
    private Object iD;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Source")
    public Object getSource() {
        return source;
    }

    @JsonProperty("Source")
    public void setSource(Object source) {
        this.source = source;
    }

    @JsonProperty("BodySite")
    public Object getBodySite() {
        return bodySite;
    }

    @JsonProperty("BodySite")
    public void setBodySite(Object bodySite) {
        this.bodySite = bodySite;
    }

    @JsonProperty("ID")
    public Object getID() {
        return iD;
    }

    @JsonProperty("ID")
    public void setID(Object iD) {
        this.iD = iD;
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
