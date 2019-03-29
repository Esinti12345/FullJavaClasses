package com.class11;

public class Task2 {

	public static void main(String[] args) {
	//{Create a 2D array where you will store the following values: 
	//Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
		//After storing values print the following:
			//Mrs Smith, Mr Obama, Ms Jackson Miss Jordan

		

		String[][] names= {
				
				{"Mr","Mrs","Ms","Miss"},
				{"Smith","Jordan","Jackson","Obama"}
		};
		
		System.out.println(names[0][1]+" "+ names[1][0]);
		System.out.println(names[0][0]+" "+ names[1][3]);
		System.out.println(names[0][2]+" "+ names[1][2]);
		System.out.println(names[0][3]+" "+ names[1][1]);
		
		
		// 2nd way
		
		for (int i=0; i<names.length; i++) {
			
		}
		
		
		//Create a 2D array that first row will contain 4 names and 
		//second row will contain grades. 
		//Then you program should print name of the students that has as an A and B grade
		
		String[][] array= {
				{"Smith","Jordan","Jackson","Obama"},
				{"A","B","C","D"}
		};
		
		System.out.println(array[0][0]+" "+array[1][0]);
		System.out.println(array[0][1]+" "+array[1][1]);
		System.out.println(array[0][2]+" "+array[1][0]);
		System.out.println(array[0][3]+" "+array[1][1]);
		
	}

}
