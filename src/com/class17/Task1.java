package com.class17;

public class Task1 {

	public static void main(String[] args) {
		// Create a method that will take 2 parameters as a numbers and prints which number is larger.

//Create a method that will take a number and prints whether the number is even or odd.
//
//Create a method that will print whether given String is palindrome or not.
		System.out.println("-----Q 1----");
		Task1 obj =new Task1();
		obj.largest(67, 62);	
		
		System.out.println("-----Q 2----");
		Task1 number=new Task1();
		number.findingEvenAndOdd(81);
		
		System.out.println("-----Q 3----");
		Task1 x=new Task1();
		x.palindrome("Daddy cady");
	}
		
		void largest(int a, int b) {
			
			if(a>b) {
				System.out.println(a+" is larger than " + b);
			}else {
				System.out.println(b+" is larger than "+a);
			}	
		
	}
	
		void findingEvenAndOdd(int a) {
		    if(a%2==0)System.out.println(a+" is even");
	        else System.out.println(a+" is odd");
	    }
	    
	        
		void palindrome(String text) {
	        String reverse="";
	        for(int i=text.length()-1;i>=0;i--) {
	            reverse=reverse+text.charAt(i);
	        }
	        if(reverse.equals(text))System.out.println("Palindrom");
	        else System.out.println("Not palindrom");
	        
	    }
	
}
