package day_8_assignment;

import java.util.LinkedList;
public class AddElementsFirstAndLast
{
	public static void main(String[] args)
	{
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println("Original List: " + list);
		list.addFirst(5);
		list.addLast(40);
		System.out.println("Updated List: " + list);
	}
}