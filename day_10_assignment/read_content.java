package day_10_assignment;
import java.io.*;
public class read_content {
	public static void main(String[] args) throws IOException
	{
	 BufferedReader br = new BufferedReader(new FileReader("test.txt"));
	 String line;
	 while ((line = br.readLine()) != null)
	{
	 System.out.println(line);
	 }
	 br.close();
	 }

}
