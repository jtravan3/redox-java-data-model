package redox.datamodel;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Meta{

	@JsonProperty("Message")
	private Message message;

	@JsonProperty("EventType")
	private String eventType;

	@JsonProperty("Test")
	private Boolean test;

	@JsonProperty("DataModel")
	private String dataModel;

	@JsonProperty("EventDateTime")
	private String eventDateTime;

	@JsonProperty("Transmission")
	private Transmission transmission;

	@JsonProperty("Destinations")
	private List<DestinationsItem> destinations;

	@JsonProperty("FacilityCode")
	private Object facilityCode;

	@JsonProperty("Source")
	private Source source;

	public void setMessage(Message message){
		this.message = message;
	}

	public Message getMessage(){
		return message;
	}

	public void setEventType(String eventType){
		this.eventType = eventType;
	}

	public String getEventType(){
		return eventType;
	}

	public void setTest(Boolean test){
		this.test = test;
	}

	public boolean isTest(){
		return test;
	}

	public void setDataModel(String dataModel){
		this.dataModel = dataModel;
	}

	public String getDataModel(){
		return dataModel;
	}

	public void setEventDateTime(String eventDateTime){
		this.eventDateTime = eventDateTime;
	}

	public String getEventDateTime(){
		return eventDateTime;
	}

	public void setTransmission(Transmission transmission){
		this.transmission = transmission;
	}

	public Transmission getTransmission(){
		return transmission;
	}

	public void setDestinations(List<DestinationsItem> destinations){
		this.destinations = destinations;
	}

	public List<DestinationsItem> getDestinations(){
		return destinations;
	}

	public void setFacilityCode(Object facilityCode){
		this.facilityCode = facilityCode;
	}

	public Object getFacilityCode(){
		return facilityCode;
	}

	public void setSource(Source source){
		this.source = source;
	}

	public Source getSource(){
		return source;
	}
}