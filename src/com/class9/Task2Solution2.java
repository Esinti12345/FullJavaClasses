package com.class9;

import java.util.Scanner;

public class Task2Solution2 {

	public static void main(String[] args) {
		// Ask user to enter the item they want to buy and the price for the item.
		// Then ask user to pay for it. Every time user enters money accumulate the
		// amount and
		// tell user how much is left to pay off the amount.
		// Whenever user done with payments tell them "Thank you for shopping!"
		
		
		String item;
		double price;
		double payment;
		double balance;
		double totalPayment=0;

		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your item");
		item=scanner.nextLine();

		System.out.println("Please enter the item price");
		price=scanner.nextDouble();

		do {
		    System.out.println("Please enter your payment amount");
		    payment=scanner.nextDouble();
		    
		    totalPayment=totalPayment+payment;
		    
		    balance=price-totalPayment;
		    System.out.println("Please enter more $ "+balance);
		    }while(totalPayment<=price);
		

	}

}
