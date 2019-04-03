package com.class14;

public class StringSplit {

	public static void main(String[] args) {
		// split --> cut it out 
		
		
		String str="Welcome Syntax Students Batch 4";
		String[] array=str.split("s");// try "S"  try " " see difference
		System.out.println("The length of array is "+array.length);
		System.out.println(array.length);
		
		for(String substring: array) {
			System.out.println(substring);
		}

		System.out.println("----------");
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		
		
	}

}
