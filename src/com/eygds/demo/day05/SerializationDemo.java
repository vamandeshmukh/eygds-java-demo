package com.eygds.demo.day05;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializationDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employeeId:");
		int employeeId = sc.nextInt();
		System.out.println("Enter firstName:");
		String firstName = sc.next();
		System.out.println("Enter salary:");
		double salary = sc.nextDouble();
		Employee emp = new Employee(employeeId, firstName, salary);
		System.out.println(emp.toString());
		
		String file = "emp2.ser";
		FileOutputStream fos;
		ObjectOutputStream oos;
		
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(emp); // imp 
			oos.close();
			fos.close();
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("End");
		}
	}

}
