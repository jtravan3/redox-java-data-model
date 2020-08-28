package redox.datamodel;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SocialHistory{

	@JsonProperty("Pregnancy")
	private List<Object> pregnancy;

	@JsonProperty("TobaccoUse")
	private List<TobaccoUseItem> tobaccoUse;

	@JsonProperty("Observations")
	private List<ObservationsItem> observations;

	public void setPregnancy(List<Object> pregnancy){
		this.pregnancy = pregnancy;
	}

	public List<Object> getPregnancy(){
		return pregnancy;
	}

	public void setTobaccoUse(List<TobaccoUseItem> tobaccoUse){
		this.tobaccoUse = tobaccoUse;
	}

	public List<TobaccoUseItem> getTobaccoUse(){
		return tobaccoUse;
	}

	public void setObservations(List<ObservationsItem> observations){
		this.observations = observations;
	}

	public List<ObservationsItem> getObservations(){
		return observations;
	}
}