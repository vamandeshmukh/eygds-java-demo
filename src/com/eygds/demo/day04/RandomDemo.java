package com.eygds.demo.day04;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {

		Random ran = new Random();

		int num = ran.nextInt();
		System.out.println(num);

		int num2 = ran.nextInt(100);
		System.out.println(num2);

	}
}
