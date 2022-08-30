package com.eygds.demo.day05;

public class ExDemo2 {
	
	public static void main(String[] args) {
		
		System.out.println("Common Unchecked Exceptions");
		
		int[] myMarks = { 99, 95, 98, 96, 97 };
//		System.out.println(myMarks[5]); // ArrayIndexOutOfBoundsException
		System.out.println(myMarks[4]); 
		
		String str = "ABCDE";
		System.out.println(str.charAt(4));
//		System.out.println(str.charAt(5)); // StringIndexOutOfBoundsException
		
		Integer.parseInt("10");
//		Integer.parseInt("abc"); // NumberFormatException
		
		String str2 = null;
		
//		System.out.println(str2.length()); // NullPointerException
		
		
		System.out.println("End");
	}

}
