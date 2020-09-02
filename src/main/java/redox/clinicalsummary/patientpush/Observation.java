
package redox.clinicalsummary.patientpush;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import redox.clinicalsummary.common.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Code",
    "CodeSystem",
    "CodeSystemName",
    "Name",
    "AltCodes",
    "Status",
    "Interpretation",
    "DateTime",
    "CodedValue",
    "Value",
    "ValueType",
    "Units",
    "ReferenceRange",
        "TargetSite",
        "ValueText",
        "StartDate",
        "EndDate"
})
public class Observation {

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
    @JsonProperty("Interpretation")
    private Object interpretation;
    @JsonProperty("DateTime")
    private String dateTime;
    @JsonProperty("CodedValue")
    private CodedValue codedValue;
    @JsonProperty("Value")
    private Object value;
    @JsonProperty("ValueType")
    private String valueType;
    @JsonProperty("Units")
    private Object units;
    @JsonProperty("ReferenceRange")
    private ReferenceRange referenceRange;
    @JsonProperty("TargetSite")
    private TargetSite targetSite;
    @JsonProperty("ValueText")
    private String valueText;
    @JsonProperty("StartDate")
    private String startDate;
    @JsonProperty("EndDate")
    private Object endDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    @JsonProperty("Interpretation")
    public Object getInterpretation() {
        return interpretation;
    }

    @JsonProperty("Interpretation")
    public void setInterpretation(Object interpretation) {
        this.interpretation = interpretation;
    }

    @JsonProperty("DateTime")
    public String getDateTime() {
        return dateTime;
    }

    @JsonProperty("DateTime")
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    @JsonProperty("CodedValue")
    public CodedValue getCodedValue() {
        return codedValue;
    }

    @JsonProperty("CodedValue")
    public void setCodedValue(CodedValue codedValue) {
        this.codedValue = codedValue;
    }

    @JsonProperty("Value")
    public ValueWrapper getValue() {
        ValueWrapper valueWrapper = new ValueWrapper();
        if (value instanceof Value) {
            Value valueTmp = (Value)value;
            valueWrapper.setValue(valueTmp);
            valueWrapper.setValueString((String)valueTmp.getName());
        } else {
            valueWrapper.setValueString((String)value);
        }
        return valueWrapper;
    }

    @JsonProperty("Value")
    public void setValue(Object value) {
        this.value = value;
    }

    @JsonProperty("ValueType")
    public String getValueType() {
        return valueType;
    }

    @JsonProperty("ValueType")
    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    @JsonProperty("Units")
    public Object getUnits() {
        return units;
    }

    @JsonProperty("Units")
    public void setUnits(Object units) {
        this.units = units;
    }

    @JsonProperty("ReferenceRange")
    public ReferenceRange getReferenceRange() {
        return referenceRange;
    }

    @JsonProperty("ReferenceRange")
    public void setReferenceRange(ReferenceRange referenceRange) {
        this.referenceRange = referenceRange;
    }

    @JsonProperty("TargetSite")
    public TargetSite getTargetSite() {
        return targetSite;
    }
    @JsonProperty("TargetSite")
    public void setTargetSite(TargetSite targetSite) {
        this.targetSite = targetSite;
    }

    @JsonProperty("ValueText")
    public String getValueText() {
        return valueText;
    }
    @JsonProperty("ValueText")
    public void setValueText(String valueText) {
        this.valueText = valueText;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
