package day_6_assignment;

import java.util.Scanner;

//Enum

public class DayCheckDemo {

	enum DaysOfWeek {
		monday, tuesday, wednesday, thursday, friday, saturday, sunday
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Day Name: ");
		String str = sc.next().toLowerCase();

		try {
			DaysOfWeek day = DaysOfWeek.valueOf(str);

			System.out.println("Day ordinal position: " + day.ordinal());

			if (day == DaysOfWeek.saturday || day == DaysOfWeek.sunday) {
				System.out.println("It's a weekend!");
			} else {
				System.out.println("It's a weekday.");
			}

		} catch (IllegalArgumentException e) {
			System.out.println("Invalid day entered. Please enter a valid day of the week.");
		}

	}
}
