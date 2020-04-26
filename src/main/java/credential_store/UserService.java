package credential_store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired // This means to get the bean called ServiceCredentialsRepository
    private UserRepository userRepository;

    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Integer userId) {
        return userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException(userId));
    }

    public User addNewUser(User newUser) {
        return userRepository.save(newUser);
    }

    public User deleteUser(Integer userId) {
        Optional<User> optCredential = userRepository.findById(userId);
        if (optCredential.isPresent()) {
            return optCredential.get();
        } else {
            throw new UserNotFoundException(userId);
        }
    }
}


