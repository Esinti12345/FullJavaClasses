package com.reviewclass2;

public class Task1 {

	String color;
	double size;
	int pages;
	
	
	public static void main(String[] args) {
		
		Task1 notebook=new Task1();
		notebook.color="green";
		notebook.pages=40;
		notebook.size=5.4;
	
	}

	void writing() {
		System.out.println("I can write on my Notebook");
	}
	void drawing() {
		System.out.println("I can draw on my Notebook");
	}
	void rule() {
		System.out.println("I can measure everyting with my notebook");
	}
	
	
	
}
