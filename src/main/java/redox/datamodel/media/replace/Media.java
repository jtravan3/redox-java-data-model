
package redox.datamodel.media.replace;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "FileType",
    "FileName",
    "FileContents",
    "DocumentType",
    "OriginalDocumentID",
    "DocumentID",
    "DocumentDescription",
    "CreationDateTime",
    "ServiceDateTime",
    "Provider",
    "Authenticated",
    "Authenticator",
    "Availability",
    "Notifications"
})
public class Media {

    @JsonProperty("FileType")
    private String fileType;
    @JsonProperty("FileName")
    private String fileName;
    @JsonProperty("FileContents")
    private String fileContents;
    @JsonProperty("DocumentType")
    private String documentType;
    @JsonProperty("OriginalDocumentID")
    private String originalDocumentID;
    @JsonProperty("DocumentID")
    private String documentID;
    @JsonProperty("DocumentDescription")
    private Object documentDescription;
    @JsonProperty("CreationDateTime")
    private String creationDateTime;
    @JsonProperty("ServiceDateTime")
    private String serviceDateTime;
    @JsonProperty("Provider")
    private Provider provider;
    @JsonProperty("Authenticated")
    private String authenticated;
    @JsonProperty("Authenticator")
    private Authenticator authenticator;
    @JsonProperty("Availability")
    private String availability;
    @JsonProperty("Notifications")
    private List<Notification> notifications = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("FileType")
    public String getFileType() {
        return fileType;
    }

    @JsonProperty("FileType")
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    @JsonProperty("FileName")
    public String getFileName() {
        return fileName;
    }

    @JsonProperty("FileName")
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @JsonProperty("FileContents")
    public String getFileContents() {
        return fileContents;
    }

    @JsonProperty("FileContents")
    public void setFileContents(String fileContents) {
        this.fileContents = fileContents;
    }

    @JsonProperty("DocumentType")
    public String getDocumentType() {
        return documentType;
    }

    @JsonProperty("DocumentType")
    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    @JsonProperty("OriginalDocumentID")
    public String getOriginalDocumentID() {
        return originalDocumentID;
    }

    @JsonProperty("OriginalDocumentID")
    public void setOriginalDocumentID(String originalDocumentID) {
        this.originalDocumentID = originalDocumentID;
    }

    @JsonProperty("DocumentID")
    public String getDocumentID() {
        return documentID;
    }

    @JsonProperty("DocumentID")
    public void setDocumentID(String documentID) {
        this.documentID = documentID;
    }

    @JsonProperty("DocumentDescription")
    public Object getDocumentDescription() {
        return documentDescription;
    }

    @JsonProperty("DocumentDescription")
    public void setDocumentDescription(Object documentDescription) {
        this.documentDescription = documentDescription;
    }

    @JsonProperty("CreationDateTime")
    public String getCreationDateTime() {
        return creationDateTime;
    }

    @JsonProperty("CreationDateTime")
    public void setCreationDateTime(String creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    @JsonProperty("ServiceDateTime")
    public String getServiceDateTime() {
        return serviceDateTime;
    }

    @JsonProperty("ServiceDateTime")
    public void setServiceDateTime(String serviceDateTime) {
        this.serviceDateTime = serviceDateTime;
    }

    @JsonProperty("Provider")
    public Provider getProvider() {
        return provider;
    }

    @JsonProperty("Provider")
    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    @JsonProperty("Authenticated")
    public String getAuthenticated() {
        return authenticated;
    }

    @JsonProperty("Authenticated")
    public void setAuthenticated(String authenticated) {
        this.authenticated = authenticated;
    }

    @JsonProperty("Authenticator")
    public Authenticator getAuthenticator() {
        return authenticator;
    }

    @JsonProperty("Authenticator")
    public void setAuthenticator(Authenticator authenticator) {
        this.authenticator = authenticator;
    }

    @JsonProperty("Availability")
    public String getAvailability() {
        return availability;
    }

    @JsonProperty("Availability")
    public void setAvailability(String availability) {
        this.availability = availability;
    }

    @JsonProperty("Notifications")
    public List<Notification> getNotifications() {
        return notifications;
    }

    @JsonProperty("Notifications")
    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
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
