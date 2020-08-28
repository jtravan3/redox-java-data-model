package redox.datamodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LocationsItem{

	@JsonProperty("Type")
	private Type type;

	@JsonProperty("Address")
	private Address address;

	@JsonProperty("Name")
	private String name;

	public void setType(Type type){
		this.type = type;
	}

	public Type getType(){
		return type;
	}

	public void setAddress(Address address){
		this.address = address;
	}

	public Address getAddress(){
		return address;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}
}