package com.eygds.demo.day04;

public class ThisDemo {
	
	public static void main(String[] args) {
		
		ThisClass.num = 10; // access static fields with ClassName
		
		ThisClass obj = new ThisClass();
		
		// this keyword 
		
		obj.num2 = 20;
	}

}
