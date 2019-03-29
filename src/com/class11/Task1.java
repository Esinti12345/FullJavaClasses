package com.class11;

public class Task1 {

	public static void main(String[] args) {
		// Create an array of cars and store 6 elements into it.
		// Using 2 different loops print all values from the array.




		
		String[] cars= {"Toyota","Mercedes","Lamborgini","Nissan","BMW","Volvo"};
		
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
		
		
		for(String names:cars) {
			System.out.println(names);
		}
		
		
		
	//Create an array on integers and calculate the sum of all elements in an array.
		
		int[] numbers= { 3,4,6,2,9,8,5};
		
		int sum=0;
		for(int i=0;i<numbers.length; i++) {
			
			sum=sum+numbers[i];		
		}
		
		System.out.println(sum);
		
		
		
		//Create an array of countries. While retrieving all values from an array print 
				// capital for each country. (use 2 different loops).	
		
		
		  String[] country= {"Turkey", "USA", "Russia","England"};
	        String[] capital1= {"Ankara", "Washington","Moscova","London"};
	        String capital = "";
	        for(int i=0; i<country.length; i++) {
	            switch(country[i]) {
	            case "Turkey":
	                capital = "Ankara";
	                break;
	            case "USA":
	                capital = "Washington";
	                break;
	            case "Russia":
	                capital = "Moscova";
	                break;
	            case "England":
	                capital = "London";
	                break;
	            default:
	                capital = "Wrong input.";
	            }
	            System.out.println(country[i]+" - "+capital);
	    
	        }
			
			
			
	
		
		
	}

}
