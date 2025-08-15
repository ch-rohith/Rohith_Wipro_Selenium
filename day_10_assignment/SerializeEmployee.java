package day_10_assignment;

import java.io.*;
class Employee implements Serializable
{
	String name;
	int id;
	Employee(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
}
public class SerializeEmployee
{
	public static void main(String[] args) throws Exception
	{
		Employee emp = new Employee("Rohith", 1);
		FileOutputStream fos = new FileOutputStream("employee.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp);
		oos.close();
		System.out.println("Employee object serialized to employee.ser");
	}
}
