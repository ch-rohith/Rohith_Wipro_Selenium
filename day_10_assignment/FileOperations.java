package day_10_assignment;

import java.nio.file.*;
public class FileOperations
{
	public static void main(String[] args) throws Exception
	{
		Path filePath = Paths.get("test.txt");
		Files.createFile(filePath);
		System.out.println("File created: " + filePath);
		// Move file
		Path newPath = Paths.get("moved_test.txt");
		Files.move(filePath, newPath,
				StandardCopyOption.REPLACE_EXISTING);
		System.out.println("File moved to: " + newPath);
		// Delete file
		Files.delete(newPath);
		System.out.println("File deleted.");
	}
}