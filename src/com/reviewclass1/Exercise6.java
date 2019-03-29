package com.reviewclass1;

public class Exercise6 {

	public static void main(String[] args) {
		// * Write a program to test if an array(1-10) contains a specific value. 6
		/*
		 * Hint: use a boolean flag
		 */

		/*
		 * int[] numbers= {1,2,3,4,5,6,7,8,9,10}; boolean a=false;
		 * 
		 * for(int i=0; i<numbers.length; i++) { while(numbers[i]==6) { a=true; break; }
		 * }if (a) { System.out.println("It contains 6"); }else {
		 * System.out.println("it doesnt contain"); }
		 */

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		boolean found = false;

		for (int i = 0; i < 10; i++) {

			if (numbers[i] == 6) {
				found = true;
				break;
			}
		}

		if (found == true) {
			System.out.println("The array contains the value 6");
		} else {
			System.out.println("The array do not contain the value 6");

		}

	}

}
