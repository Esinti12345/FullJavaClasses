package com.class14;

public class Task1 {

	public static void main(String[] args) {
		// Create a String that will hold a sentence. Write a program to get a new String without any spaces.

		
	String str= "What we are doing is all learning"	;
	String[] array=str.split(" ");
	String second = "";
	

	for(int i=0;i<array.length; i++) {
		System.out.println(array[i]);
		second +=array[i];
	}
	System.out.println(second);	
	
	second = "";
	
	second = str.replace(" ", "");
	System.out.println("----------");
	System.out.println(second);
	
// 2.Question  -->//Create a String that should be combination of letters, numbers and special characters. 
	//Find out how many alpha characters are there in the String.
	
	
	String newString="Tell me what you want from 23 Question %#@!?";
	
	String newer=newString.replaceAll("[^A-Za-z]", "");
	System.out.println("Numbers of alpha character is "+newer.length());
	
//3.Question --> //You have a String a=“Is it saturday! Is it raining! 
	//Do we have a Java Class today?” How would you find out how many sentences are in that String?	
	
	
	String sentences= "Is it saturday! Is it raining! Do we have a Java Class today?";
	String[] array1=sentences.split("\\?");
	String print="";
	
	for(int i=0; i<array1.length; i++) {
		System.out.println(array1.length);	
		
	}
	
	
	
	
	
	}
}
