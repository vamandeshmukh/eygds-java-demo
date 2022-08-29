package com.eygds.demo.day04;

abstract class Rbi {

	// method signature - identity - What does this method do?
	// method body - description - How does it do it?

	// concrete method - has method signature and method body
	// abstract method - has only method signature
	// abstract method - specifies only the "what" part, not "how" part
	// abstract method - has abstract keyword, can be defined only in abstract class

	public abstract void doKyc();

}

class HdfcBank extends Rbi {

	@Override
	public void doKyc() {
		System.out.println("KYC with Aadhaar");
	}

}

class IciciBank extends Rbi {

	@Override
	public void doKyc() {
		System.out.println("KYC with PAN card");
	}

}

public class BankDemo {

	public static void main(String[] args) {

		HdfcBank bank1 = new HdfcBank();
		bank1.doKyc();
		IciciBank bank2 = new IciciBank();
		bank2.doKyc();

	}

}
