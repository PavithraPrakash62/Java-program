package com.edu;

import java.util.Scanner;

public class Diffarea {

	public static void main(String[] args) {
		int choice;
		double n1,n2,ans;
		Scanner sc = new Scanner(System.in);
		System.out.println("AREA OF DIFFERENT FIGURES");
		System.out.println("1.Area of Rectangle ");
		System.out.println("2.Area of Square ");
		System.out.println("3.Area of Triangle ");
		System.out.println("4.Area of circle ");
		
		System.out.println("Please enter your choise ");
		choice =sc.nextInt();
		
		switch(choice) {
		case 1: System.out.println("Enter lenth and  breadth of Rectangle ");
		        n1 =sc.nextDouble();
		        n2=sc.nextDouble();
		        ans=n1*n2;
		        System.out.println("The area of Rectangle is "+ans);
		        break;
		case 2: System.out.println("Enter the side of Square ");
                n1 =sc.nextDouble();
                ans=n1*n1;
                System.out.println("The area of Square is "+ans);
                 break;
		case 3: System.out.println("Enter base and height of triangle ");
                n1 =sc.nextDouble();
                n2=sc.nextDouble();
                ans=(n1*n2)/2;
                System.out.println("The area of triangle is "+ans);
                break;
		case 4: System.out.println("Enter the radius of circle ");
                n1 =sc.nextDouble();
                ans=(22 * n1 * n1)/7;
                 System.out.println("The area of circle is "+ans);
                break;
		default : System.out.println("invalid");
			
                
		        
		}
				
	}	

}
