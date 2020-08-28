package redox.datamodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Document{

	@JsonProperty("Locale")
	private String locale;

	@JsonProperty("Type")
	private String type;

	@JsonProperty("TypeCode")
	private TypeCode typeCode;

	@JsonProperty("Visit")
	private Visit visit;

	@JsonProperty("Author")
	private Author author;

	@JsonProperty("Title")
	private String title;

	@JsonProperty("ID")
	private String iD;

	@JsonProperty("DateTime")
	private String dateTime;

	public void setLocale(String locale){
		this.locale = locale;
	}

	public String getLocale(){
		return locale;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setTypeCode(TypeCode typeCode){
		this.typeCode = typeCode;
	}

	public TypeCode getTypeCode(){
		return typeCode;
	}

	public void setVisit(Visit visit){
		this.visit = visit;
	}

	public Visit getVisit(){
		return visit;
	}

	public void setAuthor(Author author){
		this.author = author;
	}

	public Author getAuthor(){
		return author;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setID(String iD){
		this.iD = iD;
	}

	public String getID(){
		return iD;
	}

	public void setDateTime(String dateTime){
		this.dateTime = dateTime;
	}

	public String getDateTime(){
		return dateTime;
	}
}