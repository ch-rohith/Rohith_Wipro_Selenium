package day_10_assignment;
import java.io.*;
public class append_line {
	
	public static void main(String[] args) throws IOException
	{
	 FileWriter fw = new FileWriter("test.txt", true);
	 fw.write("This is a new line.\n");
	 fw.close();
	 System.out.println("Text appended successfully.");
	 }

}
