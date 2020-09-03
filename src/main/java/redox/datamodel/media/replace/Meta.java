
package redox.datamodel.media.replace;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DataModel",
    "EventType",
    "EventDateTime",
    "Test",
    "Source",
    "Destinations",
    "Message",
    "Transmission",
    "FacilityCode"
})
public class Meta {

    @JsonProperty("DataModel")
    private String dataModel;
    @JsonProperty("EventType")
    private String eventType;
    @JsonProperty("EventDateTime")
    private String eventDateTime;
    @JsonProperty("Test")
    private Boolean test;
    @JsonProperty("Source")
    private Source source;
    @JsonProperty("Destinations")
    private List<Destination> destinations = null;
    @JsonProperty("Message")
    private Message message;
    @JsonProperty("Transmission")
    private Transmission transmission;
    @JsonProperty("FacilityCode")
    private Object facilityCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("DataModel")
    public String getDataModel() {
        return dataModel;
    }

    @JsonProperty("DataModel")
    public void setDataModel(String dataModel) {
        this.dataModel = dataModel;
    }

    @JsonProperty("EventType")
    public String getEventType() {
        return eventType;
    }

    @JsonProperty("EventType")
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    @JsonProperty("EventDateTime")
    public String getEventDateTime() {
        return eventDateTime;
    }

    @JsonProperty("EventDateTime")
    public void setEventDateTime(String eventDateTime) {
        this.eventDateTime = eventDateTime;
    }

    @JsonProperty("Test")
    public Boolean getTest() {
        return test;
    }

    @JsonProperty("Test")
    public void setTest(Boolean test) {
        this.test = test;
    }

    @JsonProperty("Source")
    public Source getSource() {
        return source;
    }

    @JsonProperty("Source")
    public void setSource(Source source) {
        this.source = source;
    }

    @JsonProperty("Destinations")
    public List<Destination> getDestinations() {
        return destinations;
    }

    @JsonProperty("Destinations")
    public void setDestinations(List<Destination> destinations) {
        this.destinations = destinations;
    }

    @JsonProperty("Message")
    public Message getMessage() {
        return message;
    }

    @JsonProperty("Message")
    public void setMessage(Message message) {
        this.message = message;
    }

    @JsonProperty("Transmission")
    public Transmission getTransmission() {
        return transmission;
    }

    @JsonProperty("Transmission")
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @JsonProperty("FacilityCode")
    public Object getFacilityCode() {
        return facilityCode;
    }

    @JsonProperty("FacilityCode")
    public void setFacilityCode(Object facilityCode) {
        this.facilityCode = facilityCode;
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
