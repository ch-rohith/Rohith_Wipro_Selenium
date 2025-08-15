package day_10_assignment;

import java.nio.file.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class FileSize
{
	public static void main(String[] args) throws Exception
	{
		Path path = Paths.get("test.txt");
		long size = Files.size(path);
		System.out.println("File size: " + size + " bytes");
	}
}
