package com.edu;

import java.util.Scanner;

interface Calculator{
	void add();
	void sub();
	void mul();
	void div();
	
	void input();
}
class CalculatedImp1 implements Calculator{
	float ans , a,b;
	public  void input() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number 1: ");
		 a = sc.nextFloat();
		System.out.print("Enter Number 2: ");
		 b = sc.nextFloat();
		}
	public void add() {
		ans =a+b;
		System.out.print("Addition: " +ans);
		
		
	}
	public void sub() {
		ans =a-b;
		System.out.print("Subraction: " +ans);
		
		
	}
	public void mul() {
		ans =a*b;
		System.out.print("Multiplication: " +ans);
		
		
	}
	public void div() {
		if(b!=0) {
		ans =a/b;
		System.out.print("Division " +ans);
		}
		else 
		{
			System.out.println("Enter the vaild number");
		}
		
	}
}

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        CalculatedImp1 obj = new CalculatedImp1();
        
        obj.input();
        
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
        
	}

}
