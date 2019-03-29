package com.homework1;

public class QuizExamples {

	public static void main(String[] args) {
	//	What is the start point of the loop?
		
		
		double discount;
		char code = 'C' ;

		switch ( code )
		{
		case 'A':
		discount = 0.0;
		break;

		case 'B':
		discount = 0.1;
		break;

		case 'C':
		discount = 0.2;
		break;
		
		default:
		discount = 0.3;
		}
		System.out.println(discount);
		/*
		
		
		int m=2, total=0;

		while(m<6) {

		   total=total+m;

		   m++;

		}

		System.out.print(total);
		
		
		for(int x=20; x<40; x=x+3)   {        

				   System.out.println(x);

				}
		
		
		
		
		int m=2, total=0;

		while(m<6) {

		   total=total+m;

		   m++;

		}

		System.out.print(total);
		
		
		
		
		
		
		
		*/
	}

}
