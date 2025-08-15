package day_8_assignment;

import java.util.*;
public class VectorIntegerOperation
{
	public static void main(String[] args)
	{
		Vector<Integer> numbers = new Vector<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		numbers.add(2, 25);
		numbers.remove(1);
		System.out.println("Vector Elements:");
		Enumeration<Integer> e = numbers.elements();
		while (e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}
}
