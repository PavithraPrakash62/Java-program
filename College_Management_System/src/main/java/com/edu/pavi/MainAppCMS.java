package com.edu.pavi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class MainAppCMS {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernete.cfg.xml");
		config.addAnnotatedClass(Student.class);
		config.addAnnotatedClass(Teacher.class);
		config.addAnnotatedClass(Subject.class);
		
		SessionFactory sf =config.buildSessionFactory();
		Session session=sf.openSession();
	
		 Transaction tx = session.beginTransaction();
		
		tx.commit();
		session.close();
	
	
	}

}
