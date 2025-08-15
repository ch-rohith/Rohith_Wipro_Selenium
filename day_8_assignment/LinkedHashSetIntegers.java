package day_8_assignment;
import java.util.*;
public class LinkedHashSetIntegers {

	public static void main(String[] args)
	{
		LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
		numbers.add(10);
		numbers.add(5);
		numbers.add(20);
		numbers.add(15);
		numbers.add(5);
		System.out.println("LinkedHashSet elements:");
		for (int num : numbers)
		{
			System.out.println(num);
		}
	}

}
