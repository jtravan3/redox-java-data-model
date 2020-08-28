package redox.datamodel;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class VitalSignsItem{

	@JsonProperty("Observations")
	private List<ObservationsItem> observations;

	@JsonProperty("DateTime")
	private String dateTime;

	public void setObservations(List<ObservationsItem> observations){
		this.observations = observations;
	}

	public List<ObservationsItem> getObservations(){
		return observations;
	}

	public void setDateTime(String dateTime){
		this.dateTime = dateTime;
	}

	public String getDateTime(){
		return dateTime;
	}
}