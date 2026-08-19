package com.priyanshu.Springboot_01.services;

import com.priyanshu.Springboot_01.Interface.GreetingInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
@Service
public class Greeting implements GreetingInterface {
    @Autowired
    LocalDateTime time;

    @Override
    public Boolean Greet(String n) {
        int hour = time.getHour();
        if(12 > hour){
            System.out.println("Good Morning " + n);
            return true;
        }else if(18 > hour){
            System.out.println("Good Afternoon "+n);
            return true;
        }else {
            System.out.println("Good night "+n);
            return true;
        }
    }
}
