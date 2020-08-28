
package redox.datamodel;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Plan",
    "MemberNumber",
    "Company",
    "GroupNumber",
    "GroupName",
    "EffectiveDate",
    "ExpirationDate",
    "PolicyNumber",
    "AgreementType",
    "CoverageType",
    "Insured"
})
public class Insurance {

    @JsonProperty("Plan")
    private Plan plan;
    @JsonProperty("MemberNumber")
    private Object memberNumber;
    @JsonProperty("Company")
    private Company company;
    @JsonProperty("GroupNumber")
    private String groupNumber;
    @JsonProperty("GroupName")
    private String groupName;
    @JsonProperty("EffectiveDate")
    private String effectiveDate;
    @JsonProperty("ExpirationDate")
    private String expirationDate;
    @JsonProperty("PolicyNumber")
    private String policyNumber;
    @JsonProperty("AgreementType")
    private Object agreementType;
    @JsonProperty("CoverageType")
    private Object coverageType;
    @JsonProperty("Insured")
    private Insured insured;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Plan")
    public Plan getPlan() {
        return plan;
    }

    @JsonProperty("Plan")
    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    @JsonProperty("MemberNumber")
    public Object getMemberNumber() {
        return memberNumber;
    }

    @JsonProperty("MemberNumber")
    public void setMemberNumber(Object memberNumber) {
        this.memberNumber = memberNumber;
    }

    @JsonProperty("Company")
    public Company getCompany() {
        return company;
    }

    @JsonProperty("Company")
    public void setCompany(Company company) {
        this.company = company;
    }

    @JsonProperty("GroupNumber")
    public String getGroupNumber() {
        return groupNumber;
    }

    @JsonProperty("GroupNumber")
    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    @JsonProperty("GroupName")
    public String getGroupName() {
        return groupName;
    }

    @JsonProperty("GroupName")
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @JsonProperty("EffectiveDate")
    public String getEffectiveDate() {
        return effectiveDate;
    }

    @JsonProperty("EffectiveDate")
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    @JsonProperty("ExpirationDate")
    public String getExpirationDate() {
        return expirationDate;
    }

    @JsonProperty("ExpirationDate")
    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @JsonProperty("PolicyNumber")
    public String getPolicyNumber() {
        return policyNumber;
    }

    @JsonProperty("PolicyNumber")
    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    @JsonProperty("AgreementType")
    public Object getAgreementType() {
        return agreementType;
    }

    @JsonProperty("AgreementType")
    public void setAgreementType(Object agreementType) {
        this.agreementType = agreementType;
    }

    @JsonProperty("CoverageType")
    public Object getCoverageType() {
        return coverageType;
    }

    @JsonProperty("CoverageType")
    public void setCoverageType(Object coverageType) {
        this.coverageType = coverageType;
    }

    @JsonProperty("Insured")
    public Insured getInsured() {
        return insured;
    }

    @JsonProperty("Insured")
    public void setInsured(Insured insured) {
        this.insured = insured;
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
