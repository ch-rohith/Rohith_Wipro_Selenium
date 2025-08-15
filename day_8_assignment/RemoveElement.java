package day_8_assignment;

import java.util.*;
public class RemoveElement
{
	public static void main(String[] args)
	{
		ArrayList<String> fruits = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Grapes");
		fruits.add("Orange");
		System.out.println("Fruits List: " + fruits);
		System.out.print("Enter a fruit to remove: ");
		String fruitToRemove = sc.nextLine();
		if (fruits.remove(fruitToRemove))
		{
			System.out.println(fruitToRemove + " removed.");
		}
		else
		{
			System.out.println(fruitToRemove + " not found.");
		}
		System.out.println("Updated List: " + fruits);
		sc.close();
	}
}
