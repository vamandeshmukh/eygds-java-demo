package com.eygds.demo.day07;

@FunctionalInterface
interface FunInt {

	public abstract void funMethod();

}

// option 1 - implements 
class ConcreteClass implements FunInt {

	@Override
	public void funMethod() {
		System.out.println("funMethod implemented with implemements");
	}

}

public class LambdaDemo {

	public static void main(String[] args) {

		FunInt obj = new ConcreteClass();
		obj.funMethod();

		// option2 - anonymous inner class
		FunInt obj2 = new FunInt() {
			@Override
			public void funMethod() {
				System.out.println("funMethod implemented with anonymous inner class ");
			}
		};
		obj2.funMethod();

		// option 3 - with lambda method
		// syntax for lambda
		// InterfaceName objectName = (method parameters) -> {method body};

		FunInt obj3 = () -> {
			System.out.println("funMethod implemented with lambda");
		};
		obj3.funMethod();

	}

}
