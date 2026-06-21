package com.hibernate.app;

import com.hibernate.model.Student;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Level1_Cache {
    public static void main(String[] args) {
        Session session1 = null;
        Session session2 = null;
        SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
        try{
            session1 = sessionFactory.openSession();
            session2 = sessionFactory.openSession();
//            For object S1 and S2 only one time the constructor is being called
//            As the data is stored in level one cache
            Student s1 = session1.getReference(Student.class, 1);
            Student s2 = session1.getReference(Student.class, 1);


//            For every session there is a new cache memory And one session
//            cache memory cannot be used by other sessions
//            So for the session two a new cache is being created And the data
//            of session two is stored in The new cache memory
            Student s3 = session2.getReference(Student.class, 1);
            Student s4 = session2.getReference(Student.class, 1);


            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
            System.out.println(s4);
        }catch (HibernateException e){
            e.printStackTrace();
        }
        finally {
            session1.close();
            session2.close();
            sessionFactory.close();
        }
    }
}
