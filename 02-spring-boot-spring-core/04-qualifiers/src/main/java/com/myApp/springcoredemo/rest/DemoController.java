package com.myApp.springcoredemo.rest;

import com.myApp.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

    @Autowired
    //when we have more than 1 bean then we have to explicitly tell what bean we want (i.e. CricketCoach, BaseballCoach, TennisCoach or TrackCoach)
    //using @Qualifier annotation.
    //@Qualifier("bean_name") --> bean_name is same as class name but make 1st alphabet as lower case.
    public DemoController (@Qualifier("trackCoach") Coach theCoach){
        myCoach = theCoach;
    }

    @GetMapping("/dailyWorkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

}
