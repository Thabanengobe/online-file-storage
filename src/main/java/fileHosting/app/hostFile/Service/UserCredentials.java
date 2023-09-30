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
        if(userDao.existsById(email)){
            return email;
        }
        return "failed";
    }

    public User registerUser(String userName, String email,
                               String password, String confirmPassword) {
        User user = new User();
        if(isPasswordValid(password, confirmPassword)){

            user.setUserName(userName);
            user.setEmail(email);
            user.setPassword(password);
            userDao.save(user);
            return user;
        }

        return user;
    }

    private boolean isPasswordValid(String password, String confirmPassword){
        return password.equals(confirmPassword);
    }
}
