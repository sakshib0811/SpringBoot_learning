package com.myApp.springcoredemo.rest;

import com.myApp.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

    @Autowired
    public void setCoach(Coach theCoach){
        myCoach = theCoach;
    }

    //Field Injection example:
    //@Autowired
    //private Coach myCoach;
    // no need for constructor or setter myCoach field is directly get injected, however this
    //is not recommended by the spring developer as it makes unit testing difficult.

    @GetMapping("/dailyWorkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

}
