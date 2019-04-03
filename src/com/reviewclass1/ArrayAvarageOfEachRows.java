package com.reviewclass1;

public class ArrayAvarageOfEachRows {

	public static void main(String[] args) {
		// //                    Write a program to find the average of row 2.
//      2 6 9 3 7
//      1 7 9 4 8
//      0 4 6 2 5
//      0 1 2 3

		int[][] rating = { { 2, 6, 9, 3, 7 }, { 1, 7, 9, 4, 8 }, { 0, 4, 6, 2, 5 }, { 0, 1, 2, 3 } };
	
	
	int sum=0;
	
	for(int i=0; i<rating.length; i++) {
		for(int x=0; x<rating[i].length; x++) {
			sum+=rating[x][i];
			System.out.print(sum/rating[i].length);
		}
		System.out.println();
	}
	
	
	
	}

}
