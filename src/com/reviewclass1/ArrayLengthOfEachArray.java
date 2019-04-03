package com.reviewclass1;

public class ArrayLengthOfEachArray {

	public static void main(String[] args) {
		
		
		// Finding the each row length.
		
		
int [][] arr= {{1,2,3},{4,5,6,9},{7,8,9}};

System.out.println(arr[0].length);
System.out.println(arr[1].length);
System.out.println(arr[2].length);




for(int i=0; i<arr.length; i++) {
	                                     // we could write only i.If it was so 
	                                    //it would show index number of row.
	                                    //adding 1 shows the number of row not the index number.
	System.out.println("The length of row "+ (i+1) + " = "+ arr[i].length);
}


System.out.println("------//3rd way-------");

for(int[] inner:arr) {
	System.out.println("The length of row = "+ inner.length);
}

	}

}
