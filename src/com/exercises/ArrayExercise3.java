package com.exercises;

public class ArrayExercise3 {
public static void main(String[]args) {
	
	
	// Aşağıdaki örnek, bileşenlerle işlem yapılabileceğini göstermektedir. 
	// Aylık ücretler ve gelir vergileri iki ayrı array ile tutulmakta, bir döngü ile
	// %30 gelir vergisi hesaplanıp konsola yazılmaktadır.	
	

double[] aylıkÜcret = new double[3];

aylıkÜcret[0] = 2782.45;

aylıkÜcret[1] = 9346.74;

aylıkÜcret[2] = 10867.83;


double[] gelirVergisi = new double[3];

for (int i = 0; i < aylıkÜcret.length; i++)

{

gelirVergisi[i] = aylıkÜcret[i] * 30 / 100;


System.out.println("Aylık " + aylıkÜcret[i] + " TL ücretin gelir vergisi = " + gelirVergisi[i]);

}	
	
	
	
///Aşağıdaki program short tipinden int tipine istemsiz dönüşüm yapılabileceğini göstermektedir


//ornek1

short[] a = { 1, 2, 3, 4 };

int[] b = { 5, 6, 262141, 8, 9 };

System.out.println("b[2] = " + b[2]);

b[2] = a[3];

System.out.println("b[2] = " + b[2]);
	
	
	
//ornek2	

short[] x = { 1, 2, 3, 4 };

int[] y = { 5, 6, 262141, 8, 9 };

System.out.println("x[3] = " + x[3]);

x[3] = (short)y[2];

System.out.println("x[3] = " + x[3]);

	


//

int[] arr = { 11, 12, 13, 14, 15, 16, -21, -11, 0 };


for (int i : arr)

{

System.out.print(i + " \t " );

}





	
	
}
}
