package day_8_assignment;

import java.util.*;
public class DoubleEndedOrderedSystem {
	public static void main(String[] args) {
		Deque<String> orders = new LinkedList<>();
		// Add items from front and rear
		orders.addFirst("Order A");
		orders.addLast("Order B");
		orders.addFirst("Order C");
		orders.addLast("Order D");
		System.out.println("After adding orders:");
		System.out.println(orders);
		String frontRemoved = orders.removeFirst();
		System.out.println("Removed from front: " + frontRemoved);
		System.out.println("Current orders: " + orders);
		String rearRemoved = orders.removeLast();
		System.out.println("Removed from rear: " + rearRemoved);
		System.out.println("Current orders: " + orders);
	}
}
