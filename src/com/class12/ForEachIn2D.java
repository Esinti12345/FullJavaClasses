package com.class12;

public class ForEachIn2D {

	public static void main(String[] args) {
		// Create a grocery list: fruits{}
       // *                         veggies{}
       // *                         dairy{}
       // * Retrive all values using 2 different loops

		
		String[][] grocery={
			{"apple","peach","banana","orange"},
			{"Patoto","Onion","Spanich"},
			{"Chese","Milk","Butter"}
		};
		
		for (int i=0; i<grocery.length; i++) {
			for (int x=0; x<grocery[i].length; x++) {
				System.out.print(grocery[i][x]+" ");
			}
			System.out.println();
		}
		
		
		
		System.out.println("------------------");
		
		for (String[] singleArray:grocery)	{
			for(String numbers:singleArray) {
				System.out.print(numbers+" ");
			}
	System.out.println();
		}
		
		
		
	}

}
