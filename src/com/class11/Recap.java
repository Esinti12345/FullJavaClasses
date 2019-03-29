package com.class11;

public class Recap {

	public static void main(String[] args) {
		// let's create an array of names thats will hold 5 elements and retrieve all
		// values from it

		String[] names = new String[7];

		names[0] = "Asel";
		names[1] = "Awet";
		names[2] = "Arif";
		names[3] = "Weqas";
		names[4] = "Dzmitri";
		names[5] = "Shiva";
		names[6] = "Sandesh";

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		// 2.create an array using array literal
		                            // 0       1       2         3       4        5
		String[] studentNames = { "Shaban", "Bilal", "Mehmet", "Zaki", "Samir", "Frank" };
		
		System.out.println("---------For loop--------");
		for (int i = 0; i <= studentNames.length - 1; i++) {
			System.out.println("Second " + studentNames[i]);
		}

		// Retrieve values using: advanced for loop, for each loop, enhanced for loop
		
		System.out.println("---------Advanced for loop--------");
		for (String student : studentNames) {
			System.out.println(student);
		}

	}

}
