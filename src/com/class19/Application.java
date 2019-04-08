package com.class19;

public class Application {


	    public static void main(String[] args) {
	    	
	        Human person1=new Human();
	        person1.eyeColor="Pink";
	        person1.name="Hacer";
	      //  person1.print();
	        
	        
	        System.out.println(person1.eyeColor);
	        System.out.println(person1.height);
	        System.out.println(person1.weight);
	        System.out.println(person1.gender);
	        
	        
	Human person2=new Human();
	person2.eyeColor="Orange";
	//person2.name="Esin";
	System.out.println("instance "+person1.eyeColor+" "+person2.eyeColor);
	System.out.println("Class-static"+person1.name+" "+person2.name);
//	person2.print();
	        
	        System.out.println(person1.eyeColor);
	        System.out.println(person1.height);
	        System.out.println(person1.weight);
	        System.out.println(person1.gender);
	    }

	}
	
	


