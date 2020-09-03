
package redox.datamodel.clinicalsummary.patientpush;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import redox.datamodel.clinicalsummary.common.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Identifiers",
    "Type",
    "DateTime",
    "EndDateTime",
    "Providers",
    "Locations",
    "Diagnosis",
    "ReasonForVisit",
        "Code",
        "CodeSystem",
        "CodeSystemName",
        "Name",
        "AltCodes",
        "Status"
})
public class Encounter {

    @JsonProperty("Identifiers")
    private List<Identifier> identifiers = null;
    @JsonProperty("Type")
    private Type type;
    @JsonProperty("DateTime")
    private String dateTime;
    @JsonProperty("EndDateTime")
    private Object endDateTime;
    @JsonProperty("Providers")
    private List<Provider> providers = null;
    @JsonProperty("Locations")
    private List<Location> locations = null;
    @JsonProperty("Diagnosis")
    private List<Diagnosi> diagnosis = null;
    @JsonProperty("ReasonForVisit")
    private List<ReasonForVisit> reasonForVisit = null;
    @JsonProperty("Code")
    private String code;
    @JsonProperty("CodeSystem")
    private String codeSystem;
    @JsonProperty("CodeSystemName")
    private String codeSystemName;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("AltCodes")
    private List<Object> altCodes = null;
    @JsonProperty("Status")
    private String status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Identifiers")
    public List<Identifier> getIdentifiers() {
        return identifiers;
    }

    @JsonProperty("Identifiers")
    public void setIdentifiers(List<Identifier> identifiers) {
        this.identifiers = identifiers;
    }

    @JsonProperty("Type")
    public Type getType() {
        return type;
    }

    @JsonProperty("Type")
    public void setType(Type type) {
        this.type = type;
    }

    @JsonProperty("DateTime")
    public String getDateTime() {
        return dateTime;
    }

    @JsonProperty("DateTime")
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    @JsonProperty("EndDateTime")
    public Object getEndDateTime() {
        return endDateTime;
    }

    @JsonProperty("EndDateTime")
    public void setEndDateTime(Object endDateTime) {
        this.endDateTime = endDateTime;
    }

    @JsonProperty("Providers")
    public List<Provider> getProviders() {
        return providers;
    }

    @JsonProperty("Providers")
    public void setProviders(List<Provider> providers) {
        this.providers = providers;
    }

    @JsonProperty("Locations")
    public List<Location> getLocations() {
        return locations;
    }

    @JsonProperty("Locations")
    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    @JsonProperty("Diagnosis")
    public List<Diagnosi> getDiagnosis() {
        return diagnosis;
    }

    @JsonProperty("Diagnosis")
    public void setDiagnosis(List<Diagnosi> diagnosis) {
        this.diagnosis = diagnosis;
    }

    @JsonProperty("ReasonForVisit")
    public List<ReasonForVisit> getReasonForVisit() {
        return reasonForVisit;
    }

    @JsonProperty("ReasonForVisit")
    public void setReasonForVisit(List<ReasonForVisit> reasonForVisit) {
        this.reasonForVisit = reasonForVisit;
    }
    @JsonProperty("Code")
    public String getCode() {
        return code;
    }
    @JsonProperty("Code")
    public void setCode(String code) {
        this.code = code;
    }
    @JsonProperty("CodeSystem")
    public String getCodeSystem() {
        return codeSystem;
    }
    @JsonProperty("CodeSystem")
    public void setCodeSystem(String codeSystem) {
        this.codeSystem = codeSystem;
    }
    @JsonProperty("CodeSystemName")
    public String getCodeSystemName() {
        return codeSystemName;
    }
    @JsonProperty("CodeSystemName")
    public void setCodeSystemName(String codeSystemName) {
        this.codeSystemName = codeSystemName;
    }
    @JsonProperty("Name")
    public String getName() {
        return name;
    }
    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }
    @JsonProperty("AltCodes")
    public List<Object> getAltCodes() {
        return altCodes;
    }
    @JsonProperty("AltCodes")
    public void setAltCodes(List<Object> altCodes) {
        this.altCodes = altCodes;
    }
    @JsonProperty("Status")
    public String getStatus() {
        return status;
    }
    @JsonProperty("Status")
    public void setStatus(String status) {
        this.status = status;
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
