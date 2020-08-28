package redox.datamodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ImmunizationsItem{

	@JsonProperty("Product")
	private Product product;

	@JsonProperty("Dose")
	private Dose dose;

	@JsonProperty("DateTime")
	private String dateTime;

	@JsonProperty("Route")
	private Route route;

	public void setProduct(Product product){
		this.product = product;
	}

	public Product getProduct(){
		return product;
	}

	public void setDose(Dose dose){
		this.dose = dose;
	}

	public Dose getDose(){
		return dose;
	}

	public void setDateTime(String dateTime){
		this.dateTime = dateTime;
	}

	public String getDateTime(){
		return dateTime;
	}

	public void setRoute(Route route){
		this.route = route;
	}

	public Route getRoute(){
		return route;
	}
}