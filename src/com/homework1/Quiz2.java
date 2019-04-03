package com.homework1;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int array_variable[][] = {{ 1, 2, 3}, { 4 , 5, 6}, { 7, 8, 9}};
		int sum = 0;
		for (int i = 0; i < 3; ++i)
		for (int j = 0; j < 3 ; ++j)
		sum = sum + array_variable[i][j];
		System.out.print(sum /5);
		
		int[] array = { 1, 4, 3, 6, 8, 2, 5};
		int what = array[0];

		// scan the array
		for ( int index=0; index < array.length; index++ )
		{ 
		if ( array[ index ] > what ) 
		what = array[ index ]; 
		}
		System.out.println( what ); 
		
		int[] zip = new int[5];

		zip[0] = 7;
		zip[1] = 3;
		zip[2] = 4;
		zip[3] = 1;
		zip[4] = 9;

		System.out.println( zip[ 2 + 1 ] );
		
		

		
		
		
		
		
		int[] a = {12, 15, 11, 13, 9, 25};
		int[] a2 = {12, 15, 11, 13, 9, 25};
		int sum = 0;
		for (int i = 0; i <a.length; i++) 
		{
		if (a[i] % 2== a2[i ] % 5) 
		{
		sum += i * i;
		}
		}
		System.out.println("sum = " + sum);
		
		
		
		
		
		
		
		
		int i = 50;

		int[] a = new int[10];
		System.out.println(a.length); 

		a = new int[100]; 
		System.out.println(a.length);

		a = new int[i]; 
		System.out.println(a.length);
		
		
		
		
		if (true) {
			int[] str = {5};
			String i = "" + str[0];
			System.out.print(i);
			}
			System.out.print("-");
			{
			int[] str = {1, 2};
			System.out.print(str[1]);
			}
			System.out.print("-");
			{
			String str = "I like Java Programming Language";
			System.out.print(str);
			}
			System.out.print("-");
			{
			int str = 124;
			System.out.print(str);
			}
			
			
			
			
			
			int arr[] = new int[] {0 , 1, 2, 3, 4, 5, 6, 7, 8, 9};
			int n = 6;
			n = arr[arr[n] / 2];
			System.out.println(arr[n] / 2);
		
			
			
			char array_variable [] = new char[10];
			for (int i = 0; i < 10; ++i) 
			{
			array_variable[i] = 'i';
			System.out.print(array_variable[i] + " ");
			}
			
			
			/////////////////
			
			int array_variable[][] = {{ 1, 2, 3}, { 4 , 5, 6}, { 7, 8, 9}};
			int sum = 0;
			for (int i = 0; i < 3; ++i)
			for (int j = 0; j < 3 ; ++j)
			sum = sum + array_variable[i][j];
			System.out.print(sum / 5);
			
			
			
			
			/////////////
			
			int[] array = { 1, 4, 3, 6, 8, 2, 5};
			int what = array[0];

			// scan the array
			for ( int index=0; index < array.length; index++ )
			{ 
			if ( array[ index ] > what ) 
			what = array[ index ]; 
			}
			System.out.println( what ); 
			
			
			///////////
			int[] zip = new int[5];

			zip[0] = 7;
			zip[1] = 3;
			zip[2] = 4;
			zip[3] = 1;
			zip[4] = 9;

			System.out.println( zip[ 2 + 1 ] );

	}

}
