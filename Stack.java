package com.edu.pavi;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		//push and pop
		 Stack<Integer> s1=new Stack<Integer>();
		// check stack is empty or not
		Boolean result=s1.empty();
		System.out.println("Is stack is empty?" +result);
		s1.push(23);
		s1.push(43);
		s1.push(78);
		s1.push(56);
		s1.push(23);
		System.out.println(s1);
		try {
		s1.pop();
		s1.pop();
		s1.pop();
		s1.pop();
		s1.pop();
		s1.pop();
		} catch (EmptyStackException e) {
			System.out.println("Stack is empty");
			
		}
	// peek= element of top
		Stack<String> s2 = new Stack<String>();
		s2.push("pavithra");
		s2.push("preethi");
		s2.push("durga");
		s2.push("jaya");
		s2.push("prakash");
		String ans=s2.peek();
		System.out.println("Element at the top of the stack: "+ ans);
		// Search an element in stack
		int location=s2.search("durga");
		System.out.println("The location given object is: "+location);
		int size=s2.size();
		System.out.println("The size of Stack is "+size);
		
		
		
	}

}
