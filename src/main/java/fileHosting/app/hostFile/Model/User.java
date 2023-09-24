package fileHosting.app.hostFile.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "UserProfile")
public class User {
    @Id
    private String email;
    private String password;
    private String userName;

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
