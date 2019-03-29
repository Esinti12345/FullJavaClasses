package com.homework1;

import java.util.Scanner;

public class Denemeler5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int mN;
		String season;
		System.out.println("Please enter valid month number");
		mN = scan.nextInt();

		if (mN == 12 || mN == 1 || mN == 2) {
			season = "Winter";
		} else if (mN == 3 || mN == 4 || mN == 5) {
			season = "Spring";
		} else if (mN == 6 || mN == 7 || mN == 8) {
			season = "Summer";
		} else if (mN == 9 || mN == 10 || mN == 11) {
			season = "Fall";
		} else {
			System.out.println("Please enter valid month number");
			season = "Unknown";
		}
		System.out.println("You were born " + season);
	}

}
