package credential_store;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity // This tells Hibernate to make a table out of this class
public class Credential {

    //@GeneratedValue(strategy=GenerationType.AUTO)
    @Id
    private Integer id;

    private String serviceUrl;

    @NotNull
    private String serviceName;

    private String username;

    private String email;

    @NotNull
    private String encryptedPassword;

    private String encryptedPreviousPasswords;

    @NotNull
    private long dateLastModified;

    private String note;

    @NotNull
    private Integer userId;

    @NotNull
    private boolean active;

    // Getters
    public Integer getId() {
        return id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public String getServiceUrl() {
        return serviceUrl;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public String getEncryptedPreviousPasswords() {
        return this.encryptedPreviousPasswords;
    }

    public long getDateLastModified() {
        return dateLastModified;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getNote() {
        return note;
    }

    public boolean getActive() {
        return active;
    }

    // Setters
    public void setId(Integer id) {
        this.id = id;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
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

	public void setEncryptedPreviousPasswords(String encryptedPreviousPasswords) {
		this.encryptedPreviousPasswords = encryptedPreviousPasswords;
	}

    void setDateLastModified(long dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setUser(Integer userId) {
        this.userId = userId;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
