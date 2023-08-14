package com.edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainApp {
   public static void main(String[] args) throws NumberFormatException, IOException {
	int sid;
	 String sname;
	 float sfees;
	 
	 /*InputStreamReader is = new InputStreamReader(System.in);
	 BufferedReader br = new BufferedReader(is);*/
	 
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 //read()->ascii
	 //readLine(); ->String
	 
	 System.out.println("Enter student id");
	 sid = Integer.parseInt(br.readLine()); //"23"
	 
	 System.out.println("Enter name");
	 sname=br.readLine();
	 
	 System.out.println("Enter fees");
	 sfees = Float.parseFloat(br.readLine());
	 
	 System.out.println("Student Details");
	 System.out.println("Id="+sid);
	 System.out.println("Name="+sname);
	 System.out.println("Fees="+sfees);
	 
	 
	 
}
	
}