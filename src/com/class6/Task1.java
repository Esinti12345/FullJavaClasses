package com.class6;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program that prints out if it is good weather to go for any activity
		 * or not If the temperature is between 40 degrees and 80 degrees inclusive & no
		 * rain--> we will go for hiking otherwise--> we will not go hiking If
		 * temperature is between 25 and 40 inclusive & snowing -->going snowboarding
		 * otherwise we are not going snowboarding it if temperature is more than 80 &
		 * sunny--> go to the beach otherwise --> not go to the beach
		 */

		Scanner scan;
		boolean snow, sunny, rainy;
		int temp;
		String activity;

		scan = new Scanner(System.in);

		System.out.println("Please enter a temperature");

		temp = scan.nextInt();

		snow = true;
		sunny = true;
		rainy = true;

		if (temp >= 40 && temp <= 80) {
			
			if (sunny) {
				System.out.println(" Go for hiking");
			} else {
				System.out.println("Watch movie");
			}
		} else if (temp >= 25 && temp <= 40) {
			if (snow) {
				System.out.println(" Go snowboarding");
			} else {
				System.out.println("do coding");
			}
		} else if (temp > 80) {
			if (sunny) {
				System.out.println("go to beach");
			} else {
				System.out.println("more coding");
			}
		} else {
			System.out.println("Please enter different temp");

		}

	}

}
