package com.class5;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int quiz;
		int midTerm;
		int finalScores;
		int averageScore;
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Write your Quiz Score");
		quiz=input.nextInt();
		System.out.println("Write your midterm Score");
		midTerm=input.nextInt();
		System.out.println("Write your FinalScore");
		finalScores=input.nextInt();
		
		
		averageScore=(quiz+midTerm+finalScores)/3;
		
		
		
		if (averageScore>=90) {
			System.out.println("your score grade A");
		}else if (averageScore >=70 && averageScore<=90) {
			System.out.println("your score grade B");
		}else if (averageScore >=50 && averageScore<=70) {
			System.out.println("your score grade c");
		} else if(averageScore <50 ) {
			
		}
		
		
		
	}

}
