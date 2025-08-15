package day_8_assignment;

import java.util.ArrayList;
import java.util.Collections;
public class Reverse_ArrayList
{
	public static void main(String[] args)
	{
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Orange");
		fruits.add("Grapes");
		Collections.reverse(fruits);
		System.out.println(fruits);
	}
}
