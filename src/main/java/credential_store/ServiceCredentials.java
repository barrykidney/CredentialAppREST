package credential_store;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.net.URL;


@Entity // This tells Hibernate to make a table out of this class
public class ServiceCredentials {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private URL serviceUrl;

    private String serviceName;

    private String username;

    private String email;

    private String encodedPassword;

//    private List<String> encodedPreviousPasswordList;

    private long dateLastModified;

//    private List<String> identifierList;

    private String note;

    private boolean active;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public URL getServiceUrl() {
        return serviceUrl;
    }

    public void setServiceUrl(URL serviceUrl) {
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

//	public List<String> getEncodedPreviousPasswordList() {
//		return encodedPreviousPasswordList;
//	}
//
//	public void setEncodedPreviousPasswordList(List<String> encodedPreviousPasswordList) {
//		this.encodedPreviousPasswordList = encodedPreviousPasswordList;
//	}

    public long getDateLastModified() {
        return dateLastModified;
    }

    public void setDateLastModified(long dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

//	public List<String> getIdentifierList() {
//		return identifierList;
//	}
//
//	public void setIdentifierList(List<String> identifierList) {
//		this.identifierList = identifierList;
//	}

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
