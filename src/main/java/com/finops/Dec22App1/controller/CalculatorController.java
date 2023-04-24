
package com.finops.Dec22App1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/calculator")
public class CalculatorController {


    @GetMapping("/add/{a}/{b}")
    public int add(@PathVariable int a, @PathVariable int b){

        return a+b;
    }

    @GetMapping("/subtract/{a}/{b}")
    public int subtract(@PathVariable int a, @PathVariable int b){

        return  a-b;
    }
}
