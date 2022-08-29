package com.eygds.demo.day04;

public class EncapDemo {

	public static void main(String[] args) {

//			HumanBody body = new HumanBody();
//			System.out.println(body.getMuscles());
//			body.workOut();
////			body.muscles = "Very strong";
//			System.out.println(body.getMuscles());

//		Employee emp = new Employee();
//		 
//		emp.setEmployeeId(101);
//		emp.setFirstName("Sonu");
//		emp.setSalary(900000);
//		
//		System.out.println(emp.getEmployeeId());
//		System.out.println(emp.getFirstName());
//		System.out.println(emp.getSalary());
		
		Employee emp = new Employee(101, "Sonu", 90000);
		
		System.out.println(emp.toString());
		
		Employee emp2 = new Employee(101, "Sonu", 90000);
		
		System.out.println(emp.toString());
		System.out.println(emp2.toString());
		System.out.println(emp.equals(emp2));
		System.out.println(emp.hashCode());
		System.out.println(emp2.hashCode());

	}

}
