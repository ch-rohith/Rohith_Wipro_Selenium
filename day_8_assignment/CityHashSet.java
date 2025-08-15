package day_8_assignment;

import java.util.*;
public class CityHashSet
{
	public static void main(String[] args)
	{
		HashSet<String> cities = new HashSet<>();
		cities.add("Mumbai");
		cities.add("Delhi");
		cities.add("Chennai");
		cities.add("Bangalore");
		cities.add("Kolkata");
		// Try adding a duplicate city
		boolean added = cities.add("Delhi");
		if (!added)
		{
			System.out.println("Duplicate city 'Delhi' was not added.");
		}
		System.out.println("Cities in the HashSet:");
		Iterator<String> it = cities.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		cities.remove("Chennai");
		System.out.println("After removing 'Chennai': " + cities);
		if (cities.contains("Bangalore"))
		{
			System.out.println("Bangalore exists in the HashSet.");
		}
		else
		{
			System.out.println("Bangalore does not exist.");
		}
		// Clear the entire HashSet
		cities.clear();
		System.out.println("HashSet after clearing: " + cities);
	}
}
