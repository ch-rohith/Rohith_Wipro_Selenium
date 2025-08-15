package day_6_assignment;

import java.util.Scanner;

//Mini Project – Temperature Converter 

public class TempratureConverterDemo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Temperature in Celsius (double): ");
		double celsius = sc.nextDouble();

		
		double fahrenheit = celsius * 9 / 5 + 32;

		// Cast to int
		int truncatedFahrenheit = (int) fahrenheit;

		System.out.println("Temperature in Fahrenheit (precise): " + fahrenheit);
		System.out.println("Temperature in Fahrenheit (truncated to int): " + truncatedFahrenheit);

		System.out.println("\nNote: The int version loses precision because decimals are cut off.");

	}
}
