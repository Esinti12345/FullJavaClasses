package com.class5;

public class LogicalOr {

	public static void main(String[] args) {
		
		int day=3;
		
		if(day==1 || day==2 || day==3|| day==4 || day==5) {
			System.out.println("It is week");
		}else if(day==6 || day==7) {
			System.out.println("it is weekend");
		}else {
			System.out.println("it is nothing");
		}
	
	}

}
