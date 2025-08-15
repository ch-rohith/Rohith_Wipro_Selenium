package day_10_assignment;
import java.io.File;
public class file_exists {
	
	public static void main(String[] args)
	{
	 File f = new File("test.txt"); // file name
	 if (f.exists())
	{
	 System.out.println("File exists");
	 }
	else
	{
	 System.out.println("File does not exist");
	 }
	 }

}
