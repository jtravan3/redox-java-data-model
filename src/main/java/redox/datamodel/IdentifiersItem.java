package redox.datamodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IdentifiersItem{

	@JsonProperty("Type")
	private Object type;

	@JsonProperty("ID")
	private String iD;

	@JsonProperty("IDType")
	private String iDType;

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
}