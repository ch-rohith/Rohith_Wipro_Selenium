package day_8_assignment;

import java.util.Stack;
public class Stack
{
	public static void main(String[] args)
	{
		Stack<String> stack = new Stack<>();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack);
	}
}

