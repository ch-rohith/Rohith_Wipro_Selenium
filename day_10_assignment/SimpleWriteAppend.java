package day_10_assignment;

import java.io.file.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
public class SimpleWriteAppend
{
	public static void main(String[] args) throws Exception
	{
		Path file = Paths.get("test.txt");
		// Write
		Files.write(file, "Hello, World!\n".getBytes());
		// Append
		Files.write(file, "This is appended text.\n".getBytes(),
				StandardOpenOption.APPEND);
		System.out.println("Done!");
	}
}
