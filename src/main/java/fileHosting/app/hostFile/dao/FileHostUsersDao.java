package fileHosting.app.hostFile.dao;

import fileHosting.app.hostFile.model.FileHostUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileHostUsersDao extends JpaRepository<FileHostUsers, String> {
    FileHostUsers findByUserName(String userName);
}
