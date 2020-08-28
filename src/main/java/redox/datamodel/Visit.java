package redox.datamodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Visit{

	@JsonProperty("StartDateTime")
	private Object startDateTime;

	@JsonProperty("EndDateTime")
	private Object endDateTime;

	@JsonProperty("VisitNumber")
	private Object visitNumber;

	@JsonProperty("Reason")
	private Object reason;

	@JsonProperty("Location")
	private Location location;

	public void setStartDateTime(Object startDateTime){
		this.startDateTime = startDateTime;
	}

	public Object getStartDateTime(){
		return startDateTime;
	}

	public void setEndDateTime(Object endDateTime){
		this.endDateTime = endDateTime;
	}

	public Object getEndDateTime(){
		return endDateTime;
	}

	public void setVisitNumber(Object visitNumber){
		this.visitNumber = visitNumber;
	}

	public Object getVisitNumber(){
		return visitNumber;
	}

	public void setReason(Object reason){
		this.reason = reason;
	}

	public Object getReason(){
		return reason;
	}

	public void setLocation(Location location){
		this.location = location;
	}

	public Location getLocation(){
		return location;
	}
}