package day_8_assignment;

import java.util.*;
public class SortElements
{
	public static void main(String[] args)
	{
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(25);
		numbers.add(10);
		numbers.add(35);
		numbers.add(5);
		numbers.add(60);
		numbers.add(15);
		numbers.add(45);
		System.out.println("Original List: " + numbers);
		Collections.sort(numbers);
		System.out.println("Sorted List: " + numbers);
	}
}
