package com.class6;

import java.util.Scanner;

public class YesterdayHomework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  /*
         * Program to find largest number among three numbers using nested if
         * provided by a user (numbers must be distinct)
         */
		
int num1,num2,num3;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter 3 distinct double number");
		num1=scan.nextInt();
		num2=scan.nextInt();
		num3=scan.nextInt();
		//5,4,3
		
		if (num1>num2) {
			if(num1>num3) {
			System.out.println(num1+ " is the largest");
		}else {
			System.out.println(num3+ " is the largest");
		}

		}else {//assuming num2>num1
			if(num2>num3) {
				System.out.println(num2 + " is the largest");
			}else {
				System.out.println(num3+ " is the largest");
			}
		}
		
		
		
	}}


