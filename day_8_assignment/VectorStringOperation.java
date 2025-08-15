package day_8_assignment;

import java.util.*;
public class VectorStringOperation
{
	public static void main(String[] args)
	{
		Vector<String> names = new Vector<>();
		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");
		names.add("David");
		String searchName = "Charlie";
		if (names.contains(searchName))
		{
			System.out.println(searchName + " is present in the vector.");
		}
		else
		{
			System.out.println(searchName + " is not found.");
		}
		int index = names.indexOf("Bob");
		if (index != -1)
		{
			names.set(index, "Brian");
			System.out.println("Replaced 'Bob' with 'Brian'.");
		}
		System.out.println("Updated Vector: " + names);
		names.clear();
		System.out.println("Vector after clearing: " + names);
	}
}
