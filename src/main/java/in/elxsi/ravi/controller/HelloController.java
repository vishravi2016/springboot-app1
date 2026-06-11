package in.elxsi.ravi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home(){
        return "Spring Boot app deployment using gitHub,Jenkins,Docker and Ec2 instance";
    }

    @GetMapping("/health")
    public String health(){
        return "healthy";
    }
}
