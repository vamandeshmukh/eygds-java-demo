package com.eygds.demo.day04;

public class EncapDemo {

	public static void main(String[] args) {

//			HumanBody body = new HumanBody();
//			System.out.println(body.getMuscles());
//			body.workOut();
////			body.muscles = "Very strong";
//			System.out.println(body.getMuscles());

		Employee emp = new Employee();
		
		emp.setEmployeeId(101);
		emp.setFirstName("Sonu");
		emp.setSalary(900000);
		
		System.out.println(emp.getEmployeeId());
		System.out.println(emp.getFirstName());
		System.out.println(emp.getSalary());
		

	}

}
