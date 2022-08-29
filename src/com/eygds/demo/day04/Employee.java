package com.eygds.demo.day04;

import java.util.Objects;

//class HumanBody {
//
//	private String muscles;
//
//	public String getMuscles() {
//		return this.muscles;
//	}
//
//	void workOut() {
//		this.muscles = "Strong";
//	}
//
//}

public class Employee {

	// POJO class
	// fields, constructors, getters-setters, [ hashCode(), equals(),] toString()

	private int employeeId;
	private String firstName;
	private double salary;
	// dob, email, phone, address, qualification, 

	
	
	public Employee() {
		super();
	}

	public Employee(int employeeId, String firstName, double salary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
 
	@Override
	public int hashCode() {
		return Objects.hash(employeeId, firstName, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return employeeId == other.employeeId && Objects.equals(firstName, other.firstName)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", salary=" + salary + "]";
	}

}
