package com.hibernate.app;

import com.hibernate.model.Student;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteAppData {
    public static void main(String[] args) {Session session = null;
        Transaction transaction = null;
        SessionFactory sessionFactory = null;
        boolean flag = false;

        sessionFactory  = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();

        try{
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            Student s = new Student();
            s.setSid(2);
            s.setScity("gujrat");
            s.setSname("abc");
            session.remove(s);
            flag = true;
        }catch (HibernateException e){
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            if (flag == true){
                transaction.commit();
            }else {
                transaction.rollback();
            }
            session.close();
            sessionFactory.close();
        }


    }
}
