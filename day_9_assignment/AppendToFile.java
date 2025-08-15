package day_9_assignment;

import java.io.FileWriter;
import java.io.IOException;
public class AppendToFile {
	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("student1.txt", true); // true = append
			writer.close();
			System.out.println("Data appended successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
