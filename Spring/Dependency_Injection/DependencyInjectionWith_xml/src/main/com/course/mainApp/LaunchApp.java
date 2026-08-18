package com.course.mainApp;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchApp {
    public static void main(String[] args) {

//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationconfig.xml");

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationconfig5.xml");
        Coder c = context.getBean(Coder.class);
        Boolean status = c.buyTheCourse(2134);
        if(status){
            System.out.println("Course Enrolled Succesfully");
        }else {
            System.out.println("Failed to Enroll");
        }
    }
}
