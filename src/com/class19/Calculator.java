package com.class19;

//    Let’s create a class called Calculator
//
//    Have methods that take three inputs and return the result
//
//    and return the sum, average, min and max

public class Calculator {
	
	static int sum(int a, int b,int c) {
		int sum = a+b+c;
		//System.out.println(sum);
		return sum;
	}
	
	
	 double average(int a, int b, int c) {
		int average=(a+b+c)/3;
		//System.out.println(average);
		return average;
		
	}
	
	static int minimum (int a,int b, int c) {
		int min;
		if(a<b) {
			min=a;
		}else {
			min=b;
		}
		if(min>c) {
			min=c;
		}
		return min;
	}
	
	static int maximum(int a,int b,int c) {
		int max=a;
		if(b>a) {
			max=b;
		}if(c>max) {
			max=c;
		}
		return max;
	}

}
