package com.eygds.demo.day06;

import java.util.ArrayList;
import java.util.List;

public class ColDemo3 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
//		List<Integer> list = new ArrayList<>();

		System.out.println(list.size());
		System.out.println(list);
		Integer num = 6;
		list.add(2);
		list.add(1);
		list.add(6);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(3);
//		list.add(
		System.out.println(list.size());
		System.out.println(list);
//		list.remove(2);
		list.remove(num);
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(2));

//		list.add
	}

}
