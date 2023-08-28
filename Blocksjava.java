package com.edu;

public class BlocksJava {
	static {
		System.out.println("static block will executes before the main");
	}
	{
	
		System.out.println("annonymous block , executes after main , on object creation before constructor");
	}
	public BlocksJava(){
		System.out.println("constuctor");
	}
	
	static void display() {
		System.out.println("display method");
	}
	public static void main(String[] args) {
		 System.out.println("main");
		 BlocksJava ob = new BlocksJava();
		// ob.display();
		 BlocksJava.display();
		  display();

	}

}