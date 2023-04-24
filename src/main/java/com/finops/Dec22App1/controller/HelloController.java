package com.finops.Dec22App1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-controller")
public class HelloController {


    @GetMapping("/hello")
    public String sayHello(){

        return "Hello from HelloController";
    }

    @GetMapping("/hi")
    public String sayHi(){
        return "Hi from HelloController";
    }

}
