package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public String Hello()
    {
        return "Hello Lukas!";
    }

    @GetMapping("/")
    public String root()
    {
        return "Openshift deployment is working !!";
    }
}
