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
    	
    	phone2.touchscreen=true;
        phone2.screen=5.8;
        phone2.memory=256;
        phone2.brand="Android";
        
        phone2.watchMovie();
        phone2.sendMessaje();
        phone2.playMusic();
       
        
	Phones phone3=new Phones();
    	
    	phone3.touchscreen=false;
        phone3.screen=5.8;
        phone3.memory=128;
        phone3.brand="Nokia";
        
        phone3.watchMovie();
        phone3.sendMessaje();
        phone3.playMusic();
  
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
