package com.eygds.demo.day05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExDemo {

	public static void main(String[] args) {
		
//		Throwable obj;
		
		System.out.println("Start");
		ExDemo.calc();
		System.out.println("End");
	}

	public static void calc() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter num1");
			int num1 = sc.nextInt();
			System.out.println("Enter num2");
			int num2 = sc.nextInt();
			System.out.println(num1 / num2); // exception object
		} catch (ArithmeticException e) {
			System.out.println("Do not divide by 0.");
			ExDemo.calc();
		} catch (InputMismatchException e) {
			System.out.println("Enter only integers.");
			ExDemo.calc();
		} catch (Exception e) {
			System.out.println("Something is wrong!");
			ExDemo.calc();
		} finally {
			System.out.println("Calculation done!");
			sc.close();
		}
	}

}
