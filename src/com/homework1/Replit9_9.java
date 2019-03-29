package com.homework1;

public class Replit9_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a program that prints the count down from 10 up to 1 and string "Happy New Year!".


Output:
10
9
8
7
6
5
4
3
2
1
Happy New Year!
		 */
		
		//Model solution
		
		 for(int i = 10; i>=0; i--){
		      
		      if(i==0){
		              System.out.println("Happy New Year!");

		      }else{
		        
		              System.out.println(i);

		      }

		      
		    }
		 // mySolution
		 
		 for(int i=10; i>=1; i--){
			  System.out.println(i);
			}System.out.println("Happy New Year!");
	}

}
