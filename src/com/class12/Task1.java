package com.class12;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {

		/*
		 * Accept username, password and confirm password and check following
		 * requirements:
		 * 
		 * Username and Password cannot be empty, if so→ message=”Username and Password
		 * cannot be empty”. Password should be minimum 8 characters, if less →
		 * message=”Password is too short”. Password cannot contain username if so, →
		 * message=”Password cannot contain username”. Password should match confirmed
		 * password, if not → message “Passwords do not match”. Only after all
		 * requirements met → message “Your username and password has been created”
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter username and password");
		String username, password;

		username = scan.nextLine();
		password = scan.nextLine();

		if (!username.isEmpty() && !password.isEmpty()) {

			if (password.length() >= 8) {
				
				if (!password.contains(username)) {
					System.out.println("Please confirm password.");

					String confirmedPassword = scan.nextLine();

					if (confirmedPassword.equals(password)) {
						System.out.println("Congratulation!");
					} else {
						System.out.println("Password do not match");
					}

				} else {
					System.out.println("Password cannot contain username.");
				}
			} else {
				System.out.println("It is too short");
			}
		} else {
			System.out.println("it cant be empty");
		}

	}

}
