package com.tectoro.HibernateFourthOneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        
        
        // creating question
        Question q = new Question();
        q.setQuestion_id(1212);
        q.setQuestion("What is java");
        
        // creating answer
        Answer a = new Answer();
        q.setAns(a);
        a.setAns_id(343);
        a.setAnswer("Java is a programing language");
        a.setQuestion(q);
        
        
        // saving
        
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        session.save(q);
        session.save(a);
        tx.commit();
        
        // fetching
        
       Question question = (Question)session.get(Question.class, 1212);
       System.out.println(question.getQuestion());
       System.out.println(question.getAns().getAnswer());
       
        
        
        session.close();
        
        
        
        
    }
}
