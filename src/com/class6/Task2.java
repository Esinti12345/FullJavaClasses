package com.class6;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		/*
		 * Exercises to complete:

Ask user to enter their country and capture it. 
Once values are captured print which language user speaks.

Allow user to enter grade and then provide explanation: 
A-Excellent, B-Good, C-Average, D-Bad, any other grade --> 
Not Acceptable. At the end your program should print 
which grade was entered by a user with explanation.

HomeWork: Using scanner class create calculator. 
Allow user to enter 2 numbers and operator(+,-,*,/). 
Based on operator provide the result to user.
		 */
		
		Scanner scan;
		String country;
		String language;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter which country you are from");
		country=scan.nextLine();
		
switch(country) {
		
		case "USA":
			language="English";
			break;
			
		case  "Germany":
			language="Germany";
			break;
			
		case  "Russia":
			language="Russian";
			break;
			
		case  "Italy":
			language="Italy";
			break;
			
		case  "Turkey":
			language="Turkish";
			break;
			
		case  "Morocco":
			language="Arabic";
			break;
			
		case  "Kazakhstan":
			language="Russian";
			break;
			
		case  "Pakistan":
			language="Urduca";
			break;
			
			default:
				language="Unknown";
		}
		System.out.println("Your language is "+ language);


		
	}

}
