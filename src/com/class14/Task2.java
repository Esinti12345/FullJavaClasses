package com.class14;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/*
		 
		 
		 * 
		 * 8. Write a Java Program to print first 10 numbers of Fibonacci series.
		 */

		// 1ST QUESTION 1. Write a program to swap 2 numbers without a temporary
		// variable?
		// *Swap 2 strings without a temporary variable?

		int x = 10;
		int y = 5;
		x = y + x;
		y = x - y;
		x = x - y;

		System.out.println("The value of a="+x+" value of b="+y);
	

		String name1 = "Ali";
		String name2 = "Veli";
		name1 = name1 + name2;

		name2 = name1.substring(0, name1.length() - name2.length());
		name1 = name1.substring(name2.length());

		System.out.println(name1);
		System.out.println(name2);

		// 2 QUESTION -->Write a java program to find the second largest number in the
		// array?
		// * Maximum and minimum number in the array?

		int[] arr = { 3, 15, 36, 8, 19, 12, 23 };
		int max = arr[0];
		int min = arr[0];
		int secondmax = arr[0];
		int secondmin = arr[0];

		for (int i = 1; i < arr.length; i++) {
			//System.out.println(arr[i]);

			if (arr[i] > max) {
				secondmax = max;
				max = arr[i];

			} else if (arr[i] > secondmax) {
				secondmax = arr[i];
			}

			if (arr[i] < min) {
				min = arr[i];
			}
		}

		System.out.println("Max number is " + max);

		System.out.println("Secondmax number is " + secondmax);
		System.out.println("Min number is " + min);

		// 3 Question/ Find out how many alpha characters present in a string?

		String str = "New @#$%& language based on numbers1234567";
		String array = str.replaceAll("[^A-Za-z]", "");
		System.out.println("Number of alpha character is " + array.length());

		// * 4.How to find out the part of the string from a string? What is substring?
		// * Find number of words in string?
		
		
		
		
		
		

		// * 5. Write a java program to reverse String? Reverse a string word by word?
		String original = "Today is Spring day";
		String reverse = "";

		char[] arrayy = original.toCharArray();
		for (int i = arrayy.length - 1; i >= 0; i--) {
			reverse = reverse + arrayy[i];

		}
		System.out.println("Reversed String is: " + reverse);

		
		// * 6.Write a Java Program to find whether a String is palindrome or not?
		
		String a, b = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string you want to check:");
        a = scan.nextLine();
        
        
        int n = a.length();
        for(int i = n - 1; i >= 0; i--)
        {
            b = b + a.charAt(i);
        }
        if(a.equalsIgnoreCase(b))
        {
            System.out.println("The string is palindrome.");
        }
        else
        {
            System.out.println("The string is not palindrome.");
        }
		
		
		
	}

}
