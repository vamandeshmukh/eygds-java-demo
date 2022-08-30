package com.eygds.demo.day05;

import java.util.Scanner;

public class Delete {

	public static void main(String[] args) {


		System.out.println("Start");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter num1");
		int num1 = sc.nextInt();
		System.out.println("Enter num2");
		int num2 = sc.nextInt(); // InputMismatchException
		System.out.println(num1 / num2); // ArithmeticException  

		System.out.println("Calculation done!");
		sc.close();
	}

}
