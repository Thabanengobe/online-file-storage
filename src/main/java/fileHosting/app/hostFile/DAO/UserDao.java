package fileHosting.app.hostFile.DAO;

import fileHosting.app.hostFile.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDao extends CrudRepository<User, String> {
}
