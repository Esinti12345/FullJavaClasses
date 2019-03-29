package com.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercise {

	public static void main(String[] args) {
		// a) Write a statement that declares a string array initialized with the following strings:
		//	"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" and "Saturday".
		//	b) Write a loop that displays the contents of each element in the array that you declared.
		
	/*
	 * 	String [] days= {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		
		for (String day : days)
		 {
		    System.out.println(day);
		 }
		
		
		//Write a program that creates an array of 10 elements size. 
		//Your program should prompt the user to input numbers in array 
		//and then display the sum of all array elements.
		
		 final int SIZE = 10;

	      // Create an array to hold numbers.
	      int[] numbers = new int[SIZE];

	      Scanner console = new Scanner(System.in);
	      System.out.println("Enter " + SIZE + " numbers.");

	      // Get employees' salary.
	      for (int i = 0; i < SIZE; i++)
	      {
	         numbers[i] = console.nextInt();
	      }

	      int sum = 0;

	      // Calculate the sum.
	      for (int i = 0; i < SIZE; i++)
	      {
	         sum += numbers[i];
	      }
	      
	      System.out.println("Sum of numbers: " + sum);
	      
	    
		
	      
	      //The variable list1 and list2 are reference arrays that each have 5 elements.
	      //Write code that copies the values in list1 to list2. Values in list1 are input by user.
	      
 
	       
	    
	     final int SIZE = 5;

	      int[] list1 = new int[SIZE];
	      int[] list2 = new int[SIZE];

	      Scanner console = new Scanner(System.in);
	      System.out.println("Enter " + SIZE + " numbers.");

	      // Get value in list1
	      for (int i = 0; i < SIZE; i++)
	      {
	          list1[i] = console.nextInt();
	      }

	      // Copy elements in list2.
	      for (int i = 0; i < SIZE; i++)
	      {
	          list2[i] = list1[i];
	      }
	      
	      // Display elements of list2.
	      System.out.println("Elements of list2 are: ");
	      for (int i = 0; i < SIZE; i++)
	      {
	          System.out.println(list2[i]);
	      }
	      
	      
	      
	      //length
	      String[] meyve = {"elma", "çilek", "kiraz"};

	      int arrayUzunluğu = meyve.length;

	      System.out.format("Bileşen sayısı: %d ", arrayUzunluğu);
	      
	       */
	      
	      //bir döngü ile array bileşenlerinin bazılarına değer atanmaktadır. 
		//Sonra başka bir döngü ile bütün bileşenlerin değerleri konsola yazdırılmaktadır. 
		//Değer atanmamış bileşenlerin (default) değerlerinin 0 olduğuna dikkat ediniz
	      
		
		//ornek1
	      int[] çarpan = new int[10];

	      for (int i = 6; i < 10; i++)

	      {

	      çarpan[i] = i * i;

	      }

	      for (int i = 0; i < 10; i++)

	      {

	      System.out.print(çarpan[i]);

	      System.out.print("\t");
	      
	      }
	      
	      
	     //ornek2 
	      
	      int[] intSayı = new int[5];

	      for (int i = 0; i < intSayı.length; i++)

	      intSayı[i] = i * 10;

	      for (int i = 0; i < intSayı.length; i++)

	      System.out.println("intSayı[" + i + "] = " + intSayı[i]);
	      
	      
	    //  
	      
	      
	      
	      
	      
	      

	}

}
