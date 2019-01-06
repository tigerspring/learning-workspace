package eurekaserver;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ClientController")
public class ClientController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello world!";
    }
}
