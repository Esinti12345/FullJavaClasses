package com.homework1;

	
	import java.util.Scanner;
	class Denemeler2  {
	public static void main(String[] args){
	  
	 boolean isTrue=true;
		Scanner input=new Scanner(System.in);
		System.out.println("Is it weekend?");
		
		
		
		
		int day=4 ;
		// false OR false OR false OR false Or True -->true
		if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5) {
			System.out.println("It is a weekday");
			// false OR false -->False
		} else if (day == 6 || day == 7) {
			System.out.println("It is a weekend");
		} else {
			System.out.println("Not a valid day");
	  
	}
	}
	}
	
	
	

