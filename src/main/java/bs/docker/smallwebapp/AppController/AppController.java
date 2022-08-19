package bs.docker.smallwebapp.AppController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/api")
public class AppController {

    @GetMapping("/date")
    public Date getDate(){
        return new Date();
    }
}
