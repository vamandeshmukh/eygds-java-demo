package com.eygds.demo.day02;

import java.util.Scanner;

public class GeneralConepts {

	public static void main(String[] args) {

		// use input
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name:");
		String userName = sc.next();
		System.out.println("Welcome " + userName + "!");
		System.out.println("Please enter your salary:");
		double salary = sc.nextDouble();
		System.out.println("Your salary is " + salary + ".");
		sc.close();
	}

}
