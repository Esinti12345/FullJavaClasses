package com.class20;
//Create a method that will take a String and return whether 
//String is palindrome or not. 
//Method should available to all classes within your projects.

public class AccessModifiers1 {

	public static void main(String[] args) {
		AccessModifiers1 obj=new AccessModifiers1();
		obj.reverseString(str);
		
	}
	
	protected String reverseString(String str) {
		String reversed="";
		for(int i=str.length()-1; i>=0; i--) {
		
			reversed=reversed+str.charAt(i);
		}
		return reversed;
	}
	
	
	
	
	
	
	
	
//	public static void main(String[] args) {
//		
//		AccessModifiers1 obj=new AccessModifiers1();
//	}
//	
//	
//	public boolean isPalindrome(String str) {
//		
//		String reversed="";
//		//boolean flag=false; --> bu durumda else kismina gerek kalmaz. return true yerine flag=true; demelisin.
//		for(int i=str.length()-1; i>=0; i--) {
//			reversed=reversed+str.charAt(i);	
//		}
//		if (reversed.equalsIgnoreCase(str)) {
//			return true;
//		}//else {
//		
//		{return false;
//		}
//		return reversed;
//	}
}
