package com.class11;

public class Task3AlternativeAnswer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] countries= {
				{"Canada","Mexico","ABD"},
				{"Brezil","Columbia","Venezula","Chile"},
					{"Tahiland","Vietnam","japan","Korean"},
				{"Sudan","Kenya","Tanzania","Angola","South Africa"}
				};
		
		for(String[]rows:countries) {
			for (String country:rows) {
				System.out.print(country+" ");
			}
			System.out.println();
		}
		
		
	}

}
