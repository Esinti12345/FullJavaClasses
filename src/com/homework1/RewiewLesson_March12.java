package com.homework1;

public class RewiewLesson_March12 {

	public static void main(String[] args) {
		// write 

		
		
		boolean happy = true;
		int number = 0;

		while (happy) {
			System.out.println("I am feeling happy today " + number);

			// happy=false;
			if (number == 9) {
				break;
			}

			number++;
		}

		// write a program that prints decreasing from 18 to 0 multiplying by 3
		// first way
		int x = 0;
		for (x = 18; x >= 0; x -= 3) {
			System.out.println(x);
		}

		// second way
		int c = 18;

		do {
			System.out.println("Second Way " + c);
			c -= 3;
		} while (c >= 0);

		
		
		
		// Write a program that prints the String " the time is 07:min and then all the
		// min till 7.30
		
		//1st way
		
		String min = "the time is 07:";
		for (int a = 10; a <= 30; a++) {
			System.out.println(min + a);
		}
		// 2nd way

		for (int y = 01; y <= 30; y++) {
			System.out.println("the time is 07;" + y);
		}
		
		//3rd way
		
		for ( int i=0;i<=30; i++) {
			if(i<10) {
				System.out.println("The time is 7;0"+i);
			}else 
				System.out.println("The time is 7;"+i);	
		}

		//4rd way
        int t = 0;

        while (t <= 30) {
            if (t < 10) {
                System.out.println("The time is 7:0" + t+ "happy");

            } else {
                System.out.println("The time is 7:" + t);
            } 
            t++;
            }
		
		
		
	}

}
