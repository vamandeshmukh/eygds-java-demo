package com.eygds.demo.day03;

// static - free access - common to all objects - belong to class 
// non static - restricted access - unique for each object - belong to objects 

public class BankCustomer {

	static String ifsc; // same for all the customers
	int accountNumber; // unique to the customer
	String customerName; // unique to the customer
	double balancce; // unique to the customer

}
