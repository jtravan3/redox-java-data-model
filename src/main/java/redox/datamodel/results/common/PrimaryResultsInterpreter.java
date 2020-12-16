
package redox.datamodel.results.common;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import redox.datamodel.clinicalsummary.common.EmailAddress;
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
public class PrimaryResultsInterpreter {

    @JsonProperty("NPI")
    private Object nPI;
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
    private Address address;
    @JsonProperty("EmailAddresses")
    private List<EmailAddress> emailAddresses = null;
    @JsonProperty("PhoneNumber")
    private PhoneNumber phoneNumber;
    @JsonProperty("Location")
    private Location location;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("NPI")
    public Object getNPI() {
        return nPI;
    }

    @JsonProperty("NPI")
    public void setNPI(Object nPI) {
        this.nPI = nPI;
    }

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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
