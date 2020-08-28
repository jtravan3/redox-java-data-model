package redox.datamodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Header{

	@JsonProperty("Patient")
	private Patient patient;

	@JsonProperty("DirectAddressFrom")
	private String directAddressFrom;

	@JsonProperty("DirectAddressTo")
	private String directAddressTo;

	@JsonProperty("Document")
	private Document document;

	@JsonProperty("PCP")
	private PCP pCP;

	public void setPatient(Patient patient){
		this.patient = patient;
	}

	public Patient getPatient(){
		return patient;
	}

	public void setDirectAddressFrom(String directAddressFrom){
		this.directAddressFrom = directAddressFrom;
	}

	public String getDirectAddressFrom(){
		return directAddressFrom;
	}

	public void setDirectAddressTo(String directAddressTo){
		this.directAddressTo = directAddressTo;
	}

	public String getDirectAddressTo(){
		return directAddressTo;
	}

	public void setDocument(Document document){
		this.document = document;
	}

	public Document getDocument(){
		return document;
	}

	public void setPCP(PCP pCP){
		this.pCP = pCP;
	}

	public PCP getPCP(){
		return pCP;
	}
}