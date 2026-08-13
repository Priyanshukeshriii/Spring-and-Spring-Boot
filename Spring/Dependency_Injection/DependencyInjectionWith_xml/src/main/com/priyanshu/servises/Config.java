package com.priyanshu.servises;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    public Config(){
        System.out.println("Config Bean created");
    }
    @Bean
    public Password createPasswordBean(){
        Password pass = new Password("ansd");
        return pass;
    }
}
