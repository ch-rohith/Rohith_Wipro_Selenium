package day_6_assignment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//File Handling with Multiple Catches

public class FileReadDemo {
	public static void main(String[] args) {

		String filename = "C:\\Users\\rohit\\OneDrive\\Desktop\\Java_Selenium\\Java_practise\\sample12.txt";

		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			String firstLine = br.readLine();
			System.out.println("First line of file: " + firstLine);
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + filename);
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		} finally {
			System.out.println("Cleanup done.");
		}
	}
}
