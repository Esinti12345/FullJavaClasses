package com.class9;

public class Task3 {

	public static void main(String[] args) {
		// Print the following pattern:
		// 1
		// 12
		// 123
		// 1234
		// 12345

		for (int i = 1; i <= 5; i++) {
			for (int a = 1; a <=i; a++) {
				System.out.print(a);
				//System.out.print(i); check the difference
			}
			System.out.println();
		}

	}

}
