package com.eygds.demo.day07;

@FunctionalInterface
interface AnotherFunInt {

	public abstract void funMethod(int num);

}

@FunctionalInterface
interface YetAnotherFunInt {

	public abstract void funMethod(int i, int j);

}

@FunctionalInterface
interface JustAnotherFunInt {

	public abstract int funMethod(int i);

}

public class LambdaDemo2 {

	public static void main(String[] args) {

//		AnotherFunInt obj = (abc) -> { System.out.println("arg value is : " + abc); };
//		AnotherFunInt obj = (abc) -> System.out.println("arg value is : " + abc);
		AnotherFunInt obj = abc -> System.out.println("arg value is : " + abc);
		obj.funMethod(10);

		YetAnotherFunInt obj2 = (a, b) -> System.out.println(a + b);
		obj2.funMethod(10, 20);

//		JustAnotherFunInt obj3 = (i) -> {
//			return i + 100;
//		};
		JustAnotherFunInt obj3 = i -> i + 100;

		System.out.println(obj3.funMethod(10));

	}

}
