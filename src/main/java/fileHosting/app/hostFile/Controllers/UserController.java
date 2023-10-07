package fileHosting.app.hostFile.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @PostMapping("/login")
    public String logUser(){
        return "login";
    }

    @GetMapping("/register")
    public String registerUser(){
        return "register";
    }
}
