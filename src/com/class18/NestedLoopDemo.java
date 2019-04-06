package com.class18;

public class NestedLoopDemo {

	public static void main(String[] args) {
	
	
		
		//printPattern();
		printPattern(10, 20);
	

	}

	public static void printPattern() {
		for (int i = 0; i <=3; i++) {
			
			for (int y = 0; y <=3; y++) {
				
				System.out.println(i+" "+y);
			}
			
		}
		

		for (int i = 1; i <= 7; i++) {

			for (int y = 1; y <= 7; y++) {
				System.out.print(i);// 1111111 //2222222
			}
			System.out.println();
		}
	}
	
	private static void printPattern(int a, int b) {
		for (int i = 0; i <=a; i++) {
			
			for (int y = 0; y <=3; y++) {
				
				System.out.println(i+" "+y);
			}
			
		}
		

		for (int i = 1; i <= b; i++) {

			for (int y = 1; y <= 7; y++) {
				System.out.print(i);// 1111111 //2222222
			}
			System.out.println();
		}
	}
	

}
