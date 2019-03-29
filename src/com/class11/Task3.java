package com.class11;

public class Task3 {

	public static void main(String[] args) {
		// Create an array of cars : 
		//american, german, korean, italian. Then retrieve all values from that array


		String [] countryNames= {"America","Germany","Japan","Italy"};
		String[][] cars= {
				{"Ford","Chevrolet","Jeep"},
				{"Mercedes","BMW","Wolswagen","Audi"},
				{"Kia","Hydandi","Daewoo"},
				{"Ferrari","Lamborgini"}
		};
		
		
		for (int i=0; i<cars.length; i++) {
			 System.out.println("This is a list of cars made in "+countryNames[i]+" :");
			for (int j=0; j<cars[i].length; j++) {
				System.out.print(cars[i][j]+" ");
			}
			System.out.println();
		}
		
		
		//Create an array of countries: north america countries, south america countries, 
		//europe countries, asian countries, african countries. 
		//Then print all values from that array.
		
		System.out.println("--------------------");
		String[][] countries= {
				{"Canada","Mexico","ABD"},
				{"Brezil","Columbia","Venezula","Chile"},
					{"Tahiland","Vietnam","japan","Korean"},
				{"Sudan","Kenya","Tanzania","Angola","South Africa"}
				};
		
		for (int i=0; i<countries.length; i++) {
			for(int x=0; x<countries[i].length; x++) {
				System.out.print(countries[i][x]+" , ");
			}
			System.out.println();
		}
		
		
		

	}

}
