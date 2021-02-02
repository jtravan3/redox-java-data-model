
package redox.datamodel.vaccination.common;

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
    "Code",
    "Codeset",
    "Description",
    "LotNumber",
    "ExpirationDate",
    "Manufacturer"
})
public class Product {

    @JsonProperty("Code")
    private String code;
    @JsonProperty("Codeset")
    private String codeset;
    @JsonProperty("Description")
    private Object description;
    @JsonProperty("LotNumber")
    private String lotNumber;
    @JsonProperty("ExpirationDate")
    private Object expirationDate;
    @JsonProperty("Manufacturer")
    private Manufacturer manufacturer;
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
    public String getCodeset() {
        return codeset;
    }

    @JsonProperty("Codeset")
    public void setCodeset(String codeset) {
        this.codeset = codeset;
    }

    @JsonProperty("Description")
    public Object getDescription() {
        return description;
    }

    @JsonProperty("Description")
    public void setDescription(Object description) {
        this.description = description;
    }

    @JsonProperty("LotNumber")
    public String getLotNumber() {
        return lotNumber;
    }

    @JsonProperty("LotNumber")
    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
    }

    @JsonProperty("ExpirationDate")
    public Object getExpirationDate() {
        return expirationDate;
    }

    @JsonProperty("ExpirationDate")
    public void setExpirationDate(Object expirationDate) {
        this.expirationDate = expirationDate;
    }

    @JsonProperty("Manufacturer")
    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    @JsonProperty("Manufacturer")
    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
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
