
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
    "Type",
    "Facility",
    "Department",
    "Room",
    "Bed",
    "Address",
    "Name"
})
public class Location {

    @JsonProperty("Type")
    private Object type;
    @JsonProperty("Facility")
    private Object facility;
    @JsonProperty("Department")
    private Object department;
    @JsonProperty("Room")
    private Object room;
    @JsonProperty("Bed")
    private Object bed;
    @JsonProperty("Address")
    private Address address;
    @JsonProperty("Name")
    private String name;
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

    @JsonProperty("Bed")
    public Object getBed() {
        return bed;
    }

    @JsonProperty("Bed")
    public void setBed(Object bed) {
        this.bed = bed;
    }

    @JsonProperty("Address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("Address")
    public void setAddress(Address address) {
        this.address = address;
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
