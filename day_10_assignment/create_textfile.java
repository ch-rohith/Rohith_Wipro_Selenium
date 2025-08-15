package day_10_assignment;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
public class create_textfile
{
	public static void main(String[] args) throws Exception
	{
		Files.createFile(Paths.get("test.txt"));
		System.out.println("File created successfully!");
	}
}
