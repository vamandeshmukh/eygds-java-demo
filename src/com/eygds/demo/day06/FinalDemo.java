package com.eygds.demo.day06;

// final keyword - 

// final field - can not be reassigned a value 
// final method - can not be overridden  
// final class - can not be extended (can not be inherited)

class C1 {

	void m1() {
		// code
	}

	final void m2() {
		// code
	}
}

class C2 extends C1 {

	@Override
	void m1() {
		// code
	}

	// final method - can not be overridden
//	@Override
//	void m2() {
//		// code
//	}
}

final class C3 {
	// code
}

//final class - can not be extended (can not be inherited)
//class C4 extends C3 {
//
//}

public class FinalDemo {

//	public static final int numberOfDaysInWeek = 7;
	public static final int NUMBER_OF_DAYS_IN_WEEK = 7;
	public static int anyOtherVariable = 7;

	public static void main(String[] args) {

		final int num = 10;

//		num = 11; // CE 

		System.out.println(NUMBER_OF_DAYS_IN_WEEK);
		System.out.println(anyOtherVariable);

		// final field - can not be reassigned a value
//		FinalDemo.numberOfDaysInWeek = 8; // CE 
		FinalDemo.anyOtherVariable = 8;

		System.out.println(NUMBER_OF_DAYS_IN_WEEK);
		System.out.println(anyOtherVariable);
	}

}
