package com.class7;

public class Task2 {

	public static void main(String[] args) {
		// create a boolean variable workDay and assign true
	   // * create int variable day and assign it to 1
	   // * as long as it is workDay print--> "I need a day off" and increment day
	    //* day once day is 6 --> your condition for your loop should become false

	
	boolean workDay=true;
	
	int day=6;
	
	while(workDay) {
		if(day < 6) {
			System.out.println("I need a day off");		
			day++;
		}
		else {
			workDay=false;
	}
	}
	
	/*
	 * boolean workDay=true;
	 * int day=6;
	 * while(workDay){
	 * System.out.println("I need a day off");	
	 * if(day==6) {
	 * System.out.println("I DO NOT need a day off");
	 * workDay=false;
	 * }
	 * day++	
	 */
	
	
	}

}
