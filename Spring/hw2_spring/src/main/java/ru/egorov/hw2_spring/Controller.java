package ru.egorov.hw2_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
    private final HelloService helloservice;

    @Autowired
    public Controller(HelloService helloservice) {
        this.helloservice = helloservice;
    }

    @GetMapping("/")
    public String hello(){
        return this.helloservice.getGreeting();
    }
}
