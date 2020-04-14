package credential_store;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;


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

    @NotNull
    private ArrayList<String> identifiers;

    @NotNull
    private boolean active;

    CredentialDTO(Integer id, String serviceUrl, String serviceName, String username, String email,
                  String encryptedPassword, long dateLastModified, ArrayList<String> identifiers, boolean active) {
        this.id = id;
        this.serviceUrl = serviceUrl;
        this.serviceName = serviceName;
        this.username = username;
        this.email = email;
        this.encryptedPassword = encryptedPassword;
        this.dateLastModified = dateLastModified;
        this.active = active;
        if (identifiers != null) {
            this.identifiers = identifiers;
        } else {
            this.identifiers = new ArrayList<>();
        }
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getServiceUrl() {
        return this.serviceUrl;
    }

    public void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }


    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getEncryptedPassword() {
        return this.encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

    public long getDateLastModified() {
        return this.dateLastModified;
    }

    void setDateLastModified(long dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    public ArrayList<String> getIdentifiers() {
        return this.identifiers;
    }

    void setIdentifiers(ArrayList<String> identifiers) {
        this.identifiers = identifiers;
    }

    public boolean getActive() {
        return this.active;
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
                .append("identifiers: ").append(this.identifiers.toString()).append(", ")
                .append("active: ").append(this.active);

        return sb.toString();
    }
}
