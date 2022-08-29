package com.eygds.demo.day04;

import java.util.Scanner;

public class Delete {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Addition program \nPlease enter num1:");
		int num1 = sc.nextInt();
		System.out.println("Please enter num2:");
		int num2 = sc.nextInt();
		
		int num3 = num1 + num2;
		
		System.out.println(num3);

		sc.close();

	}

}
