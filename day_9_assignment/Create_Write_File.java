package day_9_assignment;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
public class Create_Write_File {
	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("C:\\Users\\rohit\\OneDrive\\Desktop\\Java_Selenium\\Java_practise\\src\\File_Handling/student1.txt");
		fw.write("rohith\n");
		fw.write("chekurthi\n");
		fw.close();
		System.out.println("successfully written to file");
	}
}
