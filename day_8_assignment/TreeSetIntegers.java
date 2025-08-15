package day_8_assignment;

import java.util.TreeSet;
public class TreeSetIntegers
{
	public static void main(String[] args)
	{
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		System.out.println("First: " + numbers.first());
		System.out.println("Last: " + numbers.last());
		int num = 25;
		System.out.println("Lower than " + num + ": " + numbers.lower(num));
		System.out.println("Higher than " + num + ": " + numbers.higher(num));
	}
}
