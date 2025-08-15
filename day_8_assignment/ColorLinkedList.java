package day_8_assignment;

import java.util.*;
public class ColorLinkedList
{
	public static void main(String[] args)
	{
		LinkedList<String> colors = new LinkedList<>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Yellow");
		colors.add("Purple");
		System.out.println("Colors in the list:");
		for (String color : colors)
		{
			System.out.println(color);
		}
	}
}

