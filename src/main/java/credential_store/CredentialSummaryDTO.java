package credential_store;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@Entity
public class CredentialSummaryDTO {

    @Id
    private Integer id;

    @NotNull
    private String serviceName;

    @NotNull
    private long dateLastModified;

    @NotNull
    private boolean active;

    CredentialSummaryDTO(Integer id, String serviceName, long dateLastModified, boolean active) {
        this.id = id;
        this.serviceName = serviceName;
        this.dateLastModified = dateLastModified;
        this.active = active;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public long getDateLastModified() {
        return this.dateLastModified;
    }

    void setDateLastModified(long dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    public boolean getActive() {
        return this.active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
