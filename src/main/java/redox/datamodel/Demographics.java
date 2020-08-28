package redox.datamodel;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Demographics{

	@JsonProperty("Address")
	private Address address;

	@JsonProperty("FirstName")
	private String firstName;

	@JsonProperty("Sex")
	private String sex;

	@JsonProperty("Religion")
	private String religion;

	@JsonProperty("SSN")
	private String sSN;

	@JsonProperty("MaritalStatus")
	private String maritalStatus;

	@JsonProperty("Ethnicity")
	private String ethnicity;

	@JsonProperty("Language")
	private Object language;

	@JsonProperty("DOB")
	private String dOB;

	@JsonProperty("Race")
	private String race;

	@JsonProperty("PhoneNumber")
	private PhoneNumber phoneNumber;

	@JsonProperty("EmailAddresses")
	private List<EmailAddressesItem> emailAddresses;

	@JsonProperty("LastName")
	private String lastName;

	public void setAddress(Address address){
		this.address = address;
	}

	public Address getAddress(){
		return address;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setSex(String sex){
		this.sex = sex;
	}

	public String getSex(){
		return sex;
	}

	public void setReligion(String religion){
		this.religion = religion;
	}

	public String getReligion(){
		return religion;
	}

	public void setSSN(String sSN){
		this.sSN = sSN;
	}

	public String getSSN(){
		return sSN;
	}

	public void setMaritalStatus(String maritalStatus){
		this.maritalStatus = maritalStatus;
	}

	public String getMaritalStatus(){
		return maritalStatus;
	}

	public void setEthnicity(String ethnicity){
		this.ethnicity = ethnicity;
	}

	public String getEthnicity(){
		return ethnicity;
	}

	public void setLanguage(Object language){
		this.language = language;
	}

	public Object getLanguage(){
		return language;
	}

	public void setDOB(String dOB){
		this.dOB = dOB;
	}

	public String getDOB(){
		return dOB;
	}

	public void setRace(String race){
		this.race = race;
	}

	public String getRace(){
		return race;
	}

	public void setPhoneNumber(PhoneNumber phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public PhoneNumber getPhoneNumber(){
		return phoneNumber;
	}

	public void setEmailAddresses(List<EmailAddressesItem> emailAddresses){
		this.emailAddresses = emailAddresses;
	}

	public List<EmailAddressesItem> getEmailAddresses(){
		return emailAddresses;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String getLastName(){
		return lastName;
	}
}