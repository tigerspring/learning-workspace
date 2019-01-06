package learn;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/SecurityWebController")
public class SecurityWebController {

    @RequestMapping(value = "/doTest",method = RequestMethod.POST)
    public void doTest(){
        System.out.println("测试安全机制");
    }
}
