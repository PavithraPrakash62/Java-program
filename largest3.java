package com.edu;

import java.util.Scanner;

public class Largest3 {
	public static void main(String[] args) {
		int a,b,c,d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a");
        a= sc.nextInt();
        System.out.println("Enter value of b");
        b =sc.nextInt();
        System.out.println("Enter value of c");
        c=sc.nextInt();
        c=(a>b && a>c )?a:b>c?b:c ;
        System.out.println("The largest number is: " +c);
	}
}


