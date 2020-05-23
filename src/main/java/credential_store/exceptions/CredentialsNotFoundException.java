package credential_store.exceptions;

public class CredentialsNotFoundException extends RuntimeException {

    public CredentialsNotFoundException(Integer id) {
        super("Could not find credential " + id);
    }
}
