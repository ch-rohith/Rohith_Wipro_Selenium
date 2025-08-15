package day_10_assignment;

import java.io.*;
import java.util.*;
public class WordCount
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(new File("test.txt"));
		String word = "Hello";
		int count = 0;
		while (sc.hasNext())
		{
			if (sc.next().equalsIgnoreCase(word))
				count++;
		}
		sc.close();
		System.out.println("Occurrences of '" + word + "': " + count);
	}
} 