package com.edu;

import java.util.Scanner;

public class Empoloyeedata {
	int eid,eage,esal;
	String name;
	
	void getDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		name = sc.next();
		System.out.println("Enter your age");
		eage = sc.nextInt();
		System.out.println("Enter your salary");
		esal=sc.nextInt();
		
	}
	void displayDetails() {
		System.out.println("Enter your name ; " +name);
		System.out.println("Enter your age: " +eage);
		System.out.println("Enter your name: " +esal);
	  }
	public static void main(String arg[]) {
		Employee1 e1 = new Employee1();
		
		
		
		
	}
	

}
