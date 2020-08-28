package redox.datamodel;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ServicesItem{

	@JsonProperty("Status")
	private String status;

	@JsonProperty("CodeSystemName")
	private String codeSystemName;

	@JsonProperty("Code")
	private String code;

	@JsonProperty("CodeSystem")
	private String codeSystem;

	@JsonProperty("AltCodes")
	private List<Object> altCodes;

	@JsonProperty("DateTime")
	private Object dateTime;

	@JsonProperty("Name")
	private String name;

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
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

	public void setAltCodes(List<Object> altCodes){
		this.altCodes = altCodes;
	}

	public List<Object> getAltCodes(){
		return altCodes;
	}

	public void setDateTime(Object dateTime){
		this.dateTime = dateTime;
	}

	public Object getDateTime(){
		return dateTime;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}
}