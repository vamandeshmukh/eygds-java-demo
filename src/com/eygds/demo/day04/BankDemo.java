package com.eygds.demo.day04;

// method signature - identity - What does this method do?
// method body - description - How does it do it?

// concrete method - has method signature and method body

// abstract method - has only method signature
// abstract method - specifies only the "what" part, not "how" part
// abstract method - has abstract keyword, can be defined only in abstract class

// abstract class - 
// has the keyword abstract 
// can contain 0 or more abstract methods 
// can contain 0 or more concrete methods 
// object can not be created for an abstract class 
// if a concrete class extends abstract class - 
// then that concrete class should override and implement abstract methods 

// interface - 
//has the keyword interface
//can contain 0 or more abstract methods 
//can contain 0 or more static and default methods 
//object can not be created for an interface

abstract class Rbi {

	public abstract void doKyc();

}

interface FinMin {
	
	public abstract void payInterest();
//	void payInterest();

}

class HdfcBank extends Rbi implements FinMin {

	@Override
	public void doKyc() {
		System.out.println("KYC with Aadhaar");
	}

	@Override
	public void payInterest() {
		System.out.println("Paying interest");
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

		System.out.println("Hdfc Bank");
		HdfcBank bank1 = new HdfcBank();
		bank1.doKyc();
		bank1.payInterest();
		System.out.println("Icici Bank");
		IciciBank bank2 = new IciciBank();
		bank2.doKyc();

	}

}


interface In1 {
	
}

interface In2 {
	
}

class C2 {
	
}

class C1 extends C2 implements In1, In2 {
	
}










