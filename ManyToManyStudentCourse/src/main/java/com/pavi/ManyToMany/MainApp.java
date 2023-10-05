package com.pavi.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernete.cfg.xml");
		config.addAnnotatedClass(Student.class);
		config.addAnnotatedClass(Course.class);
		
		SessionFactory sf =config.buildSessionFactory();
		Session session=sf.openSession();
		Student s1= new Student(1,"siree");
		Student s2= new Student(2,"kobi");
		Student s3= new Student(3,"pavi");
		List<Student> studentlist =new ArrayList<Student>();
		studentlist.add(s1);
		studentlist.add(s2);
		studentlist.add(s3);
		
		
        Course c1= new Course(100,"JFS");
        Course c2= new Course(101,"PFS");
        Course c3= new Course(102,"Devops");
        Course c4= new Course(103,"Testing");
        List<Course> courselist = new ArrayList<Course>();
        courselist.add(c1);
        courselist.add(c2);
        courselist.add(c3);
        courselist.add(c4);
        c1.setStudent(studentlist);
        s2.setCourse(courselist);
        
        /*s1.setCourse(courselist);
        c3.setStudent(studentlist);*/
        
        Transaction tx = session.beginTransaction();
        session.save(s1);
        session.save(s2);
        session.save(s3);
        session.save(c1);
        session.save(c2);
        session.save(c3);
        session.save(c4);
        
        
        
        
        
        
		
		
		
		tx.commit();
		session.close();

	}

}
