package redox.datamodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MedicalEquipmentItem{

	@JsonProperty("Status")
	private String status;

	@JsonProperty("StartDate")
	private String startDate;

	@JsonProperty("Quantity")
	private String quantity;

	@JsonProperty("Product")
	private Product product;

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

	public void setQuantity(String quantity){
		this.quantity = quantity;
	}

	public String getQuantity(){
		return quantity;
	}

	public void setProduct(Product product){
		this.product = product;
	}

	public Product getProduct(){
		return product;
	}
}