package com.class11;

public class Largest {

	public static void main(String[] args) {
		// 
		
		
		int[] numbers= {8,45,32,12,9,23,16,76};
		
		int largest=numbers[0]; // arrayin ilk elamanini largest ya da baska bir isimle tanimlayip
		                        //for dongusunde  her bir elemanla kiyasliyor
		                        
		
		
		for(int i=0;i<numbers.length;i++) {
			
			if(numbers[i]>largest) {
				largest=numbers[i];
			}
		
		}
		
		System.out.println("The largest number is "+largest);
		

	}

}
