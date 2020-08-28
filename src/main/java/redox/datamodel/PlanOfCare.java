package redox.datamodel;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PlanOfCare{

	@JsonProperty("Orders")
	private List<OrdersItem> orders;

	@JsonProperty("Services")
	private List<ServicesItem> services;

	@JsonProperty("Encounters")
	private List<EncountersItem> encounters;

	@JsonProperty("Procedures")
	private List<ProceduresItem> procedures;

	@JsonProperty("MedicationAdministration")
	private List<MedicationAdministrationItem> medicationAdministration;

	@JsonProperty("Supplies")
	private List<Object> supplies;

	public void setOrders(List<OrdersItem> orders){
		this.orders = orders;
	}

	public List<OrdersItem> getOrders(){
		return orders;
	}

	public void setServices(List<ServicesItem> services){
		this.services = services;
	}

	public List<ServicesItem> getServices(){
		return services;
	}

	public void setEncounters(List<EncountersItem> encounters){
		this.encounters = encounters;
	}

	public List<EncountersItem> getEncounters(){
		return encounters;
	}

	public void setProcedures(List<ProceduresItem> procedures){
		this.procedures = procedures;
	}

	public List<ProceduresItem> getProcedures(){
		return procedures;
	}

	public void setMedicationAdministration(List<MedicationAdministrationItem> medicationAdministration){
		this.medicationAdministration = medicationAdministration;
	}

	public List<MedicationAdministrationItem> getMedicationAdministration(){
		return medicationAdministration;
	}

	public void setSupplies(List<Object> supplies){
		this.supplies = supplies;
	}

	public List<Object> getSupplies(){
		return supplies;
	}
}