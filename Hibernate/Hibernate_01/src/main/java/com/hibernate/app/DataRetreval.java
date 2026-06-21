package com.hibernate.app;

import com.hibernate.model.Student;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DataRetreval {
    public static void main(String[] args) {
        Session session = null;
        SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
        try{
            session = sessionFactory.openSession();
//            Student s = session.get(Student.class, 1); // this is Eager loading
//            Student s = session.load(Student.class, 1);
            Student s = session.getReference(Student.class, 1); // this is lazy loading
//            System.out.println(s);

            System.out.println(s.getSid()); // for this the constructor will be called for only once as it
//            the primary key
            System.out.println(s); // but for this the consturctor will be called twice
        }catch (HibernateException e){
            e.printStackTrace();
        }
        finally {
            session.close();
            sessionFactory.close();
        }
    }
}

