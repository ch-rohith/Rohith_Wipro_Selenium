package day_10_assignment;

import java.nio.file.*;
import java.util.List;
public class ReadFile
{
	public static void main(String[] args) throws Exception
	{
		Path path = Paths.get("test.txt");
		List<String> lines = Files.readAllLines(path);
		for (String line : lines)
		{
			System.out.println(line);
		}
	}
}
