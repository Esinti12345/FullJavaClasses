package com.class13;

import java.util.Scanner;

public class Task3And4 {

	public static void main(String[] args) {
		// Write a program that reads two people’s first names and if they expecting boy
		// or girl?
		// Based on the input suggests a name for a baby:
		// Example Output:
		// Mom’s first name? Mary
		// Dad’s first name? Daniel
		// Boy or Girl? boy
		// Suggested baby name: DANRY

		// Example Output:
		// Mom’s first name? Mary
		// Dad’s first name? Daniel
		// Boy or Girl? girl
		// Suggested baby name: MAIEL

		Scanner scan = new Scanner(System.in);

		String nameM, nameD, gender, babyName;
		System.out.println("Please write Mom's name");
		nameM = scan.nextLine();

		System.out.println("Please write Dad's name");
		nameD = scan.nextLine();

		System.out.println("boy or girl");
		gender = scan.nextLine();

		if (gender.equalsIgnoreCase("boy")) {

			System.out.println(nameD.substring(0, 3) + nameM.substring(0, 2));

		} else if (gender.equalsIgnoreCase("girl")) {
			System.out.println(nameM.substring(0, 3) + nameD.substring(0, 2));
		} else {
			System.out.println("No match");
		}
		
		
		//Second Way
	/*	
		Scanner scan; 
		String motherName,fatherName, gender, babyName;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter mothers name");
		motherName=scan.nextLine();
		
		System.out.println("Please enter fathers name");
		fatherName=scan.nextLine();
		
		System.out.println("Please enter expected gender");
		gender=scan.nextLine();
		
		
		if(gender.equalsIgnoreCase("boy")) {
			babyName=fatherName.substring(0, fatherName.length()/2)+
					motherName.substring(motherName.length()/2);
		}else if(gender.equalsIgnoreCase("girl")){
		babyName=motherName.substring(0, motherName.length()/2)+
				fatherName.substring(fatherName.length()/2);
		}else {
			babyName="No suggestion";
			
		}
		System.out.println(babyName.toUpperCase());
	*/	
		

	}

}
