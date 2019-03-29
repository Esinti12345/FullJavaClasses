package com.class5;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*
	     * Write a Java program to ask user enter daily sales amount
	     * Based on the sales range commission will be different;
	     * Example: sales is <100==> commission =2
	     * sales more than 100 and less than 200=5
	     */
		
		Scanner scan;
		int dailySales;
		int commission;
		
		
		scan=new Scanner(System.in);
		System.out.println("Please enter sales amount");
		dailySales=scan.nextInt();
		
		if(dailySales>0 && dailySales<100) {
			commission=2;
		}else if (dailySales>=100 && dailySales<200) {
			commission=5;
		}else if (dailySales>=200 && dailySales<500) {
			commission=10;
		}else if (dailySales>=500) {
			commission=20;
			
		}else {
			commission=0;
		}
		System.out.println("your commision is " +commission);
		
	}

}
