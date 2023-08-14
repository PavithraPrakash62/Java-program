package com.edu;

import java.util.Scanner;

public class Discount1 {

	public static void main(String[] args) {
		String pname;
		float pprice,discount,finalprice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the product name");
		 pname =sc.nextLine();
		 System.out.println("Enter the product price");
		 pprice=sc.nextFloat();
        if(pprice<=1000) {
        	discount=pprice*0.02f;
        }
        else if(pprice>1000 && pprice<3000) {
        	discount=pprice*0.1f;
        }
        else
        {
        	discount=pprice*0.15f;
        }
        finalprice=pprice-discount;
        System.out.println("The produt name is "+pname);
        System.out.println("The produt price is "+pprice);
        System.out.println("The produt discount is "+discount);
        System.out.println("The final product price is  "+finalprice);
        
	}

}
