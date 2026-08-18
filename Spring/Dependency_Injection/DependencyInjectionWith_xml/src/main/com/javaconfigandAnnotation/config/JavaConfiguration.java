package com.javaconfigandAnnotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalDateTime;

//this is not a good approch as if we change a little we have to compile the complete code
@Configuration
@ComponentScan(basePackages = {"com.javaconfigandAnnotation"})
public class JavaConfiguration {
    public JavaConfiguration(){
        System.out.println("configuration file is called");
    }
    @Bean
    public LocalDateTime getLocalTime(){
        return LocalDateTime.now();
    }
}
