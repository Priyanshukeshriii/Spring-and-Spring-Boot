package com.hibernate.app;

import com.hibernate.model.StudentAutoIncrement;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.Property;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AutoIncrement {
    public static void main(String[] args) {
        Properties hibernate_2 = new Properties();
        SessionFactory sessionFactory =null;
        try {
            // Load the properties file (adjust the path if it's in your classpath)
            hibernate_2.load(new FileInputStream("Hibernate/Hibernate_01/src/main/resources/hibernate_2.properties"));

            // Build the SessionFactory
            sessionFactory = new Configuration()
                    .configure("hibernate.cfg_2.xml") // Loads base XML config
                    .addProperties(hibernate_2)        // Appends/overrides with your .properties file
                    .buildSessionFactory();

            System.out.println("SessionFactory created successfully!");

        } catch (IOException e) {
            System.err.println("Could not load properties file: " + e.getMessage());
            e.printStackTrace();
        }
        Session session= sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        StudentAutoIncrement s = new StudentAutoIncrement();
        s.setName("priyanshu");
        session.persist(s);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
