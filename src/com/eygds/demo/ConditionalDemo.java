package com.eygds.demo;

public class ConditionalDemo {

	public static void main(String[] args) {

		int num1 = 25, num2 = 20, num3;

//		if (num1 > num2) {
//			num3 = num1;
//		} else {
//			num3 = num2;
//		}

		num3 = (num1 > num2) ? num1 : num2;

		System.out.println(num3);
	}
}
