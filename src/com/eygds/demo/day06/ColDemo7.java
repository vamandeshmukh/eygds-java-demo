package com.eygds.demo.day06;

import java.util.List;
import java.util.Stack;

public class ColDemo7 {
	
	public static void main(String[] args) {
		
//		List<String> stack = new Stack<>();
		Stack<String> stack = new Stack<>();
		
		System.out.println(stack.size());
		System.out.println(stack.capacity());
		System.out.println(stack);
		stack.add("abc");
		stack.add("def");
		stack.add("ghi");
		System.out.println(stack.size());
		System.out.println(stack.capacity());
		System.out.println(stack);
		stack.add("abc");
		stack.add("def");
		stack.add("ghi");
		stack.add("abc");
		stack.add("def");
		stack.add("ghi");
		stack.add("abc");
		stack.add("def");
		System.out.println(stack.size());
		System.out.println(stack.capacity());
		System.out.println(stack);
		stack.add("abc");
		stack.add("def");
		stack.add("ghi");
		stack.add("abc");
		stack.add("def");
		stack.add("ghi");
		stack.add("abc");
		stack.add("def");
		stack.add("ghi");
		stack.add("abc");
		System.out.println(stack.size());
		System.out.println(stack.capacity());
		System.out.println(stack);
		
	}

}
