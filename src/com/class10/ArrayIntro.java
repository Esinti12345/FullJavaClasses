package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		num=10; // int num=10;
		
		int[] array1; //declare an array --> preferred way
		int[] array2; //declare an array
		int array3[]; //declare an array
		
		
		
		array1=new int [4]; // initialize, create an array
		
		//assigning value
		array1[0]=10;
		array1[1]=20;
		array1[2]=30;
		array1[3]=40;
		
		//access values
		
		System.out.println(array1[0]); // change the number into the array then see the difference.
		
		
		
		int []  numbers=new int[3];
		numbers[0]=5;
		numbers[1]=10;
		numbers[2]=15;
	    // numbers[3]=20; no error during complication but error during run time
	    
		//System.out.println(numbers[3]); // ArrayIndexOutOfBoundsException
		
		System.out.println(numbers[2]/numbers[0]);
		
		
		String[] a=new String [3];
		a[0]="Hello";
		a[1]="Hi";
		a[2]="Bye";
		
		System.out.println(a[1]+ " friends");

	}

}
