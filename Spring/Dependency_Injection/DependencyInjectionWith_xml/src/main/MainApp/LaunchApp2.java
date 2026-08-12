package MainApp;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class LaunchApp2 {
    public static void main(String[] args) {
        //beeanFactory
        // this is Lazy initialisation
//        we can use multiple config file in one object
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions("applicationconfig.xml");
        Coder c = beanFactory.getBean(Coder.class);
        Boolean status = c.buyTheCourse(2134);
        if(status){
            System.out.println("Course Enrolled Succesfully");
        }else {
            System.out.println("Failed to Enroll");
        }
    }
}
