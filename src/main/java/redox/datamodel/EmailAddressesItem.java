package redox.datamodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmailAddressesItem{

	@JsonProperty("Address")
	private String address;

	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return address;
	}
}