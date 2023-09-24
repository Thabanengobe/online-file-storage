package fileHosting.app.hostFile.Controller;

import fileHosting.app.hostFile.Service.UserCredentials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserCredentials userCredentials;
    @PostMapping("/login")
    public String logUser(@RequestParam String email, @RequestParam String password){
        return userCredentials.logUser(email, password);
    }

    @PostMapping("/register")
    public String registerUser(@RequestParam String userName, @RequestParam String email,
            @RequestParam String password, @RequestParam String confirmPassword){

        return userCredentials.registerUser(userName, email, password, confirmPassword);
    }
}
