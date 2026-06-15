package com.hibernate.app;

import com.hibernate.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FirstApp {
    public static void main(String[] args) {
//        Step 01 Configuration Object from org.hibernate.cfg.configuration
        Configuration config = new Configuration();

//        Step 02 configure hibernate.cfg.xml file to configuration object
        config.configure();

//        Step 03 create SessionFactory  Object
        SessionFactory sessionFactory  =  config.buildSessionFactory();

//        step 04 get the session object from session factory
        Session session = sessionFactory.openSession();

//        Step 05 Begin the transaction within Session
        Transaction transaction = session.beginTransaction();

        Student s = new Student();
        s.setSid(1);
        s.setSname("priyanshu");
        s.setScity("Katihar");

        Student s2 = new Student();
        s2.setSid(2);
        s2.setSname("priyanshu");
        s2.setScity("Katihar");

//        Step 06 Perform Operation
        session.persist(s);
        session.persist(s2);

//        step 07 Performing Transaction Operations
        transaction.commit();

//        Step 08 Close the Session
        session.close();
    }
}
