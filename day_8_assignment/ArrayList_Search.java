package day_8_assignment;

import java.util.ArrayList;
import java.util.List;
public class ArrayList_Search
{
	public static void main(String[] args)
	{
		List<String> list=new ArrayList<>();
		list.add(0,"Apple");
		list.add(1,"Mango");
		list.add(2,"Kiwi");
		list.add(3,"Banana");
		String search="Mango";
		if(list.contains("Mango"))
			System.out.println(search+" element found in arraylist");
		else
			System.out.println(search+" element not found in arraylist");
	}
}
