package com.class9;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		/*
		 * Write a guessing game where the user has to guess a secret number between 1
		 * and 20. After every guess input, the program tells the user whether their
		 * number was too large or too small. The program will keep asking the user to
		 * enter the number until he finds the correct number. When the correct answer
		 * is found the system should display "Congratulations!!. You got it!".
		 */

		int secretNumber = 9;
		int guessNumber;
		Scanner input;

		input = new Scanner(System.in);

		for (int x = 1; x <= 20; x++) {
			System.out.println("Please guess a number ");
			guessNumber = input.nextInt();
			if (guessNumber < secretNumber) {
				System.out.println("Your number is small");
			} else if ((guessNumber > secretNumber)) {
				System.out.println("Your number is big");
			} else if ((guessNumber == secretNumber)) {
				System.out.println("Congratulations!!. You got it!");

			}
		}

	}

}
