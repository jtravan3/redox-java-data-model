package redox.datamodel;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ProblemsItem{

	@JsonProperty("StartDate")
	private String startDate;

	@JsonProperty("Status")
	private Status status;

	@JsonProperty("Comment")
	private Object comment;

	@JsonProperty("Category")
	private Category category;

	@JsonProperty("HealthStatus")
	private HealthStatus healthStatus;

	@JsonProperty("CodeSystemName")
	private String codeSystemName;

	@JsonProperty("EndDate")
	private String endDate;

	@JsonProperty("Code")
	private String code;

	@JsonProperty("CodeSystem")
	private String codeSystem;

	@JsonProperty("AltCodes")
	private List<AltCodesItem> altCodes;

	@JsonProperty("Name")
	private String name;

	public void setStartDate(String startDate){
		this.startDate = startDate;
	}

	public String getStartDate(){
		return startDate;
	}

	public void setStatus(Status status){
		this.status = status;
	}

	public Status getStatus(){
		return status;
	}

	public void setComment(Object comment){
		this.comment = comment;
	}

	public Object getComment(){
		return comment;
	}

	public void setCategory(Category category){
		this.category = category;
	}

	public Category getCategory(){
		return category;
	}

	public void setHealthStatus(HealthStatus healthStatus){
		this.healthStatus = healthStatus;
	}

	public HealthStatus getHealthStatus(){
		return healthStatus;
	}

	public void setCodeSystemName(String codeSystemName){
		this.codeSystemName = codeSystemName;
	}

	public String getCodeSystemName(){
		return codeSystemName;
	}

	public void setEndDate(String endDate){
		this.endDate = endDate;
	}

	public String getEndDate(){
		return endDate;
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

	public void setAltCodes(List<AltCodesItem> altCodes){
		this.altCodes = altCodes;
	}

	public List<AltCodesItem> getAltCodes(){
		return altCodes;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}
}