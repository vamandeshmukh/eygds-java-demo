package com.eygds.demo.day03;

import java.util.ArrayList;
import java.util.List;

public class ConstructorDemo {

	public static void main(String[] args) {

		Employee obj = new Employee();
		obj.employeeId = 101;
		obj.firstName = "Sonu";
		obj.salary = 90000;
		System.out.println(obj.toString());

		Employee obj2 = new Employee();
		obj2.employeeId = 102;
		obj2.firstName = "Monu";
		obj2.salary = 95000;
		System.out.println(obj2.toString());

		Employee obj3 = new Employee(103, "Tonu", 85000);
		System.out.println(obj3.toString());

		Employee obj4 = new Employee(103, "Tonu");
		System.out.println(obj4.toString());

		obj.someMethod();
		
//		Employee.
//		obj.


	}

}
