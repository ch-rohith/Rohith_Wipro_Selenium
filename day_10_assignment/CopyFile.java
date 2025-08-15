package day_10_assignment;

import java.nio.file.*;
public class CopyFile
{
	public static void main(String[] args) throws Exception
	{
		Path source = Paths.get("source.txt");
		Path dest = Paths.get("copy.txt");
		Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING);
		System.out.println("File copied successfully.");
	}
}

