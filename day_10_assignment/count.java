package day_10_assignment;
import java.io.*;
public class count {
	public static void main(String[] args) throws Exception
	{
	 BufferedReader br = new BufferedReader(new FileReader("test.txt"));
	 int lines = 0, words = 0, chars = 0;
	 String s;
	 while ((s = br.readLine()) != null)
	{
	 lines++;
	 words += s.split(" ").length;
	 chars += s.length();
	 }
	 br.close();
	 System.out.println("Lines: " + lines);
	 System.out.println("Words: " + words);
	 System.out.println("Characters: " + chars);
	 }
}
