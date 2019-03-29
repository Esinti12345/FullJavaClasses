package com.reviewclass1;

public class Exercise5 {

	public static void main(String[] args) {
		// Write a program to sum the values of an array 1-10

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i]; // sum+=arr[i];
		}
		System.out.print("The sum of all array elements = " + sum);

	}

}
