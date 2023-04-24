package com.finops.Dec22App1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo-controller")
public class DemoController {


    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from DemoController";
    }

    @GetMapping("/hi")
    public String sayHi(){
        return "Hi from DemoController";
    }
}
