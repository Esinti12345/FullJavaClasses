package com.class9;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// Ask a user to input a leap year.
		// Give the user 10 chances to enter a correct leap year.
		// As soon as the user enters the correct leap year exit the loop.

		int leapYear;
		Scanner scan;

		scan = new Scanner(System.in);

		for (int x = 0; x < 10; x++) {

			System.out.println("Please enter a year");
			leapYear = scan.nextInt();

			if (leapYear % 4 != 0) {
				System.out.println("It is not a leap year");
			} else {
				System.out.println("It is a leap year.Thank you");
				break;
			}

		}

	}

}
