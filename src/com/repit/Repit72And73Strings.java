package com.repit;

import java.util.Scanner;

public class Repit72And73Strings {

	public static void main(String[] args) {
		// ALL print statements in this exercise should be on one line, no newlines.

		// Print out the character in the 5th index of the String str
		// Print out the character in the 8th index of the String str
		// Print out the character in the 1st index of the String str
		// Print out the character in the 10th index of the String strTODO
		// Auto-generated method stub

		String str = "boopity bop";

		char character = str.charAt(5);
		System.out.print(character);
		System.out.print(str.charAt(8));
		System.out.print(str.charAt(1));
		System.out.print(str.charAt(10));

		// Model Solution

		String str1 = "boopity bop";
		int i = 10;

		// write code here
		System.out.print(str1.charAt(5) + "" + str1.charAt(8) + "" + str1.charAt(1) + "" + str1.charAt(i));

		// 73. Note: Create a main Method and Scanner class

        //Given a String banana do the following:
        //Print out the following: "The first 3 letters of ___ is ___"

        //For example, if the input is "banana", your output should be "The first 3 letters of banana is ban"

		Scanner scan=new Scanner(System.in);
	    String str2="banana";
	    str2=scan.nextLine();
	    
	    System.out.println("The first 3 letters of "+ str2+" is "+str2.substring(0, 3));
	    
	    
	    //Model Solution
	    
	    Scanner a=new Scanner(System.in);
	    String ab=a.nextLine();
	    System.out.println("The first 3 letters of "+ab+ " is "+ ab.substring(0,3));
	   
		
		
		
		
		
	}

}
