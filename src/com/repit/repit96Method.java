package com.repit;

//Write a method header on line two with the following specs:  
//
//Returns: a String
//Method Name: mixString
//Parameters:
//a String called s1
//a String called s2
//
//Then, starting on line 4, write code that will return the strings combined, 
//one letter at a time, starting with s1.  See example below for an example.  
//You can assume that s1 and s2 are equal lengths:
//s1 ==> "12345"
//s2 ==> "abcde"
//mixString(s1,s2) ==> "1a2b3c4d5e"

public class repit96Method {

	static String mixString(String s1, String s2) {
		
		repit96Method str=new repit96Method();
		
		String opposite="";
		
		for(int i=0; i<s1.length(); i++) {
			String[] a1=new String[s1.length()];
			a1[i]=s1.substring(i,i+1);
			String[] b1=new String[s2.length()];
			b1[i]=s2.substring(i,i+1);
			
			opposite+=(a1[i]+b1[i]);
		}
		return opposite;
		
	}
	
	//Model Solution 
//	public static String mixString(String s1,String s2)
//	{
//		String mixString="";
//		for (int i = 0; i < s1.length(); i++) {
//			mixString = mixString + s1.charAt(i) + s2.charAt(i);
//		}
//		return mixString;
//	}
//	


	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(mixString("12345","abcde")); //should be 1a2b3c4d5e
		System.out.println(mixString("howdy","hello")); //should be hhoewldlyo
	}
	
	
	
}
