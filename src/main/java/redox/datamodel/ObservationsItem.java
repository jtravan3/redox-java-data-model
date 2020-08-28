package redox.datamodel;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ObservationsItem{

	@JsonProperty("Status")
	private String status;

	@JsonProperty("ValueType")
	private String valueType;

	@JsonProperty("CodedValue")
	private CodedValue codedValue;

	@JsonProperty("Interpretation")
	private Object interpretation;

	@JsonProperty("Code")
	private String code;

	@JsonProperty("CodeSystem")
	private String codeSystem;

	@JsonProperty("DateTime")
	private String dateTime;

	@JsonProperty("Units")
	private Object units;

	@JsonProperty("Name")
	private String name;

	@JsonProperty("ReferenceRange")
	private ReferenceRange referenceRange;

	@JsonProperty("Value")
	private String value;

	@JsonProperty("CodeSystemName")
	private String codeSystemName;

	@JsonProperty("AltCodes")
	private List<Object> altCodes;

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	public void setValueType(String valueType){
		this.valueType = valueType;
	}

	public String getValueType(){
		return valueType;
	}

	public void setCodedValue(CodedValue codedValue){
		this.codedValue = codedValue;
	}

	public CodedValue getCodedValue(){
		return codedValue;
	}

	public void setInterpretation(Object interpretation){
		this.interpretation = interpretation;
	}

	public Object getInterpretation(){
		return interpretation;
	}

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setCodeSystem(String codeSystem){
		this.codeSystem = codeSystem;
	}

	public String getCodeSystem(){
		return codeSystem;
	}

	public void setDateTime(String dateTime){
		this.dateTime = dateTime;
	}

	public String getDateTime(){
		return dateTime;
	}

	public void setUnits(Object units){
		this.units = units;
	}

	public Object getUnits(){
		return units;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setReferenceRange(ReferenceRange referenceRange){
		this.referenceRange = referenceRange;
	}

	public ReferenceRange getReferenceRange(){
		return referenceRange;
	}

	public void setValue(String value){
		this.value = value;
	}

	public String getValue(){
		return value;
	}

	public void setCodeSystemName(String codeSystemName){
		this.codeSystemName = codeSystemName;
	}

	public String getCodeSystemName(){
		return codeSystemName;
	}

	public void setAltCodes(List<Object> altCodes){
		this.altCodes = altCodes;
	}

	public List<Object> getAltCodes(){
		return altCodes;
	}
}