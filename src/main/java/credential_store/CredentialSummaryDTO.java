package credential_store;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


@Entity
public class CredentialSummaryDTO {

    @Id
    private Integer id;

    @NotNull
    private String serviceName;

    @NotNull
    private long dateLastModified;

    private String note;

    @NotNull
    private boolean active;

    CredentialSummaryDTO(Integer id, String serviceName, long dateLastModified, String note, boolean active) {
        this.id = id;
        this.serviceName = serviceName;
        this.dateLastModified = dateLastModified;
        this.note =note;
        this.active = active;
    }

    public Integer getId() {
        return this.id;
    }

    public String getServiceName() {
        return this.serviceName;
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

    public void setId(Integer id) {
        this.id = id;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    void setDateLastModified(long dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    void setNote(String note) {
        this.note = note;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
