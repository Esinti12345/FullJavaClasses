package com.repit;

import java.util.Scanner;

public class Repit58Arrays {

	public static void main(String[] args) {
		// Create an int array with the size of 5 and input values with Scanner.  
		//Print out each element of the array multiplied by ten, one element per line. 
		//Create a loop and enter values into one loop, 
		//the second loop print the values and it must be multiplied by 10.
		
	
		int[] array=new int[5];
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter 5 numbers");
		
		for(int i=0; i<array.length; i++) {
			array[i]=input.nextInt();
			System.out.print(array[i]*10);
			
			System.out.println();
		}
		

		
		
		
		// second way 
		System.out.println("-------------");
		
		Scanner input1 = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i=0;i<arr.length;i++)
		{
			arr[i] = input1.nextInt();
		}
		
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]*10+" ");
		
		}

	        
	        
	}

}
