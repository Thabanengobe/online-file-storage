package fileHosting.app.hostFile.DAOs;

import fileHosting.app.hostFile.Models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDao extends JpaRepository<UserEntity, String> {
}
