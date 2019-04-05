package com.exercises;

import java.util.Scanner;

public class ReverseIntoLoops {

	public static void main(String[] args) {
		// Write a program that prompts the user to input an integer and then outputs 
		//the number with the digits reversed. 
		//For example, if the input is 12345, the output should be 54321.
		
		Scanner scan=new Scanner(System.in);
		
		
		 int number;
	        int reverse = 0;
	        System.out.println("Please enter an integer");
			number=scan.nextInt(); 
	      
	        
	        int temp = number;
	        int remainder = 0;
	        
	        while(temp>0)
	        {
		    remainder = temp % 10;
		    reverse = reverse * 10 + remainder;
	            temp /= 10;
	        }

	        System.out.println("Reverse of " + number + " is " + reverse);
	        
	        
	        //Write a program that reads a set of integers, and 
	        //then prints the sum of the even and odd integers.
	        

	        Scanner console = new Scanner(System.in);
	     
	        int number1;
	        char choice;
	        int evenSum = 0;
	        int oddSum = 0;
	        
	        do
	        {
	            System.out.print("Enter the number ");
	            number1 = console.nextInt();
	        
	            if( number1 % 2 == 0)
	            {
	                evenSum += number1;
	            }
	            else
	            {
	                oddSum += number1;
	            }
	        
	            System.out.print("Do you want to continue y/n? ");
	            choice = console.next().charAt(0);
	            
	        }while(choice=='y' || choice == 'Y');
	        
	        System.out.println("Sum of even numbers: " + evenSum);
	        System.out.println("Sum of odd numbers: " + oddSum);
	        
	        
	        
	        
	        
	        //Write a do-while loop that asks the user to enter two numbers. 
	        //The numbers should be added and the sum displayed. 
	        //The loop should ask the user whether he or she wishes to perform the operation again.
	       // If so, the loop should repeat; otherwise it should terminate.
	        
	        int a;
	        int b;
	        int sum = 0;
	        char choice1;
	        
	        Scanner input=new Scanner(System.in);
	       
	        
	        do {
	        	 System.out.println("Plese enter two numbers");
	 	        a=input.nextInt();
	 	        b=input.nextInt();
	 	        sum=a+b;
	 	       System.out.println(sum);
	        System.out.print("Do you want to continue y/n? ");
	        choice1=input.next().charAt(0);
	        } while (choice1=='Y' || choice1=='N');
	        if(choice1=='Y') {
	        	System.out.println("Please enter new numbers");
	            a=input.nextInt();
	 	        b=input.nextInt();
	 	        sum=a+b;
	        	System.out.println(sum);
	        }else {
	        	
	        }
	        
	        
	}

}
