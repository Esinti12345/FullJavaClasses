package com.repit;

public class repit64Array2D {

	public static void main(String[] args) {
		// Write a program that  takes a 2-D array and prints the sums of the rows 
		//as an integer array.
/*
For example, the if we run rowSums for the following 2D array:
{
  {1,1,2}, //sum = 4
  {3,1,2}, //sum = 6
  {3,5,3}, //sum = 11
  {0,1,2}  //sum = 3
}


Then we should get the following array back:
4
6
11
3
*/
		int[][] a = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
			};
		
	int sum;	
		for (int i = 0; i < a.length; i++)
	    {   
	      sum=0;
	      for (int j = 0; j < a[0].length; j++)
	      {                
	        sum += a[i][j]; 

	      }

	     System.out.println(sum);
	    } 
		
		
		
		
/*       //Model Solution
		
		int sums[] = new int[nums.length];
		
		for (int i = 0; i < nums.length; i++) {
			int rowSum = 0;
			for (int j = 0; j < nums[i].length; j++) {
				rowSum += nums[i][j];
			}
			sums[i] = rowSum;
		}

	for(int sum : sums) {
			System.out.println(sum);
  }
		
*/		
		
	
		
	}

}
