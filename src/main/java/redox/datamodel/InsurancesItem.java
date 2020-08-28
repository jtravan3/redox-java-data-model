package redox.datamodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InsurancesItem{

	@JsonProperty("GroupName")
	private String groupName;

	@JsonProperty("AgreementType")
	private Object agreementType;

	@JsonProperty("Company")
	private Company company;

	@JsonProperty("ExpirationDate")
	private String expirationDate;

	@JsonProperty("PolicyNumber")
	private String policyNumber;

	@JsonProperty("GroupNumber")
	private String groupNumber;

	@JsonProperty("MemberNumber")
	private Object memberNumber;

	@JsonProperty("Plan")
	private Plan plan;

	@JsonProperty("CoverageType")
	private Object coverageType;

	@JsonProperty("Insured")
	private Insured insured;

	@JsonProperty("EffectiveDate")
	private String effectiveDate;

	public void setGroupName(String groupName){
		this.groupName = groupName;
	}

	public String getGroupName(){
		return groupName;
	}

	public void setAgreementType(Object agreementType){
		this.agreementType = agreementType;
	}

	public Object getAgreementType(){
		return agreementType;
	}

	public void setCompany(Company company){
		this.company = company;
	}

	public Company getCompany(){
		return company;
	}

	public void setExpirationDate(String expirationDate){
		this.expirationDate = expirationDate;
	}

	public String getExpirationDate(){
		return expirationDate;
	}

	public void setPolicyNumber(String policyNumber){
		this.policyNumber = policyNumber;
	}

	public String getPolicyNumber(){
		return policyNumber;
	}

	public void setGroupNumber(String groupNumber){
		this.groupNumber = groupNumber;
	}

	public String getGroupNumber(){
		return groupNumber;
	}

	public void setMemberNumber(Object memberNumber){
		this.memberNumber = memberNumber;
	}

	public Object getMemberNumber(){
		return memberNumber;
	}

	public void setPlan(Plan plan){
		this.plan = plan;
	}

	public Plan getPlan(){
		return plan;
	}

	public void setCoverageType(Object coverageType){
		this.coverageType = coverageType;
	}

	public Object getCoverageType(){
		return coverageType;
	}

	public void setInsured(Insured insured){
		this.insured = insured;
	}

	public Insured getInsured(){
		return insured;
	}

	public void setEffectiveDate(String effectiveDate){
		this.effectiveDate = effectiveDate;
	}

	public String getEffectiveDate(){
		return effectiveDate;
	}
}