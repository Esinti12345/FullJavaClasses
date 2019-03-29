package com.exercises;

import java.util.Scanner;

public class LoopsExercise {

	public static void main(String[] args) {
		
		//Write a program to print numbers from 1 to 10.
		
		int num;
		for(num=1; num<=10; num++) {
			System.out.println(num);
		}
		
		
		//Write a program to calculate the sum of first 10 natural number.
		
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum+=i;
		}System.out.println("Sum "+ sum);
		
		
		
        //Write a program that prompts the user to input a positive integer. 
		//It should then print the multiplication table of that number.
		
		Scanner scan;
		scan=new Scanner(System.in); 
		
		int positive;
		
		
		System.out.println("Please enter a positive number");
		positive=scan.nextInt();
		
		for (int i=1; i<=10; i++) {
		
		System.out.println(positive+"*"+i+"="+positive*i);
		}
	
		
		
		
		
	}

}
