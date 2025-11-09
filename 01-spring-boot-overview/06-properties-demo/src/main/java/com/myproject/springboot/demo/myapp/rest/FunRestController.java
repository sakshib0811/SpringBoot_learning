package com.myproject.springboot.demo.myapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //injecting properties for: coach.name, team.name

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    //expose new endpoints for team Info

    @GetMapping("/teamInfo")
    public String getTeamInfo(){
        return "Coach Name: " + coachName + ", Team Name: " + teamName;
    }

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
