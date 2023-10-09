package fileHosting.app.hostFile.DAOs;

import fileHosting.app.hostFile.Models.UserFiles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileDao  extends JpaRepository<UserFiles, Integer> {
}
