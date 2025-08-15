package day_10_assignment;

import java.io.*;
class Student implements Serializable
{
	String name;
	int age;
	Student(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
}
public class SerializeExample
{
	public static void main(String[] args)
	{
		Student s1 = new Student("Rohith", 22);
		try
		(ObjectOutputStream out = new ObjectOutputStream(new
				FileOutputStream("student.ser")))
		{
			out.writeObject(s1);
			System.out.println("Object serialized successfully!");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		try (ObjectInputStream in = new ObjectInputStream(new
				FileInputStream("student.ser")))
		{
			Student s2 = (Student) in.readObject();
			System.out.println("Object deserialized:");
			System.out.println("Name: " + s2.name + ", Age: " + s2.age);
		}
		catch (IOException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
