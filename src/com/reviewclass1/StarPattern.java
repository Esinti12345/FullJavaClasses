package com.reviewclass1;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		
	/*	
		// Example 1

	Scanner scan;
	scan=new Scanner(System.in);
	
	int entry;
	
	System.out.println("Please enter a number between 1-10");
		entry=scan.nextInt();
		
		int star=1;
		
		for(int x=0; x<entry; x++) {
		
		
		for(int i=0; i<star; i++) {
			System.out.print("*");
		}
		System.out.println("\n");
		star++;
		}
		
		//Example 2
		
		Scanner scan1;
		scan1=new Scanner(System.in);
		int entry1;
		System.out.println("Enter a number");	
		entry1=scan1.nextInt();
		
		
		int star2=1;
		for(int g=1; g<=entry1; g++) {
		
		for(int i=0; i<star2;i++) {
			System.out.print("*");
		}
		System.out.println(g);
		star2++;
		}
		
		
		//  Example 3
		
		
		
		Scanner input;
		input=new Scanner(System.in);
		int entry3;
		System.out.println("Enter enter a number");
		entry3=input.nextInt();
		
		int star3,dot;
		
		star3=1;
		dot=entry3-1;
		for(int f=0; f<entry3; f++) {
			for(int i=0; i<dot; i++) {
				System.out.print(" ");
			}
		
		for(int i=0; i<star3; i++) {
			System.out.print("*");
		}
		System.out.println();
		dot--;
		star3++;
		}
		*/
		
		//Piramit
		
		Scanner input;
		input=new Scanner(System.in);
		int entry3;
		System.out.println("Enter enter a number");
		entry3=input.nextInt();
		
		int star3,dot;
		
		star3=1;
		dot=entry3-1;
		for(int f=0; f<entry3; f++) {
			for(int i=0; i<dot; i++) {
				System.out.print(" ");
			}
		
		for(int i=0; i<star3; i++) {
			System.out.print("*");
		}
		System.out.println();
		dot--;
		star3+=2;
		}
		
		star3-=2;
		dot=0;
		for(int f=0; f<entry3; f++) {
			for(int i=0; i<dot; i++) {
				System.out.print(" ");
			}
		
		for(int i=0; i<star3; i++) {
			System.out.print("*");
		}
		System.out.println();
		dot++;
		star3-=2;
		}
		
		
		
		
		
		

	}

}
