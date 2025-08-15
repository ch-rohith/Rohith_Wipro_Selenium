package day_8_assignment;
import java.util.LinkedHashSet;
public class Merge
{
	public static void main(String[] args)
	{
		LinkedHashSet<String> set1 = new LinkedHashSet<>();
		set1.add("Apple");
		set1.add("Banana");
		LinkedHashSet<String> set2 = new LinkedHashSet<>();
		set2.add("Mango");
		set2.add("Orange");
		set1.addAll(set2);
		System.out.println("Merged Set: " + set1);
	}
}

