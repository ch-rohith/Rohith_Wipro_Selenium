package day_10_assignment;

import java.io.*;
class Employee implements Serializable
{
	String name;
	int id;
}
public class DeserializeEmployee
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fis = new FileInputStream("employee.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee emp = (Employee) ois.readObject();
		ois.close();
		System.out.println("Name: " + emp.name);
		System.out.println("ID: " + emp.id);
	}
}
