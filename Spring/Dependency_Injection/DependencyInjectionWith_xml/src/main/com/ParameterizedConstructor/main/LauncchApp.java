package com.ParameterizedConstructor.main;

import com.ParameterizedConstructor.services.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LauncchApp {
    public static void main(String[] args) {
        ApplicationContext container =new ClassPathXmlApplicationContext("applicationconfig7.xml");
        Employee emp=container.getBean(Employee.class);
        System.out.println(emp);
    }
}
