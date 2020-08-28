
package redox.datamodel;

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
    "FirstName",
    "LastName",
    "DOB",
    "SSN",
    "Sex",
    "Address",
    "PhoneNumber",
    "EmailAddresses",
    "Language",
    "Race",
    "Ethnicity",
    "Religion",
    "MaritalStatus"
})
public class Demographics {

    @JsonProperty("FirstName")
    private String firstName;
    @JsonProperty("LastName")
    private String lastName;
    @JsonProperty("DOB")
    private String dOB;
    @JsonProperty("SSN")
    private String sSN;
    @JsonProperty("Sex")
    private String sex;
    @JsonProperty("Address")
    private Address_ address;
    @JsonProperty("PhoneNumber")
    private PhoneNumber_ phoneNumber;
    @JsonProperty("EmailAddresses")
    private List<EmailAddress> emailAddresses = null;
    @JsonProperty("Language")
    private Object language;
    @JsonProperty("Race")
    private String race;
    @JsonProperty("Ethnicity")
    private String ethnicity;
    @JsonProperty("Religion")
    private String religion;
    @JsonProperty("MaritalStatus")
    private String maritalStatus;
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

    @JsonProperty("LastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("LastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("DOB")
    public String getDOB() {
        return dOB;
    }

    @JsonProperty("DOB")
    public void setDOB(String dOB) {
        this.dOB = dOB;
    }

    @JsonProperty("SSN")
    public String getSSN() {
        return sSN;
    }

    @JsonProperty("SSN")
    public void setSSN(String sSN) {
        this.sSN = sSN;
    }

    @JsonProperty("Sex")
    public String getSex() {
        return sex;
    }

    @JsonProperty("Sex")
    public void setSex(String sex) {
        this.sex = sex;
    }

    @JsonProperty("Address")
    public Address_ getAddress() {
        return address;
    }

    @JsonProperty("Address")
    public void setAddress(Address_ address) {
        this.address = address;
    }

    @JsonProperty("PhoneNumber")
    public PhoneNumber_ getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty("PhoneNumber")
    public void setPhoneNumber(PhoneNumber_ phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @JsonProperty("EmailAddresses")
    public List<EmailAddress> getEmailAddresses() {
        return emailAddresses;
    }

    @JsonProperty("EmailAddresses")
    public void setEmailAddresses(List<EmailAddress> emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    @JsonProperty("Language")
    public Object getLanguage() {
        return language;
    }

    @JsonProperty("Language")
    public void setLanguage(Object language) {
        this.language = language;
    }

    @JsonProperty("Race")
    public String getRace() {
        return race;
    }

    @JsonProperty("Race")
    public void setRace(String race) {
        this.race = race;
    }

    @JsonProperty("Ethnicity")
    public String getEthnicity() {
        return ethnicity;
    }

    @JsonProperty("Ethnicity")
    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    @JsonProperty("Religion")
    public String getReligion() {
        return religion;
    }

    @JsonProperty("Religion")
    public void setReligion(String religion) {
        this.religion = religion;
    }

    @JsonProperty("MaritalStatus")
    public String getMaritalStatus() {
        return maritalStatus;
    }

    @JsonProperty("MaritalStatus")
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
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
