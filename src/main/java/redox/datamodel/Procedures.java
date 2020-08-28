package redox.datamodel;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Procedures{

	@JsonProperty("Services")
	private List<ServicesItem> services;

	@JsonProperty("Procedures")
	private List<ProceduresItem> procedures;

	@JsonProperty("Observations")
	private List<ObservationsItem> observations;

	public void setServices(List<ServicesItem> services){
		this.services = services;
	}

	public List<ServicesItem> getServices(){
		return services;
	}

	public void setProcedures(List<ProceduresItem> procedures){
		this.procedures = procedures;
	}

	public List<ProceduresItem> getProcedures(){
		return procedures;
	}

	public void setObservations(List<ObservationsItem> observations){
		this.observations = observations;
	}

	public List<ObservationsItem> getObservations(){
		return observations;
	}
}