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

    @NotNull
    private String identifiers;

    private String note;

    @NotNull
    private boolean active;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getServiceUrl() {
        return serviceUrl;
    }

    public void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

	public String getEncryptedPreviousPasswords() {
		return this.encryptedPreviousPasswords;
	}

	public void setEncryptedPreviousPasswords(String encryptedPreviousPasswords) {
		this.encryptedPreviousPasswords = encryptedPreviousPasswords;
	}

    public long getDateLastModified() {
        return dateLastModified;
    }

    void setDateLastModified(long dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    public String getIdentifiers() {
        return this.identifiers;
    }

    public void setIdentifiers(String identifiers) {
        this.identifiers = identifiers;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
