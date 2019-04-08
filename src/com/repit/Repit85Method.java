package com.repit;

public class Repit85Method {
//	For you to do 
//		Multiple Parameters for method
//		create method with Multiple Parameters as int 
//		and write the logic in that method in println statement to print hours : with minutes 
//		and call the method in main method with values 
//
//		Output: MUST BE!!!
//		11:30
	
	void printTime1(int hour, int minute){  // My way part 1
	    for (int h = 11; h < 12; h++) {

				for (int m = 30; m < 31; m++) {
					System.out.println(h + " " + m);
				}

			}
		
	  }
	
	
	void printTime(int hour, int minute){ //Model Solution part 1
	    System.out.print(hour);
	    System.out.print(":");
	    System.out.println(minute);
	  }
	
	
//	  public static void main(String[] args) { // My way part 2
//		  Repit84Method obj=new Repit84Method();
//	    obj.printTime1(11,30);
//	    
//	 
//	  
//	  
//	  //Model Solution part 2
//		    Main mm= new Main();
//		    mm.printTime(11,30);
		    
		  
	  }


