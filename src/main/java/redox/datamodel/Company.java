package redox.datamodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Company{

	@JsonProperty("Address")
	private Address address;

	@JsonProperty("PhoneNumber")
	private String phoneNumber;

	@JsonProperty("ID")
	private String iD;

	@JsonProperty("IDType")
	private Object iDType;

	@JsonProperty("Name")
	private String name;

	public void setAddress(Address address){
		this.address = address;
	}

	public Address getAddress(){
		return address;
	}

	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber(){
		return phoneNumber;
	}

	public void setID(String iD){
		this.iD = iD;
	}

	public String getID(){
		return iD;
	}

	public void setIDType(Object iDType){
		this.iDType = iDType;
	}

	public Object getIDType(){
		return iDType;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}
}