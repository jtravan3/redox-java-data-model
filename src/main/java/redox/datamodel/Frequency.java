package redox.datamodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Frequency{

	@JsonProperty("Period")
	private Object period;

	@JsonProperty("Unit")
	private Object unit;

	public void setPeriod(Object period){
		this.period = period;
	}

	public Object getPeriod(){
		return period;
	}

	public void setUnit(Object unit){
		this.unit = unit;
	}

	public Object getUnit(){
		return unit;
	}
}