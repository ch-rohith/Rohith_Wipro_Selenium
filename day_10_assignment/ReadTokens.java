package day_10_assignment;

import java.io.*;
import java.util.*;
public class ReadTokens
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(new File("test.txt"));
		while (sc.hasNext())
			System.out.println(sc.next());
		sc.close();
	}
}

