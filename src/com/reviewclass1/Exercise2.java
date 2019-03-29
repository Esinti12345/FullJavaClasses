package com.reviewclass1;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 5; i++) {
			for (int a = 5; a > 0; a--) {

				if (a <= i) {
					System.out.print(i);
				} else {
					System.out.print(".");
				}
			}
			System.out.println();

		}

		/*
		 * Write a program that prints the following pattern
		 *
		 * Output: 1 2 3 4 5 6 7 8 9 10 2 4 6 8 10 12 14 16 18 20 3 6 9 12 15 18 21 24
		 * 27 30 4 8 12 16 20 24 28 32 36 40 5 10 15 20 25 30 35 40 45 50
		 *
		 */

		for (int i = 1; i <= 5; i++) {
			for (int y = 1; y <= 10; y++) {

				System.out.print((i * y) + " ");
			}

			System.out.println();

		}

		/**
		 * Write a program that prints the following pattern
		 *
		 * ....1 ...22 ..333 .4444 55555
		 *
		 */

		// 1 to 5
		// 1 to 5-i
		// 1 to i

		for (int i = 1; i <= 5; i++) {
			for (int k = 1; k <= (5 - i); k++) {
				System.out.print(".");
			}
			for (int l = 1; l <= i; l++) {

				System.out.print(i);
			}

			System.out.println();

		}

	}

}
