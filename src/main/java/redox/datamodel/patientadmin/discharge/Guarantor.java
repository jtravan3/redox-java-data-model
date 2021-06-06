
package redox.datamodel.patientadmin.discharge;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
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
    "Number",
    "FirstName",
    "MiddleName",
    "LastName",
    "SSN",
    "DOB",
    "Sex",
    "Spouse",
    "Address",
    "PhoneNumber",
    "EmailAddresses",
    "Type",
    "RelationToPatient",
    "Employer"
})
@Generated("jsonschema2pojo")
public class Guarantor {

    @JsonProperty("Number")
    private String number;
    @JsonProperty("FirstName")
    private String firstName;
    @JsonProperty("MiddleName")
    private Object middleName;
    @JsonProperty("LastName")
    private String lastName;
    @JsonProperty("SSN")
    private Object ssn;
    @JsonProperty("DOB")
    private Object dob;
    @JsonProperty("Sex")
    private Object sex;
    @JsonProperty("Spouse")
    private Spouse spouse;
    @JsonProperty("Address")
    private Address address;
    @JsonProperty("PhoneNumber")
    private PhoneNumber phoneNumber;
    @JsonProperty("EmailAddresses")
    private List<Object> emailAddresses = null;
    @JsonProperty("Type")
    private Object type;
    @JsonProperty("RelationToPatient")
    private String relationToPatient;
    @JsonProperty("Employer")
    private Employer employer;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Number")
    public String getNumber() {
        return number;
    }

    @JsonProperty("Number")
    public void setNumber(String number) {
        this.number = number;
    }

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

    @JsonProperty("SSN")
    public Object getSsn() {
        return ssn;
    }

    @JsonProperty("SSN")
    public void setSsn(Object ssn) {
        this.ssn = ssn;
    }

    @JsonProperty("DOB")
    public Object getDob() {
        return dob;
    }

    @JsonProperty("DOB")
    public void setDob(Object dob) {
        this.dob = dob;
    }

    @JsonProperty("Sex")
    public Object getSex() {
        return sex;
    }

    @JsonProperty("Sex")
    public void setSex(Object sex) {
        this.sex = sex;
    }

    @JsonProperty("Spouse")
    public Spouse getSpouse() {
        return spouse;
    }

    @JsonProperty("Spouse")
    public void setSpouse(Spouse spouse) {
        this.spouse = spouse;
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

    @JsonProperty("EmailAddresses")
    public List<Object> getEmailAddresses() {
        return emailAddresses;
    }

    @JsonProperty("EmailAddresses")
    public void setEmailAddresses(List<Object> emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    @JsonProperty("Type")
    public Object getType() {
        return type;
    }

    @JsonProperty("Type")
    public void setType(Object type) {
        this.type = type;
    }

    @JsonProperty("RelationToPatient")
    public String getRelationToPatient() {
        return relationToPatient;
    }

    @JsonProperty("RelationToPatient")
    public void setRelationToPatient(String relationToPatient) {
        this.relationToPatient = relationToPatient;
    }

    @JsonProperty("Employer")
    public Employer getEmployer() {
        return employer;
    }

    @JsonProperty("Employer")
    public void setEmployer(Employer employer) {
        this.employer = employer;
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
