
package redox.datamodel.clinicalsummary.common;

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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Identifiers",
    "LastName",
    "MiddleName",
    "FirstName",
    "SSN",
    "Relationship",
    "DOB",
    "Sex",
    "Address"
})
public class Insured {

    @JsonProperty("Identifiers")
    private List<Object> identifiers = null;
    @JsonProperty("LastName")
    private String lastName;
    @JsonProperty("MiddleName")
    private String middleName;
    @JsonProperty("FirstName")
    private String firstName;
    @JsonProperty("SSN")
    private Object sSN;
    @JsonProperty("Relationship")
    private Object relationship;
    @JsonProperty("DOB")
    private Object dOB;
    @JsonProperty("Sex")
    private Object sex;
    @JsonProperty("Address")
    private Address address;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Identifiers")
    public List<Object> getIdentifiers() {
        return identifiers;
    }

    @JsonProperty("Identifiers")
    public void setIdentifiers(List<Object> identifiers) {
        this.identifiers = identifiers;
    }

    @JsonProperty("LastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("LastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("MiddleName")
    public String getMiddleName() {
        return middleName;
    }

    @JsonProperty("MiddleName")
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @JsonProperty("FirstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("FirstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("SSN")
    public Object getSSN() {
        return sSN;
    }

    @JsonProperty("SSN")
    public void setSSN(Object sSN) {
        this.sSN = sSN;
    }

    @JsonProperty("Relationship")
    public Object getRelationship() {
        return relationship;
    }

    @JsonProperty("Relationship")
    public void setRelationship(Object relationship) {
        this.relationship = relationship;
    }

    @JsonProperty("DOB")
    public Object getDOB() {
        return dOB;
    }

    @JsonProperty("DOB")
    public void setDOB(Object dOB) {
        this.dOB = dOB;
    }

    @JsonProperty("Sex")
    public Object getSex() {
        return sex;
    }

    @JsonProperty("Sex")
    public void setSex(Object sex) {
        this.sex = sex;
    }

    @JsonProperty("Address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("Address")
    public void setAddress(Address address) {
        this.address = address;
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
