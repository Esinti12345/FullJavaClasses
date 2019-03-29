package com.reviewclass1;

import java.util.Scanner;

public class ReviewRepitArrays {

	public static void main(String[] args) {
		/*
		 * 57/ Write a program that creates an array of integers of size 11. Add the
		 * years 2010 to 2020 to your array one by one using a for-loop and then print
		 * all those values
		 * 
		 * Hint:
		 * 
		 * 2010 
		 * 2011 
		 * 2012 
		 * 2013 
		 * 2014 
		 * 2015 
		 * 2016 
		 * 2017 
		 * 2018 
		 * 2019 
		 * 2020
		 */

		int[] years = new int[11];
		for (int i = 0; i < years.length; i++) {
			years[i] += 2010 + i;
			System.out.println(years[i]);
		}

		// Write a program that creates an array of strings with the following values
		// {"This", "is", "array", "of", "strings"} and prints all values in one line

//Hint: This is array of strings

		String[] words= {"This", "is", "array", "of", "strings"};
		
		for(int i=0; i<words.length; i++) {
			System.out.print (words[i]+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
