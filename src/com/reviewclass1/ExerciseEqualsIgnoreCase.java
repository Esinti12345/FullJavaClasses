package com.reviewclass1;

import java.util.Scanner;

public class ExerciseEqualsIgnoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String lang1 = "Java";
		String lang2 = "C";
		String lang3 = "C++";

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any programming language");
		String language = scan.nextLine();
		
		
		if (lang1.equals(language)) {
			System.out.println("Java is a programming language");
			
		} else if (lang2.equals(language)) {

			System.out.println("C is a procedural programming language");
			
		} else if (lang3.equals(language)) {
			System.out.println("C++ is a middle-level programming language");
			
		} else {
			System.out.println("Doesn't match any programming language");
		}
		System.out.println();

	}

}
