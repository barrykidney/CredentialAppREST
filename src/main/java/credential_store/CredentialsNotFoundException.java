package credential_store;

class CredentialsNotFoundException extends RuntimeException {

    CredentialsNotFoundException(Integer id) {
        super("Could not find credential " + id);
    }
}
