package com.myproject.springboot.demo.myapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // expose "/" that return "Hello World"

    @GetMapping("/")
    public String sayHello(){
        return "Hello World !";
    }

    // expose a new endPoints fpr workout
    @GetMapping("/sakshiBharti")
    public String saySakshi(){
        return "Hello Sakshi All the best and keep Working. YOU CAN DO IT!!!!";
    }
}
