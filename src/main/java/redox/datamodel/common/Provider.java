
package redox.datamodel.common;

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
    "Role",
        "NPI",
})
public class Provider {

    @JsonProperty("ID")
    private Object iD;
    @JsonProperty("IDType")
    private Object iDType;
    @JsonProperty("FirstName")
    private String firstName;
    @JsonProperty("LastName")
    private String lastName;
    @JsonProperty("Credentials")
    private List<Object> credentials = null;
    @JsonProperty("Address")
    private Address address;
    @JsonProperty("EmailAddresses")
    private List<EmailAddress> emailAddresses = null;
    @JsonProperty("PhoneNumber")
    private PhoneNumber phoneNumber;
    @JsonProperty("Location")
    private Location location;
    @JsonProperty("Role")
    private Role role;
    @JsonProperty("NPI")
    private String nPI;
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
    public List<Object> getCredentials() {
        return credentials;
    }

    @JsonProperty("Credentials")
    public void setCredentials(List<Object> credentials) {
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
    public List<EmailAddress> getEmailAddresses() {
        return emailAddresses;
    }

    @JsonProperty("EmailAddresses")
    public void setEmailAddresses(List<EmailAddress> emailAddresses) {
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

    @JsonProperty("Role")
    public Role getRole() {
        return role;
    }

    @JsonProperty("Role")
    public void setRole(Role role) {
        this.role = role;
    }

    @JsonProperty("NPI")
    public String getNPI() {
        return nPI;
    }

    @JsonProperty("NPI")
    public void setNPI(String nPI) {
        this.nPI = nPI;
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
