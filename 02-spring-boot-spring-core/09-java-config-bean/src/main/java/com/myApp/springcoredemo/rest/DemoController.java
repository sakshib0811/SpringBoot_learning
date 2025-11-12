package com.myApp.springcoredemo.rest;

import com.myApp.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;


    //SwimCoach did not have @Component
    //Instead we configured it as a spring bean using @Bean
    @Autowired
    public DemoController (@Qualifier("aquatic") Coach theCoach){
        System.out.println("In constructor : " + getClass().getSimpleName());
        myCoach = theCoach;
    }

    @GetMapping("/dailyWorkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }


}
