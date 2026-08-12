package MainApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchApp1 {
    //BeanFactory
    //ApplicationContext

    // Application context is used by spring frame work
//    it uses igear initialization
//    can load only one config file in one object
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationconfig.xml");
        Coder c = context.getBean(Coder.class);
        Boolean status = c.buyTheCourse(2134);
        if(status){
            System.out.println("Course Enrolled Succesfully");
        }else {
            System.out.println("Failed to Enroll");
        }
    }
}
