package fileHosting.app.hostFile.DAOs;

import fileHosting.app.hostFile.Models.UserFiles;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileDao  extends CrudRepository<UserFiles, Integer> {
}
