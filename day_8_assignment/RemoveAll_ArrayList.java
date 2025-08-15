package day_8_assignment;

import java.util.ArrayList;
public class RemoveAll_ArrayList
{
	public static void main(String[] args)
	{
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		System.out.println("Original List: " + numbers);
		numbers.clear();
		System.out.println("List after clear: " + numbers);
		System.out.println("Size of list: " + numbers.size());
	}
}
