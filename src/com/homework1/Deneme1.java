package com.homework1;

import java.util.Scanner;

public class Deneme1 {

	public static void main(String[] args) {
		
		
		
		 Scanner scan;
		    String name;
		    String Respon;
		    
		    scan=new Scanner(System.in);
		    System.out.println("enter name of the instuctor");
		    name=scan.nextLine();
		    
		    switch(name){
		      
		       
		        case "Shiva":
		            Respon="Will take care of Java Assignment";
		            break;
		            
		             case "Sandish":
		            Respon="Will take care of SDLC Assignment";
		            break;
		            
		             case "Wegas":
		            Respon="Will take care of Selenium Assignment";
		            break;
		            
		             case "Asel":
		            Respon="Will take care of every Assignment";
		            break;
		            
		      
		    
		            
		      
		    }
		
		    for (int a=1; a<100; a+=2) {
				System.out.println(a);
			}
			
		
		
	}

}
