package com.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class MainApp {

	public static void main(String[] args) {
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
	    config.configure();
		config.addAnnotatedClass(CourseTable.class);
		config.addAnnotatedClass(StudentCourse.class);
		SessionFactory sf = config.buildSessionFactory();
		Session ses =  sf.openSession();
		Transaction tx = ses.beginTransaction();
		CourseTable cobj1 = new CourseTable("AWS");
		StudentCourse sobj1=new StudentCourse("durga");
		sobj1.setCourse(cobj1);
		ses.save(cobj1);
		ses.save(sobj1);
		tx.commit();
		ses.close();
		
	}

}
