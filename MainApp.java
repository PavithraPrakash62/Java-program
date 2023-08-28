package com.Monday;

public class Mainapp {

	public static void main(String[] args) {
		int a=10,b=0,c=0;
		System.out.println("Before division");
		try {
			c=a/b;
		}
		catch(ArithmeticException e) {
		   System.out.println(e);
		   e.printStackTrace();
		   System.out.println("catch will be execute only when there is exception");
		}
		finally {
			System.out.println("finally block");
		}
		
		
		

	}

}
