package com.MTM;

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
		config.addAnnotatedClass(Project.class);
		config.addAnnotatedClass(Employee.class);
		
		SessionFactory sf =config.buildSessionFactory();
		Session session=sf.openSession();
		Project p1= new Project(1,"Hotel Management Angular");
		Project p2= new Project(2,"ATM Project .net");
		List<Project> projectlist =new ArrayList<Project>();
		projectlist.add(p1);
		projectlist.add(p2);
		
		
        Employee e1= new Employee(1143,"pavithra");
        Employee e2= new Employee(2244,"sneha");
        List<Employee> employeelist = new ArrayList<Employee>();
        employeelist.add(e1);
        employeelist .add(e2);
        /*e1.setProject(projectlist);
        p1.setEmployee(employeelist);*/
        e2.setProject(projectlist);
        p2.setEmployee(employeelist);
        
        Transaction tx = session.beginTransaction();
        session.save(e1);
        session.save(e2);
        session.save(p1);
        session.save(p2);
        
        
        
        
        
        
		
		
		
		tx.commit();
		session.close();
	}

}
