package com.eygds.demo.day07;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

//		empList.set(0, null)

		System.out.println("empList with forEach method:");
//		empList.forEach((e) -> {
//			System.out.println(e.toString());
//		});

		empList.forEach(e -> System.out.println(e.toString()));

		System.out.println("empList with salary > 90K with for each loop:");
		for (Employee emp : empList) {
			if (emp.getSalary() > 90000)
				System.out.println(emp.toString());
		}

		System.out.println("Convert collection to stream - with stream() method");
		Stream<Employee> empStream = empList.stream();
//		empStream.forEach(null);
//		empStream.map(null);
//		empStream.filter(null);
//		empStream.skip(0);
//		empStream.limit(0);
//		empStream.collect(null);
		empStream.forEach(e -> System.out.println(e.toString()));

		System.out.println("Only first three employees from the empList:");
		Stream<Employee> firstThreeEmps = empList.stream();
		firstThreeEmps.limit(6).forEach(e -> System.out.println(e.toString()));

		System.out.println("Only 3 to 4 employees from the empList:");
		Stream<Employee> emps3to4 = empList.stream();
		emps3to4.skip(2).limit(2).forEach(e -> System.out.println(e.toString()));

		System.out.println("empList with salary > 90K :");

		Stream<Employee> empsWithHighSalary = empList.stream();
		empsWithHighSalary.filter(e -> e.getSalary() > 90000).forEach(e -> System.out.println(e.toString()));

		System.out.println("Stream to list conversion with collect(Collectors.toList():");

		Stream<Employee> empStr = empList.stream();
		List<Employee> empLt = empStr.collect(Collectors.toList());
		empLt.forEach(e -> System.out.println(e.toString()));

		System.out.println("EmpList with salary < 90K using stream API");

		List<Employee> empListWithLessSalary = empList.stream().filter(e -> e.getSalary() < 90000)
				.collect(Collectors.toList()); // imp

		empListWithLessSalary.forEach(e -> System.out.println(e.toString()));

		System.out.println("Increase employees' salaries using stream API map() method");

		List<Employee> empsWithNewSalary = empList.stream().map(e -> {
			if (e.getSalary() < 90000) {
				e.setSalary(e.getSalary() + e.getSalary() * 0.1);
			}
			return e;
		}).collect(Collectors.toList());

		empsWithNewSalary.forEach(e -> System.out.println(e.toString()));

	}

}
