package mainApp;


import service.Coder;
import service.Java;
import service.SpringBoot;

public class LaunchApp {
    public static void main(String[] args) {
        Coder coder = new Coder(new Java()); // Constructor injection
//        Java java = new Java();
//        coder.setiCourse(new Java());// java method is invoked
        coder.setiCourse(new SpringBoot());// spring method is invoked  // this is setter injection
        Boolean status = coder.buyTheCourse(91390);
        if(status){
            System.out.println("Course Enrolled Succesfully");
        }else {
            System.out.println("Failed to Enroll");
        }

    }
}
