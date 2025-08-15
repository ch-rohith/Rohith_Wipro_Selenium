package day_8_assignment;

import java.util.ArrayList;
public class CopyOneArrayListTOOther
{
	public static void main(String[] args)
	{
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Mango");
		ArrayList<String> list2 = new ArrayList<>();
		list2.addAll(list1);
		System.out.println("First List: " + list1);
		System.out.println("Second List: " + list2);
	}
}
