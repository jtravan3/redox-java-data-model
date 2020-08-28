package redox.datamodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Source{

	@JsonProperty("ID")
	private String iD;

	@JsonProperty("Name")
	private String name;

	public void setID(String iD){
		this.iD = iD;
	}

	public String getID(){
		return iD;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}
}