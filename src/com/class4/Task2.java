package com.class4;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
/*
		
		double morgageRate = 3.5;

		int morgagePrice = 150000;

		if (morgageRate > 4.5) {
			System.out.println("I won't buy the house");
		} else {
			System.out.println("I will consider buying");
			if (morgagePrice >= 200000) {
				System.out.println("i will take loan");
			} else {
				System.out.println("I will pay it cash");

			}

		}
*/
		
		Scanner workedYear=new Scanner(System.in);
	
		System.out.println("Please enter how long you have worked");
		Scanner annualSallary=new Scanner(System.in);
		System.out.println("Please enter your annual sallary");
		
		
	int workedYear1=3;
	int annualSallary1=60000;
	
	if(workedYear1>=5) {
		System.out.println("You are eligible to get bonus");
	if(annualSallary1>50000) {
		System.out.println("your bonus is 5000");
	}else {
		System.out.println("your bonus is 3000");
	}
	}else {
		System.out.println("you are not eligible to get bonus");
	}
		
	
	}

}
