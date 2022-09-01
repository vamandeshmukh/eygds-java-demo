package com.eygds.demo.day06;

import java.util.HashSet;
import java.util.Set;

// Set collection 

public class ColDemo8 {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();

		System.out.println(set.size());
		System.out.println(set);
		set.add("abc");
		set.add("xyz");
		set.add("pqr");
		set.add("ghi");
		set.add("jkl");
		set.add("xyz");
		System.out.println(set.size());
		System.out.println(set);

	}

}
