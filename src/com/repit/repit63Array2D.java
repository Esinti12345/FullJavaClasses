package com.repit;

public class repit63Array2D {

	public static void main(String[] args) {
		// Write a program that checks if a 2-D integer array is a square array, 
		//meaning, if its rows and columns are equal.
		
		int[][] a = {
				{1,1,1},
				{1,1,1},
				{1,1,1}
			};
		
		//First Way
	
		 for (int i=0; i<a.length; i++) {
			 for (int y=0; y<a[i].length; y++) {
			   if(a[i]==a[y]) {

			   }

			 }
			}
			System.out.println("true");
		
		// Second Way
			int row=0;
		       int col=0;
		           for(int i=0;i<a.length;i++) {
		               row++;
		           if(a.length==a[i].length) {
		               col++;
		           }
		       }
		       if(row==col)System.out.println("true");
		
/*	//Model Solution
		       boolean flag = false;
				
				for (int i = 0; i < array.length; i++) {
					if (array.length == array[i].length){
						flag = true;
					}
					break;
				}
				System.out.println(flag);
				
*/
		
		
	}

}
