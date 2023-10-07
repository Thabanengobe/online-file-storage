package fileHosting.app.hostFile.DAOs;

import fileHosting.app.hostFile.Models.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDao extends CrudRepository<UserEntity, String> {
}
