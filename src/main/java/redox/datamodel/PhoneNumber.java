package redox.datamodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PhoneNumber{

	@JsonProperty("Office")
	private Object office;

	@JsonProperty("Home")
	private String home;

	@JsonProperty("Mobile")
	private Object mobile;

	public void setOffice(Object office){
		this.office = office;
	}

	public Object getOffice(){
		return office;
	}

	public void setHome(String home){
		this.home = home;
	}

	public String getHome(){
		return home;
	}

	public void setMobile(Object mobile){
		this.mobile = mobile;
	}

	public Object getMobile(){
		return mobile;
	}
}