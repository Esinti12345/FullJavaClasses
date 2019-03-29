package com.reviewclass1;

public class Exercise9 {

	public static void main(String[] args) {
		// /             Write a program to Print all elements of 2d array Using Loop

	      int[][] ar= {{1,2,3},{4,5,6,9},{7,8,9}};
		
// 1st Way
			for (int i = 0; i < ar.length; ++i) {
		           for (int j = 0; j < ar[i].length; ++j) {
		               System.out.println(ar[i][j]);
		           }
		       }
// 2nd Way
			
	       for (int[] innerArray : ar) {
	           for (int data : innerArray) {
	               System.out.println(data);
	           }
	       }
	       
	       

	}

}
