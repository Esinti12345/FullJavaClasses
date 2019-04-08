package library;

import java.util.Scanner;

public class library01 {

	public static void main(String[] args) {
		
		
		

	}

	public int comparingNum(int x, int y) { // Comparing numbers Finding Largest One
		Scanner myScanner;
		int num1, num2;
		int largest = 0;

		myScanner = new Scanner(System.in);

		System.out.println("Please enter first number");
		num1 = myScanner.nextInt();

		System.out.println("Please enter second number");
		num2 = myScanner.nextInt();

		for (int i = 1; i <= 5; i++) {
			if (num1 > num2) {
				largest = num1;
			} else if (num2 > num1) {
				largest = num2;
			} else {
				System.out.println(num1 + " is equals to " + num2);
			}
			System.out.println(largest + " is the largest");
		}
		return largest;
	}
	
	

	public int findingSumOfLoop(int x, int y) { /* find sum of  numbers from 1 to 5 */

		int sum = 0;

		for (int i = 1; i <= 5; i++) {

			sum = sum + i;

		}

		System.out.println(sum);
		return sum;
	}
	
	
	public int findingEvenNumbersOfLoop(int x, int y) {/* find sum of all even numbers from 1 to 100 */
	
	int sum = 0;

	for (int a =1; a <= 100; a+=1) {
		if(a%2==0) {
		sum = sum + a;
		}
		}

	System.out.println(sum);
	return sum;
	
	}
	
	
	
	
//	for(int i=1; i<array.length; i++) {
//	if(array[i]<minimum) {
//		minimum=array[i];
//	}
	

}
