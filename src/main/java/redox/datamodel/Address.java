package redox.datamodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address{

	@JsonProperty("ZIP")
	private String zIP;

	@JsonProperty("StreetAddress")
	private String streetAddress;

	@JsonProperty("State")
	private String state;

	@JsonProperty("Country")
	private String country;

	@JsonProperty("City")
	private String city;

	@JsonProperty("County")
	private String county;

	public void setZIP(String zIP){
		this.zIP = zIP;
	}

	public String getZIP(){
		return zIP;
	}

	public void setStreetAddress(String streetAddress){
		this.streetAddress = streetAddress;
	}

	public String getStreetAddress(){
		return streetAddress;
	}

	public void setState(String state){
		this.state = state;
	}

	public String getState(){
		return state;
	}

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setCounty(String county){
		this.county = county;
	}

	public String getCounty(){
		return county;
	}
}