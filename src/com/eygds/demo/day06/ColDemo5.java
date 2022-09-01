package com.eygds.demo.day06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ColDemo5 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
//		List<String> list = new ArrayList<>();
		
//		list.
		
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

		System.out.println("Iterate through the list with for loop");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("Iterate through the list with for each loop");
		for (String str : list) {
			System.out.println(str);
		}

		System.out.println("Iterate through the list with iterator");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("Iterate through the list with forEach() method");		
		list.forEach( s -> System.out.println(s));

	}

}
