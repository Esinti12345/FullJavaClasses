package com.class5;

import java.util.Scanner;

public class HomeworkToSunday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	Scanner input = new Scanner(System.in);
        System.out.println("Please input 3 integers: ");
        int x = Integer.parseInt(input.nextLine());
        int y = Integer.parseInt(input.nextLine());
        int z = Integer.parseInt(input.nextLine());
        int max = Math.max(x,y);
        
        
        if(max>y){ //suppose x is max then compare x with z to find max number
            max = Math.max(x,z);    
        }
        else{ //if y is max then compare y with z to find max number
            max = Math.max(y,z);    
        }
        System.out.println("The max of three is: " + max);
		*/
		
		
		
		
		double a;
		double b;
		double c;
		Scanner input;
		
		input=new Scanner(System.in);
		System.out.println("Please enter 3 numbers");
		a=input.nextDouble();
		b=input.nextDouble();
		c=input.nextDouble();
		
		System.out.println("The largest number of the three numbers is " + Math.max(a,b));
	
	}

}
