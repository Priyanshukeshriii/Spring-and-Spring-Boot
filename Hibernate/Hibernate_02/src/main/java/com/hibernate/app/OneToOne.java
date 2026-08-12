package com.hibernate.app;

import com.hibernate.model.Answer;
import com.hibernate.model.Question;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOne {
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

        Question q1 = new Question();
        q1.setQ_id(2);
        q1.setQuestion("What is OneToOne means");

        Answer a1 = new Answer();
        a1.setA_id(2);
        a1.setAnswer("In hibernate A one to one relationship means That one instance of an entity mapped to exactly one instance of another entity " +
                "For example a user can have only one user profile And that user profile belongs to only one user " +
                "It is implemented Typically by two ways One is share primary key and second is Foreign key association");
        q1.setAnswer(a1);



        try{
            transaction = session.beginTransaction();
            session.persist(q1);
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
