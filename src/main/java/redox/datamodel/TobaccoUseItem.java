package redox.datamodel;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TobaccoUseItem{

	@JsonProperty("IsSmokingStatus")
	private Boolean isSmokingStatus;

	@JsonProperty("StartDate")
	private String startDate;

	@JsonProperty("CodeSystemName")
	private String codeSystemName;

	@JsonProperty("Code")
	private String code;

	@JsonProperty("CodeSystem")
	private String codeSystem;

	@JsonProperty("EndDate")
	private Object endDate;

	@JsonProperty("AltCodes")
	private List<Object> altCodes;

	@JsonProperty("Name")
	private String name;

	public void setIsSmokingStatus(Boolean isSmokingStatus){
		this.isSmokingStatus = isSmokingStatus;
	}

	public boolean isIsSmokingStatus(){
		return isSmokingStatus;
	}

	public void setStartDate(String startDate){
		this.startDate = startDate;
	}

	public String getStartDate(){
		return startDate;
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

	public void setEndDate(Object endDate){
		this.endDate = endDate;
	}

	public Object getEndDate(){
		return endDate;
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