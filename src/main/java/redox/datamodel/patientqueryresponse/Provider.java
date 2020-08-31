
package redox.datamodel.patientqueryresponse;

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
    "ID",
    "IDType",
    "FirstName",
    "LastName",
    "Credentials",
    "Address",
    "EmailAddresses",
    "PhoneNumber",
    "Location",
    "Role"
})
public class Provider {

    @JsonProperty("ID")
    private Object iD;
    @JsonProperty("IDType")
    private Object iDType;
    @JsonProperty("FirstName")
    private Object firstName;
    @JsonProperty("LastName")
    private Object lastName;
    @JsonProperty("Credentials")
    private List<Object> credentials = null;
    @JsonProperty("Address")
    private Address____ address;
    @JsonProperty("EmailAddresses")
    private List<Object> emailAddresses = null;
    @JsonProperty("PhoneNumber")
    private PhoneNumber___ phoneNumber;
    @JsonProperty("Location")
    private Location__ location;
    @JsonProperty("Role")
    private Role role;
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
    public Object getFirstName() {
        return firstName;
    }

    @JsonProperty("FirstName")
    public void setFirstName(Object firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("LastName")
    public Object getLastName() {
        return lastName;
    }

    @JsonProperty("LastName")
    public void setLastName(Object lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("Credentials")
    public List<Object> getCredentials() {
        return credentials;
    }

    @JsonProperty("Credentials")
    public void setCredentials(List<Object> credentials) {
        this.credentials = credentials;
    }

    @JsonProperty("Address")
    public Address____ getAddress() {
        return address;
    }

    @JsonProperty("Address")
    public void setAddress(Address____ address) {
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
    public PhoneNumber___ getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty("PhoneNumber")
    public void setPhoneNumber(PhoneNumber___ phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @JsonProperty("Location")
    public Location__ getLocation() {
        return location;
    }

    @JsonProperty("Location")
    public void setLocation(Location__ location) {
        this.location = location;
    }

    @JsonProperty("Role")
    public Role getRole() {
        return role;
    }

    @JsonProperty("Role")
    public void setRole(Role role) {
        this.role = role;
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
