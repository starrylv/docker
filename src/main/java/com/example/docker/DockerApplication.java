package com.example.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerApplication {

    @RequestMapping("/hello")
    public String hello(){
        return "hello world new docker";
    }
    public static void main(String[] args) {
        SpringApplication.run(DockerApplication.class, args);
    }

}
