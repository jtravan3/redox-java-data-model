package redox.datamodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Message{

	@JsonProperty("ID")
	private Integer iD;

	public void setID(Integer iD){
		this.iD = iD;
	}

	public Integer getID(){
		return iD;
	}
}