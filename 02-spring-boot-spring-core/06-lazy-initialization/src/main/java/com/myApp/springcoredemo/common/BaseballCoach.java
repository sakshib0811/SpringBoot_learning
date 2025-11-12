package com.myApp.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
// Using @Lazy annotation this constructor will only create if it is actually been used.
//without it all the constructor will get created at the start of the Application.
//We can also make @Lazy annotation as global if we want all our constructor to be created
//only when it is used --> this can be archived using Application.properties file.

public class BaseballCoach implements Coach{

    public BaseballCoach(){
        System.out.println("In constructor : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes in batting practice" ;
    }
}
