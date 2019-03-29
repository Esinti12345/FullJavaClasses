package com.class7;

public class Task1 {

	public static void main(String[] args) {
		// Asel Umurzakova (Instructor) [10:56 AM]
		/* 1. Declare variable and increase by 100 using shorthand operator
        * 2. Declare variable and decrease by 67 using shorthand operator
        * 3. Declare variable cakePiece=11 and divide cakePiece between 4 people using shorthand operator
        * each person should get an equal piece of cake
        *
        * 4. Declare variable cakePiece=25 and divide cakePiece between 7 people
        * using shorthand operator found out how many pieces of cake left after it was distributed equally among 7 people
        */
		
		
		int a=10;
		
		a+=100;
		
		a-=67;
		System.out.println(a);
		
		
		double cakePiece=11;
		cakePiece/=4;
		System.out.println("Every person got " + cakePiece);
		
		
		
		double cakePiece1=25;
		cakePiece1/=7;
		cakePiece1%=7;
		System.out.println(cakePiece1);
		
		
		
		
		
	}

}
