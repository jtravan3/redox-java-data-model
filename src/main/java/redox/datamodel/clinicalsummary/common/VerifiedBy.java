
package redox.datamodel.clinicalsummary.common;

import com.fasterxml.jackson.annotation.*;
import redox.datamodel.common.Address;
import redox.datamodel.common.Location;
import redox.datamodel.common.PhoneNumber;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ID",
    "IDType",
    "FirstName",
    "LastName",
    "Credentials",
    "Address",
    "EmailAddresses",
    "PhoneNumber",
    "Location",
    "DateTime"
})
public class VerifiedBy {

    @JsonProperty("ID")
    private Object iD;
    @JsonProperty("IDType")
    private Object iDType;
    @JsonProperty("FirstName")
    private String firstName;
    @JsonProperty("LastName")
    private String lastName;
    @JsonProperty("Credentials")
    private String credentials = null;
    @JsonProperty("Address")
    private Address address;
    @JsonProperty("EmailAddresses")
    private List<Object> emailAddresses = null;
    @JsonProperty("PhoneNumber")
    private PhoneNumber phoneNumber;
    @JsonProperty("Location")
    private Location location;
    @JsonProperty("DateTime")
    private Object dateTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ID")
    public Object getID() {
        return iD;
    }

    @JsonProperty("ID")
    public void setID(Object iD) {
        this.iD = iD;
    }

    @JsonProperty("IDType")
    public Object getIDType() {
        return iDType;
    }

    @JsonProperty("IDType")
    public void setIDType(Object iDType) {
        this.iDType = iDType;
    }

    @JsonProperty("FirstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("FirstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("LastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("LastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("Credentials")
    public String getCredentials() {
        return credentials;
    }

    @JsonProperty("Credentials")
    public void setCredentials(String credentials) {
        this.credentials = credentials;
    }

    @JsonProperty("Address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("Address")
    public void setAddress(Address address) {
        this.address = address;
    }

    @JsonProperty("EmailAddresses")
    public List<Object> getEmailAddresses() {
        return emailAddresses;
    }

    @JsonProperty("EmailAddresses")
    public void setEmailAddresses(List<Object> emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    @JsonProperty("PhoneNumber")
    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty("PhoneNumber")
    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @JsonProperty("Location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("Location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonProperty("DateTime")
    public Object getDateTime() {
        return dateTime;
    }

    @JsonProperty("DateTime")
    public void setDateTime(Object dateTime) {
        this.dateTime = dateTime;
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
