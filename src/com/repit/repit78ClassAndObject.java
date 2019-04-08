package com.repit;

//Create a Class main that should be a template for the DogClass. 
//In this class you should specify the following attributes: breed, name, color 
//and following behaviors: bark(), run(), play().
//Create 3 different objects of it: Husky, Bulldog, Labrador  with specific  attributes and behaviors.
//
//The output of the program should be as following:
// 
//Husky can bark
//Husky can run
//Husky can play
//Bulldog can bark
//Bulldog can run
//Bulldog can play
//Labrador can bark
//Labrador can run
//Labrador can play

public class repit78ClassAndObject {


int breed;
String name;
String color;

	
	
	public static void main(String[] args) {
	
		repit78ClassAndObject dog=new repit78ClassAndObject();
		dog.name="Husky";
		dog.color="White";
		dog.breed=4;
		
		repit78ClassAndObject dog1=new repit78ClassAndObject();
		dog1.name="Labrador";
		dog1.color="Black";
		dog1.breed=2;
		
		repit78ClassAndObject dog2=new repit78ClassAndObject();
		dog2.name="Bulldog";
		dog2.color="Grey";
		dog2.breed=6;
	
		
		dog.bark();
		dog.run();
		dog.play();
		
		dog2.bark();
		dog2.run();
		dog2.play();
		
		dog1.bark();
		dog1.run();
		dog1.play();
		
		

	}
	
	
	
	void bark() {
		System.out.println(name + " can bark");
	}

	void run() {
		System.out.println(name + " can run");
	}
	void play() {
		System.out.println(name+ " can play");
	}
}
