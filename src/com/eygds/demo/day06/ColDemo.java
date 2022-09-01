package com.eygds.demo.day06;

import java.util.ArrayList;

public class ColDemo {

	public static void main(String[] args) {

		ArrayList myMarks = new ArrayList();

		System.out.println(myMarks.size());
		myMarks.add(98);
		myMarks.add(96);
		myMarks.add(99);
		System.out.println(myMarks.size());
		System.out.println(myMarks);
		myMarks.remove(1);
		System.out.println(myMarks.size());
		System.out.println(myMarks);

	}

}
