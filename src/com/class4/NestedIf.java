package com.class4;

public class NestedIf {

	/*
	 * write a program to check eork eligibility if user is younger <16 --> not
	 * allowed to work otherwise --> allow to work. if user is younger than 64--> go
	 * to work otherwise--> enjoy your life
	 */

	public static void main(String[] args) {

		int age = 15;
		int eligibleAge = 16;
		int retirementAge = 65;

		if (age < eligibleAge) {
			System.out.println("You are too young,no work for you");
		} else {
			System.out.println("you are eligible at work");

		}
		if (age < retirementAge) {
			System.out.println("Go work hard");
		} else {
			System.out.println("Please enjoy your life. You do need to work ");
		}

	}

}
