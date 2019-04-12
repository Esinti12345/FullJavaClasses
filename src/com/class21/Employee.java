package com.class21;

public class Employee {
	
	String eID;
	int salary;
	static String ceo="Sumair";
	
	public void Print() {
		System.out.println("CEO of company is "+ceo+" has an employee who is "+eID+" makes "
	                        +salary+" salary per a month");
	}

	public static void main(String[] args) {
	
		Employee Emp1=new Employee();
		Emp1.eID="Maria";
		Emp1.salary=6500;
	
		
		Employee Emp2=new Employee();
	    Emp2.eID="John";
		Emp2.salary=4500;
		
		Emp1.Print();
		Emp2.Print();

	}

}
