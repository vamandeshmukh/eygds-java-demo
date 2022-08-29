package com.eygds.demo.day04;

public class CastingDemo {

	public static void main(String[] args) {

		byte b1 = 100;
		byte b2 = 28;
//		byte b3 = b1 + b2;
//		int b3 = b1 + b2;
		byte b3 = (byte) (b1 + b2);

		System.out.println(b3);

		char ch = 'a'; // 97 - ASCII value   
		int i = 10;

		System.out.println(ch + i);

	}

}
