package credential_store;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.net.URL;
import java.util.List;


@Entity // This tells Hibernate to make a table out of this class
public class ServiceCredentials {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

//    private URL serviceUrl;
    private String serviceUrl;

    @NotNull
    private String serviceName;

    private String username;

    private String email;

    @NotNull
    private String encodedPassword;

//    private List<String> encodedPreviousPassword;

    @NotNull
    private long dateLastModified;

//    private List<String> Identifiers;
    private String firstIdentifier;

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

    public String getEncodedPassword() {
        return encodedPassword;
    }

    public void setEncodedPassword(String encodedPassword) {
        this.encodedPassword = encodedPassword;
    }

//	public String getEncodedPreviousPassword() {
//		return this.encodedPreviousPassword;
//	}
//
//	public void setEncodedPreviousPassword(String encodedPreviousPassword) {
//		this.encodedPreviousPassword = encodedPreviousPassword;
//	}

    public long getDateLastModified() {
        return dateLastModified;
    }

    void setDateLastModified(long dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

	public String getFirstIdentifier() {
		return this.firstIdentifier;
	}

	public void setFirstIdentifier(String firstIdentifier) {
		this.firstIdentifier = firstIdentifier;
	}

//    public String getSecondIdentifier() {
//        return this.secondIdentifier;
//    }
//
//    public void setSecondIdentifier(String secondIdentifier) {
//        this.secondIdentifier = secondIdentifier;
//    }

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
