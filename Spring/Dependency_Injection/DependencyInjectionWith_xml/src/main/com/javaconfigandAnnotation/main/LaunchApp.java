package com.javaconfigandAnnotation.main;

import com.javaconfigandAnnotation.config.JavaConfiguration;
import com.javaconfigandAnnotation.services.Greet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LaunchApp {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(JavaConfiguration.class);
        Greet greet = container.getBean(Greet.class);
        greet.greetMethod("Priyanshu");
    }
}
