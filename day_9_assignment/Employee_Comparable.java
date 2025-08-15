package day_9_assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Employee1 implements Comparable<Employee1> {
	int id;
	String name;
	Employee1(String name,int id) {
		this.name = name;
		this.id = id;
	}
	public int compareTo(Employee1 E)
	{
		return this.name.compareTo(E.name);
	}
	public String toString() {
		return name + " " + id ;
	}
}
public class Employee_Comparable{
	public static void main(String[] args) {
		List<Employee1> list =new ArrayList<>();
		list.add(new Employee1("Rohith",101));
		list.add(new Employee1("kavya",102));
		list.add(new Employee1("sree",103));
		Collections.sort(list);
		list.forEach(System.out::println);
	}
}
