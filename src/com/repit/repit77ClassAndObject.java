package com.repit;

//create a class named 'Main' with specific attributes.
//For you to do
//
//Create two object in which you will be assigning the following values.
//carColor='Black'
//carModelYear=2019
//carName='BMW'
//
//carColor='White'
//carModelYear=2018
//carName='Toyota'
//
//Car color is Black and car model year is 2019 and car name is BMW
//Car color is White and car model year is 2018 and car name is Toyota

public class repit77ClassAndObject {

	String carColor;
	int carModelYear;
	String carName;
	
	public static void main(String[] args) {
		repit77ClassAndObject car1=new repit77ClassAndObject();
		car1.carColor="Black";
		car1.carModelYear=2019;
		car1.carName="BMW";
		
		repit77ClassAndObject car2=new repit77ClassAndObject();
		car2.carColor="White";
		car2.carModelYear=2018;
		car2.carName="Toyota";
		
		System.out.println("Car color is "+car1.carColor+" and car model year "+car1.carModelYear+ " and car name is "+ car1.carName);
		System.out.println("Car color is "+car2.carColor+" and car model year "+car2.carModelYear+ " and car name is "+ car2.carName);
	
	}

}
