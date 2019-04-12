package com.repit;

public class Repit87Method {

	int method1(int a) {
		System.out.println(100);
		return a;
	}

	String method1(String name) {
		System.out.println("Syntax Solutions");
		return name;
	}

	double method1(double x) {
		System.out.println(100.09);
		return x;
	}

	float method1(float b) {
		System.out.println(200.0998);
		return b;
	}

	public static void main(String[] args) {

		Repit87Method mm = new Repit87Method();
		
		mm.method1(100);
		mm.method1("Syntax Solutions");
		mm.method1(100.09);
		mm.method1(200.0998f);

	}
	//Model Solution
//	class Main {
//		  void method1(int a){
//		    System.out.println(a);
//		  }
//		   void method1(String ss){
//		    System.out.println(ss);
//		  }
//		   void method1(double dd){
//		    System.out.println(dd);
//		  }
//		   void method1(float ff){
//		    System.out.println(ff);
//		  }
//		  public static void main(String[] args) {
//		    Main mm= new Main();
//		    mm.method1(100);
//		   mm.method1("SyntaxSolutions");
//		     mm.method1(100.09);
//		       mm.method1(200.0998);
//		  }
//		}

}
