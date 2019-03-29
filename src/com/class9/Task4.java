package com.class9;

public class Task4 {

	public static void main(String[] args) {
		// Print the following pattern:
		//*
		//**
		//***
		//****
		//*****
		//****
		//***
		//**
		//*
		
		for(int i=1; i<=5; i++) {
			for(int a=1; a<=i; a++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=4; i++) {
			for(int a=4; a>=i; a--) {
				System.out.print("*");
			}
			System.out.println();
		}
	
		
		
		
	}

}
