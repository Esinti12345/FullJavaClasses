package com.class9;

public class NestedLoop {

	public static void main(String[] args) {
		
		

		for (int i = 0; i < 3; i++) {
			System.out.println(i);
			for (int y = 0; y < 3; y++) {
				System.out.println(y);
			}
		}
		
		
		for (int i = 0; i < 3; i++) {
			System.out.println("------ I am outer loop ------"+i);
			for (int y = 0; y < 3; y++) {
				System.out.println("I am inner loop"+y);
			}
		}
		
		
		//pay attention to  outer loop is between two bracelet
		
		for (int i = 0; i < 3; i++) {
			
			for (int y = 0; y < 3; y++) {
				System.out.println("I am inner loop"+y);
			}
			
			System.out.println("------ I am outer loop ------"+i);
		}
		
		
		
		
		
		
	}

}
