package com.eygds.demo.day03;

public class Access {

	public static int num = 10;
	protected static int num2 = 20;
	static int num3 = 30;
	private static int num4 = 40;

	public static void main(String[] args) {

		System.out.println(Access.num);
		System.out.println(Access.num2);
		System.out.println(Access.num3);
		System.out.println(Access.num4);
	}

}
