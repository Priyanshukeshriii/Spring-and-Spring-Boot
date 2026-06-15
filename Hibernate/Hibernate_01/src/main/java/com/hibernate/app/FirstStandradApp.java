package com.hibernate.app;

import com.hibernate.model.Student;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FirstStandradApp {
    public static void main(String[] args) {

        Configuration config = null;
        Session session = null;
        Transaction transaction = null;
        SessionFactory sessionFactory = null;
        boolean flag = false;

        config = new Configuration();

        config.configure();

        sessionFactory = config.buildSessionFactory();

        session = sessionFactory.openSession();

        transaction = session.beginTransaction();

        Student s3  = new Student();
        s3.setSid(3);
        s3.setSname("priyanshu");
        s3.setScity("Katihar");

        try{
            transaction = session.beginTransaction();
            session.persist(s3);
            flag = true;
        }catch (HibernateException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(flag == true){
                transaction.commit();
            }else {
                transaction.rollback();
            }
            session.close();
            sessionFactory.close();
        }

    }
}
