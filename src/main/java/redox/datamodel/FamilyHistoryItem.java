package redox.datamodel;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FamilyHistoryItem{

	@JsonProperty("Problems")
	private List<ProblemsItem> problems;

	@JsonProperty("Relation")
	private Relation relation;

	public void setProblems(List<ProblemsItem> problems){
		this.problems = problems;
	}

	public List<ProblemsItem> getProblems(){
		return problems;
	}

	public void setRelation(Relation relation){
		this.relation = relation;
	}

	public Relation getRelation(){
		return relation;
	}
}