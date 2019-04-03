package com.class14;

public class StringManipulations {

	public static void main(String[] args) {
		// 1 replace str.replace(oldChar, newChar)

		// 1 replace()- will replace old

		String str = " I am good tester!#1";
		String newStr = str.replace("a", "e");
		System.out.println(newStr);

		String newStr1 = str.replace("good", "great");
		System.out.println(newStr1);

		// What we are looking for to replace,new value

		String newStr2 = str.replace("tester", "programmer");
		System.out.println(newStr2);

		str = str.replace("!", "?");
		System.out.println(str);

		str = str.replace("1", "2");
		System.out.println(str);

		String str1 = "12Hello 3234 World 465%^%";
		String replacedNoNumbers = str1.replaceAll("[0-9]", "");
		System.out.println(replacedNoNumbers);

		String newString = replacedNoNumbers.replaceAll("[^A-Za-z]", "");
		System.out.println(newString);
		
//		String replacedNoCharacter = replacedNoNumbers.replaceAll("[A-Za-z]", "");
//		System.out.println(replacedNoCharacter);
		
		
		String str2="1Hello123";
		System.out.println(str2.replace("[^0-9]", ""));

	}

}
