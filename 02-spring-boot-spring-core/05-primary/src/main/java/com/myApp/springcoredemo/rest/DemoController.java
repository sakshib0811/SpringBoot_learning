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
    //for this we can use 2 annotation --> @Primary or @Qualifier.
    //@Primary can be used directly on any one of the bean class (i.e. CricketCoach, BaseballCoach, TennisCoach or TrackCoach)
    //@Qualifier can be used on constructor
    //ex: public DemoController (@Qualifier("tennisCoach") Coach theCoach){
    //        myCoach = theCoach;
    //    }
    //@Qualifier("bean_name") --> bean_name is same as class name but make 1st alphabet as lower case.
    //@Qualifier has higher priority than @Primary

    public DemoController (Coach theCoach){ //by default, it will take BaseballCoach as we made it Primary
        myCoach = theCoach;
    }

    @GetMapping("/dailyWorkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

}
