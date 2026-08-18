package com.javaconfigandAnnotation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
@Service
public class Greet {
    @Autowired
    public LocalDateTime time;
    public Greet(){
        System.out.println("Greeting class created");
    }
    public void greetMethod(String name){
        int hour = time.getHour();
        if(12 > hour){
            System.out.println("good Morning " +name);
            System.out.println(time);
        }else if(18 > hour){
            System.out.println("good afternoon " +name);
            System.out.println(time);
        }else {
            System.out.println("good Night " + name);
            System.out.println(time);
        }
    }
}
