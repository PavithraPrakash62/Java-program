package com.pavi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
	    config.configure();
		config.addAnnotatedClass(employee.class);
		SessionFactory sf = config.buildSessionFactory();
		Session ses =  sf.openSession();
		Transaction tx = ses.beginTransaction();
		employee employee =new employee(1,"prakash");
		ses.save(employee); 
		tx.commit();
		ses.close();
		
		
	}

}
