package com.class21;
//Create a Class called Students
//Create three  variables  studentName , studentID  and  numberOfStudents
//Create three objects of the Students Class
//Set the value for  studentName , studentID and increment  the numberOfStudents for each object
//Print out  total number of students

public class Students {
	
	String studentName;
	int studentID;
	public static int numbersOfStudents;

	public static void main(String[] args) {
		
		Students std1=new Students();
		Students std2=new Students();
		Students std3=new Students();
		
		std1.studentID=123;
		std1.studentName="Bugrahan";
		std1.numbersOfStudents++;
		
		std2.studentID=456;
		std2.studentName="Ali";
		std2.numbersOfStudents++;
		
		std3.studentID=321;
		std3.studentName="Yusuf";
		std3.numbersOfStudents++;
		
		System.out.println("Total number of students is "+numbersOfStudents);
		
		

	}

}
