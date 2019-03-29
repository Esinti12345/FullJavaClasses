package com.class2;

public class VariableChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Bill";

		String lastName = "Smith";

		System.out.println(lastName);
		

		lastName = "Johnson";
		

		char grade = 'B';
		// char grade='A'; do not work

		grade = 'A';

		// creating a variable and assignin the value
		String city = "Fairfax";
		System.out.println(city);

		// printing value of city

		System.out.println(lastName);
		

		// changing value of city from Fairfax to NY

		city = "New York"; // value of variable is changed

		System.out.println(grade);
		
		System.out.printf(city + lastName);

	}

}
