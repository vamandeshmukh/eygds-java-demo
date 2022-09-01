package com.eygds.demo.day06;

import java.util.ArrayList;

//collection with generic type arguments  

public class ColDemo2 {

	public static void main(String[] args) {

//		ArrayList myMarks = new ArrayList();
//		ArrayList<int> myMarks = new ArrayList<>();
		ArrayList<Integer> myMarks = new ArrayList<>();

		System.out.println(myMarks.size());
		System.out.println(myMarks);
		myMarks.add(98);
		myMarks.add(96);
		myMarks.add(99);
//		myMarks.add(99.50);
//		myMarks.add("abc");
//		myMarks.add(null);
//		myMarks.add(new App());
		System.out.println(myMarks.size());
		System.out.println(myMarks);
		myMarks.remove(1);
		System.out.println(myMarks.size());
		System.out.println(myMarks);

	}
}
