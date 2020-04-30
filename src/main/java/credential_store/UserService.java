package credential_store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired // This means to get the bean called ServiceCredentialsRepository
    private UserRepository userRepository;

    @Autowired
    private CredentialService credentialService;

    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Iterable<Integer> getAllUserIds() {
        List<Integer> allUserIds = new ArrayList<>();
        Iterable<User> allUsers = userRepository.findAll();

        for (User user : allUsers) {
            allUserIds.add(user.getUserId());
        }
        return allUserIds;
    }

    public User getUserById(Integer userId) {
        return userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException(userId));
    }

    public User addNewUser(User newUser) {
        newUser.setDateLastModified(Instant.now().toEpochMilli());
        return userRepository.save(newUser);
    }

    public User deleteUser(Integer userId) {
        User user = userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException(userId));
        Iterable<CredentialSummaryDTO> credentialsToBeDeleted = credentialService.getCredentialsByUserId(userId);
        for (CredentialSummaryDTO credential : credentialsToBeDeleted) {
            credentialService.deleteCredential(credential.getId());
        }
        userRepository.deleteById(user.getUserId());
        return user;
    }
}


