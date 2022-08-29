package com.eygds.demo.day02;

import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {

		String[] myFriends = { "Sonu", "Monu", "Tonu", "Gonu" };
		System.out.println("I have " + myFriends.length + " friends.");

		System.out.println("My friends:");
		for (String friend : myFriends) {
			System.out.println(friend);
		}

		System.out.println(Arrays.toString(myFriends));

		Arrays.sort(myFriends);

		System.out.println("My friends in ascending order of their names:");
		for (String friend : myFriends) {
			System.out.println(friend);
		}
		System.out.println(Arrays.toString(myFriends));

	}

}
