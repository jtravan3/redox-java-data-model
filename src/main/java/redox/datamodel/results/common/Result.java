
package redox.datamodel.results.common;

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
    "Code",
    "Codeset",
    "Description",
    "RelatedGroupID",
    "Specimen",
    "Value",
    "ValueType",
    "CompletionDateTime",
    "FileType",
    "Units",
    "Notes",
    "AbnormalFlag",
    "Status",
    "PrimaryResultsInterpreter",
    "Producer",
    "Performer",
    "ReferenceRange",
    "ObservationMethod"
})
public class Result {

    @JsonProperty("Code")
    private String code;
    @JsonProperty("Codeset")
    private Object codeset;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("RelatedGroupID")
    private Object relatedGroupID;
    @JsonProperty("Specimen")
    private Specimen specimen;
    @JsonProperty("Value")
    private String value;
    @JsonProperty("ValueType")
    private String valueType;
    @JsonProperty("CompletionDateTime")
    private Object completionDateTime;
    @JsonProperty("FileType")
    private Object fileType;
    @JsonProperty("Units")
    private Object units;
    @JsonProperty("Notes")
    private List<String> notes = null;
    @JsonProperty("AbnormalFlag")
    private String abnormalFlag;
    @JsonProperty("Status")
    private String status;
    @JsonProperty("PrimaryResultsInterpreter")
    private PrimaryResultsInterpreter primaryResultsInterpreter;
    @JsonProperty("Producer")
    private Producer producer;
    @JsonProperty("Performer")
    private Performer performer;
    @JsonProperty("ReferenceRange")
    private ReferenceRange referenceRange;
    @JsonProperty("ObservationMethod")
    private ObservationMethod observationMethod;
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

    @JsonProperty("Codeset")
    public Object getCodeset() {
        return codeset;
    }

    @JsonProperty("Codeset")
    public void setCodeset(Object codeset) {
        this.codeset = codeset;
    }

    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("RelatedGroupID")
    public Object getRelatedGroupID() {
        return relatedGroupID;
    }

    @JsonProperty("RelatedGroupID")
    public void setRelatedGroupID(Object relatedGroupID) {
        this.relatedGroupID = relatedGroupID;
    }

    @JsonProperty("Specimen")
    public Specimen getSpecimen() {
        return specimen;
    }

    @JsonProperty("Specimen")
    public void setSpecimen(Specimen specimen) {
        this.specimen = specimen;
    }

    @JsonProperty("Value")
    public String getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(String value) {
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

    @JsonProperty("CompletionDateTime")
    public Object getCompletionDateTime() {
        return completionDateTime;
    }

    @JsonProperty("CompletionDateTime")
    public void setCompletionDateTime(Object completionDateTime) {
        this.completionDateTime = completionDateTime;
    }

    @JsonProperty("FileType")
    public Object getFileType() {
        return fileType;
    }

    @JsonProperty("FileType")
    public void setFileType(Object fileType) {
        this.fileType = fileType;
    }

    @JsonProperty("Units")
    public Object getUnits() {
        return units;
    }

    @JsonProperty("Units")
    public void setUnits(Object units) {
        this.units = units;
    }

    @JsonProperty("Notes")
    public List<String> getNotes() {
        return notes;
    }

    @JsonProperty("Notes")
    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    @JsonProperty("AbnormalFlag")
    public String getAbnormalFlag() {
        return abnormalFlag;
    }

    @JsonProperty("AbnormalFlag")
    public void setAbnormalFlag(String abnormalFlag) {
        this.abnormalFlag = abnormalFlag;
    }

    @JsonProperty("Status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("Status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("PrimaryResultsInterpreter")
    public PrimaryResultsInterpreter getPrimaryResultsInterpreter() {
        return primaryResultsInterpreter;
    }

    @JsonProperty("PrimaryResultsInterpreter")
    public void setPrimaryResultsInterpreter(PrimaryResultsInterpreter primaryResultsInterpreter) {
        this.primaryResultsInterpreter = primaryResultsInterpreter;
    }

    @JsonProperty("Producer")
    public Producer getProducer() {
        return producer;
    }

    @JsonProperty("Producer")
    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    @JsonProperty("Performer")
    public Performer getPerformer() {
        return performer;
    }

    @JsonProperty("Performer")
    public void setPerformer(Performer performer) {
        this.performer = performer;
    }

    @JsonProperty("ReferenceRange")
    public ReferenceRange getReferenceRange() {
        return referenceRange;
    }

    @JsonProperty("ReferenceRange")
    public void setReferenceRange(ReferenceRange referenceRange) {
        this.referenceRange = referenceRange;
    }

    @JsonProperty("ObservationMethod")
    public ObservationMethod getObservationMethod() {
        return observationMethod;
    }

    @JsonProperty("ObservationMethod")
    public void setObservationMethod(ObservationMethod observationMethod) {
        this.observationMethod = observationMethod;
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
