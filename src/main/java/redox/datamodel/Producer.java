package redox.datamodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Producer{

	@JsonProperty("Address")
	private Address address;

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