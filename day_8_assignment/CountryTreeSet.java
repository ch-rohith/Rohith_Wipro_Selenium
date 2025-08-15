package day_8_assignment;
import java.util.*;
public class CountryTreeSet
{
	public static void main(String[] args)
	{
		TreeSet<String> countries = new TreeSet<>();
		countries.add("India");
		countries.add("Germany");
		countries.add("Australia");
		countries.add("Brazil");
		countries.add("Canada");
		System.out.println("Sorted Country Names:");
		for (String country : countries)
		{
			System.out.println(country);
		}
	}
}
