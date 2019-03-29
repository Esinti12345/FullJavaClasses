package com.class5;

import java.util.Scanner;

public class Tasks {

	public static void main(String[] args) {
		
		int man1=260;
		int man2=370;
		double height1=man1/12;
		double height2=man2/12;
		
		
		
		if(height1<=5 ) {
			System.out.println(height1 + " you are short");
		}else if(height1>=5 || height1<=6) {
			System.out.println(height1 +" you are medium");
		}else if (height1 >=6) {
			System.out.println(height1 + "you are tall");
		}else {
			System.out.println(height1 + "it is not between our range");
		}
		
		
	/*	if(height2<=5) {
			System.out.println(height2 +" you are short");
		}else if(height2>=5 || height2<=6) {
			System.out.println(height2 +" you are medium");
		}else if (height2 >=6) {
			System.out.println(height2+" you are tall");
		}else {
			System.out.println(height2+" it is not between our range");
		}
		*/

	}

}
