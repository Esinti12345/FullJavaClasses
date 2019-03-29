package com.class9;

import java.util.Scanner;

public class Task2Solution3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan;
        String item;
        double price;
        double payment;
        double totalPayment =0;
        double balance;
        
        scan=new Scanner(System.in);
        System.out.println("Please enter your item");
        item=scan.nextLine();
        
        System.out.println("Please enter item price");
        price=scan.nextDouble();
        
        do {
            System.out.println("Please enter your payment amount");
            payment=scan.nextDouble();
        
            totalPayment = totalPayment +payment;
            
            balance=price-totalPayment;
            System.out.println("Please enter more $" + balance);
            
        }while (balance >=price);
        System.out.println("Thank you for shopping");
	}

}
