package com.priyanshu.main;

import com.priyanshu.servises.Password;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchApplication {
    public static void main(String[] args) {
        ApplicationContext contiiner = new ClassPathXmlApplicationContext("applicationconfig3.xml");
        Password p = contiiner.getBean(Password.class);
        p.passWordAlgoUsed();
    }
}
