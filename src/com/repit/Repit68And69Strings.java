package com.repit;

public class Repit68And69Strings {

	public static void main(String[] args) {
		// 68-Create a two Strings
		// create first string named str1= syntaxsolutions convert into SYNTAXSOLUTIONS
		// create first string named str2= SYNTAXSOLUTIONS convert into syntaxsolutions

		String str1 = "syntaxsolutions";
		String str2 = "SYNTAXSOLUTIONS  ";
		String newString = str1.toUpperCase();
		System.out.println(newString);
		String newString1 = str2.toLowerCase();
		System.out.println(newString1);

		// Model Solution

		System.out.println(str1.toUpperCase());
		System.out.println(str2.toLowerCase());

		
		System.out.println("--------69.Replit-------");
		
		// 69. Validate if the string ends with "u" prints the Boolean value accordingly
		// Validate if the string ends with "world" prints the Boolean value accordingly
		// Validate if the string ends with "are" prints the Boolean value accordingly
		// Validate if the string ends with "you" prints the Boolean value accordingly

		String s1 = "hello how are you";

		System.out.println(s1.endsWith("u"));
		System.out.println(s1.endsWith("world"));
		System.out.println(s1.endsWith("are"));
		System.out.println(s1.endsWith("you"));

	}

}
