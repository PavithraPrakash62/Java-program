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
		config.addAnnotatedClass(UserTable.class);
		config.addAnnotatedClass(Country.class);
		SessionFactory sf = config.buildSessionFactory();
		Session ses =  sf.openSession();
		Transaction tx = ses.beginTransaction();
		Country cobj1 = new Country("America");
		UserTable sobj1=new UserTable("monica",29);
		UserTable sobj2=new UserTable("kobi",27);
		sobj1.setCountry(cobj1);
		ses.save(cobj1);
		ses.save(sobj1);
		ses.save(sobj1);
		
		
		tx.commit();
		ses.close();
		

	}

}
