package com.class10;

public class Task2 {

	public static void main(String[] args) {
		// .Create an array of names and store all names of your group. 
		//Then print your name from that array. (use 2 different ways of creating an array).

		
		
		//1st way
		
		String[] names= {"ALI","SELMA","KATE","BETH"};
		System.out.println(names[3]);
		
		
		//2nd way
		
		String[]names1;
		names1=new String[4];
		
		names1[0]="ALI";
		names1[1]="SELMA";
		names1[2]="KATE";
		names1[3]="BETH";
		
		System.out.println(names1[2]);
		
		
	}

}
