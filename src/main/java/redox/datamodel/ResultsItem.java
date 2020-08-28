package redox.datamodel;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ResultsItem{

	@JsonProperty("Status")
	private String status;

	@JsonProperty("Producer")
	private Producer producer;

	@JsonProperty("CodeSystemName")
	private String codeSystemName;

	@JsonProperty("Observations")
	private List<ObservationsItem> observations;

	@JsonProperty("Code")
	private String code;

	@JsonProperty("CodeSystem")
	private String codeSystem;

	@JsonProperty("AltCodes")
	private List<Object> altCodes;

	@JsonProperty("Name")
	private String name;

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	public void setProducer(Producer producer){
		this.producer = producer;
	}

	public Producer getProducer(){
		return producer;
	}

	public void setCodeSystemName(String codeSystemName){
		this.codeSystemName = codeSystemName;
	}

	public String getCodeSystemName(){
		return codeSystemName;
	}

	public void setObservations(List<ObservationsItem> observations){
		this.observations = observations;
	}

	public List<ObservationsItem> getObservations(){
		return observations;
	}

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setCodeSystem(String codeSystem){
		this.codeSystem = codeSystem;
	}

	public String getCodeSystem(){
		return codeSystem;
	}

	public void setAltCodes(List<Object> altCodes){
		this.altCodes = altCodes;
	}

	public List<Object> getAltCodes(){
		return altCodes;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}
}