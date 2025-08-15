package day_10_assignment;

import java.nio.file.*;
public class WalkDir
{
	public static void main(String[] args) throws Exception
	{
		Files.walk(Paths.get(".")) // current directory
		. forEach(System.out::println);
	}
}

