package fileHosting.app.hostFile.controller;

import fileHosting.app.hostFile.model.FileHostUsers;
import fileHosting.app.hostFile.service.FileHost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("fileHost")
public class HomePage {
    @Autowired
    private FileHost fileHost;
    @PostMapping("login")
    public FileHostUsers getUser(@RequestBody FileHostUsers fileHostUsers){
        return fileHost.getUser(fileHostUsers);
    }
    @PostMapping("register")
    public FileHostUsers saveUser(@RequestBody FileHostUsers hostUser){
        return fileHost.saveUser(hostUser);
    }

    @GetMapping("users")
    public List<FileHostUsers> getAllUsers(){
        return fileHost.getAllUsers();
    }
}
