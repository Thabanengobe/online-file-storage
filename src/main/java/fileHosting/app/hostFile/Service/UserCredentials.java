package fileHosting.app.hostFile.Service;

import fileHosting.app.hostFile.DAO.UserDao;
import fileHosting.app.hostFile.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserCredentials {
    @Autowired
    UserDao userDao;


    public String logUser(String email, String password) {
        return null;
    }

    public String registerUser(String userName, String email,
                               String password, String confirmPassword) {
        User user = new User();
        user.setUserName(userName);
        user.setEmail(email);
        user.setPassword(password);
        userDao.save(user);
        return null;
    }
}
