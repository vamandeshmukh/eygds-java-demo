package com.eygds.demo.day02;

public class ArrayDemo {

	public static void main(String[] args) {

//		int []marks = {98, 95, 98, 97, 99};
//		int marks[] = {98, 95, 98, 97, 99};
		
		int[] marks = { 98, 95, 98, 97, 99 };

		System.out.println(marks[0]);

		System.out.println("Print array elements using for loop");
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}

		System.out.println("Print array elements using for each loop");
		for (int m : marks) {
			System.out.println(m);
		}

		String[] myFriends = { "Sonu", "Monu", "Tonu", "Gonu" };
		System.out.println("Print array elements using for each loop");
		for (String friend : myFriends) {
			System.out.println(friend);
		}
		myFriends[2] = "Ponu";
		System.out.println("Print array elements using for each loop");
		for (String friend : myFriends) {
			System.out.println(friend);
		}

//		int[] arr = {10, false, 30.5, "Abc", 50}; // NA 
		int[] arr = { 10, 20, 30, 40, 50 };
		System.out.println("access an element from array:");
		System.out.println(arr[-1]);

		int[][] nums = { { 2, 4, 6 }, { 3, 5, 7 } };
		int[][][] nums2 = { { { 2, 4, 6 }, { 3, 5, 7 } }, { { 2, 4, 6 }, { 3, 5, 7 } } };

	}

}

//data types to use by default 

//// integer variables
//int employeeId = 10; // long
//// floating point variables 
//double salary = 10.5;
//// String variables 
//String firstName = "Sonu";
