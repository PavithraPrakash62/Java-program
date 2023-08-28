package com.edu;

import java.util.Scanner;

public class Students {
             int age;
			 String name;
			static String collegename;
			static {
				collegename="VCTW";
			}
			void input(){
			     Scanner sc=new Scanner(System.in);
			     System.out.println("Enter student name");
			     name = sc.nextLine();
			     
			     System.out.println("Enter age");
			     age = sc.nextInt();
			  }
			  void display(){
			      System.out.println("Name ="+name);
			       System.out.println("Age="+age);
			       System.out.println("collegename="+collegename);
			  }
			  
			public static void main(String args[]){
				 Students s[] = new Students[5];
				 for(int i=0;i<s.length;i++) {
					 s[i]= new Students();
				 }
				 
			   /*Students sob=new Students();
			     sob.input();
			     sob.display(); 
			  Students sob1=new Students();
			     sob1.input();
			     sob1.display(); */
			   System.out.print("Enter " +s.length+" students detaiils");
				 for(int i=0;i<s.length;i++) {
				  s[i].input();
			  }
				 System.out.println("Student details");
			  for(int i=0;i<s.length;i++) {
				  s[i].display();			  }
			}
			

	}


