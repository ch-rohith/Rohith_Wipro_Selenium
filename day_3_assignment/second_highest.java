package day_3_assignment;
import java.util.Arrays;
public class second_highest {
	public static void main(String[] args) {
		int[] numbers = {10, 40, 20, 90, 70};
        Arrays.sort(numbers);
        int secondHighest = numbers[numbers.length - 2];
        System.out.println("Second highest element: " + secondHighest);

	}

}
