package com.pavi;



import java.util.ArrayList;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class MainAppOneToMany {

	public static void main(String[] args) {
	  Configuration config = new Configuration()
			  .configure("hibernate.cfg.xml")
			  .addAnnotatedClass(Employee1.class)
			  .addAnnotatedClass(Department1.class);
	  
	  SessionFactory sf = config.buildSessionFactory();
	  Session session = sf.openSession();
	  Transaction tx= session.beginTransaction();
	  

	  Department1 department = new Department1("Production","chennai");
	  
	  
	  
	  Employee1 e1=new Employee1("sneha",9632,22);
	  Employee1 e2=new Employee1("yamuna",89632,34);
	  Employee1 e3=new Employee1("vimala",35632,29);
	  
	  List <Employee1> emplist =new ArrayList<Employee1>();
	  
	  emplist.add(e1);
	  emplist.add(e2);
	  emplist.add(e3);
	  
	  department.setEmployee(emplist);
	  
	 session.save(department);
	  tx.commit();
	  session.close();
	  
	  
	  
     
	}

}
