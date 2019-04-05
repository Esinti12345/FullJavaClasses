package com.reviewclass2;

public class FindingVovals {
	
	

	public static void main(String[] args) {
		// * create a method that shows you all the vowals in a string
//	     * output: should only show these characters a,e,i,o,u,A,E,I,O,U,
//	     * this method can have any string value you put in, but must return
//	     * all the vowals within the string
		
		String sentence="This class is  ";

		

	}
	void vowelCountWithReplaceAll() {
        String weqas="hello world my name Is wEqas";
        String replace =weqas.replaceAll("[^aA,eE,iI,oO,uU]", "");
        //String replace =string.replaceAll("[^aA,eE,iI,oO,uU]", "");

        System.out.println(replace);
    }
}
