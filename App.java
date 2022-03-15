package com.telusko.hei;

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
        //System.out.println( "Hello World!" );
    	
    	Alien telusko= new Alien();
    	telusko.setId(101);
    	telusko.setName("Navin");
    	telusko.setColor("Green");
    	
    	
    	Laptop laptop =new Laptop();
    	laptop.setLid(100);
    	laptop.setLname("Dell");
    	
   // 	telusko.setLaptop().add(laptop);
    	
    	
    	Configuration con= new Configuration().configure().addAnnotatedClass(Alien.class).addAnnotatedClass(Laptop.class);
    	 
    	SessionFactory sf= con.buildSessionFactory();
    	
    	Session session=sf.openSession();
    	
        Transaction tx= session.beginTransaction();
    	
    	session.save(telusko);
    	session.save(laptop);
    	tx.commit();
    	
    }
}
