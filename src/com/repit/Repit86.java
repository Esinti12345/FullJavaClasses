package com.repit;

public class Repit86 {

	void mult(int a,int b){
		   System.out.println(a*b+" for multiplication"); 
		  }
	
	void add(int a,int b){
	   System.out.println((a+b)+ " for addition"); 
	  }
	
	void sub(int a,int b){
		   System.out.println((a-b)+" for subtraction"); 
		  }
	
	public static void main(String[] args) {
		// For you to do 
//		Multiple Parameters for method
//		create three method with  Multiple Parameters as int 
//		and write the logic in that method to perform multiplication,addition and subtraction
//		and call the method in main method with values 
//
//		1. for the addition method add two numbers to make 30 but put those numbers in the parameters
//		2. for multiplication multiply two numbers to make 30 but put those two numbers in your parameters
//		3. for Subtraction subtract two numbers to equal 20, with using parameters.
//		30 for addition
//		30 for multiplication
//		20 for subtraction
		
Repit86 obj=new Repit86();
obj.add(20, 10);
obj.mult(6, 5);
obj.sub(30, 10);
		
	}

}
