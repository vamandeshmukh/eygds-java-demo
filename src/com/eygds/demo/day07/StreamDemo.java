package com.eygds.demo.day07;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee(101, "Sonu", 90000));
		empList.add(new Employee(102, "Monu", 95000));
		empList.add(new Employee(103, "Tonu", 85000));
		empList.add(new Employee(104, "Ponu", 80000));
		empList.add(new Employee(105, "Gonu", 98000));

		System.out.println("empList with for each loop:");
		for (Employee emp : empList) {
			System.out.println(emp.toString());
		}

		System.out.println("empList with only salary > 90K with for each loop:");
		for (Employee emp : empList) {
			System.out.println(emp.toString());
		}
	}

}