package com.class3;

public class Modulus {

	public static void main(String[] args) {

		int a = 10;
		int b = 3;
		int div = a / b;

		System.out.println(div); // 3 or 3.3

		// modulus operator
		int mod = a % b;
		System.out.println(mod);

		int q = 23;
		int w = 11;

		System.out.println(q % w); // bolmeden kalani gosteriyor

		// parentheses' exponents'multiplication/division' addition/subtraction

		int e = -5 + 4 * 6;
		System.out.println(e); // 19

		int x = (22 + 9) % 7;
		System.out.println(x); // 3

		int y = 20 + -3 + 5 / 8;
		System.out.println(y);

		int z = 5 + 15 / 3 * 2 - 8 % 3; // (5+10-2) //bu islemlerde bolme ve carpa oncelikli olmasina ragmen burada once bolme 
		                                           //islemini yapiyoruz. neden? java soldan saga dogru okudugu icin 
		                                           //once bolme islemini yapiyoruz sonrasinda carpmayi yapiyoruz.
		                                           //8 i 3 e boldugumuzde 2 kalan % isaretinin ifadesidir 

		
		System.out.println(z);
		
	

	}

}
