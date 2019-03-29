package com.homework1;

public class Deneme3 {

	public static void main(String[] args) {

		for (int i = 5; i < 22; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

	

		for (int i = 1; i < 20; i++) {

			System.out.println("carpim" + 3 * i);

		}
/*
 * Write a program that use for loop to print multiples of 3 between 1 and 20.

Must not include the number 20 in the output 

Hint :
3*1=3 3*2=6 3*3=9 3*4=12 3*5=15 3*6=18

Output: 
3 6 9 12 15 18

 */
		//way1
		
		for (int i = 1; i <= 6; i++) {
			System.out.print(i * 3 + " ");
		}
//way2
		for(int i=1; i<20;i++ ) {
	    	if(i%3==0) 
	    	 System.out.println(i);
	    	} 
	}

}
