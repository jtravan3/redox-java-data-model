package redox.datamodel;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Patient{

	@JsonProperty("Demographics")
	private Demographics demographics;

	@JsonProperty("Identifiers")
	private List<IdentifiersItem> identifiers;

	public void setDemographics(Demographics demographics){
		this.demographics = demographics;
	}

	public Demographics getDemographics(){
		return demographics;
	}

	public void setIdentifiers(List<IdentifiersItem> identifiers){
		this.identifiers = identifiers;
	}

	public List<IdentifiersItem> getIdentifiers(){
		return identifiers;
	}
}