package redox.datamodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustodiansItem{

	@JsonProperty("Address")
	private Address address;

	@JsonProperty("FirstName")
	private String firstName;

	@JsonProperty("LastName")
	private String lastName;

	@JsonProperty("Credentials")
	private String credentials;

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

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String getLastName(){
		return lastName;
	}

	public void setCredentials(String credentials){
		this.credentials = credentials;
	}

	public String getCredentials(){
		return credentials;
	}
}