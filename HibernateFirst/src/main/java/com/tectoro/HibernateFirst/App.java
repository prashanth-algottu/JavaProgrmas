package com.tectoro.HibernateFirst;

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
        System.out.println( "Hello !" );
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        System.out.println(factory);
        System.out.println("completed");
        
        Student st = new Student(3, "Chinnu", "CMR");
        
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(st);
        transaction.commit();
        
    }
}
