
package redox.datamodel.medications.administration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import redox.datamodel.common.Address;
import redox.datamodel.common.PhoneNumber;
import redox.datamodel.common.Location;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "NPI",
    "ID",
    "IDType",
    "FirstName",
    "LastName",
    "Credentials",
    "Address",
    "EmailAddresses",
    "PhoneNumber",
    "Location"
})
public class AdministeringProvider {

    @JsonProperty("NPI")
    private String nPI;
    @JsonProperty("ID")
    private String iD;
    @JsonProperty("IDType")
    private String iDType;
    @JsonProperty("FirstName")
    private String firstName;
    @JsonProperty("LastName")
    private String lastName;
    @JsonProperty("Credentials")
    private List<String> credentials = null;
    @JsonProperty("Address")
    private Address address;
    @JsonProperty("EmailAddresses")
    private List<Object> emailAddresses = null;
    @JsonProperty("PhoneNumber")
    private PhoneNumber phoneNumber;
    @JsonProperty("Location")
    private Location location;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("NPI")
    public String getNPI() {
        return nPI;
    }

    @JsonProperty("NPI")
    public void setNPI(String nPI) {
        this.nPI = nPI;
    }

    @JsonProperty("ID")
    public String getID() {
        return iD;
    }

    @JsonProperty("ID")
    public void setID(String iD) {
        this.iD = iD;
    }

    @JsonProperty("IDType")
    public String getIDType() {
        return iDType;
    }

    @JsonProperty("IDType")
    public void setIDType(String iDType) {
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
    public List<String> getCredentials() {
        return credentials;
    }

    @JsonProperty("Credentials")
    public void setCredentials(List<String> credentials) {
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
