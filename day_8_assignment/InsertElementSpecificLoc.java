package day_8_assignment;

import java.util.*;
public class InsertElementSpecificLoc
{
	public static void main(String[] args)
	{
		LinkedList<String> names = new LinkedList<>();
		names.add("Alice");
		names.add("Bob");
		names.add("David");
		System.out.println("Before insertion: " + names);
		names.add(2, "Charlie");
		System.out.println("After insertion: " + names);
	}
}
