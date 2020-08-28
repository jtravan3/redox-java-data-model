package redox.datamodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReferenceRange{

	@JsonProperty("High")
	private Object high;

	@JsonProperty("Low")
	private Object low;

	@JsonProperty("Text")
	private Object text;

	public void setHigh(Object high){
		this.high = high;
	}

	public Object getHigh(){
		return high;
	}

	public void setLow(Object low){
		this.low = low;
	}

	public Object getLow(){
		return low;
	}

	public void setText(Object text){
		this.text = text;
	}

	public Object getText(){
		return text;
	}
}