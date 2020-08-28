package redox.datamodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VerifiedByItem{

	@JsonProperty("FirstName")
	private String firstName;

	@JsonProperty("LastName")
	private String lastName;

	@JsonProperty("Credentials")
	private String credentials;

	@JsonProperty("DateTime")
	private Object dateTime;

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

	public void setDateTime(Object dateTime){
		this.dateTime = dateTime;
	}

	public Object getDateTime(){
		return dateTime;
	}
}