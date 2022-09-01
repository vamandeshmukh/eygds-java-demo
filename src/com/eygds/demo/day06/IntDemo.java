package com.eygds.demo.day06;

// Java 8 onwards interfaces can also contain static and default methods 

interface Int1 {

//	void m1();
	public abstract void m1();

	public abstract void m2();

	public static void m4() {
		// code
	}

	public default void m6() {
		// code
	}

}

// to invoke abstract methods from an interface - 

// option 1 - concrete classes implements those methods 

class Class1 implements Int1 {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
	}

}

public class IntDemo {

	public static void main(String[] args) {

		Int1 obj = new Class1();
		obj.m2();

// option 2 - anonymous inner class 

//		Int1 obj0 = new Int1();

		Int1 obj2 = new Int1() {

			@Override
			public void m2() {

			}

			@Override
			public void m1() {

			}

		};

		obj2.m2();

	}
}
