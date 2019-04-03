package com.reviewclass1;

public class Array2dFirstRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr= {
				{1,2},
				{3,4},
				{5,6}
				};
		// if we change the value of arr[] it shows the rows index
		//for first row arr[0] 
		//for second row arr[1]
		// for third row arr[2] --- you can change the value and you can see the difference
		
		for(int i=0; i<arr[0].length; i++) {
			System.out.println(arr[0][i]);
		}
		
		// if we want to sum of one of arrays.lets do this.
		
		int sum=0;
		for(int i=0; i<arr[1].length; i++) {
			System.out.print(arr[1][i]);
			sum+=arr[1][i];
		}
		System.out.println(sum);
		
		
		
		
		
		
	}

}
