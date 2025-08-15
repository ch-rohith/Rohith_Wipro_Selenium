package day_10_assignment;
import java.io.*;
public class TxtFilter {
	public static void main(String[] args)
	{
	 File folder = new File(".");
	 String[] files = folder.list((dir, name) -> name.endsWith(".txt"));
	 for (String f : files)
	{
	 System.out.println(f);
	 }
	 }

}
