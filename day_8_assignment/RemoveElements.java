package day_8_assignment;

import java.util.LinkedList;
public class RemoveElements
{
	public static void main(String[] args)
	{
		LinkedList<String> animals = new LinkedList<>();
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Elephant");
		animals.removeFirst();
		animals.removeLast();
		//animals.remove("Cat");
		System.out.println(animals);
	}
}
