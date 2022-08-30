package com.eygds.demo.day05;

public class ThrowsDemo {

	public static void main(String[] args) {
		System.out.println("Start");
		ThrowsDemo.you();
		System.out.println("End");
	}

	static void car() throws InterruptedException {
		System.out.println("Car starts...");
		Thread.sleep(1000);
		System.out.println("Car runs with problems!");
	}

	static void friendsUncle() {
		try {
			ThrowsDemo.car();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	static void friend() {
		ThrowsDemo.friendsUncle();
	}

	static void you() {
		ThrowsDemo.friend();
	}

}
