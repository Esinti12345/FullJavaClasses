package com.repit;

public class Repit70And71Strings {

	public static void main(String[] args) {
		// 70. Validate if the string ends with "u" prints the Boolean value accordingly
		// Validate if the string ends with "world" prints the Boolean value accordingly
		// Validate if the string ends with "are" prints the Boolean value accordingly
		// Validate if the string ends with "you" prints the Boolean value accordingly
		String str = "abracadabra alakazam";
		String target1 = "dab";
		String target2 = "ABRA";

		int index = str.indexOf("c");
		System.out.println(index);
		int index1 = str.indexOf(" ");
		System.out.println(index1);
		int index2 = str.indexOf("dab");
		System.out.println(index2);
		int index3 = str.indexOf("ABRA");
		System.out.println(index3);

		// Model Solution

		System.out.println(str.indexOf("c"));
		System.out.println(str.indexOf(" "));
		System.out.println(str.indexOf(target1));
		System.out.println(str.indexOf(target2));

		System.out.println("----------71.Replit---------");
		// 71.For you to do:

//(all output should be one per line)

//Output 1: print str starting at index 5 and going to the end
//Output 2:  print str starting at index 7 and ending at index 10
//Output 3: print "harambe" this must not be a new string must be from str
//Output 4: print "t f" this must not be a new string must be from str on one line

		String str1 = "laptops out for harambe";
		System.out.println(str1.substring(5, 23));
		System.out.println(str1.substring(7, 10));
		System.out.println(str1.substring(16, 23));
		System.out.println(str1.substring(10, 13));

	}

}
