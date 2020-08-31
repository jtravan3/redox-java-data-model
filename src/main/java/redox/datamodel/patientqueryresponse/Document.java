
package redox.datamodel.patientqueryresponse;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Author",
    "ID",
    "Locale",
    "Title",
    "DateTime",
    "Type",
    "TypeCode"
})
public class Document {

    @JsonProperty("Author")
    private Author author;
    @JsonProperty("ID")
    private String iD;
    @JsonProperty("Locale")
    private String locale;
    @JsonProperty("Title")
    private String title;
    @JsonProperty("DateTime")
    private String dateTime;
    @JsonProperty("Type")
    private String type;
    @JsonProperty("TypeCode")
    private TypeCode typeCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Author")
    public Author getAuthor() {
        return author;
    }

    @JsonProperty("Author")
    public void setAuthor(Author author) {
        this.author = author;
    }

    @JsonProperty("ID")
    public String getID() {
        return iD;
    }

    @JsonProperty("ID")
    public void setID(String iD) {
        this.iD = iD;
    }

    @JsonProperty("Locale")
    public String getLocale() {
        return locale;
    }

    @JsonProperty("Locale")
    public void setLocale(String locale) {
        this.locale = locale;
    }

    @JsonProperty("Title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("Title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("DateTime")
    public String getDateTime() {
        return dateTime;
    }

    @JsonProperty("DateTime")
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    @JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("TypeCode")
    public TypeCode getTypeCode() {
        return typeCode;
    }

    @JsonProperty("TypeCode")
    public void setTypeCode(TypeCode typeCode) {
        this.typeCode = typeCode;
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
