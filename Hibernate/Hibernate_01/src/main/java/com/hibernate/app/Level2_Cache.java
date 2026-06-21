package com.hibernate.app;

import com.hibernate.model.Student;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Level2_Cache {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
        Session session1 = null;
        Session session2 = null;
        try{
            session1  = sessionFactory.openSession();
            session2 = sessionFactory.openSession();
            Student s1 = session1.getReference(Student.class,1);
            Student s2 = session1.getReference(Student.class,1);
            Student s3 = session1.getReference(Student.class,1);
            Student s4 = session1.getReference(Student.class,1);
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
            System.out.println(s4);

        }catch (HibernateException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            session1.close();
            session2.close();
            sessionFactory.close();
        }
    }
}
