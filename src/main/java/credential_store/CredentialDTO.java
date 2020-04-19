package credential_store;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@Entity
public class CredentialDTO {

    @Id
    private Integer id;

    private String serviceUrl;

    @NotNull
    private String serviceName;

    private String username;

    private String email;

    @NotNull
    private String encryptedPassword;

    @NotNull
    private long dateLastModified;

    private String note;

    @NotNull
    private boolean active;

    CredentialDTO(Integer id, String serviceUrl, String serviceName, String username, String email,
                  String encryptedPassword, long dateLastModified, String note, boolean active) {
        this.id = id;
        this.serviceUrl = serviceUrl;
        this.serviceName = serviceName;
        this.username = username;
        this.email = email;
        this.encryptedPassword = encryptedPassword;
        this.dateLastModified = dateLastModified;
        this.note = note;
        this.active = active;
    }

    //Getters
    public Integer getId() {
        return this.id;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public String getServiceUrl() {
        return this.serviceUrl;
    }

    public String getUsername() {
        return this.username;
    }

    public String getEmail() {
        return this.email;
    }

    public String getEncryptedPassword() {
        return this.encryptedPassword;
    }

    public long getDateLastModified() {
        return this.dateLastModified;
    }

    public String getNote() {
        return this.note;
    }

    public boolean getActive() {
        return this.active;
    }

    // Setters
    public void setId(Integer id) {
        this.id = id;
    }

    public void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

    void setDateLastModified(long dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    void setIdentifiers(String note) {
        this.note = note;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("id: ").append(this.id.toString()).append(", ")
                .append("serviceName: ").append(this.serviceName).append(", ")
                .append("serviceUrl: ").append(this.serviceUrl).append(", ")
                .append("username: ").append(this.username).append(", ")
                .append("email: ").append(this.email).append(", ")
                .append("encryptedPassword: ").append(this.encryptedPassword).append(", ")
                .append("dateLastModified: ").append(this.dateLastModified).append(", ")
                .append("note: ").append(this.note).append(", ")
                .append("active: ").append(this.active);

        return sb.toString();
    }
}
