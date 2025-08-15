package day_6_assignment;

public class ExceptionDemo {
	public static void main(String[] args) {

		try {
			int num = 10;
			int result = num / 0;

			System.out.println("Result: " + result);

		} catch (ArithmeticException e) {

			System.out.println("Division by zero is not allowed!");
		} finally {

			System.out.println("Division operation completed.");
		}

		System.out.println("----------------");

		// Array out of bounds 
		try {
			int[] arr = { 1, 2, 3 };

			System.out.println("Accessing 5th element: " + arr[4]); 
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Array index out of bounds! Please check your index.");
		} finally {

			System.out.println("Array access operation completed.");
		}
	}
}
