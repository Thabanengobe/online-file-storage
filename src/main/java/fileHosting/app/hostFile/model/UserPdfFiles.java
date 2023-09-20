package fileHosting.app.hostFile.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class UserPdfFiles {
    @Id
    private String filename;
}
