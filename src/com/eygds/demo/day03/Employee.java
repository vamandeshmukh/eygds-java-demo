package com.eygds.demo.day03;

// constructor -
// special type of method 
// constructor name is same as class name 
// constructor does not have return type
// by default JVM provides a constructor for every class  
// we can also create create out own constructors 
// if we create a constructor, then JVM will not provide it 
// a class can have one or more constructors
// constructor is necessary to create object 

public class Employee {

	static int num;
	int employeeId;
	String firstName;
	double salary;

	public Employee() {
		super();
		System.out.println("default constructor");
	}

	public Employee(int employeeId, String firstName) {
		super();
		System.out.println("2 parameterized constructor");
		this.employeeId = employeeId;
		this.firstName = firstName;
	}

	public Employee(int employeeId, String firstName, double salary) {
		super();
		System.out.println("all parameterized constructor");
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", salary=" + salary + "]";
	}

	void someMethod() {

	}

	static void someOtherMethod() {

	}
}
