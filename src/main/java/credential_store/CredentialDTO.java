package credential_store;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@Entity
public class CredentialDTO {

    @Id
    private Integer id;

    @NotNull
    private String serviceName;

    @NotNull
    private long dateLastModified;

    @NotNull
    private boolean active;

    CredentialDTO(Integer id, String serviceName, long dateLastModified, boolean active) {
        this.id = id;
        this.serviceName = serviceName;
        this.dateLastModified = dateLastModified;
        this.active = active;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public long getDateLastModified() {
        return dateLastModified;
    }

    void setDateLastModified(long dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
