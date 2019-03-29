package com.class11;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		
		// creating 2D array
		
		
		int[][]d=new int[4][4];//3*4=12 elements
		
		//int[] [] d={ {12,13,14,15},
		//             {1,2,3,4},
		//             {5,20,25,20},
		//             {100,200,300,400}
		//            };        one array inside an array
		
		// 1st Row
		d[0][0]=12;
		d[0][1]=13;
		d[0][2]=14;
		d[0][3]=15;
		
		//2nd Row
		d[1][0]=1;
		d[1][1]=2;
		d[1][2]=3;
		d[1][3]=4;
		
		//3rd Row
		d[2][0]=5;
		d[2][1]=10;
		d[2][2]=15;
		d[2][3]=20;
		
		//4rd Row
		d[3][0]=100;
		d[3][1]=200;
		d[3][2]=300;
		d[3][3]=400;
		
		System.out.println(d[1][2]);//3
		System.out.println(d[2][3]);//20
		
		
		
		
		int[] [] c={ {12,13,14,15},
				     {1,2,3,4},
				     {5,20,25,20},
				     {100,200,300,400}
				    }; 
		
		
		System.out.println(c[1][3]);
		
		
		
		
		String [] []  groups= {
		        {"javid", "Mustafa", "Amina","Emily", "Ahmad"},
		        {"Bilal", "Shaban","Asmit","Sasha"},
		        };
		System.out.println(groups[1][2]);
		// ilk row(index number) veriyor, ikincisi kolonu, javada indeks 0 baslar.
	

		
		
		
	}

}
