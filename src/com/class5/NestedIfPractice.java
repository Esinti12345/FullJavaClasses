package com.class5;

public class NestedIfPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Boolean creditCard=true;
		int balance=900;
		
		if(creditCard) {
			System.out.println("Let`scheck the balance");
			if(balance>=1000) {
				System.out.println("pay off now");
			}else {
				System.out.println("you are safe");
			}
		}else {
			System.out.println("Do you want a credit card? ");
		}
		
		
	}

}
