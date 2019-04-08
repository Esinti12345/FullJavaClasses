package com.class19;

public class Applications2 {

	public static void main(String[] args) {
		
		Calculator calc=new Calculator();
	       int result=calc.sum(12, 13, 14);
			System.out.println(result);
			
			
			//System.out.println(Calculator.average(65, 4, 12));
			
			Calculator obj=new Calculator();
			System.out.println(obj.average(6, 9, 3));

	}

}
