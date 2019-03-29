package com.class8;

public class Task1 {

	public static void main(String[] args) {

		// Print numbers from 1 to 100

		for (int a = 1; a <= 100; a++) {
			System.out.println(a);
		}

		// Print numbers from 100 to 1
		for (int a = 100; a >= 1; a--) {
			System.out.println(a);
		}

		// Print odd numbers from 1 to 20 (2 ways)
		for (int a = 1; a <= 20; a += 2) {
			System.out.println(a);

		}

		for (int a = 1; a <= 20; a++) {
			if (a % 2 != 0) {
				System.out.println("Odd is " + a);
			}
		}

		// Print even numbers from 20 to 1 (2 ways)

		for (int a = 20; a >= 1; a -= 2) {
			System.out.println("even way1 " + a);

		}

		for (int a = 20; a >= 1; a--) {

			if (a % 2 == 0)

				System.out.println("even way2 " + a);

		}

		// Print even numbers between 20 and 50 (2 ways)

		for (int a = 20; a <= 50; a += 2) {
			System.out.println("even 20 to 50 way1 " + a);

		}

		for (int a = 20; a <= 50; a++) {

			if (a % 2 == 0) {

				System.out.println("even 20 to 50 way2 " + a);
			}
		}

		// Print odd numbers between 20 and 50 (2 ways)

		for (int a = 20; a <= 50; a += 1) {
			System.out.println("odd 20 to 50 way1 " + a);

		}

		for (int a = 20; a <= 50; a++) {

			if (a % 2 ==1) {

				System.out.println("odd 20 to 50 way2 " + a);
			}
		}

	}

}
