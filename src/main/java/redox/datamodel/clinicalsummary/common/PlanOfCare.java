
package redox.datamodel.clinicalsummary.common;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Orders",
    "Procedures",
    "Encounters",
    "MedicationAdministration",
    "Supplies",
    "Services"
})
public class PlanOfCare {

    @JsonProperty("Orders")
    private List<Order> orders = null;
    @JsonProperty("Procedures")
    private List<Procedure> procedures = null;
    @JsonProperty("Encounters")
    private List<Encounter> encounters = null;
    @JsonProperty("MedicationAdministration")
    private List<MedicationAdministration> medicationAdministration = null;
    @JsonProperty("Supplies")
    private List<Supply> supplies = null;
    @JsonProperty("Services")
    private List<Service> services = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Orders")
    public List<Order> getOrders() {
        return orders;
    }

    @JsonProperty("Orders")
    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @JsonProperty("Procedures")
    public List<Procedure> getProcedures() {
        return procedures;
    }

    @JsonProperty("Procedures")
    public void setProcedures(List<Procedure> procedures) {
        this.procedures = procedures;
    }

    @JsonProperty("Encounters")
    public List<Encounter> getEncounters() {
        return encounters;
    }

    @JsonProperty("Encounters")
    public void setEncounters(List<Encounter> encounters) {
        this.encounters = encounters;
    }

    @JsonProperty("MedicationAdministration")
    public List<MedicationAdministration> getMedicationAdministration() {
        return medicationAdministration;
    }

    @JsonProperty("MedicationAdministration")
    public void setMedicationAdministration(List<MedicationAdministration> medicationAdministration) {
        this.medicationAdministration = medicationAdministration;
    }

    @JsonProperty("Supplies")
    public List<Supply> getSupplies() {
        return supplies;
    }

    @JsonProperty("Supplies")
    public void setSupplies(List<Supply> supplies) {
        this.supplies = supplies;
    }

    @JsonProperty("Services")
    public List<Service> getServices() {
        return services;
    }

    @JsonProperty("Services")
    public void setServices(List<Service> services) {
        this.services = services;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
