package day_8_assignment;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIterator
{
	public static void main(String[] args)
	{
		LinkedList<String> cities = new LinkedList<>();
		cities.add("Delhi");
		cities.add("Mumbai");
		cities.add("Chennai");
		cities.add("Kolkata");
		ListIterator<String> it = cities.listIterator();
		System.out.println("Forward:");
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("Reverse:");
		while (it.hasPrevious())
		{
			System.out.println(it.previous());
		}
	}
}

