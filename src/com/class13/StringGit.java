package com.class13;

public class StringGit {

	public static void main(String[] args) {
		// Create a String and print it in reverse order (Sunday → yadnuS).

//Create a String and if the String is not empty perform the following: 
//	if the String has an odd number of characters and has 3 or more characters, 
//	print the character in the middle of the String
		
		
		String day="Sunday";
		for(int i=day.length()-1; i>=0; i--) {
		
			System.out.print(day.charAt(i));
		}
		
		
		String some="Transformation";

		
	if (!some.isEmpty()) {
		if(some.length()%2==1 && some.length()>=3)
			System.out.println(some.charAt(some.length())/2);
			
		}
		

	}

}
