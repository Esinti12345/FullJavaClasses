package com.repit;

import java.util.Scanner;

public class repit59Arrays {

	public static void main(String[] args) {
		// Create Scanner class
/*
Write an array with size of 5. Use a loop to input values to the array. 
Then print out all the elements you have created in the first loop in reverse order. 

Input: 
1
2
3
4
5

Output:
5
4
3
2
1
*/

Scanner scan=new Scanner(System.in);
int [] arr = new int [5];  
  
for (int i = 0; i < arr.length; i++) {  
	arr[i] = scan.nextInt();
	 
}  
System.out.println();  
 
 
for (int i = arr.length-1; i >= 0; i--) {  
    System.out.print(arr[i] + " ");  
}  

	}

}
