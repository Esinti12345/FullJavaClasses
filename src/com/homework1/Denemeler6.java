package com.homework1;
import java.util.Scanner;
public class Denemeler6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 boolean thirsty;
		    boolean sleepy;
		    String drink;
		    
		    Scanner scan=new Scanner(System.in);
		    System.out.println("Are you thirsty ?");
		    thirsty=scan.nextBoolean();
		    
		    
		    System.out.println("Are you sleepy ?");
		    sleepy=scan.nextBoolean();
		    
		    
		    if(thirsty && !sleepy){
		      drink="Water";
		    }else if(thirsty && sleepy){
		      drink="Coffee";
		      }else if(!thirsty && sleepy){
		      drink="Tea";
		      }else {
		        drink="Nothing";
		      } System.out.println("Looks like you need " + drink);
		    
		    
		    
		  }

		}
