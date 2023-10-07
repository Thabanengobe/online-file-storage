package fileHosting.app.hostFile.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/files")
public class FileController {

    @PostMapping("/upload")
    public String uploadFile(){
        return "upload";
    }

    @GetMapping("/viewFile")
    public String viewFile(@RequestBody String fileName){
        return "file";
    }

    @PostMapping("/deleteFile")
    public String deleteFile(@RequestBody String fileName){
        return "deleteFile";
    }
}
