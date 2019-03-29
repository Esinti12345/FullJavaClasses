package com.homework1;

import java.util.Scanner;

public class Denemeler4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan;
		String a = "cat";
		String b = "dog";
		int x = 5;
		int y = 4;

		scan = new Scanner(System.in);
		System.out.println("Please enter two strings");
		a = scan.nextLine();
		b = scan.nextLine();

		System.out.println("Please enter two numbers");
		x = scan.nextInt();
		y = scan.nextInt();

		if (x == y && a == b) {
			System.out.println("AND");
		} else if (x == y || a == b) {
			System.out.println("OR");
		} else if (!(x == y) && !(a == b)) {
			System.out.println("NONE");
		}

	}
}
