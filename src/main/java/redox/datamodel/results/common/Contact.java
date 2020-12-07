
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
import redox.datamodel.common.Address;
import redox.datamodel.common.PhoneNumber;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "FirstName",
    "MiddleName",
    "LastName",
    "Address",
    "PhoneNumber",
    "RelationToPatient",
    "EmailAddresses",
    "Roles"
})
public class Contact {

    @JsonProperty("FirstName")
    private String firstName;
    @JsonProperty("MiddleName")
    private Object middleName;
    @JsonProperty("LastName")
    private String lastName;
    @JsonProperty("Address")
    private Address address;
    @JsonProperty("PhoneNumber")
    private PhoneNumber phoneNumber;
    @JsonProperty("RelationToPatient")
    private String relationToPatient;
    @JsonProperty("EmailAddresses")
    private List<String> emailAddresses = null;
    @JsonProperty("Roles")
    private List<String> roles = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("FirstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("FirstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("MiddleName")
    public Object getMiddleName() {
        return middleName;
    }

    @JsonProperty("MiddleName")
    public void setMiddleName(Object middleName) {
        this.middleName = middleName;
    }

    @JsonProperty("LastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("LastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("Address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("Address")
    public void setAddress(Address address) {
        this.address = address;
    }

    @JsonProperty("PhoneNumber")
    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty("PhoneNumber")
    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @JsonProperty("RelationToPatient")
    public String getRelationToPatient() {
        return relationToPatient;
    }

    @JsonProperty("RelationToPatient")
    public void setRelationToPatient(String relationToPatient) {
        this.relationToPatient = relationToPatient;
    }

    @JsonProperty("EmailAddresses")
    public List<String> getEmailAddresses() {
        return emailAddresses;
    }

    @JsonProperty("EmailAddresses")
    public void setEmailAddresses(List<String> emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    @JsonProperty("Roles")
    public List<String> getRoles() {
        return roles;
    }

    @JsonProperty("Roles")
    public void setRoles(List<String> roles) {
        this.roles = roles;
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
