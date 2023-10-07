package fileHosting.app.hostFile.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    private String email;
    private String password;
    private String userName;

}
