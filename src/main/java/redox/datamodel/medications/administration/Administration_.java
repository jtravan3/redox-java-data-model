
package redox.datamodel.medications.administration;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import redox.datamodel.common.VerifiedBy;
import redox.datamodel.common.Medication;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Status",
    "Medication",
    "StartDate",
    "EndDate",
    "AdministeringProvider",
    "OrderedBy",
    "VerifiedBy"
})
public class Administration_ {

    @JsonProperty("Status")
    private String status;
    @JsonProperty("Medication")
    private Medication medication;
    @JsonProperty("StartDate")
    private String startDate;
    @JsonProperty("EndDate")
    private Object endDate;
    @JsonProperty("AdministeringProvider")
    private AdministeringProvider administeringProvider;
    @JsonProperty("OrderedBy")
    private OrderedBy orderedBy;
    @JsonProperty("VerifiedBy")
    private VerifiedBy verifiedBy;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("Status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("Medication")
    public Medication getMedication() {
        return medication;
    }

    @JsonProperty("Medication")
    public void setMedication(Medication medication) {
        this.medication = medication;
    }

    @JsonProperty("StartDate")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("StartDate")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("EndDate")
    public Object getEndDate() {
        return endDate;
    }

    @JsonProperty("EndDate")
    public void setEndDate(Object endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("AdministeringProvider")
    public AdministeringProvider getAdministeringProvider() {
        return administeringProvider;
    }

    @JsonProperty("AdministeringProvider")
    public void setAdministeringProvider(AdministeringProvider administeringProvider) {
        this.administeringProvider = administeringProvider;
    }

    @JsonProperty("OrderedBy")
    public OrderedBy getOrderedBy() {
        return orderedBy;
    }

    @JsonProperty("OrderedBy")
    public void setOrderedBy(OrderedBy orderedBy) {
        this.orderedBy = orderedBy;
    }

    @JsonProperty("VerifiedBy")
    public VerifiedBy getVerifiedBy() {
        return verifiedBy;
    }

    @JsonProperty("VerifiedBy")
    public void setVerifiedBy(VerifiedBy verifiedBy) {
        this.verifiedBy = verifiedBy;
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
