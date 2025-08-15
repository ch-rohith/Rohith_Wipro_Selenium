package day_8_assignment;

import java.util.LinkedList;
public class SearchElement
{
	public static void main(String[] args)
	{
		LinkedList<String> list = new LinkedList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Mango");
		String search = "Banana";
		if (list.contains(search))
		{
			System.out.println(search + " is found.");
		}
		else
		{
			System.out.println(search + " is not found.");
		}
	}
}

