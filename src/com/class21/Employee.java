package com.class21;
//Create a Class called Employee:
//Create three  variables  eID , salary and set the CEO to “Sumair”
//Create two objects of the class Employee
//Set the value of eID, salary for each of the objects
//Print out the eID , salary and  CEO for each of the objects

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
