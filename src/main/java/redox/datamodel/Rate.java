package redox.datamodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rate{

	@JsonProperty("Quantity")
	private Object quantity;

	@JsonProperty("Units")
	private Object units;

	public void setQuantity(Object quantity){
		this.quantity = quantity;
	}

	public Object getQuantity(){
		return quantity;
	}

	public void setUnits(Object units){
		this.units = units;
	}

	public Object getUnits(){
		return units;
	}
}