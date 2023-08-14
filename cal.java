package com.edu;
import java.util.Scanner;
public class Calculater {

	public static void main(String[] args) {
		char opertor;
		int num1,num2,Ans;
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the opertor: ");
        opertor=sc.next().charAt(0);
        System.out.println("Enter the value of num1: ");
        num1=sc.nextInt();
        System.out.println("Enter the value of num2: ");
        num2=sc.nextInt();
        switch(opertor) 
        {
        case '+' : Ans = num1 + num2;
        	System.out.println("The sum of two is "+Ans);
        	break;
        case '-': Ans = num1 - num2;
            System.out.println("The sub of two is "+Ans);
            break;
        case '*': Ans = num1 *num2;
            System.out.println("The Mul of two is "+Ans);
            break;
        case '/' :if(num2!=0) {
             Ans = num1 / num2;
             System.out.println("The Div of two is "+Ans);
              }
              else{
        	System.out.println("Enter other than zero");
        }
        break;
        default : System.out.println("Invaild");
        }
	}
}
