package com.eygds.demo.day04;

public class InheritDemo {

	public static void main(String[] args) {

		System.out.println("My basic phone:");
		Phone phone1 = new Phone();
		phone1.call();
		phone1.sms();
		
		System.out.println("My feature phone:");
		FeaturePhone phone2 = new FeaturePhone();
		phone2.call();
		phone2.sms();
		phone2.music();
		

	}

}
