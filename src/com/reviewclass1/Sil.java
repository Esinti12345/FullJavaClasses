package com.reviewclass1;

import java.util.Scanner;

public class Sil {

	public static void main(String[] args) {
		// Write a program that creates an array of 10 elements size.
		// Your program should prompt the user to input numbers in array and
		// then display the sum of all array elements.

		int[] numbers = new int[10];
		
		Scanner input;
		
		input = new Scanner(System.in);
		
		System.out.println("Please enter 10 numbers");

		for (int i = 0; i < 10; i++) {

			numbers[i] = input.nextInt();
		}

		
		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			
			sum = sum + numbers[i];

		}
		System.out.println("Sum of the Numbers " + sum);

	}

}
