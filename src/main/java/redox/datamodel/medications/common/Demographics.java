
package redox.datamodel.medications.common;

import com.fasterxml.jackson.annotation.*;
import redox.datamodel.common.Address;
import redox.datamodel.common.PhoneNumber;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "FirstName",
        "MiddleName",
        "LastName",
        "DOB",
        "SSN",
        "Sex",
        "Race",
        "IsHispanic",
        "MaritalStatus",
        "IsDeceased",
        "DeathDateTime",
        "PhoneNumber",
        "EmailAddresses",
        "Language",
        "Citizenship",
        "Address",
        "Ethnicity",
        "Religion"
})
public class Demographics {

    @JsonProperty("FirstName")
    private String firstName;
    @JsonProperty("MiddleName")
    private String middleName;
    @JsonProperty("LastName")
    private String lastName;
    @JsonProperty("DOB")
    private String dOB;
    @JsonProperty("SSN")
    private String sSN;
    @JsonProperty("Sex")
    private String sex;
    @JsonProperty("Race")
    private String race;
    @JsonProperty("IsHispanic")
    private Object isHispanic;
    @JsonProperty("MaritalStatus")
    private String maritalStatus;
    @JsonProperty("IsDeceased")
    private Object isDeceased;
    @JsonProperty("DeathDateTime")
    private Object deathDateTime;
    @JsonProperty("PhoneNumber")
    private PhoneNumber phoneNumber;
    @JsonProperty("EmailAddresses")
    private List<String> emailAddresses = null;
    @JsonProperty("Language")
    private String language;
    @JsonProperty("Citizenship")
    private List<Object> citizenship = null;
    @JsonProperty("Address")
    private Address address;
    @JsonProperty("Ethnicity")
    private String ethnicity;
    @JsonProperty("Religion")
    private String religion;
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
    public String getMiddleName() {
        return middleName;
    }

    @JsonProperty("MiddleName")
    public void setMiddleName(String middleName) {
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

    @JsonProperty("Race")
    public String getRace() {
        return race;
    }

    @JsonProperty("Race")
    public void setRace(String race) {
        this.race = race;
    }

    @JsonProperty("IsHispanic")
    public Object getIsHispanic() {
        return isHispanic;
    }

    @JsonProperty("IsHispanic")
    public void setIsHispanic(Object isHispanic) {
        this.isHispanic = isHispanic;
    }

    @JsonProperty("MaritalStatus")
    public String getMaritalStatus() {
        return maritalStatus;
    }

    @JsonProperty("MaritalStatus")
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @JsonProperty("IsDeceased")
    public Object getIsDeceased() {
        return isDeceased;
    }

    @JsonProperty("IsDeceased")
    public void setIsDeceased(Object isDeceased) {
        this.isDeceased = isDeceased;
    }

    @JsonProperty("DeathDateTime")
    public Object getDeathDateTime() {
        return deathDateTime;
    }

    @JsonProperty("DeathDateTime")
    public void setDeathDateTime(Object deathDateTime) {
        this.deathDateTime = deathDateTime;
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
    public List<String> getEmailAddresses() {
        return emailAddresses;
    }

    @JsonProperty("EmailAddresses")
    public void setEmailAddresses(List<String> emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    @JsonProperty("Language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("Language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("Citizenship")
    public List<Object> getCitizenship() {
        return citizenship;
    }

    @JsonProperty("Citizenship")
    public void setCitizenship(List<Object> citizenship) {
        this.citizenship = citizenship;
    }

    @JsonProperty("Address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("Address")
    public void setAddress(Address address) {
        this.address = address;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
