package fileHosting.app.hostFile.dao;

import fileHosting.app.hostFile.model.UserPdfFiles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPdfFilesDao  extends JpaRepository<UserPdfFiles, String> {
}
