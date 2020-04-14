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

    @NotNull
    private ArrayList<String> identifiers;

    @NotNull
    private boolean active;

    CredentialSummaryDTO(Integer id, String serviceName, long dateLastModified,
                         ArrayList<String> identifiers, boolean active) {
        this.id = id;
        this.serviceName = serviceName;
        this.dateLastModified = dateLastModified;
        this.identifiers = identifiers;
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

    public List<String> getIdentifiers() {
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
}
