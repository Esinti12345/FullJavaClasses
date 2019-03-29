package com.repit;

public class repit66And67Strings {

	public static void main(String[] args) {

		// Create a String named "name" and assign the value "Timmy" to it
		// Find out how many characters are there in the given String

		String name = "Timmy";

		int lengthOfString = name.length();
		System.out.println(lengthOfString);
		
		
		
		// Create a String named s1 = "hello" check weather string is empty or not
		// Create a String named s2 = "" check weather string is empty or not

		String s1 = "hello";
		String s2 = "";
		boolean isEmpty = s1.isEmpty();
		System.out.println(isEmpty);
		boolean isEmpty1 = s2.isEmpty();
		System.out.println(isEmpty1);

		// Model Solution

		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());

	}

}
