package day_10_assignment;

import java.io.File;
public class ListFiles
{
	public static void main(String[] args)
	{
		File folder = new File("C:\\Users\\rohit\\OneDrive\\Desktop\\Java_Selenium\\Java_practise");
		File[] files = folder.listFiles();
		if (files != null)
		{
			for (File f : files)
			{
				System.out.println(f.getName());
			}
		}
		else
		{
			System.out.println("Directory not found!");
		}
	}
}