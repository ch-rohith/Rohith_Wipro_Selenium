package day_8_assignment;
import java.util.*;

class Student
{
	int id;
	String name;
	Student(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode()
	{
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		return id == other.id && name.equals(other.name);
	}
	@Override
	public String toString()
	{
		return id + " - " + name;
	}
}
public class LinkedHashSetStudents
{
	public static void main(String[] args)
	{
		LinkedHashSet<Student> students = new LinkedHashSet<>();
		students.add(new Student(101, "Rohith"));
		students.add(new Student(102, "Bob"));
		students.add(new Student(103, "Charan"));
		boolean added = students.add(new Student(102, "Bob"));
		if (!added)
		{
			System.out.println("Duplicate student not added.");
		}
		System.out.println("Student list:");
		for (Student s : students)
		{
			System.out.println(s);
		}
	}
}