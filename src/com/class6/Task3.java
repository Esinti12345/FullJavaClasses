package com.class6;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
	
		Scanner scan;
	
		char grade;
		String explanation;
		
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your grade");
		grade=scan.next().charAt(0);
		
switch(grade) {
		
		case 'A':
			explanation="Excellent";
			break;
			
		case  'B':
			explanation="Good";
			break;
			
		case  'C':
			explanation="Average";
			break;
			
		case  'D':
			explanation="Bad";
			break;
			
		
			default:
				explanation="Not Acceptable";
		}
		System.out.println("Your language is "+ explanation);

		
		

		
		

	}

}
