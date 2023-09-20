package fileHosting.app.hostFile.service;

import fileHosting.app.hostFile.dao.FileHostUsersDao;
import fileHosting.app.hostFile.model.FileHostUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileHost {
    @Autowired
    private FileHostUsersDao users;

    public FileHostUsers saveUser(FileHostUsers hostUser) {
        return users.save(hostUser);
    }

    public FileHostUsers getUser(FileHostUsers userName) {
        return users.findByUserName(userName.getUserName());
    }

    public List<FileHostUsers> getAllUsers() {
        return users.findAll();
    }
}
