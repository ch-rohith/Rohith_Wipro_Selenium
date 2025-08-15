package day_6_assignment;

class OddNumberException extends Exception {
	public OddNumberException(String message) {
		super(message);
	}
}

public class OddChecker {

	// method to check odd number
	public static void checkOdd(int n) throws OddNumberException {
		if (n % 2 != 0) {
			throw new OddNumberException("Odd number: " + n);
		} else {
			System.out.println("Even number: " + n);
		}
	}

	public static void main(String[] args) {
		int[] numbers = { 2, 5, 8, 11 };

		for (int n : numbers) {
			try {
				checkOdd(n);
			} catch (OddNumberException e) {
				System.out.println("Exception caught: " + e.getMessage());
			}
		}
	}
}
