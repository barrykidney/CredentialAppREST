package credential_store.exceptions;

public class UserNotAuthenticatedException extends RuntimeException {
    public UserNotAuthenticatedException(String username) {
        super("User " + username + " could not be authenticated");
    }
}
