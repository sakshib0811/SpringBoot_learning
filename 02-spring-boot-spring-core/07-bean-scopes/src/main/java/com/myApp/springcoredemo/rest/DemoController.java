package com.myApp.springcoredemo.rest;

import com.myApp.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;
    private Coach anotherCoach;

    //Default scope is Singleton so all dependency injection (i.e myCoach, anotherCoach)
    // refers to the same bean
    @Autowired
    public DemoController (@Qualifier("trackCoach") Coach theCoach, @Qualifier("trackCoach") Coach theAnotherCoach){ //by default, it will take BaseballCoach as we made it Primary
        System.out.println("In constructor : " + getClass().getSimpleName());
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
    }


    @GetMapping("/dailyWorkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check(){
        return "Comparing bean : myCoach == anotherCoach : " + (myCoach == anotherCoach);
        //if scope is Singleton it will return true
        //if scope is Prototype it will return false
    }

}
