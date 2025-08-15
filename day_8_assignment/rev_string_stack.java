package day_8_assignment;

import java.util.Stack;

public class rev_string_stack {
	
	 public static void main(String[] args) {
		 String str = "hello";
		 Stack<Character> stack = new Stack<>();
		 // Push using for loop
		 for (int i = 0; i < str.length(); i++) {
		 stack.push(str.charAt(i));
		 }
		 // Pop and print
		 for (int i = 0; i < str.length(); i++) {
		 System.out.print(stack.pop());
		 }
		 }
		}


