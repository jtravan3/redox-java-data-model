
package redox.datamodel.vaccination.common;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import redox.datamodel.common.Identifier;
import redox.datamodel.common.Consent;
import redox.datamodel.common.Contact;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Identifiers",
    "Demographics",
    "Notes",
    "Consent",
    "Contacts",
    "PCP",
    "Vaccinations"
})
public class Patient {

    @JsonProperty("Identifiers")
    private List<Identifier> identifiers = null;
    @JsonProperty("Demographics")
    private Demographics demographics;
    @JsonProperty("Notes")
    private List<Object> notes = null;
    @JsonProperty("Consent")
    private Consent consent;
    @JsonProperty("Contacts")
    private List<Contact> contacts = null;
    @JsonProperty("PCP")
    private PCP pCP;
    @JsonProperty("Vaccinations")
    private List<Vaccination> vaccinations = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Identifiers")
    public List<Identifier> getIdentifiers() {
        return identifiers;
    }

    @JsonProperty("Identifiers")
    public void setIdentifiers(List<Identifier> identifiers) {
        this.identifiers = identifiers;
    }

    @JsonProperty("Demographics")
    public Demographics getDemographics() {
        return demographics;
    }

    @JsonProperty("Demographics")
    public void setDemographics(Demographics demographics) {
        this.demographics = demographics;
    }

    @JsonProperty("Notes")
    public List<Object> getNotes() {
        return notes;
    }

    @JsonProperty("Notes")
    public void setNotes(List<Object> notes) {
        this.notes = notes;
    }

    @JsonProperty("Consent")
    public Consent getConsent() {
        return consent;
    }

    @JsonProperty("Consent")
    public void setConsent(Consent consent) {
        this.consent = consent;
    }

    @JsonProperty("Contacts")
    public List<Contact> getContacts() {
        return contacts;
    }

    @JsonProperty("Contacts")
    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @JsonProperty("PCP")
    public PCP getPCP() {
        return pCP;
    }

    @JsonProperty("PCP")
    public void setPCP(PCP pCP) {
        this.pCP = pCP;
    }

    @JsonProperty("Vaccinations")
    public List<Vaccination> getVaccinations() {
        return vaccinations;
    }

    @JsonProperty("Vaccinations")
    public void setVaccinations(List<Vaccination> vaccinations) {
        this.vaccinations = vaccinations;
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
