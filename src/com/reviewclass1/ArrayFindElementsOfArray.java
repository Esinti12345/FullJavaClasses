package com.reviewclass1;

public class ArrayFindElementsOfArray {

	public static void main(String[] args) {
		// Write a program to print all elements of the 2d array using for loop.

		int[][] arr = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		
		
		for (int i = 0; i < arr.length; i++) {
			for (int y = 0; y < arr[i].length; y++) {
				System.out.print(arr[i][y] + " ");
			}
			System.out.println();
		}

		
		
		
		
		
		System.out.println("// Second Way // ");// Second Way

		for (int[] inner : arr) {
			for (int elements : inner) {
				System.out.print(elements);
			}
		}

		
		
		
	}

}
