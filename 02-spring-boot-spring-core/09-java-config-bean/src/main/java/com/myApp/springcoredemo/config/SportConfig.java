package com.myApp.springcoredemo.config;

import com.myApp.springcoredemo.common.Coach;
import com.myApp.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    //@Bean use case : Take existing third party class and expose as a Spring bean
    @Bean("aquatic") // "aquatic" is a bean id which we have to use in demoController to access Swim Coach
    //By Default id is same as class name (1st alpha is in lower case).
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
