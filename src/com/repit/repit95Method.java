package com.repit;
//Write a method header on line two with the following specs:  
//
//Returns: a String
//Method Name: makeThreeSubstr
//Parameters:
//a String called "word"
//an integer called "startIndex"
//an integer called "endIndex"
//
//Then, starting on line 4, write code that will return 3x the substring (no spaces) from "startIndex" to "endIndex"
//
//Examples:
//makeThreeSubstr("hello",0,2) ==> "hehehe"
//makeThreeSubstr("shenanigans",3,7) ==> "naninaninani"

public class repit95Method {
	
	static	String makeThreeSubstr(String word, int startIndex,int endIndex)
		{
			for(int i=0; i<3; i++) {
				String newString=word.substring(startIndex, endIndex);
				System.out.print(newString);
			}
			return "";
			
		}
		
		//test case below (dont change):
		public static void main(String[] args){
			System.out.println(makeThreeSubstr("hello",0,2)); //should be hehehe
			System.out.println(makeThreeSubstr("shenanigans",3,7)); //should be naninaninani
		}
	}

