package fileHosting.app.hostFile.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "UserFiles")
public class UserFiles {
    @Id
    Integer id;
    private String fileName;
    private byte[] fileData;
}
