package redox.datamodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Criticality{

	@JsonProperty("CodeSystemName")
	private String codeSystemName;

	@JsonProperty("Code")
	private String code;

	@JsonProperty("CodeSystem")
	private String codeSystem;

	@JsonProperty("Name")
	private String name;

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
}