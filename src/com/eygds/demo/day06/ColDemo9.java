package com.eygds.demo.day06;

import java.util.HashMap;
import java.util.Map;

public class ColDemo9 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		System.out.println(map.size());
		System.out.println(map);
		map.put(10, "Sonu");
		map.put(20, "Monu");
		map.put(30, "Tonu");
		map.put(40, "Ponu");
		System.out.println(map.size());
		System.out.println(map);

	}

}
