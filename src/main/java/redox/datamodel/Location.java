package redox.datamodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Location{

	@JsonProperty("Type")
	private Object type;

	@JsonProperty("Department")
	private Object department;

	@JsonProperty("Facility")
	private Object facility;

	@JsonProperty("Room")
	private Object room;

	public void setType(Object type){
		this.type = type;
	}

	public Object getType(){
		return type;
	}

	public void setDepartment(Object department){
		this.department = department;
	}

	public Object getDepartment(){
		return department;
	}

	public void setFacility(Object facility){
		this.facility = facility;
	}

	public Object getFacility(){
		return facility;
	}

	public void setRoom(Object room){
		this.room = room;
	}

	public Object getRoom(){
		return room;
	}
}