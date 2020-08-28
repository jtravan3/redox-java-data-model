package redox.datamodel;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Author{

	@JsonProperty("Type")
	private Object type;

	@JsonProperty("Address")
	private Address address;

	@JsonProperty("FirstName")
	private String firstName;

	@JsonProperty("PhoneNumber")
	private PhoneNumber phoneNumber;

	@JsonProperty("EmailAddresses")
	private List<Object> emailAddresses;

	@JsonProperty("ID")
	private String iD;

	@JsonProperty("LastName")
	private String lastName;

	@JsonProperty("IDType")
	private String iDType;

	@JsonProperty("Credentials")
	private List<String> credentials;

	@JsonProperty("Location")
	private Location location;

	public void setType(Object type){
		this.type = type;
	}

	public Object getType(){
		return type;
	}

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

	public void setPhoneNumber(PhoneNumber phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public PhoneNumber getPhoneNumber(){
		return phoneNumber;
	}

	public void setEmailAddresses(List<Object> emailAddresses){
		this.emailAddresses = emailAddresses;
	}

	public List<Object> getEmailAddresses(){
		return emailAddresses;
	}

	public void setID(String iD){
		this.iD = iD;
	}

	public String getID(){
		return iD;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String getLastName(){
		return lastName;
	}

	public void setIDType(String iDType){
		this.iDType = iDType;
	}

	public String getIDType(){
		return iDType;
	}

	public void setCredentials(List<String> credentials){
		this.credentials = credentials;
	}

	public List<String> getCredentials(){
		return credentials;
	}

	public void setLocation(Location location){
		this.location = location;
	}

	public Location getLocation(){
		return location;
	}
}