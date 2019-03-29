package com.exercises;

public class incredentDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5;

		a = a + 1;// a+=1; a++;  are the same thing.

		a *= 5; // a=a*5; are the same thing

		System.out.println("A'nin degeri " + a);
		System.out.println("************");
		
		int x=10;
		
		System.out.println("X'nin degeri " + x--);
		System.out.println("X'nin degeri " + x);
		
		System.out.println("************");
		
		System.out.println("X'nin degeri " + --x);
		System.out.println("X'nin degeri " + x);
		

	}

}
