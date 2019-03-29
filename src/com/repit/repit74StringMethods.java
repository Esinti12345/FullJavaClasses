package com.repit;

import java.util.Scanner;

public class repit74StringMethods {

	public static void main(String[] args) {
		// For you to do:
/*
If language is Java
It should print the 
Java is a programming language.
If language is C
It should print the 
C is a procedural programming language
If language is C++
It should print the 
C++ is a middle-level programming language
If any other should print 
Doesn't match any programming language
*/
				   boolean flag=true;
			 Scanner sc = new Scanner(System.in); 
		  System.out.println("Enter any programming language");
		   String language = sc.nextLine(); 
		   
		   /* My way didnt work C++ line.
		       
		   if(flag==language.contains("Java")) {
			   System.out.println("Java is a programming language");
		   }else if(flag==language.contains("C")){
			   System.out.println("C is a procedural programming language");   
		   }else if (flag==language.contains("C++")){
			   System.out.println("C++ is a middle-level programming language"); 
		   } else {
				   System.out.println("Doesn't match any programming language");
			   }
		   */
		   
		   
		  // second way
		
		
		  String lang1="Java";
	        String lang2="C";
	        String lang3="C++";
	        String message;
			
		   if (lang1.equals(language)) {
               message="Java is a programming language";
           }else if (lang2.equals(language)){
               message="C is a procedural programming language";
              
           }else if (lang3.equals(language)) {
               message="C++ is a middle-level programming language";
           }else {
               message="Doesn't match any programming language";
           }System.out.println(message);
        
      
		 
           // Model Solution
           
           if(language.equals("Java"))
           {
               System.out.println("Java is a programming language.");
           }
           else if(language.equals("C"))
           {
               System.out.println("C is a procedural programming language");
           }
             else if(language.equals("C++"))
           {
               System.out.println("C++ is a middle-level programming language");
           }
           else
           {
               System.out.println("Doesn't match any programming language");
           }

		   
		   
		   
		   
			   }
	
	}


