package com.class9;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// Ask user to enter the item they want to buy and the price for the item.
		// Then ask user to pay for it. Every time user enters money accumulate the
		// amount and
		// tell user how much is left to pay off the amount.
		// Whenever user done with payments tell them "Thank you for shopping!"

		String item;
		int priceItem;
		int payment = 1000;
		int balance;

		System.out.println("Please enter your item");
		Scanner scan = new Scanner(System.in);
		item=scan.nextLine();
		
		System.out.println("Please enter the item price");
		payment=scan.nextInt();
		
		
		
		
		
		
		
		
		
		
		/*System.out.println("What do you want to buy?");

		item = scan.nextLine();

		System.out.println("What is the price?");
		priceItem = scan.nextInt();
		System.out.println("Please make a payment");
		payment = scan.nextInt();

		if (payment == priceItem) {
			System.out.println("Thank you for your payment");
		} else {

			do {
				System.out.println("Please make a payment again");

				priceItem++;

			} while (payment > priceItem);
			System.out.println(
					"you paid more than price " + "dont forget to take overpay " + (payment - priceItem) + " amount");

		}
	
		System.out.println("Enter Item, please.");
			item = scan.nextLine();
		while(true) {
			
			System.out.println("What is the price?");
			priceItem = scan.nextInt();
			int x = payment - priceItem;
			
			if(x>0) {
				System.out.println("You can bye");
				payment = payment - priceItem;
				System.out.println("You still have " + payment);
			}
			else {
				System.out.println("Sorry, you done. Thank you for shopping!");
				break;
			}
			
			
		}*/
	}

}
