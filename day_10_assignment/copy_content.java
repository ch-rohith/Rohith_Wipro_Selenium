package day_10_assignment;
import java.io.*;
public class copy_content {
	public static void main(String[] args) throws Exception
	{
	FileReader fr = new FileReader("source.txt");
	FileWriter fw = new FileWriter("destination.txt");
	int ch;
	while ((ch = fr.read()) != -1)
	{
	fw.write(ch);
	}
	fr.close();
	fw.close();
	System.out.println("File copied successfully!");
	}

}
