package redox.datamodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Relation{

	@JsonProperty("Demographics")
	private Demographics demographics;

	@JsonProperty("CodeSystemName")
	private String codeSystemName;

	@JsonProperty("Code")
	private String code;

	@JsonProperty("CodeSystem")
	private String codeSystem;

	@JsonProperty("Name")
	private String name;

	@JsonProperty("IsDeceased")
	private Boolean isDeceased;

	public void setDemographics(Demographics demographics){
		this.demographics = demographics;
	}

	public Demographics getDemographics(){
		return demographics;
	}

	public void setCodeSystemName(String codeSystemName){
		this.codeSystemName = codeSystemName;
	}

	public String getCodeSystemName(){
		return codeSystemName;
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

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setIsDeceased(Boolean isDeceased){
		this.isDeceased = isDeceased;
	}

	public boolean isIsDeceased(){
		return isDeceased;
	}
}