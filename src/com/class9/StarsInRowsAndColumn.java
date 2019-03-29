package com.class9;

public class StarsInRowsAndColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * for (int i=0; i<=3; i++) { for(int a=0; a<=i; a++) { System.out.print("*"); }
		 * System.out.println(); }
		 */

		for (int i = 1; i <= 4; i++) {

			for (int a = 1; a <= 6; a++) {

				if (i == 1 || i == 4 || a == 1 || a == 6) {
					System.out.print("*");
				} else {

					System.out.print(" ");
				}
				
			}
			System.out.println();
		}

	}

}
