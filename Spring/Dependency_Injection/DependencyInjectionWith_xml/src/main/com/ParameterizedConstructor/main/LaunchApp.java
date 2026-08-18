package com.ParameterizedConstructor.main;

import com.ParameterizedConstructor.services.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchApp {
    public static void main(String[] args) {
        ApplicationContext contain = new ClassPathXmlApplicationContext("applicationconfig6.xml");
        Employee emp1 =contain.getBean("emp1" , Employee.class);
        System.out.println(emp1);
        Employee emp2 =contain.getBean("emp2" , Employee.class);
        System.out.println(emp2);
        Employee emp3 =contain.getBean("emp3" , Employee.class);
        System.out.println(emp3);
    }
}
