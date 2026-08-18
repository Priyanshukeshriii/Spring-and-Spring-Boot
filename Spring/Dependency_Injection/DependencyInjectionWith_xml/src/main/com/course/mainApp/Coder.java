package com.course.mainApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.course.servises.ICourse;
@Component

public class Coder {

    public Coder(ICourse iCourse) {
        this.iCourse = iCourse;
        System.out.println("Coder Parameterized constructor is called");

    }
    public Coder() {
        System.out.println("Coder constructor is called");
    }

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }
    @Autowired
    @Qualifier("springBoot")
    private ICourse iCourse;
    public Boolean buyTheCourse(double amount){
        return iCourse.getTheCourse(amount);
    }
}
