package com.edu;

import java.util.Scanner;

public class Switchstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String day;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day name: ");
        day=sc.next().toLowerCase();
        switch(day) {
        case "monday" :System.out.println("First day of the week");
        break;
        case "tuesday":System.out.println("Second day of the week");
        break;
        case "wednesday":System.out.println("Third day of the week");
        break;
        case "thursday":System.out.println("Fourth day of the week");
        break;
        case "friday":System.out.println("Fifth day of the week");
        break;
        case "saturday":System.out.println("Sixth day of the week");
        break;
        case "sunday":System.out.println("Seventh day of the week");
        break;
        default :System.out.println("Invalid");
        
        }
	}

}
