package credential_store;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity // This tells Hibernate to make a table out of this class
public class User {

    @GeneratedValue(strategy= GenerationType.AUTO)
    @Id
    private Integer userId;

    @NotNull
    private String username;

    private String email;

    @NotNull
    private String password;

    @NotNull
    private long dateLastModified;

    @NotNull
    private String role;

    // Getters
    public Integer getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public long getDateLastModified() {
        return dateLastModified;
    }

    public String getRole() {
        return this.role;
    }

    // Setters
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDateLastModified(long dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
