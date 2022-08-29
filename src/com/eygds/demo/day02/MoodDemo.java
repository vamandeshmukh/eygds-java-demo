package com.eygds.demo.day02;

public class MoodDemo {

	public static void main(String[] args) {

		int mood = 1; // 1 for good mood
		int friends = 1; // 1 for friends available
		
		if (mood == 1) {
			if (friends == 1) {
				System.out.println("Go to movie.");
			} else {
				System.out.println("Go shopping.");
			}
		} else {
			if (friends == 1) {
				System.out.println("Watch TV.");
			} else {
				System.out.println("Go to sleep.");
			}
		}
	}
}
