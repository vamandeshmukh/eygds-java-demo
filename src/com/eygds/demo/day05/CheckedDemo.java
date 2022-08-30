package com.eygds.demo.day05;

public class CheckedDemo {

	public static void printNums() {

		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				System.out.println("Wrong!");
			} 
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		System.out.println("Start");
		CheckedDemo.printNums();
		System.out.println("End");

	}

}
