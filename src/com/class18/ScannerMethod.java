package com.class18;

import java.util.Scanner;

public class ScannerMethod {

	public static void main(String[] args) {
		
	ScannerMethod obj=new ScannerMethod();
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter two numbers");
	
	
	int a=scan.nextInt();
	int b=scan.nextInt();
	
	int x = obj.sum(a, b);
	
	
	
	//int c=obj.sum(a, b); --> try to put c into println and see the result. 
	//System.out.println(obj.sum(a, b));
	
//  obj.sum(12, 13);
//	obj.sum(100, 100);
//	
//	obj.sub();
//	obj.sub();
	
	
	}
	public int sum(int x,int y) {      //try void instead of int --> see the difference
		
		//System.out.println(x+y);
		return x+y;
	}
	
	
	void sub() {
		int a=10,b=50;
		System.out.println(b-a);
	}

}
