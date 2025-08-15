package day_8_assignment;

import java.util.*;
public class LinkedListtoArrayList
{
	public static void main(String[] args)
	{
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Apple");
		linkedList.add("Banana");
		linkedList.add("Mango");
		linkedList.add("Orange");
		ArrayList<String> arrayList = new ArrayList<>(linkedList);
		System.out.println("LinkedList: " + linkedList);
		System.out.println("ArrayList: " + arrayList);
	}
}

