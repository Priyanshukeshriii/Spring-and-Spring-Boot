package com.priyanshu.Springboot_01.services;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleOfBean {
    static {
        System.out.println("Static Block of Bean is Called!");
    }
    {
        System.out.println("Java Initialization Block of Bean is called");
    }
    public LifeCycleOfBean(){
        System.out.println("Bean constructor is called");
    }
    public void display(){
        System.out.println("Display Method is called");
    }
    @PostConstruct
    public void disCar(){
        System.out.println("Display Car method is called by the bean");
    }
    @PreDestroy
    public void beforeDestroy(){
        System.out.println("Before the bean dies it class this annotated function");
    }
}
