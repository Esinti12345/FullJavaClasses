package com.class14;

import java.util.Scanner;

public class InterviewQuestions {

	public static void main(String[] args) {

//3. Find out how many alpha characters present in a string?
//
//4.How to find out the part of the string from a string? What is substring? Find number of words in string?
//
//5. Write a java program to reverse String? Reverse a string word by word?

//6. Write a Java Program to find whether a String is palindrome or not?
//
//7. Write a java program to check whether a given number is prime or not?
//
//8. Write a Java Program to print first 10 numbers of Fibonacci series.

		/// 1. Write a program to swap 2 numbers without a temporary variable?
		// Swap 2 strings without a temporary variable?

		int x = 10;
		int y = 20;

		x = x + y;// 30
		y = x - y;// 30-20=10
		x = x - y;// 30-10=20

		System.out.println("The value of a=" + x + " value of b=" + y);

		String str1 = "Hello";// 5
		String str2 = "World";// 5

		str1 = str1 + str2;// HelloWorld-->10
		str2 = str1.substring(0, str1.length() - str2.length());// Hello
		str1 = str1.substring(str2.length());

		System.out.println("The value of str1=" + str1 + " value of str2=" + str2);

//2.Write a java program to find the second largest number in the array? 
		// Maximum and minimum number in the array?

		int arr[] = { 1000, 46, 1, 86, 292, 2 };

		int min = arr[0];// 0
		int secondLargest = 0;// 0
		int largest = 0;// 0

		for (int a : arr) {
			if (a > largest) {
				largest = a;
			}
			if (a < min) {
				min = a;
			}
		}
		for (int a : arr) {

			if (a > secondLargest && a < largest) {

				secondLargest = a;
			}
		}
		System.out.println("min = " + min);
		System.out.println("Second Largest = " + secondLargest);

		System.out.println("Largest =" + largest);

		/*
		 * 5 Write a java program to reverse String? Reverse a string word by word?
		 */

		String sentence = "The master is speaking ";
		String reverse = "";
		for (int i = sentence.length() - 1; i >= 0; i--) {
			reverse = reverse + sentence.charAt(i);
		}
		String[] words = reverse.split(" ");
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i] + " ");
		}

		/*
		 * 6.Write a Java Program to find whether a String is palindrome or not? (dad,
		 * mom, madam)
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter any word to check if it a palidrome!");
		String word = scan.nextLine();

		String reverse1 = "";

		for (int i = word.length() - 1; i >= 0; i--) {
			reverse1 += word.charAt(i);
		}

		if (word.equalsIgnoreCase(reverse1)) {
			System.out.println("The word is palidrome ");
		} else {
			System.out.println("The word is not a palidrome");
		}

//			//6.Question 2nd Way
//			String reverse = "";
//	        while (true) {
//	            System.out.println("Please enter string to check whether is palindrome or to exit q");
//	            str = scanner.nextLine();
//	            if (str.equals("q")) {
//	                break;
//	            } else {
//	                for (int i = str.length() - 1; i >= 0; i--) {
//	                    reverse += str.charAt(i);
//	                }
//	                if (str.equalsIgnoreCase(reverse)) {
//	                    System.out.println(str + " is palindrome");
//	                    break;
//	                } else {
//	                    System.out.println(str + " is not palindrome");
//	              }

		// * 7. Write a java program to check whether a given number is prime or not?
		
		int number;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number to check if it is prime");
		number = input.nextInt();
		boolean prime = true;
		for (int i = 2; i < number; i++) {
			if (number % i != 0) {

			}else {
				prime = false;
				break;
			}
		}
		System.out.println(prime);
		
		
		//8. Write a Java Program to print first 10 numbers of Fibonacci series.	
		
		int  a=0;
			int b=0;
			int c=0;
			
			for (int i=0; i<10; i++) {
				c=a+b;
				a=b;
				b=c;
				System.out.println(a+ " ");
			}
		
		
		

	}
}
