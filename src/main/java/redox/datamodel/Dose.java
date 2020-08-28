package redox.datamodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Dose{

	@JsonProperty("Quantity")
	private String quantity;

	@JsonProperty("Units")
	private String units;

	public void setQuantity(String quantity){
		this.quantity = quantity;
	}

	public String getQuantity(){
		return quantity;
	}

	public void setUnits(String units){
		this.units = units;
	}

	public String getUnits(){
		return units;
	}
}