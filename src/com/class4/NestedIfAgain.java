package com.class4;

public class NestedIfAgain {

	/*
	 * declare variable for gpa and having a diploma if user has a
	 * diploma->congratulations--> if gpa is higher 3.5-->hire
	 */

	public static void main(String[] args) {

		double gpa = 2.5;
		double expectedGpa = 3.5;

		boolean hasDiploma = true;

		if (hasDiploma) {
			System.out.println("Congratulations");
			if (gpa > expectedGpa) {
				System.out.println("you are hired");
			}else {
				System.out.println("Unfortunately we cannot hire you");
			}
		} else {
			System.out.println("Please get your degree");
		}

	}

}
