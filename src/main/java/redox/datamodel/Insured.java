package redox.datamodel;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Insured{

	@JsonProperty("Address")
	private Address address;

	@JsonProperty("FirstName")
	private Object firstName;

	@JsonProperty("DOB")
	private Object dOB;

	@JsonProperty("Relationship")
	private Object relationship;

	@JsonProperty("Sex")
	private Object sex;

	@JsonProperty("LastName")
	private Object lastName;

	@JsonProperty("Identifiers")
	private List<Object> identifiers;

	@JsonProperty("MiddleName")
	private Object middleName;

	@JsonProperty("SSN")
	private Object sSN;

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

	public void setDOB(Object dOB){
		this.dOB = dOB;
	}

	public Object getDOB(){
		return dOB;
	}

	public void setRelationship(Object relationship){
		this.relationship = relationship;
	}

	public Object getRelationship(){
		return relationship;
	}

	public void setSex(Object sex){
		this.sex = sex;
	}

	public Object getSex(){
		return sex;
	}

	public void setLastName(Object lastName){
		this.lastName = lastName;
	}

	public Object getLastName(){
		return lastName;
	}

	public void setIdentifiers(List<Object> identifiers){
		this.identifiers = identifiers;
	}

	public List<Object> getIdentifiers(){
		return identifiers;
	}

	public void setMiddleName(Object middleName){
		this.middleName = middleName;
	}

	public Object getMiddleName(){
		return middleName;
	}

	public void setSSN(Object sSN){
		this.sSN = sSN;
	}

	public Object getSSN(){
		return sSN;
	}
}