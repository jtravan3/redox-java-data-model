
package redox.datamodel.notes.common;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import redox.datamodel.common.Provider;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ContentType",
    "FileName",
    "FileContents",
    "Components",
    "DocumentType",
    "OriginalDocumentID",
    "DocumentID",
    "ServiceDateTime",
    "DocumentationDateTime",
    "Provider",
    "Status",
    "Authenticator",
    "Availability",
    "Notifications",
})
public class Note {

    @JsonProperty("ContentType")
    private String contentType;
    @JsonProperty("FileName")
    private String fileName;
    @JsonProperty("FileContents")
    private String fileContents;
    @JsonProperty("Components")
    private List<Object> components = null;
    @JsonProperty("DocumentType")
    private String documentType;
    @JsonProperty("OriginalDocumentID")
    private String originalDocumentID;
    @JsonProperty("DocumentID")
    private String documentID;
    @JsonProperty("ServiceDateTime")
    private String serviceDateTime;
    @JsonProperty("DocumentationDateTime")
    private String documentationDateTime;
    @JsonProperty("Provider")
    private Provider provider;
    @JsonProperty("Status")
    private Object status;
    @JsonProperty("Authenticator")
    private Authenticator authenticator;
    @JsonProperty("Availability")
    private String availability;
    @JsonProperty("Notifications")
    private List<Notification> notifications = null;
    @JsonProperty("Visit")
    private Visit visit;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ContentType")
    public String getContentType() {
        return contentType;
    }

    @JsonProperty("ContentType")
    public void setContentType(String contentType) {
        this.contentType = contentType;
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

    @JsonProperty("Components")
    public List<Object> getComponents() {
        return components;
    }

    @JsonProperty("Components")
    public void setComponents(List<Object> components) {
        this.components = components;
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

    @JsonProperty("ServiceDateTime")
    public String getServiceDateTime() {
        return serviceDateTime;
    }

    @JsonProperty("ServiceDateTime")
    public void setServiceDateTime(String serviceDateTime) {
        this.serviceDateTime = serviceDateTime;
    }

    @JsonProperty("DocumentationDateTime")
    public String getDocumentationDateTime() {
        return documentationDateTime;
    }

    @JsonProperty("DocumentationDateTime")
    public void setDocumentationDateTime(String documentationDateTime) {
        this.documentationDateTime = documentationDateTime;
    }

    @JsonProperty("Provider")
    public Provider getProvider() {
        return provider;
    }

    @JsonProperty("Provider")
    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    @JsonProperty("Status")
    public Object getStatus() {
        return status;
    }

    @JsonProperty("Status")
    public void setStatus(Object status) {
        this.status = status;
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

    @JsonProperty("Visit")
    public Visit getVisit() {
        return visit;
    }

    @JsonProperty("Visit")
    public void setVisit(Visit visit) {
        this.visit = visit;
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
