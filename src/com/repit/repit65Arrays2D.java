package com.repit;

public class repit65Arrays2D {

	public static void main(String[] args) {
		// Write a program that prints the total number of elements that are negative AND odd

		
		
		int[][] numbers = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
		
		//Hacer'in solution
/*		int oddsum=0;
		int negsum=0;
		for (int row=0; row<a.length; row++){
		  for(int col=0; col<a[row].length; col++){
		    if((a[row][col]<0)&& (a[row][col])%2!=0)
		    negsum++;
		  }
		}
System.out.println(negsum);
*/		
		
		
		//Model Solution

		int countNegative = 0;
		for (int j = 0; j < numbers.length; j++) {
			for (int i = 0; i < numbers[j].length; i++) {
				if ((numbers[j][i] < 0) && (numbers[j][i] % 2!=0)) {
					countNegative = countNegative+1;
				}
			}
		}
     System.out.println(countNegative);
		
		
		
	}

}
