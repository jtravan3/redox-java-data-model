
package redox.datamodel.media.replace;

import com.fasterxml.jackson.annotation.*;
import redox.datamodel.common.Allergy;
import redox.datamodel.common.Contact;
import redox.datamodel.common.Identifier;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Identifiers",
        "Demographics",
        "Notes",
        "Contacts",
        "Allergies"
})
public class Patient {

    @JsonProperty("Identifiers")
    private List<Identifier> identifiers = null;
    @JsonProperty("Demographics")
    private Demographics demographics;
    @JsonProperty("Notes")
    private List<Object> notes = null;
    @JsonProperty("Contacts")
    private List<Contact> contacts = null;
    @JsonProperty("Allergies")
    private List<Allergy> allergies = null;
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

    @JsonProperty("Contacts")
    public List<Contact> getContacts() {
        return contacts;
    }

    @JsonProperty("Contacts")
    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @JsonProperty("Allergies")
    public List<Allergy> getAllergies() {
        return allergies;
    }

    @JsonProperty("Allergies")
    public void setAllergies(List<Allergy> allergies) {
        this.allergies = allergies;
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
