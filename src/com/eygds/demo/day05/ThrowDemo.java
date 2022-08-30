package com.eygds.demo.day05;

public class ThrowDemo {

	public static void main(String[] args) {

		System.out.println("Start");
		try {
			Polling.checkEligibility(17); // 17 18 
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("End");
	}

}

//class Polling {
//
//	static void checkEligibility(int age) throws RuntimeException {
//		if (age >= 18) {
//			System.out.println("Vote for India!");
//		} else {
//			throw new RuntimeException("Not eligible!");
//		}
//	}
//}


class Polling {

	static void checkEligibility(int age) throws RuntimeException {
		if (age >= 18) {
			System.out.println("Vote for India!");
		} else {
			throw new IllegalVotingException("Not eligible!");
		}
	}
}

// Custom exception class 

class IllegalVotingException extends RuntimeException {

	private static final long serialVersionUID = 4557445010853768479L;
	
	public IllegalVotingException() {
		super();
	}
	
	public IllegalVotingException(String message) {
		super(message);
	}
}
