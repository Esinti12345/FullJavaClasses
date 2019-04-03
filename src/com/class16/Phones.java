package com.class16;

public class Phones {

	
	String brand,color;
    boolean touchscreen;
    int memory;
    double screen;

	public static void main(String[] args) {
		
		
		Phones phone1=new Phones();
    	
    	phone1.touchscreen=true;
        phone1.screen=5.8;
        phone1.memory=128;
        phone1.brand="Iphone";
        
        phone1.watchMovie();
        phone1.sendMessaje();
        phone1.playMusic();
       
	Phones phone2=new Phones();
    	
    	phone1.touchscreen=true;
        phone1.screen=5.8;
        phone1.memory=256;
        phone1.brand="Android";
        
        phone1.watchMovie();
        phone1.sendMessaje();
        phone1.playMusic();
       
        
	Phones phone3=new Phones();
    	
    	phone1.touchscreen=false;
        phone1.screen=5.8;
        phone1.memory=128;
        phone1.brand="Nokia";
        
        phone1.watchMovie();
        phone1.sendMessaje();
        phone1.playMusic();
  
	}
	
	void watchMovie() {
    	System.out.println("We can watch movie on a phone "+brand);
    }
	
	void sendMessaje() {
		System.out.println("We can send messaje from "+brand);
	}
	
	void playMusic() {
		System.out.println("We can play music on my phone "+brand);
	}
	
}
