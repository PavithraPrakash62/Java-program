package com.pavi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Mainapp {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Student.class);
		SessionFactory sf = config.buildSessionFactory();
		Session ses =  sf.openSession();
		Transaction tx = ses.beginTransaction();
	  Student student =new Student(7,"pavi",20,45632.5f);
		Student student1 =new Student(8,"preethi",21,45662.3f);
		//Transient 
		ses.save(student);
		ses.save(student1);//persistent
		ses.delete(student1);//removed
		tx.commit();
		ses.close();//detached
		// Student student1=ses.get(student.class,1);
		//ses.delete(student1);
	}

}