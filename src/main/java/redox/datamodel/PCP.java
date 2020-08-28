package redox.datamodel;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PCP{

	@JsonProperty("Type")
	private Object type;

	@JsonProperty("Address")
	private Address address;

	@JsonProperty("FirstName")
	private Object firstName;

	@JsonProperty("PhoneNumber")
	private PhoneNumber phoneNumber;

	@JsonProperty("EmailAddresses")
	private List<Object> emailAddresses;

	@JsonProperty("ID")
	private Object iD;

	@JsonProperty("LastName")
	private Object lastName;

	@JsonProperty("IDType")
	private Object iDType;

	@JsonProperty("Credentials")
	private List<Object> credentials;

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

	public void setFirstName(Object firstName){
		this.firstName = firstName;
	}

	public Object getFirstName(){
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

	public void setID(Object iD){
		this.iD = iD;
	}

	public Object getID(){
		return iD;
	}

	public void setLastName(Object lastName){
		this.lastName = lastName;
	}

	public Object getLastName(){
		return lastName;
	}

	public void setIDType(Object iDType){
		this.iDType = iDType;
	}

	public Object getIDType(){
		return iDType;
	}

	public void setCredentials(List<Object> credentials){
		this.credentials = credentials;
	}

	public List<Object> getCredentials(){
		return credentials;
	}

	public void setLocation(Location location){
		this.location = location;
	}

	public Location getLocation(){
		return location;
	}
}