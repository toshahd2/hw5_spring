package ru.egorov.hw2_spring;
import org.springframework.stereotype.Service;
@Service
public class HelloService {
    public String getGreeting(){
        return "Привет!";
    }
}
