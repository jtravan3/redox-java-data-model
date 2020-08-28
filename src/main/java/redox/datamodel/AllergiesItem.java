package redox.datamodel;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AllergiesItem{

	@JsonProperty("Status")
	private Status status;

	@JsonProperty("StartDate")
	private Object startDate;

	@JsonProperty("Comment")
	private String comment;

	@JsonProperty("Type")
	private Type type;

	@JsonProperty("Substance")
	private Substance substance;

	@JsonProperty("Severity")
	private Severity severity;

	@JsonProperty("Reaction")
	private List<ReactionItem> reaction;

	@JsonProperty("EndDate")
	private Object endDate;

	@JsonProperty("Criticality")
	private Criticality criticality;

	public void setStatus(Status status){
		this.status = status;
	}

	public Status getStatus(){
		return status;
	}

	public void setStartDate(Object startDate){
		this.startDate = startDate;
	}

	public Object getStartDate(){
		return startDate;
	}

	public void setComment(String comment){
		this.comment = comment;
	}

	public String getComment(){
		return comment;
	}

	public void setType(Type type){
		this.type = type;
	}

	public Type getType(){
		return type;
	}

	public void setSubstance(Substance substance){
		this.substance = substance;
	}

	public Substance getSubstance(){
		return substance;
	}

	public void setSeverity(Severity severity){
		this.severity = severity;
	}

	public Severity getSeverity(){
		return severity;
	}

	public void setReaction(List<ReactionItem> reaction){
		this.reaction = reaction;
	}

	public List<ReactionItem> getReaction(){
		return reaction;
	}

	public void setEndDate(Object endDate){
		this.endDate = endDate;
	}

	public Object getEndDate(){
		return endDate;
	}

	public void setCriticality(Criticality criticality){
		this.criticality = criticality;
	}

	public Criticality getCriticality(){
		return criticality;
	}
}