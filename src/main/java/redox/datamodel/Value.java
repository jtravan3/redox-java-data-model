package redox.datamodel;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Value{

	@JsonProperty("CodeSystemName")
	private Object codeSystemName;

	@JsonProperty("Code")
	private Object code;

	@JsonProperty("CodeSystem")
	private Object codeSystem;

	@JsonProperty("AltCodes")
	private List<Object> altCodes;

	@JsonProperty("Name")
	private Object name;

	public void setCodeSystemName(Object codeSystemName){
		this.codeSystemName = codeSystemName;
	}

	public Object getCodeSystemName(){
		return codeSystemName;
	}

	public void setCode(Object code){
		this.code = code;
	}

	public Object getCode(){
		return code;
	}

	public void setCodeSystem(Object codeSystem){
		this.codeSystem = codeSystem;
	}

	public Object getCodeSystem(){
		return codeSystem;
	}

	public void setAltCodes(List<Object> altCodes){
		this.altCodes = altCodes;
	}

	public List<Object> getAltCodes(){
		return altCodes;
	}

	public void setName(Object name){
		this.name = name;
	}

	public Object getName(){
		return name;
	}
}