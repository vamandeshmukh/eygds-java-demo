package com.eygds.demo.day04;

public class WrapperDemo {
	
	public static void main(String[] args) {
		
		int num = 10; // primitive type 
		Integer num2 = 20; // object of Wrapper class 

		Integer num3 = num; // boxing - autoboxing 
		
		int num4 = num3; // unboxing 
		
//		num.
//		num2.
//		Integer. 
		
		int num6 = 10;
		
		Integer num7 = Integer.valueOf(num6); // boxing 
		
		int num8 = num7.intValue(); // unboxing 
		
		String num9 = "10";
		
		Integer num10 = Integer.parseInt(num9); // String to Integer parsing 
		
		
	}

}






