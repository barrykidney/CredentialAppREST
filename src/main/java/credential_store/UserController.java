package credential_store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/user") // This means URL's start with /credentials (after Application path)
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(path="/")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping(path="/id/{userId}")
    public @ResponseBody User getUserById(@PathVariable Integer userId) {
        return userService.getUserById(userId);
    }

    @GetMapping(path="/username/{username}")
    public @ResponseBody User getUserByUsername(@PathVariable String username) {
        return userService.findUserByUsername(username);
    }

    @PostMapping(path="/")
    public @ResponseBody User addNewUser(@RequestBody User newUser) {
        // This returns a JSON or XML with the ServiceCredentials
        return userService.addNewUser(newUser);
    }

    @DeleteMapping("/{userId}")
    public @ResponseBody User deleteUser(@PathVariable Integer userId) {
        return userService.deleteUser(userId);
    }
}
