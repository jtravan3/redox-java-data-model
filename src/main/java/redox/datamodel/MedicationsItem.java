package redox.datamodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MedicationsItem{

	@JsonProperty("Prescription")
	private Boolean prescription;

	@JsonProperty("StartDate")
	private String startDate;

	@JsonProperty("FreeTextSig")
	private Object freeTextSig;

	@JsonProperty("Rate")
	private Rate rate;

	@JsonProperty("IsPRN")
	private Object isPRN;

	@JsonProperty("Frequency")
	private Frequency frequency;

	@JsonProperty("Product")
	private Product product;

	@JsonProperty("Dose")
	private Dose dose;

	@JsonProperty("EndDate")
	private Object endDate;

	@JsonProperty("Route")
	private Route route;

	public void setPrescription(Boolean prescription){
		this.prescription = prescription;
	}

	public boolean isPrescription(){
		return prescription;
	}

	public void setStartDate(String startDate){
		this.startDate = startDate;
	}

	public String getStartDate(){
		return startDate;
	}

	public void setFreeTextSig(Object freeTextSig){
		this.freeTextSig = freeTextSig;
	}

	public Object getFreeTextSig(){
		return freeTextSig;
	}

	public void setRate(Rate rate){
		this.rate = rate;
	}

	public Rate getRate(){
		return rate;
	}

	public void setIsPRN(Object isPRN){
		this.isPRN = isPRN;
	}

	public Object getIsPRN(){
		return isPRN;
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

	public void setEndDate(Object endDate){
		this.endDate = endDate;
	}

	public Object getEndDate(){
		return endDate;
	}

	public void setRoute(Route route){
		this.route = route;
	}

	public Route getRoute(){
		return route;
	}
}