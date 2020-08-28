package redox.datamodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MedicationAdministrationItem{

	@JsonProperty("Status")
	private String status;

	@JsonProperty("StartDate")
	private String startDate;

	@JsonProperty("Rate")
	private Rate rate;

	@JsonProperty("Frequency")
	private Frequency frequency;

	@JsonProperty("Product")
	private Product product;

	@JsonProperty("Dose")
	private Dose dose;

	@JsonProperty("EndDate")
	private String endDate;

	@JsonProperty("Route")
	private Route route;

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	public void setStartDate(String startDate){
		this.startDate = startDate;
	}

	public String getStartDate(){
		return startDate;
	}

	public void setRate(Rate rate){
		this.rate = rate;
	}

	public Rate getRate(){
		return rate;
	}

	public void setFrequency(Frequency frequency){
		this.frequency = frequency;
	}

	public Frequency getFrequency(){
		return frequency;
	}

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

	public void setEndDate(String endDate){
		this.endDate = endDate;
	}

	public String getEndDate(){
		return endDate;
	}

	public void setRoute(Route route){
		this.route = route;
	}

	public Route getRoute(){
		return route;
	}
}