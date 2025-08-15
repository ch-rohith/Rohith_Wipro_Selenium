package day_8_assignment;

import java.util.*;
class Patient
{
	String name;
	int severityLevel;
	Patient(String name, int severityLevel)
	{
		this.name = name;
		this.severityLevel = severityLevel;
	}
	@Override
	public String toString()
	{
		return name + " (Severity: " + severityLevel + ")";
	}
}
public class HospitalQueue
{
	public static void main(String[] args)
	{
		PriorityQueue<Patient> emergencyQueue = new PriorityQueue<>(new
				Comparator<Patient>()
		{
			public int compare(Patient p1, Patient p2)
			{
				return Integer.compare(p2.severityLevel,
						p1.severityLevel);
			}
		});
		emergencyQueue.add(new Patient("Alice", 4));
		emergencyQueue.add(new Patient("Bob", 2));
		emergencyQueue.add(new Patient("Charlie", 5));
		emergencyQueue.add(new Patient("David", 3));
		emergencyQueue.add(new Patient("Eve", 1));
		System.out.println("Serving patients in order of severity:");
		while (!emergencyQueue.isEmpty())
		{
			System.out.println("Attending: " + emergencyQueue.poll());
		}
	}
}
