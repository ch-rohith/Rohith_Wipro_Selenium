package day_10_assignment;
import java.io.*;
public class write_to_file {
	
	public static void main(String[] args) throws IOException
	{
	 FileWriter fw = new FileWriter("test.txt");
	 fw.write("Hello, World!");
	 fw.close();
	 System.out.println("Done");
	 }


}
