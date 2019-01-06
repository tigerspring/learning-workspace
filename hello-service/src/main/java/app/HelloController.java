package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String test(){
        List<String> services = discoveryClient.getServices();

        for(String name : services){
            System.out.println(discoveryClient.getInstances(name));
            List<ServiceInstance> serviceInstanceList = discoveryClient.getInstances(name);
            for(ServiceInstance serviceInstance : serviceInstanceList){
                System.out.println("hostname : "+serviceInstance.getHost()+" serviceId:"+serviceInstance.getServiceId());
            }
        }
        return "hello world!";
    }
}
