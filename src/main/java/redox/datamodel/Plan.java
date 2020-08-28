package redox.datamodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Plan{

	@JsonProperty("Type")
	private Object type;

	@JsonProperty("ID")
	private String iD;

	@JsonProperty("IDType")
	private String iDType;

	@JsonProperty("Name")
	private String name;

	public void setType(Object type){
		this.type = type;
	}

	public Object getType(){
		return type;
	}

	public void setID(String iD){
		this.iD = iD;
	}

	public String getID(){
		return iD;
	}

	public void setIDType(String iDType){
		this.iDType = iDType;
	}

	public String getIDType(){
		return iDType;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}
}