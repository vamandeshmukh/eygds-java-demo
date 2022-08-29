package com.eygds.demo.day04;

import java.util.Scanner;

public class StringParsingDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Addition program \nPlease enter num1:");
		String s1 = sc.next();
		
		System.out.println("Please enter num2:");
		String s2 = sc.next();
		
		int num1 = Integer.parseInt(s1);
		int num2 = Integer.parseInt(s2);
		int num3 = num1 + num2;
		
		String s3 = Integer.toString(num3);

		System.out.println(s3);

		sc.close();

	}

}
