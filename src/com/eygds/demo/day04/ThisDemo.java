package com.eygds.demo.day04;

// access static members - within static context - with class reference 
// access nonstatic members - within static context - with object reference 

// access static members - within nonstatic context - with class reference 
// access nonstatic members - within nonstatic context - with this keyword

public class ThisDemo {

	static int num = 10;
	int num2 = 20;

	public static void main(String[] args) {

		ThisDemo.staticMethod();

		ThisDemo obj = new ThisDemo();
		obj.nonStaticMethod();
	}

	static void staticMethod() {
		System.out.println(ThisDemo.num);
		ThisDemo obj = new ThisDemo();
		System.out.println(obj.num2);
	}

	void nonStaticMethod() {
		System.out.println(ThisDemo.num);
		System.out.println(this.num2);
	}
}
