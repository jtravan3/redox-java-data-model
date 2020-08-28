
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
    "Type",
    "Facility",
    "Department",
    "Room"
})
public class Location___ {

    @JsonProperty("Type")
    private Object type;
    @JsonProperty("Facility")
    private Object facility;
    @JsonProperty("Department")
    private Object department;
    @JsonProperty("Room")
    private Object room;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Type")
    public Object getType() {
        return type;
    }

    @JsonProperty("Type")
    public void setType(Object type) {
        this.type = type;
    }

    @JsonProperty("Facility")
    public Object getFacility() {
        return facility;
    }

    @JsonProperty("Facility")
    public void setFacility(Object facility) {
        this.facility = facility;
    }

    @JsonProperty("Department")
    public Object getDepartment() {
        return department;
    }

    @JsonProperty("Department")
    public void setDepartment(Object department) {
        this.department = department;
    }

    @JsonProperty("Room")
    public Object getRoom() {
        return room;
    }

    @JsonProperty("Room")
    public void setRoom(Object room) {
        this.room = room;
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
