package com.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class RepitHomeworks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	    //Write a program that creates an array of integers that stores 
		//the following values:45,78, 12,  67, 55 and then prints all its values 
       //45 78 12  67 55
		
		// My way
	/*	 int[] numbers=new int[5];
	      numbers[0]=45;
	      numbers[1]=78;
	      numbers[2]=12;
	      numbers[3]=67;
	      numbers[4]=55;
	    
	     System.out.print(numbers[0]);
	     System.out.print(" ");
	     System.out.print(numbers[1]);
	     System.out.print(" ");
	     System.out.print(numbers[2]);
	     System.out.print(" ");
	     System.out.print(numbers[3]);
	     System.out.print(" ");
	     System.out.print(numbers[4]);
		
	    // ideal way
	     
	     
	     int[] arr = { 45, 78, 12, 67, 55 };

	 		for (int i = 0; i < arr.length; i++) {

	 			System.out.print(arr[i] + " ");
	 		}
	 		
	 		
	 	//	2nd Question:Write a program that creates an array of integers 
		//that stores the following values: 45,78, 12,  67, 55, 89, 23, 77, 88
		//Print only even values.
	 		
	 		 int[] num={45,78,12,67,55,89,23,77,88};
	 		   
	 		   for (int i=0; i<num.length; i++){
	 		     if (num[i]%2==0){
	 		       System.out.println(num[i]);
	 		     }
	 		   }
		
		  //Write a program that creates an array of integers that stores 
	 		   //the following values: 45,78, 12,  67, 55, 89, 23, 77, 88
	 		 // Print only values that stored with even index including 0
         //Hint: 45 12 55 23 88 
	 		   
	 		 
		//my Way;
		int[] array={45,78,12,67,55,89,23,77,88};
	 		  
	 		 for (int i=0; i<array.length; i++) 
	 			 if(i%2==0) {
	 				
	 				System.out.println(array[i]);	 
	 			 }
	 		 
	 		
	 		 
	 		 // Recommended way;
	 		int[] arr = {45,78, 12,  67, 55, 89, 23, 77, 88};

			for (int i = 0; i < arr.length; i+=2) {

				System.out.print(arr[i] + " ");
			}
	    
	 	//Write a program that creates an array with the following 
			//values{s, a, y,  b, n, c, t,  d, a, e, x} and prints the values 
			//starting at index 0 and multiple of 2 using a for loop.
//Hint: syntax
			
			//My Way=Recommended way;
			  char[] symbol={'s','a','y','b','n','c','t','d','a','e','x'};
			    
			    for (int i=0; i<symbol.length; i+=2){
			      System.out.print(symbol[i]);
			    }	
			
			
			
			//Write a program that creates an array of strings with the following 
			    //values{"This", "is", "array", "of", "strings"} and prints all values in one line
//Hint: This is array of strings
			
			String[] words= {"This","is","array","of","strings"};
			
			for(int i=0; i<words.length; i++) {
				System.out.print(words[i]+" ");
			}
			
		
			
			//Write a program that creates an array of strings with the size being 7.
			//Ask the user to input Days of a week beginning with Sunday. 
			//Add these inputs to your array and print the values using a for-each loop.

			//Hint: 

			//Please enter day 1 of the week
			//Sunday
			//Please enter day 2 of the week
			//Monday
			//Please enter day 3 of the week
			//Tuesday
			//Please enter day 4 of the week
			//Wednesday
			//Please enter day 5 of the week
			//Thursday
			//Please enter day 6 of the week
			//Friday
			//Please enter day 7 of the week
			//Saturday
			//Sunday Monday Tuesday Wednesday Thursday Friday Saturday
		
		
		//My solution
		String[] days=new String[7];
	    Scanner scan=new Scanner(System.in);

	    for (int i = 0; i <= 6; i++) {

            System.out.println("Please enter day " + (i + 1) + " of the week : ");
            days[i] = scan.next();

        }
        for (int x = 0; x <= 6; x++) {
            System.out.println(days[x]);
        }
        
        
        
        
        //Model Solution
        
            Scanner userInput = new Scanner(System.in);

     		String[] arr = new String[7];

     		for (int i = 0; i <arr.length; i++) {

     			System.out.println("Please enter day " + (i+1) + " of the week");
     			arr[i] = userInput.next();
     		}
     		
     		
     		for(int i=0; i<=arr.length-1; i++){
     			System.out.println(arr[i]);
     		}
     		*/
     		
            //Write a program that creates an array of integers of size 11. 
     		//Add the years 2010 to 2020 to your array one by one using a for-loop 
     		//and then print all those values

//Hint: 

/*2010
2011
2012
2013
2014
2015
2016
2017
2018
2019
2020 */
		
		//My way
		int[] array=new int[11];
     		int a;
     		for(a=2010; a<=2020; a++) {
     			
     		
     			System.out.println(a);
     		}
     		
     		//Model Solution
     		
     		 int[] years = new int[11];

     		for (int i = 0; i <=years.length-1; i++) {

     			years[i] = 2010 + i;
     		}
     		
     		
     		for (int i = 0; i <years.length; i++) {

     			System.out.println(years[i]);
     		}
}
		
	}

