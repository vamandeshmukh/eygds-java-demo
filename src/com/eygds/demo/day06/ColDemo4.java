package com.eygds.demo.day06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ColDemo4 {

	public static void main(String[] args) {

//		ArrayList<Integer> list = new ArrayList<>();
		List<String> list = new ArrayList<>();
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		System.out.println(list);
		list.add("abc");
		list.add("def");
		list.add("ghi");
		list.add("jkl");
		list.add("mno");
		list.add(2, "xyz");
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println(list.isEmpty());
		list.set(3, "pqr");
		System.out.println(list.size());
		System.out.println(list);
		Collections.sort(list); // here sort 
		System.out.println(list.size());
		System.out.println(list);
		Collections.reverse(list); // here reverse 
		System.out.println(list.size());
		System.out.println(list);

//		list.add
	}

}
