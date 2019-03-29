package com.class9;

public class LoopExamples {

	public static void main(String[] args) {
		
		for ( int i=1; i<=7; i++) {
			
			for (int y=1; y<=3; y++) {
				
				for(int x=1; x<=2; x++) {
					System.out.println("Nerdeyim"+"  "+x);
				}
				
				System.out.println(y);
			}
			System.out.println(i);
		}
		

	}

}
