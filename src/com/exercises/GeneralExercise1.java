package com.exercises;

import java.util.Scanner;

public class GeneralExercise1 {

	public static void main(String[] args) {

	//Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. 
		//For example, if the input is 12345, the output should be 54321.	
		
		
		
		
		
		
		
		
		
		// 90 --> A
		// 80-90 --> B
		// 70-80 --> C
		// 70-60 -->D
		// >60 --> F

		int number;
		char grade;

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your degree");
		number = scan.nextInt();

		if (number >= 90) {
			System.out.println("Your grade is " + 'A');
		} else if (number > 80 && number < 90) {
			System.out.println("Your grade is " + 'B');
		} else if (number > 70 && number < 80) {
			System.out.println("Your grade is " + 'C');
		} else if (number > 60 && number < 70) {
			System.out.println("Your grade is " + 'D');
		} else {
			System.out.println("Your grade is " + 'F');
		}

//Write a program to calculate the sum of first 10 natural number.
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;// sum+=i;
		}
		System.out.println("The sum of first 10 natural number is =" + sum);

//Write a program that prompts the user to input a positive integer. 
//It should then print the multiplication table of that number. 	

		int mult;
		Scanner scan1 = new Scanner(System.in);

		number = scan1.nextInt();

		for (int i = 1; i <= 10; i++) {

			mult = number * i;
			System.out.println(number + "*" + i + "=" + mult);
		}

	}

}
