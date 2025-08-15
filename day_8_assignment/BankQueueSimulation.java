package day_8_assignment;

import java.util.*;
public class BankQueueSimulation
{
	public static void main(String[] args)
	{
		Queue<String> customerQueue = new LinkedList<>();
		customerQueue.add("Alice");
		customerQueue.add("Bob");
		customerQueue.add("Charlie");
		customerQueue.add("David");
		customerQueue.add("Eve");
		System.out.println("Initial Queue: " + customerQueue);
		while (!customerQueue.isEmpty())
		{
			String served = customerQueue.remove();
			System.out.println("Served: " + served);
			System.out.println("Queue now: " + customerQueue);
		}
	}
}
