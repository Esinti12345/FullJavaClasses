package com.class12;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int [][] arr= {
			{1,2,3}, // 1 array that stored with index 0
			{10,20,30}, // 2 array that stored with index 1
			{100,200,300} // 3 array that stored with index 2
		
	};
	
	// how many total arrays
	
	for (int i=0; i<arr.length; i++) {
		for(int j=0; j<arr[i].length; j++) {
			System.out.println(arr[i][j]);
		}
	
System.out.println();

	}
	
	System.out.println("----------For each Loop --------");
	
	for (int[] singleArray:arr)	{
		for(int numbers:singleArray) {
			System.out.print(numbers+" ");
		}
System.out.println();
	}
		
		

		
		
	}

}
