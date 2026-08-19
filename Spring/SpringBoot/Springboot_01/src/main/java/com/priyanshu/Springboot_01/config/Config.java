package com.priyanshu.Springboot_01.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
public class Config {
    public Config(){
        System.out.println("Config object is created");
    }
    @Bean
    public LocalDateTime getDateTime(){
        return LocalDateTime.now();
    }
}
